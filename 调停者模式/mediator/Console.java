package mediator;
/**
 * @Author: lgs
 * @Date: 2019年2月22日 下午8:11:08
 * @Version 1.0
 */
/**测试----先跑后跳然后再飞起来**/
public class Console {
	

	public static void main(String[] args) {
	
		
		CollectMediator cl = new CollectMediator();
		RunColleague run = new RunColleague(cl);
		JumpColleague jump = new JumpColleague(cl);
		FlyColleague fly = new FlyColleague(cl);
		run.startRun();
		jump.jump();
		fly.ready();

	}

}
