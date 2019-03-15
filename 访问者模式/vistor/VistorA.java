package vistor;
/**
 * @Author: lgs
 * @Date: 2019年3月5日 下午9:55:54
 * @Version 1.0
 */

public class VistorA implements Vistor {

	
	/**
	 * 此方法为针对结构-数据 Struct的访问操作
	 */
	@Override
	public void vist(Struct s) {
		for(String key:s.getDatas().keySet()) {
			System.out.println("visted  data-"+key+" value:"+s.getDatas().get(key));
			s.getDatas().put(key, s.getDatas().get(key)+"visited");
		}
	}

}
