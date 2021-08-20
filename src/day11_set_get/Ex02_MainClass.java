package day11_set_get;

import java.util.Scanner;

public class Ex02_MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		EX02_This ex = new EX02_This();
		System.out.print("나이 입력 : ");
		int a = input.nextInt();
		ex.ageFunc(a);
		ex.printAge();
	}
}
