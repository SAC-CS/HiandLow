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