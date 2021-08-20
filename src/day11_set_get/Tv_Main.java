package day11_set_get;

import java.util.Scanner;

public class Tv_Main {
	public static void main(String[] args) {


		Tv_func tv = new Tv_func();
	
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1.Tv On/Off");
			System.out.println("2.Tv 채널 설정");
			System.out.println("3.Tv 채널조정");;
			System.out.println("4.Tv 볼륨조정");
			System.out.print(">>>");
			int re = input.nextInt();
		switch(re) {
		case 1 : System.out.print("tv를 켜시겠습니까? 1.킨다 2.끈다 ");
				int tu = input.nextInt();
				tv.setTurnOnOff(tu);
				if(tv.getTurnOnOff()==1) {
				System.out.println("tv가 켜집니다");
				break;
				}
				else {
					System.out.println("tv가 꺼집니다");
					System.exit(1);
				}
		case 2 :  if(tv.getTurnOnOff() == 1) {
			System.out.print("최초 채널 설정 : ");
			int r = input.nextInt();
			if(r>140 || r< 1) {
				System.out.println("다시 설정해 주세요.");
				continue;
			}
			else {
				tv.setCh(r);
			break;
			}
		}
		else {
			System.out.println("티비를 켜고 오세요");
			break;
		}
		
		case 3 : if(tv.getCh()==0) {
			System.out.println("채널 설정 해주세요");
			break;}
				
			else {while(true) {
				System.out.print("채널 방향키 : 1.up 2.down 3.exit\n:");
				int e = input.nextInt();
				if(e ==1) {tv.pch();
				if(tv.getCh()>140) {
					tv.setCh(1);
					System.out.println(tv.getCh()+"\n1번으로 이동합니다.");
				}
				}
				
				else if(e == 2 ) {tv.mch();
					if(tv.getCh()<1) {
						tv.setCh(140);
						System.out.println(tv.getCh()+"\n140번으로 이동합니다.");
				}
					}
				
				else if (e == 3 ) { break;}
				
				else { System.out.println("재선택 해주세요.");
				
				}
			}
			}
				
				
				
				
			
		case 4 :
			if(tv.getTurnOnOff() == 1) {
				while(true) {
					System.out.print("볼륨을 조절하세요 : 1.up 2.down 3.exit\n:");
					int v = input.nextInt();
					if(v == 1 ) {
						
					 tv.setVolUp();
					 if(tv.getvol() >= 40 ) {
						 System.out.println("최대 볼륨입니다.");
						 tv.setVol(40);
					 }
					}
					else if(v == 2) {  tv.setVolumeDown();
					if(tv.getvol() <= 0 ) {
						 System.out.println("최소 볼륨입니다.");
					 tv.setVol(0);
					}
					}
					else if(v==3) { break;
					}
				}
			}
			else {
				System.out.println("전원을 키고 오세요");
				break;
			}
		
		
			}
			}
		}}
		
		


		





