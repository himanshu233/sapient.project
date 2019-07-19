package day4.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteData {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter emp id");
	int empId=Integer.parseInt(br.readLine());
	System.out.println("enter name");
	String ENAme=br.readLine();
	System.out.println("Enter your sal");
	double sal=Double.parseDouble(br.readLine());
	System.out.println("emp id "+empId+" Name "+ENAme+" sal "+ sal);
	WriteInFile(empId, ENAme);
	BufferedReader brFile=new BufferedReader(new FileReader("Emp.txt"));
	String line=null;
	System.out.println("Reading File");
	System.out.println("----------------------------------------");
	while((line=brFile.readLine())!=null) {
		System.out.println(line);
	}
}

private static void WriteInFile(int empId, String ENAme) throws IOException {
	BufferedWriter bw=new BufferedWriter(new FileWriter("Emp.txt",true));
	bw.write("empid: "+empId);
	bw.newLine();
	bw.write("empid: "+ENAme);
	bw.close();
}
}
