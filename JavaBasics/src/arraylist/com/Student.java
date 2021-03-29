package arraylist.com;

   public class Student {
	   	int id;
	   	String name;
	   	Status status;  //Typecasting
	   
   public Student(int id, String name,Status status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		}
   enum Status{
	   PENDING,CONFIRMED,REJECTED,AlLOWED
}
}
	

 

