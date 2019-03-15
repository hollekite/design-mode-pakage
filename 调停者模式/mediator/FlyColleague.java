package mediator;
/**
 * @Author: lgs
 * @Date: 2019年2月22日 下午8:22:22
 * @Version 1.0
 */

public class FlyColleague extends Colleague {

	public FlyColleague(Mediator modiator) {
		super(modiator);
	}
	@Override
	protected void change() {
		this.modiator.excute(this);
	}
	
	public void ready() {
		change();
	}
	

}
