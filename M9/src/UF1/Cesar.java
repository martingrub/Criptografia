package UF1;

import java.util.Scanner;

public class Cesar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un texto: ");
		String texto =sc.nextLine();
		System.out.print("Introduce numero: ");
		int N=sc.nextInt();
		String cifrado = cifradoCesar(texto,N);
		System.out.println("Cifrado "+ cifrado);
		String descifrado = descifradoCesar(cifrado,N);
		System.out.println("Descifrado "+ descifrado);
	}
	public static String cifradoCesar(String entrada, int N) {
		String salida="";
		for (int i = 0; i < entrada.length(); i++) {
			if (entrada.charAt(i) >= 'a' && entrada.charAt(i) <= 'z') {
                if ((entrada.charAt(i) + N) > 'z') {                	
                    salida+=((char) (entrada.charAt(i) + N - 26));                    
                } else {
                	salida+=((char) (entrada.charAt(i) + N));                	
                }
            } else if (entrada.charAt(i) >= 'A' && entrada.charAt(i) <= 'Z') {
                if ((entrada.charAt(i) + N) > 'Z') {
                	salida+=((char) (entrada.charAt(i) + N - 26));
                } else {
                	salida+=((char) (entrada.charAt(i) + N));
                }
            }
		}
		return salida;
	}

	public static String descifradoCesar(String entrada, int N) {
		String salida="";
		for (int j = 0; j < entrada.length(); j++) {
			if (entrada.charAt(j) >= 'a' && entrada.charAt(j) <= 'z') {
	            if ((entrada.charAt(j) - N) < 'a') {
	                salida+=((char) (entrada.charAt(j) - N + 26));
	            } else {
	            	salida+=((char) (entrada.charAt(j) - N));
	            }
	        } else if (entrada.charAt(j) >= 'A' && entrada.charAt(j) <= 'Z') {
	            if ((entrada.charAt(j) - N) < 'A') {
	            	salida+=((char) (entrada.charAt(j) - N + 26));
	            } else {
	            	salida+=((char) (entrada.charAt(j) - N));
	            }
	        }
		}
		return salida;
	}
	
}
