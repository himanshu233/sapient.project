package day4.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Collectionex02 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	System.out.println(list.size());
	list.add("sdfgh");
	list.add("ag");
	list.add("strdhyuftgh");
	list.add("dsfgh");
	List<String> l2=list.subList(0,2);
	System.out.println(list.size());
	for(String t:list) {
		System.out.println(t);
	}
	System.out.println("-----------------------------------");
	System.out.println(l2);
	Vector<String> l=new Vector<>();
}
}
