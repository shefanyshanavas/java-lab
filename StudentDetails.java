class  StudentData{
	int std_id;
	String name;
	int m1,m2,m3;
	StudentData(){
		std_id=13313;
		name="Aamii";
		m1=76;
		m2=77;
		m3=72;
	}
	StudentData(int id, String stu_name,int java,int DBMS ,int Computer_Network){
		std_id=id;
		name=stu_name;
		m1=java;
		m2=DBMS;
		m3=Computer_Network;
		}
	 StudentData(int DBMS,int java,int Computer_Network){
		 std_id=13310;
		 name="Abyy";
		 m1=DBMS;
         m2=java;
		 m3=Computer_Network;
		 }
void display(){
	System.out.println("Student_id \t:"+std_id);
	System.out.println("Student_NAME\t:"+name);
	System.out.println("DBMS\t\t:"+m1);
	System.out.println("java\t\t:"+m2);
	System.out.println("Computer_Network\t:"+m3);
	System.out.println("total_mark \t:"+(m1+m2+m3));
    System.out.println("average_mark\t:"+(m1+m2+m3)/3);
}
}	
public class StudentDetails{
	public static void main(String args[]){
	StudentData S=new StudentData();
	System.out.println("\n Default Constructor\n");
	S.display();
	
	StudentData obj2= new StudentData(13312,"afuu",47,48,50);
	System.out.println("\n Constructor parameter\n");
	obj2.display();
	
	StudentData obj3= new StudentData(50,50,49);
	System.out.println("\n mixed Constructor \n");
	obj3.display();
	}

}
	