package smaller_numbers;

import org.junit.platform.engine.SelectorResolutionResult;

public class Smaller_Num {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] solution = new int[nums.length];
		int counter = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = 0; j < nums.length; j++) {
				
				if(nums[j] < nums[i]) {
					counter = counter + 1;
				}
			}
			solution[i] = counter;
			counter = 0;
		}
		
		for(int i = 0; i < solution.length; i++) {
			System.out.println(solution[i]);
		}
		
		return solution;
	}
}
