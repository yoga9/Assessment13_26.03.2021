package arraylist.com;

import java.util.Comparator;

public class IdComparator implements Comparator<Object> {

	@Override
	public int compare(Object o11, Object o22) {
		// TODO Auto-generated method stub
		Student q11 = (Student) o11;
		Student q22 = (Student) o22;
		
		if(q11.id == q22.id) 
			return 0;
			else if(q11.id > q22.id)
				return 1;
			else
				return -1;
		
		
	}
}
