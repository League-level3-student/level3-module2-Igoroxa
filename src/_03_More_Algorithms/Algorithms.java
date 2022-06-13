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

	public static Object containsSOS(List<String> message1) {
if (message1.contains("... --- ...") == true) {
	return true;
	
}
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
	
		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.size()-1; j++) {
				if (results.get(j) > results.get(j+1)) {
					Double temp = results.get(j);
					results.set(j, results.get(j+1));
					results.set(j+1, temp);
				}
			}
		}
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		
		for (int i = 0; i < unsortedSequences.size(); i++) {
			for (int j = 0; j < unsortedSequences.size()-1; j++) {
				if (unsortedSequences.get(j).length() > unsortedSequences.get(j+1).length()) {
					String temp = unsortedSequences.get(j);
					unsortedSequences.set(j, unsortedSequences.get(j+1));
					unsortedSequences.set(j+1, temp);
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.size()-1; j++) {
				if (words.get(j).compareTo(words.get(j+1)) > 0)  {
					String temp = words.get(j);
					words.set(j, words.get(j+1));
					words.set(j+1, temp);
				}
			}
		}
		return words;
	}
	
	
}
