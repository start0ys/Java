package robot;

import robot.actions.FireOk;
import robot.actions.FlyOk;
import robot.actions.KnifeWithLazer;

public class SuperRobot extends Robot {
	public SuperRobot() {
		flyAtion = new FlyOk();
		fireAction = new FireOk();
		knifeAction = new KnifeWithLazer();
	}
	@Override
	public void shape() {
		System.out.println("걷고 달리고 날 수 있습니다");
		
	}

}
