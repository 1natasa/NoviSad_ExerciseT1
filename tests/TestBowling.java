import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void Da_li_je_strike()
	{
		//BowlingGame game = new BowlingGame();
		Frame frejm= new Frame(10, 0);
		assertTrue("Jeste stike", frejm.isStrike());
	}
	
	@Test 
	public void Da_li_je_spare() throws BowlingException 
	{
		Frame frejm= new Frame(10,10);
		assertTrue(frejm.isStrike());
	}
}
