import java.util.Comparator;

public class Test {
public static void main(String[] args)
{
	Car ob=new Car("A5","Black","Audi",2100000);
	Car ob1=new Car("A5","White","Audi",2300000);
	comparator ob2=new comparator();
	Comparator_Price ob3=new Comparator_Price();
	twocomparator ob4=new twocomparator();
	System.out.println(ob2.compare(ob,ob1));
	System.out.println(ob3.compare(ob,ob1));
	int f=(ob4.compare(ob, ob1));
if(f==1)
	System.out.println("Same");
else
	System.out.println("Not Same");



Comparator<Car> c=new Comparator<Car>(){               //Anonymous Comparator Class
	public int compare(Car a,Car b)
	{
		return a.color.compareTo(b.color);
	}
};
System.out.println(c.compare(ob, ob1));
}
}
