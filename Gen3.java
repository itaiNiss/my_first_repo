
public class Gen3 {
	public static void main (String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int x = (int)(a + Math.random() * (b - a));
		int y = (int)(a + Math.random() * (b - a));
		int z = (int)(a + Math.random() * (b - a));
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println("The minimal generated value was " + Math.min(x, Math.min(y, z)));
	}
}
