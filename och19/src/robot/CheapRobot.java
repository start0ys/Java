package robot;

import robot.actions.FireNo;
import robot.actions.FlyNo;
import robot.actions.KnifeNo;

public class CheapRobot extends Robot {
	// CheapRobot을 Instance화 시킬 때 부품들을 자동 세팅 하기위해
	public CheapRobot() {
		flyAtion = new FlyNo();
		fireAction = new FireNo();
		knifeAction = new KnifeNo();
	}
	
	@Override
	public void shape() {
		System.out.println("걸을 수 있습니다.");

	}

}
