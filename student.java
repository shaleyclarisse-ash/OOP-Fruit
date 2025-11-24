class Student {
    String fullname, id_number, year_level, course, subject;
    double examGrade1, examGrade2;
    final double passing_grade = 75;
    
    public Student(String fullname, String id_number, String year_level, String course, String subject,
    double examGrade1, double examGrade2) {
      this.fullname = fullname;
      this.id_number = id_number;
      this.year_level = year_level;
      this.course = course;
      this.subject = subject;
      this.examGrade1 = examGrade1;
      this.examGrade2 = examGrade2;
      
      System.out.println("-------Student Details-------");
    }
    
     void introduceStudent(){
      System.out.println("Name: " + fullname);
      System.out.println("ID Number: " + id_number);
      System.out.println("Course: " + course);
      System.out.println("Subject: " + subject);
      System.out.println("-------------------------------");
    }
    
     void calculateGrade(){
      
      double average = (examGrade1 + examGrade2) / 2;
      
      if (average >= 98 && average <= 100 ) {
        System.out.println(fullname + "'s Rating: " + average + " Summa Cum Laude " );
      } else if (average >= 95 && average <= 97) {
        System.out.println(fullname + "'s Rating: " + average + " Magna Cum Laude" );
      } else if (average >= 93 && average <= 94) {
        System.out.println(fullname + "'s Rating: " + average + " Cum Laude" );
      } else if (average >= 75 && average <= 92) {
        System.out.println(fullname + "'s Rating: " + average + " Passed" );
      } else if (average <= passing_grade) {
        System.out.println(fullname + "'s Rating: " + average + " Failed" );
      }
      System.out.println("-------------------------------");
    }  
  }
