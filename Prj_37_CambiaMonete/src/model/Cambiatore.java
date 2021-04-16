package model;

import java.util.Arrays;

public class Cambiatore {

	public static int[] cambia(int amount) {
		
		int[] denaroCambiato = new int[9];
		
		int p500 = 0;
		int p200 = 0;
		int p100 = 0;
		int p50 = 0;
		int p20 = 0;
		int p10 = 0;
		int p5 = 0;
		int p2 = 0;
		int p1 = 0;
		
		//pezzi da 500
		if (amount >= 500) {//500-999 > 1, 1000-1499 > 2, ... 
			while (amount >= 500) {
				amount -= 500;
				p500++;
			}
			denaroCambiato[0] = p500; 
		}
		//pezzi da 200
		if (amount >= 200) {
			while (amount >= 200) {
				amount -= 200;
				p200++;
			}
			denaroCambiato[1] = p200; 
		}		
		//pezzi da 100
		if (amount >= 100) {
			while (amount >= 100) {
				amount -= 100;
				p100++;
			}
			denaroCambiato[2] = p100; 
		}		
		//pezzi da 50
		if (amount >= 50) {
			while (amount >= 50) {
				amount -= 50;
				p50++;
			}
			denaroCambiato[3] = p50; 
		}		
		//pezzi da 20
		if (amount >= 20) {
			while (amount >= 20) {
				amount -= 20;
				p20++;
			}
			denaroCambiato[4] = p20; 
		}
		//pezzi da 10
		if (amount >= 10) {
			while (amount >= 10) {
				amount -= 10;
				p10++;
			}
			denaroCambiato[5] = p10; 
		}
		//pezzi da 5
		if (amount >= 5) {
			while (amount >= 5) {
				amount -= 5;
				p5++;
			}
			denaroCambiato[6] = p5; 
		}
		//pezzi da 2
		if (amount >= 2) {
			while (amount >= 2) {
				amount -= 2;
				p2++;
			}
			denaroCambiato[7] = p2; 
		}		
		//pezzi da 1
		if (amount >= 1) {
			while (amount >= 1) {
				amount -= 1;
				p1++;
			}
			denaroCambiato[8] = p1; 
		}		
		
		return denaroCambiato;
	}
	
	public static void main(String[] args) {
		int[] cambia = Cambiatore.cambia(1796);
		Arrays.stream(cambia).forEach(e -> System.out.println(e));
	
	}
}
