package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String rev = "";
			for (int i = s.length()-1; i > -1; i--) {
			rev += s.substring(i,i+1);
			}
			System.out.println(rev);
		}, "backwards");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
		String mix = "";
		for (int i = 0; i < s.length(); i++) {
		int a = new Random().nextInt(2);
		if(a == 0) {
		mix += s.substring(i,i+1).toLowerCase();
		}
		if(a ==1) {
		mix += s.substring(i,i+1).toUpperCase();
		}
		}
		System.out.println(mix);
		}, "bananaphone");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
		String per = "";
		for (int i = 0; i < s.length(); i++) {
		per += s.substring(i,i+1);
		per += ".";
		}
		System.out.println(per);
		}, "periods");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
		String a = "";
		for(int i = 0; i < s.length(); i++) {
		String b = s.substring(i, i+1);
		if(b.equals("a") || b.equals("e") ||b.equals("i") ||b.equals("o") ||b.equals("u")) {
		}else {
		a += b;
		}
		}
		System.out.println(a);
		}, "eustace constantine");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
