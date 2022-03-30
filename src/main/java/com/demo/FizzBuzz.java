package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
	{	
		if (num < 0) return "";
		if (num == 0) return "0";
		if (num % 15 == 0) return "FizzBuzz";
		if (num % 3 == 0) return "Fizz";
		if (num % 5 == 0) return "Buzz";
		return num+"";
	}
	
	String processNumbers (int[] numList) {
		String proc_num, new_nums = "";
		for (int i = 0; i < nums.length; i++) {
		  proc_num = processNumber(nums[i]);
		  if ((i == nums.length-1) || (proc_num == "")) {
		    new_nums = new_nums + proc_num;
		  } else {
		    new_nums = new_nums + proc_num + ", ";
		  }
		}
		return new_nums;
	}

}
