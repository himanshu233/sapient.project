package day4.collection;

import java.util.ArrayList;

public class Collecex1 {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("fbhukki");
	list.add(152);
	list.add(true);
	for(Object t:list) {
		System.out.println(t);
	}
}
}
