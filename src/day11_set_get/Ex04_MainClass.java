package day11_set_get;

import java.util.Scanner;

public class Ex04_MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Ex04_set_get ex = new Ex04_set_get();
		String name;
		int age;
		System.out.print("�̸� �Է� : "); name = input.next(); ex.setName(name);
		System.out.print("���� �Է� : "); age = input.nextInt(); ex.setAge(age);
		System.out.println(ex.getName()+"���� ���̴� "+ex.getAge()+" �� �Դϴ�.");
	}
}
