//student class that stores a student name and average
public class Student {
    private String name;
        private double average;
        //constructor initializes instance variables
        public Student(String name, double average){
            this.name = name;
            //validate that average is >0.0 and <== 100
            //keep instance variable average's default
            if (average > 0.0){
                if (average <=100.0){
                this.average = average;
                }
            }
        }

//Sets the student's name
    public void setName(String name){
            this.name = name;
    }
    //retrieves the student's name
    public String getName(){
            return name;
    }
    //sets the Student's average

    public void setAverage(double studentAverage) {
            //validate that average is > 0.0 and <=100.0
        //keep instance variable average's current variable
        if (average > 0.0){
            if (average <=100.0){
                this.average = average;
                //assign to initialized average
            }
        }
    }
    //retrieves the student's Average
    public double getAverage() {
            return average;
    }
    //determines and returns the Student's letter grade
    public String getLetterGrade() {
            String letterGrade = "";

            if (average >=90.0){
                letterGrade = "A";
            }
        else if (average >=80.0){
            letterGrade = "B";
        }
            else if (average >=70.0){
                letterGrade = "C";
            }
            else if (average >=60.0){
                letterGrade = "D";
            }
            else {
                letterGrade = "F";
            }
            return letterGrade;
    }
}

