
import java.util.Arrays;
public class Block
{
	private int perviousHash;
	private String transactions[];

	private int blockHash;

	public Block(int perviousHash,String[] transactions)
	{
		this.perviousHash = perviousHash;
		this.transactions = transactions;

		Object[] contens = {Arrays.hashCode(transactions), perviousHash};
		this.blockHash = Arrays.hashCode(contens);
	}

	public int getPerviousHash()
	{
		return perviousHash;
	}

	public String[] getTransactions()
	{
		return transactions;
	}

	public int getBlockHash()
	{
		return blockHash;
	}
}