package robot;

import robot.actions.FireAction;
import robot.actions.FlyAtion;
import robot.actions.KnifeAction;  // 다른 패키지일떄는 import받아야한다 같은패기지는 안받아도됨 자동완성으로 만드는게 편하다

public abstract class Robot {
	public FlyAtion flyAtion;
	public FireAction fireAction;
	public KnifeAction knifeAction;
	
	public Robot() {
		
	}
	// 나를 상속받는 Class에게 이것을 구현하라고 명령 - 추상메소드는 무조건 구현해야하기때문에
	public abstract void shape();
	
	public void actionFly() {
		flyAtion.fly();
	}
	public void actionKnife(){
		knifeAction.knife();
	}
	public void actionFire() {
		fireAction.fire();
	}
	public void actionBasic() {
		System.out.println("팔,다리,머리,몸통 존재");
	}
	public void setFlyAtion(FlyAtion flyAtion) {
		this.flyAtion = flyAtion;
	}
	public void setFireAction(FireAction fireAction) {
		this.fireAction = fireAction;
	}
	
	
} 
