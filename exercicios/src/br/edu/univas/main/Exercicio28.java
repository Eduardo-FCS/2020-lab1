package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		//TODO Faltou fazer a verifica��o se os numeros digitados est�o entre 1 e 60
		Scanner leitura = new Scanner(System.in);

		int[] numerosSorteados = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o numero sorteado:");
			numerosSorteados[i] = leitura.nextInt();
		}
		
		int[] numerosApostados = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o numero apostado:");
			numerosApostados[i] = leitura.nextInt();
		}
		
		int contador = 0;
		
		for (int i = 0; i < 6; i++) {
			
			for (int j = 0; j < 6; j++) {
				
				if (numerosSorteados[i] == numerosApostados[j]) {
					contador++;
					break;
				}
			}
		}
		
		if (contador == 6) {
			System.out.println("Parab�ns!!! Voc� j� pode se aposentar!");
		} else if (contador == 5) {
			System.out.println("Voc� acertou 5 n�meros! V� at� uma ag�ncia para retirar seu pr�mio!");
		} else if (contador == 4) {
			System.out.println("Voc� acertou 4 n�meros! V� at� uma lot�rica para retirar seu pr�mio!");
		} else if (contador == 3 || contador == 2 || contador == 1) {
			System.out.println("Voc� acertou apenas " + contador + " n�mero(s)! Tente outra vez!");
		} else {
			System.out.println("N�o foi dessa vez :( Tente outra vez!");
		}
			
		leitura.close();
	}
	
}
