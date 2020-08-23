package FilesR;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
public class FileWriterReader {
void FileWriter(String s) {
	try {
		File ob1=new File("Nabil.txt");
		ob1.createNewFile();
		FileWriter ob=new FileWriter(ob1,true);
		ob.write(s+"\r"+"\n");
		ob.flush();
		ob.close();
	}
	catch(Exception e) {
		System.out.println("Exception Caught");
	}
}
void FileReader() {
	try {
		FileReader ob3=new FileReader("Nabil.txt");
		BufferedReader ob4=new BufferedReader(ob3);
		String t="",temp;
		while((temp=ob4.readLine())!=null) {
			t=t+temp+"\n"+"\r";
		}
		System.out.print(t);
		ob3.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
void FileSearch(String s) {
	try {
		boolean isFound=false;
		FileReader ob6=new FileReader("Nabil.txt");
		BufferedReader ob4=new BufferedReader(ob6);
		String t="",temp;
		while((temp=ob4.readLine())!=null) {
		if(temp.contains(s)) {
			isFound=true;
			break;	
	}
         
	}
	if(isFound) {
		System.out.println("Employee Found");
		System.out.println("NAME:"+s);
	}
	else
	{
		System.out.println("NOT FOUND");
	}
	
	ob6.close();
	}
	catch 
	(IOException e) {
	e.printStackTrace();
}
}
public static void main(String args[]) {
	FileWriterReader obj=new FileWriterReader();
	Scanner input=new Scanner(System.in);
	String s;
	System.out.println("Entry of the Employee");
	System.out.println("Enter Your Name:");
	s=input.next();
	obj.FileWriter(s);
	System.out.println("Employee List");
	obj.FileReader();
	System.out.println("Search by Name:");
	s=input.next();
	obj.FileSearch(s);
	input.close();
}
}
