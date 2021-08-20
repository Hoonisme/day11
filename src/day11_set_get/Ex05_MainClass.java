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
		System.out.println("국어점수는 "+ex.getKor()+"점 영어점수는 "+
				ex.getEng()+"점 수학점수는 "+ex.getMath()+"점\n합계는 "+ex.getSum()
				+"점 평균점수는 "+ ex.getAvg()+"점 입니다.");
	}
}
