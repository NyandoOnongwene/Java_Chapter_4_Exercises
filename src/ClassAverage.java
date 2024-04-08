// ClassAverage.java
//Solving the class-average problem using counter-controlled iteration
import java.util.Scanner; //program use class Scanner
public class ClassAverage {
    public static void main(String[] args){
        //create Scanner to obtain input from command-line
        Scanner input = new Scanner(System.in);
        //initialization phase
        int total = 0; // initialize sum of grades
        int gradeCounter = 1; //initialize # of grades
        //processing phase uses counter-controlled
        while (gradeCounter <= 10) { // loop 10 times
            System.out.print("Enter grade:");
            int grade = input.nextInt();
            total = total + grade; //add grade to total
            gradeCounter = gradeCounter + 1;
        }
        //termination phase
        double average = total / 10;

        System.out.printf("\nTotal of all 10 grades is %d", total );
        System.out.printf("\nClass average is %f", average);
    }

}
