import java.util.*;
public class BlockChainTest
{
	ArrayList<Block> blockchain = new ArrayList<>();

	public static void main(String args[])
	{
		String fact1[] = {"haim is 19", "He dose CS210"};
		Block Block1 = new Block(0, fact1);
		
		String fact2[] = {"Haim is 18", "He dose CS220"};
		Block Block2 = new Block(Block1.getBlockHash(), fact2);
		
		String fact3[] = {"Haim is 20", "He dose CS130"};
		Block Block3 = new Block(Block2.getBlockHash(), fact3);

		System.out.println("Hash of 1st block; " + Block1.getBlockHash());
		System.out.println("Hash of block2; " + Block2.getBlockHash());
		System.out.println("Hash of block3; " + Block3.getBlockHash());
	}
}
