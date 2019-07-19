package day4.collection;

import java.util.HashSet;
import java.util.Set;

public class CollectionEx04 {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("dfsgh");
		//set.add("rth");
		System.out.println(set.add("rth"));
		System.out.println(set.add("rth"));
		System.out.println(set.add("rth"));
		System.out.println(set.add("rth"));
		set.add("aaaagh");
		set.add("dfsghjh");
		set.add("dfhgfhbvb");
		set.add("aaaaaaaaaaaaaaaa");
		set.add("zzzzzzzz");
		set.add("dfsgh");
		set.add("dfsgh");
		set.add("dfsgh");
		System.out.println(set);
		
	}

}
