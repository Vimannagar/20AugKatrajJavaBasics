package loops;

public class First100PrimeNumber {
	
	
	public static void main(String[] args) {
		int count = 0;
		int i =1;
		int primecount = 0;
		while(primecount <100)
		{
		
		for(int j=2; j<i; j++ )
		{
			if(i%j==0)
			{
				count = count+1;
			}
			
			
		}
		
		if(count ==0)
		{
			System.out.println(i);
			primecount++;
		}
		else
		{
			count =0;
		}
		
	i++;	
		
	}

}
}
