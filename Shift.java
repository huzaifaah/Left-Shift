public class Shift 
{
	public static void main(String args[])
	{
		byte x = 32, y;
		int i;
		i = x << 2;
		y = (byte) (x << 2);
		System.out.println("Valur of x after shift is " +y);
	}
}