import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import vehicle.app.State;
import vehicle.hal.Temp;


class StateTest {
	State StateObj= new State();
	
///////////////////////// true true
	@Test
	void test() 
	{
		Temp.flag = 1 ;
		Temp.validedcalliRead1=0;
		Temp.validedcalliRead2=0;
		boolean Check = StateObj.bValidateLowPerformance();
		assertAll(
					()->assertTrue(Check),
					()->assertEquals(1,Temp.validedcalliRead1),
					()->assertEquals(1,Temp.validedcalliRead2),
					()->assertTrue(Temp.iReadT1()<60),
					()->assertTrue(Temp.iReadT2()>50) 
				);
	}
	
	
/////////////////////////////////// true false
		@Test
		void test1() 
		{
			Temp.flag = 2 ;
			Temp.validedcalliRead1=0;
			Temp.validedcalliRead2=0;
			boolean Check = StateObj.bValidateLowPerformance();
			assertAll(
						()->assertFalse(Check),
						()->assertEquals(1,Temp.validedcalliRead1),
						()->assertEquals(1,Temp.validedcalliRead2),
						()->assertTrue(Temp.iReadT1()<60),
						()->assertFalse(Temp.iReadT2()>50) 
					);
			
		}
		
///////////////////////////////////  false true
	@Test
	void test2() 
	{
		Temp.flag = 3 ;
		Temp.validedcalliRead1=0;
		Temp.validedcalliRead2=0;
		boolean Check = StateObj.bValidateLowPerformance();
		assertAll(
					()->assertFalse(Check),
					()->assertEquals(1,Temp.validedcalliRead1),
					()->assertEquals(0,Temp.validedcalliRead2),
					()->assertEquals(1,Temp.validedseq),
					()->assertFalse(Temp.iReadT1()<60) 
				);
		
	}

}
