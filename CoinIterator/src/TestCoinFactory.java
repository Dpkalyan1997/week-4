
public class TestCoinFactory {

	public static void main(String[] args) {
		CoinCollectionImplementation coinCollection=new CoinCollectionImplementation();
		Iterator iterator = coinCollection.getIterator();
		while(iterator.hasNext())
		{
			System.out.println((String)iterator.next());
		}
	}

}
