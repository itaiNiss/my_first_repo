
public class Coins {
	public static void main (String[] args) 
    { 
        int AllCash = Integer.parseInt(args[0]);
        int Quarters = AllCash / 25; 
        int Cents = AllCash % 25;
        if (Quarters == 1) 
        {
            System.out.println("Use " + Quarters + " quarter and " + Cents + " cents");
        }
        else
        {
            System.out.println("Use " + Quarters + " quarters and " + Cents + " cents");
        }
        
	}
}