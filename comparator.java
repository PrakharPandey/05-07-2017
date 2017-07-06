import java.util.Comparator;

public class comparator implements Comparator<Car> {
	
public int compare(Car c1,Car c2)
{
	return c1.model.compareTo(c2.model);
}
}
