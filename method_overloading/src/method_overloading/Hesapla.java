package method_overloading;

public class Hesapla 
{
	public int calculateArea(int side) 
	{
        return side * side;
    }
	
	public int calculateArea(int length, int width)
	{
		return length * width;
	}
	
	public float calculateArea(float radius)
	{
		return 3.14f * radius * radius;
	}

}
