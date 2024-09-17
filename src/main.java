import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks in First Subject: ");
        int marks1 = sc.nextInt();
        System.out.println("Enter Marks in Second Subject: ");
        int marks2 = sc.nextInt();
        System.out.println("Enter Marks in Third Subject: ");
        int marks3 = sc.nextInt();
        System.out.println("Enter Marks in Fourth Subject: ");
        int marks4 = sc.nextInt();
        System.out.println("Enter Marks in Fifth Subject: ");
        int marks5 = sc.nextInt();

        int tot = marks1+marks2+marks3+marks4+marks5;
        System.out.println("Total Marks: " + tot);

        int percentage = (tot*100)/500;

        System.out.println("Total Percentage: "+percentage+"%");

        if (percentage <= 100 && percentage >= 90){
            System.out.println("Grade: A");
        }
        else if (percentage <= 90 && percentage >= 80){
            System.out.println("Grade: B");
        }
        else if (percentage <= 80 && percentage >= 70){
            System.out.println("Grade: C");
        }
        else if (percentage <= 70 && percentage >= 60){
            System.out.println("Grade: D");
        }
        else if (percentage <= 60 && percentage >= 50){
            System.out.println("Grade: E");
        }
        else if (percentage <= 50 && percentage >= 0){
            System.out.println("Fail");
        }
    }
}
