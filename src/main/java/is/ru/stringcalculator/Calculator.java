package is.ru.stringcalculator;

public class Calculator {
	
	public static int add(String text){
		
		if(text.isEmpty())
		{
			return 0;
		}

		String[] temp = text.split(",");
		int sum = 0;
        

        if(temp.length == 1)
        {
        	return Integer.parseInt(temp[0]);
        }

        else if(temp.length == 2)
        {
        	return Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
        }

		/*for(int i = 0; i < temp.length(); i++)
		{
			sum = temp[i] + sum;
		}*/

		return sum;
	}
}