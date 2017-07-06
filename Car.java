
public class Car {
	String model;
	String color;
	String company;
	int price;

	Car(String m, String c, String cm,int p) {
		model = m;
		color = c;
		company = cm;
		price=p;
	}
	public int compareTo(Object o)
	{
		Car car=(Car)o;
		return this.model.compareTo(car.model);
	}

	public static void main(String[] args) {
		Car obj = new Car("A6", "Black", "Audi",2100000);
		Car obj1 = new Car("A6", "Black", "Audi",2300000);
		if (obj.model.equals(obj1.model) && obj.color.equals(obj1.color) && obj.company.equals(obj1.company))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		System.out.println(obj.compareTo(obj1));
	}
}