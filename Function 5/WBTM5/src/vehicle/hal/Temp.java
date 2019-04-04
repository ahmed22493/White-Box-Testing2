package vehicle.hal;

public class Temp {
	
	public static int validedcalliRead1=0 ;
	public static int validedcalliRead2=0 ;
	public static int validedseq=0 ;

	public static int flag ;
	
	public static int iReadT1()
	{
		int ret=0;
		validedcalliRead1 ++;
		validedseq=1 ;

		
		if(flag==1)
		{
			ret= 30;
		}
		
		else if (flag==2)
		{
			ret= 30;		
		}
		
		else if (flag==3)
		{
			ret= 70;		
		}
		return ret ;
	}
	
	public static int iReadT2()
	{
		validedcalliRead2 ++ ;
		validedseq=2 ;

		int ret=0 ;
		if(flag==1)
		{
			ret= 70;
		}
		else if (flag==2)
		{
			ret= 30;		
		}
		else if (flag==2)
		{
			ret = 70;
		}
		return ret ;
	}
	
	
	
}
