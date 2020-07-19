package com.company;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите длину массива: ");
		int a = sc.nextInt();
		a +=1;
		int[] name = new int[a];
		for (int i = 1; i < a; i++) {
			System.out.print("Введите значение " + i + "-го элемент списка: ");
			int num = sc.nextInt();
			name[i] = num;
			if (i == a){
				System.out.println("Все готово!");
				break;
			}
		}
		System.out.println("Длина массива: " + (name.length -1));
	}
}
