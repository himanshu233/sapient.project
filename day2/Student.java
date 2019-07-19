package day2;

public class Student implements Comparable<Student> {

private int sId;
private Double marks;
private String name;
public Student(int sId, Double marks, String name) {
	super();
	this.sId = sId;
	this.marks = marks;
	this.name = name;
}
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public Double getMarks() {
	return marks;
}
public void setMarks(Double marks) {
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return (this.sId)-(o.sId);
}
}
