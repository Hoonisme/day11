package day11_set_get;

public class EX02_This {
	public int age = 0;
	public void ageFunc(int age) {this.age = age-1;}
	public void printAge() {System.out.println("당신의 나이 : "+age);}
}
