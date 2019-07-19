package day4.collection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
public static void main(String[] args) throws FileNotFoundException, IOException {
	Properties prop=new Properties();
	prop.load(new FileReader("sample/db.properties"));
	
	System.out.println("username "+prop.getProperty("username"));
}
}
