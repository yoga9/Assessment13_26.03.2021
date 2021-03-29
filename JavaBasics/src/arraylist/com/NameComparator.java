package arraylist.com;

import java.util.Comparator;

public class NameComparator implements Comparator<Object>{

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Student q1 = (Student) o1;
				Student q2 = (Student) o2;
				
				return q2.name.compareTo(q1.name);
			}
}
