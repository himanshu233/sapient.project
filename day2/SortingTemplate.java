package day2;

import java.util.Arrays;
import java.util.Comparator;

public class SortingTemplate {
	public static Student[] sortByNameAsc(Student[] students) {
		Arrays.sort(students,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getsId()-o2.getsId();
			}
		});
		return students;
	}

}
