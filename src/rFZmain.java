import java.util.Scanner;

public class rFZmain 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Grenze N der Fibonacci-Zahlen-Berechnung: ");
		int grenze = s.nextInt();
		s.close();
        System.out.println("Fibonacci: "+fibonacci(grenze));
    }

    public static int fibonacci(int g)
    {
        if(g == 0)
            return 0;
        if(g == 1)
            return 1;
        else
        {
            return fibonacci(g - 1) + fibonacci(g - 2);
        }
    }
}
