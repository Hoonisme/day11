package day11_set_get;

import java.util.Scanner;

public class Tv_Main {
	public static void main(String[] args) {


		Tv_func tv = new Tv_func();
	
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("1.Tv On/Off");
			System.out.println("2.Tv ä�� ����");
			System.out.println("3.Tv ä������");;
			System.out.println("4.Tv ��������");
			System.out.print(">>>");
			int re = input.nextInt();
		switch(re) {
		case 1 : System.out.print("tv�� �ѽðڽ��ϱ�? 1.Ų�� 2.���� ");
				int tu = input.nextInt();
				tv.setTurnOnOff(tu);
				if(tv.getTurnOnOff()==1) {
				System.out.println("tv�� �����ϴ�");
				break;
				}
				else {
					System.out.println("tv�� �����ϴ�");
					System.exit(1);
				}
		case 2 :  if(tv.getTurnOnOff() == 1) {
			System.out.print("���� ä�� ���� : ");
			int r = input.nextInt();
			if(r>140 || r< 1) {
				System.out.println("�ٽ� ������ �ּ���.");
				continue;
			}
			else {
				tv.setCh(r);
			break;
			}
		}
		else {
			System.out.println("Ƽ�� �Ѱ� ������");
			break;
		}
		
		case 3 : if(tv.getCh()==0) {
			System.out.println("ä�� ���� ���ּ���");
			break;}
				
			else {while(true) {
				System.out.print("ä�� ����Ű : 1.up 2.down 3.exit\n:");
				int e = input.nextInt();
				if(e ==1) {tv.pch();
				if(tv.getCh()>140) {
					tv.setCh(1);
					System.out.println(tv.getCh()+"\n1������ �̵��մϴ�.");
				}
				}
				
				else if(e == 2 ) {tv.mch();
					if(tv.getCh()<1) {
						tv.setCh(140);
						System.out.println(tv.getCh()+"\n140������ �̵��մϴ�.");
				}
					}
				
				else if (e == 3 ) { break;}
				
				else { System.out.println("�缱�� ���ּ���.");
				
				}
			}
			}
				
				
				
				
			
		case 4 :
			if(tv.getTurnOnOff() == 1) {
				while(true) {
					System.out.print("������ �����ϼ��� : 1.up 2.down 3.exit\n:");
					int v = input.nextInt();
					if(v == 1 ) {
						
					 tv.setVolUp();
					 if(tv.getvol() >= 40 ) {
						 System.out.println("�ִ� �����Դϴ�.");
						 tv.setVol(40);
					 }
					}
					else if(v == 2) {  tv.setVolumeDown();
					if(tv.getvol() <= 0 ) {
						 System.out.println("�ּ� �����Դϴ�.");
					 tv.setVol(0);
					}
					}
					else if(v==3) { break;
					}
				}
			}
			else {
				System.out.println("������ Ű�� ������");
				break;
			}
		
		
			}
			}
		}}
		
		


		





