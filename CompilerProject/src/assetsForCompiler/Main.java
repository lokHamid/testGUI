package assetsForCompiler;
import java.io.*;

import java.util.Scanner;
public abstract class Main {
	static final int MAX_ARITHMETICS = 6;
	static final String[] arithmetic_list = {"x=x+a" , "x=x-a" , "x=a" , "x = -a" , "x=a*b" , "x=x*a" };
	static final int MAX_FUNCTIONS = 3;
	static String[] functionsList = {"print","read"};
	static final int MAX_WORDS_PER_INSTRUCTION= 3;
	static final int MAX_VARIABLES = 2048;
	static functionalities functions_ = new functionalities();
	
	
	public static void main(String[] args) {
		
		/**Declaration for the main method:**/
		
		Variable[] var_list = new Variable[MAX_VARIABLES];
		
		Scanner scan = new Scanner(System.in);//used in the main method.
		Scanner FILE_READER_RF;// the scanner used to read the RF file.
		String filename;//the file name;
		File RF;//the file itself.
		int Line_Number = 0; // used for determining the beginning and the ending of the provided pseudo code.
		boolean error_encountered = false;//used for throwing errors(syntax ones of course).
		String error_message_throw;//error message.
		String buffer;
		String[] wordsForEachInstruction = new String[MAX_WORDS_PER_INSTRUCTION];
		
								/**COMPILATION PART **/
		
		System.out.println("enter the name of the file you want to compile and run: ");
		filename = scan.nextLine();
		RF = new File(filename);
		try {
		FILE_READER_RF = new Scanner(RF);	
			while(FILE_READER_RF.hasNextLine() && !error_encountered) {
				Line_Number++;
				//checking if the beginning or the end is reached and checking for the right keywords.
				if((Line_Number == 1 && !FILE_READER_RF.nextLine().trim().equalsIgnoreCase("begin") )
				|| (Line_Number == lengthInLinesfile(FILE_READER_RF) && !FILE_READER_RF.nextLine().trim().equalsIgnoreCase("end"))) 
				{
					error_encountered = true;
					error_message_throw = "Syntax error at line " + Line_Number + ".";
					break;
				}
				//reading instructions one by one in each line.
				
				buffer = FILE_READER_RF.nextLine();
				
				wordsForEachInstruction = buffer.split(" ");//split each words.
				if(!isPresentInfunctionalities(wordsForEachInstruction[0])) {
					buffer.replaceAll("\\s","");
//					if() {
//						
//					}
					//check for the rest of the syntax.
				}	
				
			}
			
			
			
			
		//this is the end of compiling.
		}catch(FileNotFoundException e){
			System.out.println("File not found!\nFile must be in the project's directory!i'll be working on it later.");
		}
				
}/**
End of main method.
**/
	/**methods used in main**/
	
	public static int lengthInLinesfile(Scanner FILEREADER) {
		int num_lines=0;
		while(FILEREADER.hasNextLine()) {
			num_lines++;
		}
		return num_lines;
	}
	
	public static boolean isPresentInfunctionalities(String func_name) {
		for(int i=0;i<MAX_FUNCTIONS;i++) {
			if(functionsList[i].equalsIgnoreCase(func_name)) {
				return true;
			}
		}
	return false;
	}
	
	public static boolean isPresentInArithmetic(String target) {
		for(int i=0;i<MAX_ARITHMETICS;i++) {
			if(arithmetic_list[i].equalsIgnoreCase(target)) {
				return true;
			}
		}
	return false;
	}
	

	
}
