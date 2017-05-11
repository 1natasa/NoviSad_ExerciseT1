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
		Frame frejm= new Frame(6,4);
		assertTrue(frejm.isSpare());
	}
	
	@Test
	public void Da_li_dobro_racuna_rezultat_frejma() throws BowlingException
	{
		Frame frejm= new Frame(5, 3);
		int ocekivani_rezultat=8;
		assertEquals(ocekivani_rezultat, frejm.score());
	}
}
