
//@author Cameron Herbert

import java.security.*;

public class MerkleTree extends DataReader{
	
	public static String[] hashBlocks = new String[n];//array used to hold hashed datablocks
	
	public MerkleTree(String[] block) throws NoSuchAlgorithmException {
		
		for (int i = 0; i < n; i++) {
			
			String currentBlock = block[i]; //temporarily hold current data block which will be hashed
			
			MessageDigest md = MessageDigest.getInstance("SHA-256"); //Creates the MessageDigest object using SHA-256 algorithim
			
			md.update(currentBlock.getBytes()); //Passes data to the created MessageDigest Object
			
			byte[] digest = md.digest(); //Computes the message digest
			
			hashBlocks[i] = digest.toString(); //puts string version of each hashed dataBlock 
			
		}
		
		Root();
		
	}
	
	public void Root() throws NoSuchAlgorithmException {
		
		String root = null;
		
		for(int j = 0; j < n; j++) {
			
			root += hashBlocks[j];
			
			
		}
		
		MessageDigest md1 = MessageDigest.getInstance("SHA-256");
		md1.update(root.getBytes());
		byte[] digest = md1.digest();
		
		String root1 = digest.toString();
		
		BinaryTree.setRootData(root1<String>);
		
	}
	
}
