package com.lab18;

public class NumberCounter {

	public static void main(String[] args) {
		
//		MyList test = new MyLinkedList();
//		MyList test = new MyArrayList();
//		test.addAtEnd("_");
//		test.addAtEnd("_");
//		test.addAtEnd("O");
//		test.addAtEnd("_");
//		System.out.println(test.toString());
//		test.removeAt(3);
//		test.insertAt("1", 2);
//		System.out.println(test.toString());
		
		int[] numbers = {1,2,3,4,5,6,7,8};
		int dez = 0;
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int sete = 0;
		int oito = 0;
		int nove = 0;
		
		for (int i = 0; i < numbers.length; i++) {

			switch (numbers[i]) {
			
			case 10: 
				dez++;
				break;
			case 1:
				um++;
				break;
			case 2:
				dois++;
				break;
			case 3:
				tres++;
				break;
			case 4:
				quatro++;
				break;
			case 5:
				cinco++;
				break;
			case 6:
				seis++;
				break;
			case 7:
				sete++;
				break;
			case 8:
				oito++;
				break;
			case 9:
				nove++;
				break;
			}
		}
		
		System.out.println("Um: " + um +
						   "\nDois: " + dois +
						   "\nTres: " + tres +
						   "\nQuatro: " + quatro +
						   "\nCinco: " + cinco +
						   "\nSeis: " + seis +
						   "\nSete: " + sete +
						   "\nOito: " + oito +
						   "\nNove: " + nove +
						   "\nDez: " + dez);
		
	}

}
