package state;
/**
 * @Author: lgs
 * @Date: 2019年3月6日 下午8:48:20
 * @Version 1.0
 * 状态模式---将对像的不同状态以及状态对应的处理方式分开实现解耦。
 * 
 */

public class main {

	public static void main(String[] args) {
		Context c = new Context();
		c.setFlag(2);
		BridgeA b = new BridgeA();
		b.setC(c);
		b.manage();
		
		c.setFlag(1);
		b.setC(c);
		b.manage();
		
		c.setFlag(0);
		b.setC(c);
		b.manage();

	}

}
