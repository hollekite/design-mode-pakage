package mediator;
/**
 * @Author: lgs
 * @Date: 2019年2月22日 下午8:21:36
 * @Version 1.0
 */

public class JumpColleague extends Colleague {

	public JumpColleague(Mediator modiator) {
		super(modiator);
	}

	@Override
	protected  void change() {
		this.modiator.excute(this);
	}
	
	public void jump() {
		System.out.println("begin jump every day ....");
		change() ;
	}

}
