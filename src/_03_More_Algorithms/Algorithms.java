package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
     int lastM = num1*num2; 
    	return num1 + " x " + num2 + " = " + lastM;
    }
    static boolean isPrime(int input) {
		for (int i = 2; i < input-1; i++) {
			
			if (input % i == 0) {
				System.out.println(i);
				return false;
			}
		}

    	return true;
    	
    }
    static boolean isSquare(int input) {
		for (int i = 0; i < array.length; i++) {
			
		}
    	
    }
    public static int findBrokenEgg(List<String> eggs) {
        return 0;
    }
}
