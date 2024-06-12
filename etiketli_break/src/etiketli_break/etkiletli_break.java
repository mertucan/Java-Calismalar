package etiketli_break;

public class etkiletli_break {

	public static void main(String[] args) 
	{
		ilk:
			for(int i = 0; i < 3; i++)
			{
				ikinci:
					for(int j = 0; j < 3; j++)
					{
						if(i == 1 && j ==1)
						{
							continue ilk;
						}
					}
				System.out.println(i + " " + j);
			}

	}

}
