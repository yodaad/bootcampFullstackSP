package challenges;

import java.util.*;

public class Challenge1 {

	public static void randomNumbers(String palabra) {

		Random random = new Random();
		int arr[] = new int [8];
		int x = palabra.length();

		// Valor de entrada "Tipo A".
		if ( x % 2 == 0 ) {

			for (int i = 0; i < arr.length; i++) {
				arr[i] = random.nextInt(10);
			}
			System.out.println("54"+Arrays.toString(arr).replaceAll("[ ,\\[\\]]", "") + "\n");

			// Valor de entrada "Tipo B".
		} else {

			for (int i = 0; i < arr.length; i++) {
				arr[i] = random.nextInt(10);
			}
			System.out.println("08"+Arrays.toString(arr).replaceAll("[ ,\\[\\]]", "") + "\n");
		}
	}

	public static Boolean inList(String pais) {

		List<String> lista = new ArrayList<>(Arrays.asList("colombia", "ecuador", "argentina", "chile", "venezuela", "uruguay"));


		if (lista.contains(pais.toLowerCase())) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Por favor ingrese una palabra: ");
		String palabra = input.next();

		randomNumbers(palabra);

		System.out.println("Por favor ingrese un pais en suramerica: ");
		String pais = input.next();
		input.close();

		if (inList(pais) == true) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}





	}

}
