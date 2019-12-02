
/**
 * @author cameronherbert
 *
 */

import java.util.Scanner;
import java.io.*;
import java.security.*;


public class DataReader extends Application{
	
	public static String[] blocks = new String[16];
	
	public static int n;
	
	public DataReader() {
		
		
	}
	
	public DataReader(String S) throws NoSuchAlgorithmException {
		
		System.out.println(S);
		
		Scanner fileScan, urlScan;
		String line;
			
			try {	
				
				fileScan = new Scanner(new File(S));
				
				while (fileScan.hasNext()) {
					
					line = fileScan.nextLine();
					
					blocks[n] = line;
					n++;
					
			   
					}    
				
				MerkleTree merkle = new MerkleTree(blocks);
			}
			catch (IOException e) { 
				
				
			}
				
	}
		
}
	

