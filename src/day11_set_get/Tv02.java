package day11_set_get;

import java.util.Random;
import java.util.Scanner;

	public class Tv02 {

		Scanner sc = new Scanner(System.in);

		Random r = new Random();

		Tv02_func t = new Tv02_func();

		public void main() {

			while(true) {

				System.out.println("\n = = = �ڷ����� = = = ");

				System.out.println("1. �ڷ����� ����");

				System.out.println("2. �ڷ����� ������");

				System.out.println("3. �ڷ����� �����ٿ�");

				System.out.println("4. �ڷ����� ä�ξ�");

				System.out.println("5. �ڷ����� ä�δٿ�");

				System.out.println("6. �ڷ����� ä�μ���");

				System.out.println("7. �ڷ����� ��������");

				System.out.println("8. �ڷ����� ����Ȯ��");

				System.out.print("�Է� >");

				int sel = sc.nextInt();

				switch(sel) {



				case 1 : powerOn(); break;

				case 2 : t.volumeUp();break;

				case 3 : t.volumeDown();break;

				case 4 : t.channelUp();break;

				case 5 : t.channelDown();break;

				case 6 : channelSet();break;

				case 7 : volumeSet();break;

				case 8 : stateFul(); break;

				default : return;

				}



			}



		}

		

		

		

		

		public void stateFul() {

			

			if(t.isPower()==true)

				System.out.println("��������");

			else

				System.out.println("��������");

			

			System.out.printf("ä�λ���" + t.getChannel());

			System.out.printf("��������" + t.getVolume());

			System.out.println("Ƽ�������"+ t.getSIZE());

		}









		public void volumeSet() {

			System.out.print("������� ���� �Է� : ");

			t.setVolume(sc.nextInt());

		}

		public void channelSet() {

			System.out.print("������� ä�� �Է� : ");

			t.setChannel(sc.nextInt());

		}

		public void powerOn() {

			System.out.println("����ų����?(y,n)");

			char answer = sc.next().charAt(0);

			if(answer=='y' || answer=='Y') {

				System.out.println("������ �����ϴ�.");

				t.setPower(true);

			}

			else {

				System.out.println("������ ���ϴ�.");

				t.setPower(false);

			}

		}





	}

