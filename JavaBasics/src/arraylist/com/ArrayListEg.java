package arraylist.com;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEg {
  
  public static void main(String[] args) {
		
   	 Student s1 = new Student(1,"Ramya",Student.Status.PENDING);
   	 Student s2 = new Student(5,"Goma",Student.Status.REJECTED);
   	 Student s3 = new Student(2,"Priya",Student.Status.CONFIRMED);
   	 Student s4 = new Student(4,"Mona",Student.Status.AlLOWED);
   	 Student s5 = new Student(1,"Mona",Student.Status.CONFIRMED);
   	// Student s6 = new Student(2,null);
   	 
   	 ArrayList<Student> a = new  ArrayList<Student>();
   	 a.add(s1);
   	 a.add(s2);
   	 a.add(s3);
   	 a.add(s4);
   	 a.add(s5);
   // a.add(s6);
   	 
   	 Collections.sort(a,new NameComparator());       //sort - not allowed null
   	
   	 Iterator<Student> i = a.iterator();
   	 	while(i.hasNext()) {
   	 		Student b = (Student)i.next();
   	 		System.out.println("StuId :"+b.id+ " " +"StuName :" +b.name +" " +"StuStatus :" +b.status);
	}
System.out.println();

		for(Student s11 : a) {
		System.out.println("StuId :"+s11.id+ " " +"StuName :"+s11.name+ " " +"StuStatus :" +s11.status);
	}
   	 
Collections.sort(a,new IdComparator());

		Iterator<Student> i1 = a.iterator();
		while(i1.hasNext()) {
			Student b1 = (Student)i1.next();
			System.out.println("StuId :"+b1.id+ " " +"StuName :" +b1.name +" " +"StuStatus :" +b1.status);
		}
System.out.println();
	
		for(Student s111 : a) {
			System.out.println("StuId :"+s111.id+ " " +"StuName :"+s111.name+ " " +"StuStatus :" +s111.status);
		}

			  		
}
}



