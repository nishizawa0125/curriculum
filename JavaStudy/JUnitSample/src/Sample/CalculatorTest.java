package Sample;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test																																																
	public void ともに自然数() {																								

		int result = Calculator.absAdd(3, 5);							
		assertThat(result, is(8));																								

	}
	@Test
	public void わざとエラー() {
		int result = Calculator.absAdd(-1, -15);
		assertThat(result, is(16));

	
	}
}