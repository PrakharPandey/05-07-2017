import java.util.Comparator;

public class twocomparator implements Comparator<Car>{
	public int compare(Car a,Car b){
		if(a.company.compareTo(b.company)==0)
		{
			if(a.model.compareTo(b.model)==0)
			{
				if(a.color.compareTo(b.color)==0)
					return 1;
			}
			
			 return 0;
		}
		return 0;
		
	}

}
