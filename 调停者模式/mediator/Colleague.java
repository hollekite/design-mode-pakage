package mediator;
/**
 * @Author: lgs
 * @Date: 2019年2月22日 下午8:13:26
 * @Version 1.0
 */

public abstract class Colleague {

	protected Mediator modiator;
	
	public Colleague(Mediator modiator) {
		this.modiator = modiator;
	}
	
	protected abstract void change();
}
