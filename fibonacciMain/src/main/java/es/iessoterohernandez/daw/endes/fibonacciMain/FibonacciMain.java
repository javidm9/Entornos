package es.iessoterohernandez.daw.endes.fibonacciMain;

import es.iessoterohernandez.daw.fibonacci.Fibonacci;

import java.util.Scanner;

public class FibonacciMain {
    
	public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
    	
    	  	int numero;
    	
    	System.out.print("Introduce un número: ");
    		numero = sc.nextInt();
  
    	System.out.println("Serie Fibonacci con " + numero + " iteraciones: ");
    
    	for (int i = 0; i < numero; i++) {
			System.out.print(Fibonacci.fibonacci(i) + " ");
		}

    }
}
