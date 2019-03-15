package vistor;
/**
 * @Author: lgs
 * @Date: 2019年3月5日 下午10:07:53
 * @Version 1.0
 */

public class AccptA extends Accept {

	@Override
	public Struct opreator(Struct s ) {
		for(Vistor v: vs) {
			v.vist(s);
		}
		return s;
	}

}
