package com.viresh.practice;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicPrograms {
	public static void main(String[] args) {
		// BasicPrograms.rangeOfPrimeNumber();
		// BasicPrograms.primeNumberOne();
		// BasicPrograms.storeEvenAndOdd();
		// BasicPrograms.factOfRange();
		 //BasicPrograms.factOfSingle();
		// BasicPrograms.factOfSingle();
		// BasicPrograms.getCount();
		// BasicPrograms.reverseOfNumber();
		// BasicPrograms.reverseText();
		// BasicPrograms.stringPalindrom();
		// BasicPrograms.numPalindrom();
		// BasicPrograms.square();
		// BasicPrograms.power();
		// BasicPrograms.armStrongNumber();
		// BasicPrograms.buzzNumber();
		// BasicPrograms.largerNumber();
		// BasicPrograms.numberToWord();
		//BasicPrograms.fibonacciSeries();
	}

	// Prime Number for one input
	private static void primeNumberOne() {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (BasicPrograms.isPrime(num)) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not prime number");
		}
		sc.close();
	}

	// Logic
	public static boolean isPrime(int num) {
		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;

	}

	// List Prime number for given Range
	public static void rangeOfPrimeNumber() {
		List<Integer> numbers = new ArrayList();
		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		for (int i = 2; i <= range; i++) {

			boolean isPrime = BasicPrograms.isPrime(i);
			if (isPrime) {
				numbers.add(i);
				// System.out.println(i);

			}

		}
		System.out.println(numbers);
		sc.close();
	}

	// Even And Odd Numbers
	// Logic
	public static boolean evenAndOdd(int num) {
		boolean isEven = false;
		if (num % 2 == 0) {
			return true;
		}
		return isEven;

	}

	// Store even and odd in list
	public static void storeEvenAndOdd() {
		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		List<Integer> evenList = new ArrayList();
		List<Integer> oddList = new ArrayList();
		for (int i = 0; i <= range; i++) {
			if (BasicPrograms.evenAndOdd(i)) {
				evenList.add(i);
			} else {
				oddList.add(i);

			}

		}
		System.out.println("Even List Is  " + evenList);
		System.out.println("Odd List Is  " + oddList);
		sc.close();
	}

	// Factorial of number
	// Logic
	public static long factorial(int num) {
		long fact = 1;
		for (int i = 2; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void factOfRange() {
		System.out.println("Enter the range");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		List<Long> factorials = new ArrayList();
		for (int i = 0; i <= range; i++) {
			factorials.add(BasicPrograms.factorial(i));
		}
		System.out.println(factorials);
		sc.close();

		// Fact of Single
	}

	private static void factOfSingle() {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		long result = BasicPrograms.factorial(num);

		System.out.println(result);
		sc.close();
	}

	// Count Digits
	public static int countDigit(long num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	// using while loop
	public static void getCount() {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		// int digits=BasicPrograms.countDigit(num);
		int digits = BasicPrograms.countDigitUsingForLoop(num);
		System.out.println("number of Digits are  " + digits);
		sc.close();
	}

	public static int countDigitUsingForLoop(long num) {
		int count = 0;
		// for (;num>0;num=num/10,count++);
		for (; num > 0;) {
			num = num / 10;
			count++;
		}
		return count;
	}

	// Reverse Number
	// Logic
	public static long reverseNumber(long num) {
		long reverse = 0;
		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		return reverse;
	}

	// reverse of number
	public static void reverseOfNumber() {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long reverseOfNumber = BasicPrograms.reverseNumber(num);
		System.out.println(reverseOfNumber);
		sc.close();

	}

	// Reverse of String
	// Logic
	public static String reverseString(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	public static void reverseText() {
		System.out.println("Enter the text");
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		String revText = BasicPrograms.reverseString(text);
		System.out.println(revText);
		sc.close();
	}

	// String Palindrom
	// Logic
	public static boolean isPalindrom(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return str.equalsIgnoreCase(rev);
	}

	public static void stringPalindrom() {
		System.out.println("Enter the text");
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		boolean check = BasicPrograms.isPalindrom(text);
		if (check)
			System.out.println(text + "  is a palindrom");
		else
			System.out.println(text + "  is not a palindrom");
		sc.close();
	}

	// number Palindrom
	// Logic
	public static boolean isPalindrom(long num) {
		long originalNum = num;

		long reverse = 0;
		while (num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}

		return originalNum == reverse;

	}

	public static void numPalindrom() {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		boolean check = BasicPrograms.isPalindrom(number);
		if (check)
			System.out.println(number + " is a Palindrom");
		else
			System.out.println(number + " is not a Palindrom");
		sc.close();
	}

	// Square of number
	// Logic
	public static long squareOfNum(int num) {

		return num * num;
	}

	public static void square() {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		long sqaureOfNum = BasicPrograms.squareOfNum(number);
		System.out.println("Square of number is  " + sqaureOfNum);
		sc.close();
	}

	// power of number
	// Logic
	public static long powerOfNum(int base, int power) {
		long powerOfNum = 1;
		for (int i = 0; i < power; i++) {
			powerOfNum = powerOfNum * base;
		}
		return powerOfNum;
	}

	public static void power() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		int base = sc.nextInt();
		System.out.println("Enter the power");
		int power = sc.nextInt();
		long powerOfNum = BasicPrograms.powerOfNum(base, power);
		System.out.println("The power of number is  " + powerOfNum);
		sc.close();
	}

	// ArmStrong Number
	// Logic
	public static boolean isArmStrongNumber(int num) {
		int originalNum = num;
		int count = BasicPrograms.countDigit(num);
		long sum = 0;
		while (num > 0) {
			int store = num % 10;
			sum = sum + BasicPrograms.powerOfNum(store, count);
			num = num / 10;

		}
		return originalNum == sum;

	}

	public static void armStrongNumber() {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean armStrongNumber = BasicPrograms.isArmStrongNumber(number);
		if (armStrongNumber)
			System.out.println(number + "  is Armstrong number");
		else
			System.out.println(number + "  is not Armstrong number");
		sc.close();
	}
	
	// Buzz Number
	// Logic
	public static boolean isBuzzNumber(int num) {
		return num % 7 == 0 || num % 10 == 7;
	}

	public static void buzzNumber() {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean isBuzzNum = BasicPrograms.isBuzzNumber(number);
		if (isBuzzNum)
			System.out.println(number + "  is BuzzNumber");
		else
			System.out.println(number + "  is not BuzzNumber");
		sc.close();
	}
	
	// Largest value between two number
	// Logic
	public static int largestOfTwoNumber(int num1,int num2) {
		return num1>num2?num1:num2;
	}
	public static void largerNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1");
		int number1 = sc.nextInt();
		System.out.println("Enter the number2");
		int number2 = sc.nextInt();
		int largeNumber=BasicPrograms.largestOfTwoNumber(number1, number2);
		System.out.println("Largest number is  "+ largeNumber);
	}
	
		
	
	// Number to word Program
	public static void numberToWord() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number    (5 Digit number)");
	    int num=sc.nextInt();
	    if (num<0 || num>99999) {
	    	System.out.println("Wrong input ");
	    }
	    else {
	    	int a5=num%10;       //-->5th Digit
	    	int x4=num/10;
	    	int a4=x4%10;        //-->4th Digit
	    	int x3=num/100;
	    	int a3=x3%10;        //-->3rd Digit
	    	int x2=num/1000;
	    	int a2=x2%10;        //-->2nd Digit
	    	int x1=num/10000; 
	    	int a1=x1%10;        //-->1st Digit
	    	
	    	String [] uniqueDigit= {" " ,"one","Two","Three","Four", "Five","Six","Seven","Eight","nine","ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Eighteen","Ninteen" };
	    	String [] twoDigit= {"","ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy" ,"Eighty","Ninty"};
	    	String [] threeDigit= {"Hundred"};
	    	String [] fourDigit= {"Thousand"};
	    	
	    	
	    	if(num<20) 
	    		System.out.println(uniqueDigit[num]);
		    	
	    	else if(num<100) 
	    		System.out.println(twoDigit[a4]+uniqueDigit[a5]);   
		    
	    	else if(num<1000) 
	    		System.out.println(uniqueDigit[a3]+threeDigit[0]+twoDigit[a4]+uniqueDigit[a5]);
	    	
	    	else if(num<10000) 
	    		System.out.println(uniqueDigit[a2]+" "+fourDigit[0]+" "+uniqueDigit[a3]+" "+threeDigit[0]+" "+twoDigit[a4]+" "+uniqueDigit[a5]);
	    	
	    	else if(num<20000) 
	    		System.out.println(uniqueDigit[a1*10+a2-1]+" "+ fourDigit[0]+uniqueDigit[a3]+threeDigit[0]+twoDigit[a4]+uniqueDigit[a5]);
	    	
	    	else if(num<100000) 
	    		System.out.println(twoDigit[a1]+uniqueDigit[a2]+" "+fourDigit[0]+uniqueDigit[a3]+threeDigit[0]+twoDigit[a4]+uniqueDigit[a5]);
	    	
	    	 
	    		
	    	
	    	
	    	
	    }
	    
		
	}

	// FibonacciSeries Logic
	public static void fibonacciSeries() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range");
		int range = sc.nextInt();
		int n1 = 0, n2 = 1, n3, i;
		System.out.print("FibonacciSeries for given range is: " + n1 + " " + n2);
		for (i = 2; i < range; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		
	}
}
