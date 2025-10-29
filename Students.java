class Student {
    String name;
    int age;
    String course;
    String gender;

    void study() {
        System.out.println(name + " is studying quietly");
    }
    void takeExam(){
        System.out.println(name + " is taking the examination");
    }
    void displayInfo(){
      System.out.println("Student Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Course: " + course);
      System.out.println("Gender: " + gender);
    }

    public static void main (String [] args){
        Student Ben = new Student();
        Student Jamil = new Student();
        Student Dcmae = new Student();
        Student Aslen = new Student();

        Ben.name = "Ben";
        Ben.age = 17;
        Ben.course = "BSIT";
        Ben.gender = "Male";

        Ben.study();
        Ben.takeExam();
        Ben.displayInfo();
        System.out.println("------------------------");
        
        Jamil.name = "Jamil";
        Jamil.age = 21;
        Jamil.course = "BSCRIM";
        Jamil.gender = "Male";

        Jamil.study();
        Jamil.takeExam();
        Jamil.displayInfo();
        System.out.println("------------------------");

        Dcmae.name = "Dcmae";
        Dcmae.age = 19;
        Dcmae.course = "BSBA";
        Dcmae.gender = "Female";

        Dcmae.study();
        Dcmae.takeExam();
        Dcmae.displayInfo();
        System.out.println("------------------------");

        Aslen.name = "Aslen";
        Aslen.age = 21;
        Aslen.course = "BSIT";
        Aslen.gender = "Female";

        Aslen.study();
        Aslen.takeExam();
        Aslen.displayInfo();
        System.out.println("------------------------");

    }
}
