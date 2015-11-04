import java.util.Random;

public class HiandLow {

	private int lo, hi;
	
	public void SetLowNumber(int low)
	{
		lo = low;
	}
	
	public void SetHighNumber(int high)
	{
		hi = high;
	}
	
	public int GetANumber()
	{	
		Random rand = new Random();
		return rand.nextInt(hi - lo + 1) + lo;
	}
}

// Plese explain how you're using thie HiandLow class....it's not in your main program.
