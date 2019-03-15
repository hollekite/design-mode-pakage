package state;
/**
 * @Author: lgs
 * @Date: 2019年3月6日 下午8:41:36
 * @Version 1.0
 */

public class BridgeA {

	private Context c;
	private State state;

	public void setC(Context c) {
		this.c = c;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void  manage() {
		if(1==this.c.getFlag()) {
			state = new StateA();
		}else {
			state = new StateB();
		}
		
		state.deal(this.c);
		
	}
	
	
}
