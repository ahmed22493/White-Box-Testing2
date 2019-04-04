package vehicle.app;

import vehicle.hal.Temp;

public class State {

	public boolean bValidateLowPerformance()
	{
		if( (Temp.iReadT1()<60) && (Temp.iReadT2()>50) )
		{
			return true;
		}else
			{
				return false ;
			}
	}
}
