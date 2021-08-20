package day11_set_get;

public class Tv02_func {

		private boolean power;

		private int volume;

		private int channel;

		private final int SIZE = 60;



		public void powerOn() {

			power = !power;

			if(power==true)

			System.out.println("전원이 켜졌습니다.");

			else

				System.out.println("전원이 꺼져있습니다.");

		}



		public boolean isPower() {

			return power;

		}



		public void setPower(boolean power) {

			this.power = power;

		}



		public int getVolume() {

			return volume;

		}



		public void setVolume(int volume) {

			this.volume = volume;

		}



		public int getChannel() {

			return channel;

		}



		public void setChannel(int channel) {

			this.channel = channel;

		}



		public int getSIZE() {

			return SIZE;

		}



		public void volumeUp() {

			volume++;

		}



		public void volumeDown() {

			volume--;

		}



		public void channelUp() {

			channel++;

		}

		public void channelDown() {

			channel--;

		}



















	}