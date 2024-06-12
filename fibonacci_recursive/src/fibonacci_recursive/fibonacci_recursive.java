package fibonacci_recursive;

public class fibonacci_recursive {

	public static void main(String[] args) 
	{
        System.out.println("İlk 10 tane Fibonacci sayısı:");
		
		for (int i = 1; i < 11; i++) 
        {
            System.out.print(fibonacci(i) + " ");
        }
    }
	
	public static int fibonacci(int a) 
	{
        if (a <= 1) 
        {
            return a;
        } 
        
        else 
        {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }

    
}


