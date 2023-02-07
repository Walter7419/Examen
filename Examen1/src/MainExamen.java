import java.util.Scanner;

public class MainExamen{

	public static void main(String[] args) {
		int r;
		
		Scanner frases = new Scanner(System.in);
		System.out.println("Dame una frase");
		String fra1 = frases.nextLine();
		
	ForExamen form = new
	ForExamen (fra1);
	do {
	Scanner menu = new Scanner(System.in);
	System.out.println("1. Escribir la primer letra en Mayuscula");
	System.out.println("2. Invertir la cadena");
	System.out.println("3. Escribir las vocales en Mayusculas");
	System.out.println("4. El juego de Fizz buzz");
	System.out.println("5. Saber si tu cadena es un palindromo");
	System.out.println("6. Salir");	
	System.out.println("Escribe el numero de lo quee quieres hacer");
	
	r=Integer.parseInt(menu.nextLine());
	
	switch(r) {
	case 1:
	System.out.println(form.primeraMayuscula()+"\n");
	break;
	case 2:
	System.out.println(form.invertirCadena()+"\n");
	break;
	case 3:
	System.out.println(form.vocalesMayuscula()+"\n");
	break;
	case 4:
	form.fizzBuzz();
	break;
	case 5:
	if(form.palindromo()) { 
		System.out.println("Es un palindrmomo\n");
	}
	else {
		System.out.println("No es un Palindromo\n");
	}
	break;
	case 6:
		System.out.println("Adios...");
		break;
	}
	}while(r <= 5);
	
	}
	
}

