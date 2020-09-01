package ArrayList;
import java.util.ArrayList;
public class Start {
public static void main(String[]args) {
	ArrayList <Integer> ob= new ArrayList<>();
	int size=ob.size();
	System.out.println("ArrayList size:"+size);
	ob.add(10);
	ob.add(20);
	int size1=ob.size();
	System.out.println("ArrayList Elements:"+ob);
	System.out.println("ArrayList Size:"+size1);
	ArrayList <Integer> ob1 = new ArrayList<>();
	ob1.add(40);
	ob1.add(50);
	System.out.println("ArrayList Elements 2:"+ob1);
	ob.addAll(ob1);
	System.out.println("Now ArrayList:"+ob);
}
}

