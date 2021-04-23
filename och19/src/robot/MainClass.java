package robot;

public class MainClass {
	
	static void action (Robot r) {
	
		r.shape();
		r.actionBasic();
		r.actionFly();
		r.actionFire();
		r.actionKnife();
		System.out.println("--------------------------");
	}
	
	
	public static void main(String[] args) {
		Robot [] rb = new Robot[3]  ;
		rb[0] = new SuperRobot();
		rb[1] = new StandardRobot();
		rb[2] = new CheapRobot();
		String [] rbKind = {"SuperRobot","StandardRobot","CheapRobot"};
		int i = 0;
		for (Robot r : rb) {
			System.out.println(rbKind[i]+" 주문. 만들어주세요.");	
			action(r);
			i++;
		}
		
		
//		System.out.println("SuperRobot 주문. 만들어주세요");
//		Robot superRobot = new SuperRobot();
//		superRobot.shape();
//		superRobot.actionBasic();
//		superRobot.actionFly();
//		superRobot.actionFire();
//		superRobot.actionKnife();
//		System.out.println("------------------");
//		System.out.println("SrandardRobot 주문. 만들어주세요");
//		Robot srandardRobot = new StandardRobot();
//		srandardRobot.shape();
//		srandardRobot.actionBasic();
//		srandardRobot.actionFly();
//		srandardRobot.actionFire();
//		srandardRobot.actionKnife();
//		System.out.println("------------------");
//		System.out.println("CheapRobot 주문. 만들어주세요");
//		Robot cheapRobot = new CheapRobot();
//		cheapRobot.shape();
//		cheapRobot.actionBasic();
//		cheapRobot.actionFly();
//		cheapRobot.actionFire();
//		cheapRobot.actionKnife();
//		

	}

}
