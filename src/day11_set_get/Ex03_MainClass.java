package day11_set_get;

public class Ex03_MainClass {
	public static void main(String[] args) {
		Ex03_set_get ex = new Ex03_set_get();
		
		ex.setNum(12345); 
		ex.setName("Hello");
		ex.print();
		
		int num = ex.getNum() - 1000;
		String name = ex.getName() + " my friend";
		
		System.out.println(name);
		System.out.println(num);
	}
}
