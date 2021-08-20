package day11_set_get;

public class Tv_func {

	int powerOn = 0; 

	int channel = 0; 

	int volume = 0;  

	public void setTurnOnOff(int powerOn){
		this.powerOn = powerOn;
	}
	public int getTurnOnOff() {
		return powerOn;
	}
	public void setCh(int channel) {
		this.channel = channel;
	} 
	public int getCh() {
		return channel;
	}
	public void pch() {
		channel++;
		System.out.println("channel: " + channel);
	}
	public void mch() {
		channel--;
		System.out.println("channel: " + channel);
	}
	public void setVol(int volume) {
		this.volume = volume;
	}
	public int getvol() {
		return volume;
	}
	public void setVolUp() {

		volume++;

		System.out.println("volume up: " + volume);

	} 

	public void setVolumeDown(){

		volume--;

		System.out.println("volume down: " + volume);

	}

	public void displayInfo() {

		System.out.println("---- TV 현재 상태 ----");

		System.out.println("채널: " + channel);

		System.out.println("볼륨: " + volume);

	} 



} 
