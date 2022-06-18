/* 
 Kai Wolf
 20/03/2022
 Project: Student grade database
 Input: The studentgradedatabase.csv file
 Output: a new file with grade letter for each student
 Comment: 
  - the program writes a new different file with grade letters.Because if it writes on the same file, the code will be useless when execute again.
  - the Buffered... methods are listed in the book, to use for read and write files
  - I have to read the file again before writing because the previous read method has broken down the data into smaller parts
*/






package MYCLU;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Homework7 {
	
	
	// method to calculate the students' final score 
		public static double score(int[][] a, int i, int j) {
			// calculate score based on location in the array 20x3
			int x = a[i][j];
			int y = a[i][j+1];
			int z = a[i][j+2];
			
			double result = 0.2 * x + 0.5 * y + 0.3 * z;
			
			return result;
		}
		
		
		// method to change 10 scale to grading scale 
		public static String grade(double n) {
			String grade = " ";
			if (n >= 95 && n <= 100) 
				grade = "A";
			else if (n >= 90 && n < 95)
				grade = "A-";
			else if (n >= 87 && n < 90)
				grade = "B+";
			else if (n >= 83 && n < 87)
				grade = "B";
			else if (n >= 80 && n < 83)
				grade = "B-";
			else if (n >= 77 && n < 80)
				grade = "C+";
			else if (n >= 73 && n < 77)
				grade = "C";
			else if (n >= 70 && n < 73)
				grade = "C-";
			else if (n >= 67 && n < 70)
				grade = "D+";
			else if (n >= 63 && n < 67)
				grade = "D";
			else if (n >= 60 && n < 63)
				grade = "D-";
			else 
				grade = "F";
			
			return grade;
		}
		

	public static void main(String[] args) {
		
		// location of the csv file (path)
		String path = "C:/Users/kaiwo/OneDrive/Desktop/CSC210/CSC210/studentgradedatabase.csv";
		String line = "";
		int row = 0;
		// point variable for students final score 
		double point = 0;
		// array of students' score 20x3
		int[][] array = new int[20][3];
		// array storing 20 grades of 20 students 
		String[] grade = new String[20];
		// array for storing content of csv file 
		String[] content = new String[20];
		
		
		try {
			// read the csv file
			BufferedReader br = new BufferedReader(new FileReader(path));
			// read the first line in the file and skip it
			String firstLine = br.readLine();
			
			// read the file till it has no more data to read
			while ((line = br.readLine()) != null) {
				
				// separate data by "," and store it into an array
				String[] data = line.split(",");
				
				// get the two dim array of students scores
				for (int col = 0; col < data.length - 3; col++) {
					// split an array into different chunks, array of array -> two dim array
					array[row][col] = Integer.parseInt(data[col + 3]);
				}
				row++;
			}
			
			// calculate the score based on value in the array 
			for (int i = 0; i < 20; i++) {
				point = score(array, i, 0);
				// convert them to letter grades 
				grade[i] = grade(point);
			}
			// create a new file to write data
			FileWriter fw = new FileWriter("gradingFile.csv",true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			// read the csv file again 
			BufferedReader rd = new BufferedReader(new FileReader(path));
			
			// looping to read the data 
			while ((line = rd.readLine()) != null) {
				
				for (int i = 0; i < 20; i++) {
					// store each line of the file into a value of an array
					content[i] = rd.readLine();		
				}
			}
			// write the first line, the headline in the table
			bw.write(firstLine + "\n");
			
			for (int i = 0; i < 20; i++) {
				// write the previous content of the file adding the grade at the end of each line after first line 
				bw.write(content[i] + grade[i] + "," + "\n");
			}
			// close write stream
			bw.close();
			
			// notify users we have successfully written the file 
			System.out.println("File has been graded! Check graded file at gradingFile.csv !");
			
			
		
			// if there are errors, notify the users 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("File cannot be found!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
