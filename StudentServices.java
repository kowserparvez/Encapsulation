package encapsulation;

public class StudentServices {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setStID(1);
		st1.setStName("Keyaan");
		st1.setSSN("112-78-7965");
		st1.setDOB("10-19-1999");

		Student st2 = new Student();
		st2.setStID(2);
		st2.setStName("Taheem");
		st2.setSSN("542-71-7361");
		st2.setDOB("12-16-1996");
		
		System.out.println( st1.getStName()+" "+st1.getStID()+" "+st1.getSSN()+" "+st1.getDOB());
		System.out.println( st2.getStName()+" "+st2.getStID()+" "+st2.getSSN()+" "+st2.getDOB());
		
		
	}

}
