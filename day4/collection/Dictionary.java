package day4.collection;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Dictionary {
	public static void main(String[] args) {
		
		List<String> goodmorning=Arrays.asList("Good Morning","Namaskar");
		List<String> goodev=Arrays.asList("Good envg","Namaskar");
		List<String> goodmorn=Arrays.asList("Good Morning","Namaskar");
		Map<String,List<String>> map=new HashMap<>();
		map.put("goodmorning", goodmorning);
		map.put("goodev",goodev);
		map.put("goodmorn",goodmorn);
		Iterator<Entry<String,List<String>>> iterator=map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<String,List<String>> next=iterator.next();
			System.out.println("word"+next.getKey());
		}
	}

}
