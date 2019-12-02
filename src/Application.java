
/**
 * @author cameronherbert

 *
 */

import java.util.Scanner;
import java.security.*;

public class Application extends BinaryTree{

	public static String fileName;
	
	public static void main(String[] args) throws NoSuchAlgorithmException{
		
		System.out.println("Please enter the  name of a file to hash: ");
		
		Scanner scan = new Scanner(System.in);
		fileName = scan.nextLine(); //get name of file from user
		
		DataReader read = new DataReader(fileName); //instantiates Datareader with the name of the file
		
	}

}
