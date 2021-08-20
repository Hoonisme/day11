package day11_set_get;

public class Ex01_MainClass {
	public static void main(String[] args) {
		/*
		 this는 클래스 자기 자신의 위치정보를 가지고 있다.
		 멤버 메소드를 만들면 자동으로 생성된다
		 */
		Ex01_This ex = new Ex01_This();
		//System.out.println("ex : "+ex);
		//ex.a=7777;
		
		ex.func01(); ex.func02();
	}
}



