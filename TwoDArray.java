import java.io.*;

public class TwoDArray {

	public static void main(String[] args) throws IOException {
		int csvValue=0;
		
		int [][] values = {{ 1,4,6,7,8},
				   {2,3,1,5,6},
				   {3,2,1,4,5}};
		
		String fileName ="input.csv";
		
		PrintWriter outFile = new PrintWriter(fileName);
		
	//output array into text file	
		for (int row=0; row <values.length; row++) {   //row
				for (int col=0; col< values[row].length; col++) {	//col
					outFile.print(csvValue+ " ");
				}
			outFile.println();     //outFile "input.csv" is what I will attempt to read with TextReader
		}
		outFile.close();
		
		
	//printout values array- verification
		for (int row =0; row< values.length; row++) {
			for (int col=0; col< values[row].length; col++)
				System.out.print(values[row][col]+ ", ");
			System.out.println();
		}
		
	
		System.out.println();
		
	//printout values from "input.csv"
		FileReader reader = new FileReader ("input.csv"); //reads textfile and outputs to console
		int character;
		while ((character = reader.read()) != -1) {
			System.out.print((char) character);	
		}
		
		reader.close();	
		
	
	System.out.println();
	System.out.println("Output file has been created:" + " "+fileName);
	
		
	}

}


