package ifelseClause;

public class Student {
	String st_name;
	String st_grade;
	double stu_per;

void studentgrades(String stu_name,double st_per) {
	this.stu_per=st_per;
	this.st_name=stu_name;
	
	if (stu_per >= 90 && stu_per<=100) {
		st_grade="A";
		System.out.println(st_name + " grade is: " +st_grade);
		
	}
	else if (stu_per >=75 && stu_per<=89) {
		st_grade="B";
		System.out.println(st_name + " grade is: " +st_grade);

	}
	else if (stu_per >=65 && stu_per<=74) {
		st_grade="C";
		System.out.println(st_name + " grade is: " +st_grade);

	}
	else if (stu_per >=35 && stu_per<=64) {
		st_grade="D";
		System.out.println(st_name + " grade is: " +st_grade);

}
	else if (stu_per <35) {
		st_grade="E";
		System.out.println(st_name + " grade is: " +st_grade);

	}
}

	
	public static void main(String[] args) {
		Student s1= new Student();
		s1.studentgrades("Anil",100);
		s1.studentgrades("Sarada",78.6);
		s1.studentgrades("Pankaj",66.9);
		s1.studentgrades("Paru", 90.7);
		s1.studentgrades("Pinky",27);
		s1.studentgrades("Chetan",56);
		s1.studentgrades("Ganga",0);
		s1.studentgrades("Hari",73.9);
	}

}
