package day11_set_get;

public class Ac_func {
	/*에어컨 클래스 생성
	-에어컨 켜기, 끄기 완료

	온도 조절 기능을 하는 매소드
	-up 일경우 1도 증가
	-down 일경우 1도 감소

	가능 설정 온도는 18도에서 30도
	에어컨 on할 시 저장되어있던 온도로 작동

	MAX 기능 구현시 
	온도 18도로 조절되어 작동

	풍량 기능 구현시
	-up일 경우 작동 방향이 위쪽으로
	-down일 경우 작동 방향이 아래쪽으로
	+3에서 -3 까지 가능함

	출력 부분
	-on/off
	-현재 온도 출력
	-현재 풍량 출력
	-MAX시 최대 가동 온도 18도로 가능*/
	
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
