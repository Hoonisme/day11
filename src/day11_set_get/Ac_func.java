package day11_set_get;

public class Ac_func {
	/*������ Ŭ���� ����
	-������ �ѱ�, ���� �Ϸ�

	�µ� ���� ����� �ϴ� �żҵ�
	-up �ϰ�� 1�� ����
	-down �ϰ�� 1�� ����

	���� ���� �µ��� 18������ 30��
	������ on�� �� ����Ǿ��ִ� �µ��� �۵�

	MAX ��� ������ 
	�µ� 18���� �����Ǿ� �۵�

	ǳ�� ��� ������
	-up�� ��� �۵� ������ ��������
	-down�� ��� �۵� ������ �Ʒ�������
	+3���� -3 ���� ������

	��� �κ�
	-on/off
	-���� �µ� ���
	-���� ǳ�� ���
	-MAX�� �ִ� ���� �µ� 18���� ����*/
	
	private int powerOn = 0; 
	
	private int temp = 0;
	
	private int wWay = 0;
	
	public void setTurnOnOff(int powerOn){
		this.powerOn = powerOn;
	}
	public int getTurnOnOff() {
		return powerOn;
	}
	
	public void setTemp(int temp) {
		this.temp = temp;
	} 
	public int getTemp() {
		return temp;
	}
	
	public void pTemp() {
		temp++;
		System.out.println("temp up: " + temp);
	}
	public void mTemp() {
		temp--;
		System.out.println("temp down: " + temp);
	}
	public void setWay(int wWay) {
		this.wWay = wWay;
	}
	public int getWay() {
		return wWay;
	}
	public void setWayUp() {

		wWay++;

		System.out.println("Way up: " + wWay);

	} 

	public void setWayDown(){

		wWay--;

		System.out.println("Way down : " + wWay);

	}
	
	
	
	
}
