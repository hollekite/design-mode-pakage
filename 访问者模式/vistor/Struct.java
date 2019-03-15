package vistor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: lgs
 * @Date: 2019年3月5日 下午9:52:15
 * @Version 1.0
 */

public class Struct implements Serializable {
	Map<String,Object> datas  = new HashMap<>();

	public Map<String, Object> getDatas() {
		return datas;
	}

	public void setDatas(Map<String, Object> datas) {
		this.datas = datas;
	}	
}
