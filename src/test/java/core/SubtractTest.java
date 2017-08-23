package core;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class SubtractTest
{
	@Test
    public void subtract_test_instanceOf() {
           assertThat(Calculator.subtract(2, 2), instanceOf(Double.class));}

    @Test
    public void subtract_test_2_param() {		
           assertThat(Calculator.subtract(3, 2), equalTo(1.0));}

    @Test
    public void subtract_test_3_param() {
           assertThat(Calculator.subtract(8, 2, 1), equalTo(5.0));}

    @Test
    public void subtract_test_4_param() {
           assertThat(Calculator.subtract(10, 3, 2, 1), equalTo(4.0));}

}
