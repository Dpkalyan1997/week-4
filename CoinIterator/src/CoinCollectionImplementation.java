
public class CoinCollectionImplementation implements CoinCollection
{
String coin[]= {"The Value of Cent is 0.01 dollars",
				"The value of Nickel is 0.05 dollars",
				"The value of dollar is $1"
			   };
	@Override
	public Iterator getIterator() {
		return new CoinIterator();
	}
	
	private class CoinIterator implements Iterator
	{
		int i=0;

		@Override
		public boolean hasNext() {
			if(i<coin.length)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

		@Override
		public Object next() {
			if(hasNext())
			{
				return coin[i++];
			}
			else 
			{
				return null;
			}
		}
		
	}
   
}
