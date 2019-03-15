package mediator;
/**
 * @Author: lgs
 * @Date: 2019年2月25日 下午9:23:12
 * @Version 1.0
 */

public class CollectMediator extends Mediator{

	boolean run = false;
	boolean jump = false;
	String msg = "";
	
	Colleague co;
	@Override
	public void excute(Colleague c) {
		if(c instanceof RunColleague) {
			run = true;
			
		}
	
		if(c instanceof JumpColleague) {
			jump = true;
		}
		
		if(c instanceof FlyColleague && !"".equals(msg)) {
			System.out.println(msg);
		}else
		IcanFly();
	}
	
	private void IcanFly() {
		if(run&&jump) {
			System.out.println("after run and jump , i can fly");
			msg = "practice makes perfect , just do it";
		}
	}

	
}
