package day11_set_get;

public class Ex05_MainClass {
	public static void main(String[] args) {
		Ex05_set_get ex = new Ex05_set_get();
		
		int k= 100 , e=90 , m=80;
		ex.setKor(k);
		ex.setMath(m);
		ex.setEng(e);
		ex.setSum(k+m+e);
		ex.setAvg(ex.getSum()/3);
		System.out.println("���������� "+ex.getKor()+"�� ���������� "+
				ex.getEng()+"�� ���������� "+ex.getMath()+"��\n�հ�� "+ex.getSum()
				+"�� ��������� "+ ex.getAvg()+"�� �Դϴ�.");
	}
}
