package smaller_numbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.SelectorResolutionResult;

class Junit_Test {

	@Test
	void test1() {
		Smaller_Num small_Num = new Smaller_Num();
		int[] test = {8,1,2,2,3};
		int[] expected_solution = {4,0,1,1,3};
		int[] given_solution = small_Num.smallerNumbersThanCurrent(test);
		assertArrayEquals(expected_solution, given_solution);
	}
	@Test
	void test2() {
		Smaller_Num small_Num = new Smaller_Num();
		int[] test = {6,5,4,8};
		int[] expected_solution = {2,1,0,3};
		int[] given_solution = small_Num.smallerNumbersThanCurrent(test);
		assertArrayEquals(expected_solution, given_solution);
	}
	@Test
	void test3() {
		Smaller_Num small_Num = new Smaller_Num();
		int[] test = {7,7,7,7};
		int[] expected_solution = {0,0,0,0};
		int[] given_solution = small_Num.smallerNumbersThanCurrent(test);
		assertArrayEquals(expected_solution, given_solution);
	}
	

}
