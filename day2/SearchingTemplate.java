package day2;
import java.util.Arrays;
public class SearchingTemplate {
	public static boolean searchById(Student[] students,int x) {
		int arr[]=new int[students.length];
		for(int i=0;i<students.length;i++)
		{
			arr[i]=students[i].getsId();
		}
		return Arrays.binarySearch(arr,x)>-1;
	}
	

}
