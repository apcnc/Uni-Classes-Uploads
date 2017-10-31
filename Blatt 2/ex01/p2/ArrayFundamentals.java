package de.unistuttgart.iaas.pse.ex01.p2;

public class ArrayFundamentals {

	public static int computeMin(int[] numbers) {
		int smallestNumber = Integer.MAX_VALUE;
		for(int i = 0; i < numbers.length; i++){
			if(smallestNumber > numbers[i]){
				smallestNumber = numbers[i];
			}
		}
		return smallestNumber;
	}

	public static void printOddNumbers(int[] numbers) {
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i]%2==1){
				System.out.println(numbers[i]);
			}
		}
	}

	public static int sumEvenElements(int[] numbers) {
		int sumEvenNumbers = 0;
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i]%2==0){
				sumEvenNumbers+=numbers[i];
			}
		}
		return sumEvenNumbers;
	}

	public static void main(String[] args) {
		// to test
		int[] numbers = { 2, 4, 6, 1, 3, 2, 8, 9, 43, 35, 42, 187, 99, 0, 12 };
		System.out.println(sumEvenElements(numbers));
		System.out.println(computeMin(numbers));
		printOddNumbers(numbers);
	}
}