package vistor;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

/**
 * @Author: lgs
 * @Date: 2019年3月5日 下午10:11:00
 * @Version 1.0
 * 
 * 访问者模式测试案例---一旦对StructA的操作需要更改则不用改变StructA的结构只需要更改处理该结构的对应的访问者或者是重新定义一个访问者对该结构进行处理即可
 */

public class main {

	public static void main(String[] args) {
		
		Map<String,Object> Datas  = new HashMap<>();
		Datas.put("1", "data_1");
		Datas.put("2", "data_2");
		Datas.put("3", "data_3");
		Datas.put("4", "data_4");
		Datas.put("5", "data_5");
		Struct sData = new StructA();
		//初始化数据结构
		sData.setDatas(Datas);
		//定义访问者--访问者中有处理数据的方法
		Vistor v = new VistorA();
		//定义关联对像accpt
		Accept a = new AccptA();
		a.accpt(v);
		//经过访问者处理之后的数据
		sData = a.opreator(sData);
		for(String key: sData.getDatas().keySet() ) {
			System.out.println("after vistor  key:"+key+"---value:"+sData.getDatas().get(key));
		}
	
	}

}
