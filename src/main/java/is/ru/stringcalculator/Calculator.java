package is.ru.stringcalculator;

public class Calculator {
	
	public static int add(String text){
		
		if(text.isEmpty())
		{
			return 0;
		}

		String[] temp = text.split(",");
		int sum = 0;
        
        for(int i = 0; i < temp.length; i++)
		{
			sum = Integer.parseInt(temp[i]) + sum;
		}

		return sum;

	}
}