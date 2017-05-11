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
	
	@Test
	public void da_li_dodaje_frame()
	{
		BowlingGame game= new BowlingGame();
		Frame frame=new Frame(10, 0);
		game.addFrame(frame);
		
		int ocekivani_br_frame=1;
		assertEquals(ocekivani_br_frame,1);
	}
}
