package core;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class MultiplyTest
{
	@Test
    public void multiply_test_instanceOf() {
           assertThat(Calculator.multiply(2, 3), instanceOf(Double.class));}

    @Test
    public void multiply_test_2_param() {		
           assertThat(Calculator.multiply(2, 3), equalTo(6.0));}

    @Test
    public void multiply_test_3_param() {
           assertThat(Calculator.multiply(2, 2, 2), equalTo(8.0));}

    @Test
    public void multiply_test_4_param() {
           assertThat(Calculator.multiply(2, 2, 2, 2), equalTo(16.0));}

}
