package day2;

import java.util.Arrays;

public class StudentImp {
public static void main(String[] args) {
	Student[] s= { new Student(101,44.2,"hugku"),new Student(102,41.2,"a"),new Student(1,4.2,"hjbvhu")};
	//Arrays.sort(s);
	SortingTemplate.sortByNameAsc(s);
	System.out.println(" "+SearchingTemplate.searchById(s,456));
	//Arrays.binarySearch(s,1);
	for(Student t:s) {
		System.out.println(t.getsId());
	}
}
}
