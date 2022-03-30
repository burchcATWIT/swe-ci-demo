package com.demo;

public class FizzBuzz {
    public static String processNumber(int num) {	
		if (num < 0) return "";
		if (num == 0) return "0";
		if (num % 15 == 0) return "FizzBuzz";
		if (num % 3 == 0) return "Fizz";
		if (num % 5 == 0) return "Buzz";
		return num+"";
	}
	
public static String processNumbers (int[] numList) {
		String proc_num, new_nums = "";
		for (int i = 0; i < numList.length; i++) {
			proc_num = processNumber(numList[i]);
			if ((i == numList.length-1) || (proc_num == "")) {
				new_nums = new_nums + proc_num;
		} else {
				new_nums = new_nums + proc_num + ", ";
		}
		return new_nums;
	}
}
