package exam02;

public class RemoteControlEx {

	public static void main(String[] args) {
	
		RemoteControl rc ;
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(16);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.setVolume(16);
		RemoteControl.changeBattery();
//		rc.changeBattery();
	}

}
