package day4.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOperation {
public static void main(String[] args) throws IOException {
	File f=new File("Hello");
	if(f.exists()) {
		System.out.println("File exists");
	}else {
		f.createNewFile();
		System.out.println("file created");
	}
	System.out.println("Last Modified "+new Date(f.lastModified()));
	System.out.println("can read "+f.canWrite());
	System.out.println("path "+f.getAbsolutePath());
}
}
