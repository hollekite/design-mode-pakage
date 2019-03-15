package state;
/**
 * @Author: lgs
 * @Date: 2019年3月6日 下午8:24:06
 * @Version 1.0
 */

public class StateA implements State {

	@Override
	public void deal(Context c) {
		
		System.out.println("state:"+c.getFlag()+"deal A");
	}

}
