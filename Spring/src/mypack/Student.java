package mypack;

public class Student {
 private int rollno,marks;
 private String name;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
 
 public void display()
 {
	 System.out.println("Roll_No="+rollno);
	 System.out.println("Name="+name);
	 System.out.println("Marks="+marks);
 }
}
