package vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lgs
 * @Date: 2019年3月5日 下午10:00:08
 * @Version 1.0
 */

public abstract class Accept {

	List<Vistor> vs   = new ArrayList<>();
	/**
	 * 
	 * @param v
	 */
	//针对一个或一组数据可能会有一条处理链路，可能会经过一系列的处理
	public void accpt(Vistor v) {
		vs.add(v);
	}
	//在这个方法中实现访问者方法对数据的处理
	public abstract Struct opreator(Struct s);
}
