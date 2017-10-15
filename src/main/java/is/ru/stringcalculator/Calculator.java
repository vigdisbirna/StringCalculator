package is.ru.stringcalculator;

public class Calculator {
	
	public static int add(String text){
		
		if(text.isEmpty())
		{
			return 0;
		}

		String[] temp = text.split("[,\\n]+");
		String[] neg;
		int countNeg = 0; 
		int sum = 0;
        
        for(int i = 0; i <temp.length; i++)
        {
        	if(Integer.parseInt(temp[i]) < 0)
        		{
        			countNeg++;
        		}
        } 

        neg = new String[countNeg];
        int count = 0;

        for(int i = 0; i < temp.length; i++)
        {
        	if(Integer.parseInt(temp[i]) < 0)
        		{
        			neg[count] = temp[i];
        			count++;
        		}
        }

        if(countNeg > 0)
        {
        	String error = "";

        	for(int i = 0; i < neg.length; i++)
        	{
        		error = neg[i] + ", ";
        	}

        	throw new RuntimeException("Negatives not allowed: " + error);
        }


        for(int i = 0; i < temp.length; i++)
		{
			sum = Integer.parseInt(temp[i]) + sum;
		}

		return sum;
	}
}