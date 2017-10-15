package is.ru.stringcalculator;

public class Calculator {
	
	public static int add(String text){
		
		if(text.isEmpty())
		{
			return 0;
		}

		String[] temp = text.split("[,\\n]+");
		String[] neg;
		int sum = 0;
        
        int countNeg = negativeNumbers(temp);
        neg = new String[countNeg];
        fillNegArray(countNeg, temp, neg);

        if(countNeg > 0)
        {
        	throwException(neg);
        }

		return sum(temp);
	}

	public static int sum(String[] temp)
	{
		int _sum = 0;
		for(int i = 0; i < temp.length; i++)
		{
			if(Integer.parseInt(temp[i]) <= 1000)
			{
				_sum = Integer.parseInt(temp[i]) + _sum;
			}
		}

		return _sum;
	}

	public static void fillNegArray(int countNeg, String[] temp, String[] neg)
	{

        
        int count = 0;

        for(int i = 0; i < temp.length; i++)
        {
        	if(Integer.parseInt(temp[i]) < 0)
        		{
        			neg[count] = temp[i];
        			count++;
        		}
        }
	}

	public static int negativeNumbers(String[] temp)
	{
		int countNeg = 0; 
        for(int i = 0; i <temp.length; i++)
        {
        	if(Integer.parseInt(temp[i]) < 0)
        		{
        			countNeg++;
        		}
        } 

        return countNeg;
	}

	public static void throwException(String[] neg)
	{
		String error = "";

        	for(int i = 0; i < neg.length; i++)
        	{
        		error = neg[i] + ", ";
        	}

        	throw new RuntimeException("Negatives not allowed: " + error);
	}
}