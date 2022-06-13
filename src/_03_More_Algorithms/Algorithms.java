package _03_More_Algorithms;

import java.util.Iterator;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		int lastM = num1 * num2;
		return num1 + " x " + num2 + " = " + lastM;
	}

	static boolean isPrime(int input) {
		for (int i = 2; i < input - 1; i++) {

			if (input % i == 0) {
		
				return false;
			}
		}

		return true;

	}

	static boolean isSquare(int input) {
		double squared = Math.sqrt(input);
		double check = Math.floor(squared);
		if (squared - check == 0) {
			return true;

		}
		return false;

	}
	static boolean isCube(int input) {
		double cubed = Math.cbrt(input);
		System.out.println(cubed);
		double check = Math.floor(cubed);
		if (cubed - check == 0) {
			return true;
		}
		return false;
	}

	
	
	public static int findBrokenEgg(List<String> eggs) {
		int index = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				index = i;
				break;
			}
		}
		return index;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int amount = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				amount++;
			}
		}
		return amount;
	}

	public static double findTallest(List<Double> peeps) {
		Double highest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if(highest < peeps.get(i)) {
				highest = peeps.get(i);
			}
		}
		return highest;
	}

	public static Object findLongestWord(List<String> words) {
		int charlongest = 0;
		String longestword = null;
		for (int i = 0; i < words.size(); i++) {
			int amount = words.get(i).length();
			System.out.println(amount);
			if(charlongest < amount) {
				longestword = words.get(i);
				charlongest = longestword.length();
			}
		}
		System.out.println(longestword);
		return longestword;
	}
}
