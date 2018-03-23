import java.util.*;
import java.util.Map.Entry;


public class MyMapKey {
	
	public MyMapKey(String name,int value){
		this.name = name;
		this.value = value;
	}

	public String name;
	public int value;

	public int hashCode() {
		return name.hashCode();
	}

	
	public boolean equals(MyMapKey v){
		return this.value == v.value;
	}


	public static final void main(String[] args){

		HashMap map = new HashMap<MyMapKey,String>();
		MyMapKey key1 = new MyMapKey("name",11);
		MyMapKey key2 = new MyMapKey("name",11);

		System.out.println(key1.hashCode());
		System.out.println(key2.hashCode());

		System.out.println(key1.equals(key2));
		
		map.put(key1,"value1");
		map.put(key2,"value2");


		Iterator<Map.Entry<MyMapKey, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<MyMapKey, String> entry = iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}



		Map<String, String> smap = new HashMap<String, String>();
		smap.put("111","111");
		for (Entry<String, String> entry : smap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}





		
	}


}