import  static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ComuterTestEquality {

	@Test
	public void assertThatTwoObjsAreAliases() {
		Computer underTest = new Computer("make", "model", 0);
		Computer underTest2 = new Computer("make", "model", 0);
		underTest = underTest2; //creates and alias
		boolean check = (underTest == underTest2);
		assertEquals (check, true);
	}
	
	@Test
	public void assertObjEqualsMethodWorksAsExpected() {
		Computer underTest = new Computer("make", "model", 0);
		Computer underTest2 = new Computer("make", "model", 0);
		underTest = underTest2;
		boolean check = underTest.equals(underTest2);
		assertEquals(check,false);
	
	}
	
	
	public void assertStringEqualsMethodWorksAsExpected() {
		Computer underTest = new Computer("make", "model", 0);
		Computer underTest2 = new Computer("make", "model", 0);
		boolean check = underTest.getMake().equals(underTest2.getMake());
		assertEquals(check,true);
}
	@Test
	public void assertComputerEqualsMethodWorksasExpected () {
		Computer underTest = new Computer("make", "model", 0);
		Computer underTest2 = new Computer("make", "model", 0);
		boolean check = underTest.equals(underTest2);
		assertEquals(check,false);
	}
}
