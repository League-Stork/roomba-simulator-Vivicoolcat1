package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 */
	public void initialize() {
driveDirect(1000,1000);
sleep(1000);
driveDirect(100,470);
sleep(1000);
driveDirect(1000,1000);
sleep(4000);
driveDirect(100,450);
sleep(1000);
driveDirect(1000,1000);
sleep(1000);
driveDirect(0,0);
	}

	public void loop() {
	
	}
}
