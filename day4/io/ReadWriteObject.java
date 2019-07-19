package day4.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import day2.Account;

public class ReadWriteObject {
	public static void storeAccount(Account account) throws FileNotFoundException, IOException {
		File file=new File("account.ser");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));
		
		oos.writeObject(account);
		oos.writeInt(100);
		
		oos.close();
		System.out.println("Data Written Sucessfully");
	}
	public static Account getAccount() throws FileNotFoundException, IOException, ClassNotFoundException {
		File file=new File("account.ser");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
		Account account=(Account)ois.readObject();
		System.out.println(ois.readInt());
		return account;
		
	}

public static void main(String[] args) throws ClassNotFoundException {
	Account account = new Account("Udit",2333);
	try {
		//storeAccount(account);
		
		System.out.println(getAccount().toString());
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
