import static org.junit.Assert.*;

import org.junit.Test;

public class ColorTest {

	@Test
	public void test() {
		Color color = new Color(1, 2, 3);
		double hue = color.hue();
		assertEquals(5.0, hue, 1e-30);
	}

}
