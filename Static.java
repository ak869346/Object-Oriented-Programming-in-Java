public class Static {
        public static void main(String[] args) {
            Student s1 = new Student();
		s1.schoolName = "DAV";
		Student s2 = new Student();
		System.out.println(s2.schoolName);
		Student s3 = new Student();
		s3.schoolName = "PPS";
		System.out.println(s1.schoolName);
        }
}

class Student {
    String name;
    int roll;
    
    static String schoolName;
    
    void setName(String name) {
        this.name = name;
    }
    
    String getName() {
        return this.name;
    }
}
