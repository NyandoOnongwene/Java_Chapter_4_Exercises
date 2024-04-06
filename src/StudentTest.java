//Create and test Student objects.
public class StudentTest {
    public static void main(String[] args){
      Student account1 = new Student("Jane Green", 70);
      Student account2 = new Student("Nyando Onongwene",90);

      System.out.printf("%s's letter grade is %s%n",
              account1.getName(), account1.getLetterGrade());
      System.out.printf("%s's letter grade is %s%n", account2.getName(), account2.getLetterGrade() );;
    }
}
