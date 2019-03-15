package mediator;
/**
 * @Author: lgs
 * @Date: 2019年2月22日 下午8:19:57
 * @Version 1.0
 */

public class RunColleague extends Colleague {

	public RunColleague(Mediator modiator) {
		super(modiator);
	}

	@Override
	protected void change() {
		this.modiator.excute(this);
	}

	public void  startRun() {
		System.out.println("begin run everday .....");
		change();
	}
	
	

}
