package assignment.com;

import java.util.Scanner;

public class CheckMarks {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the marks between 1-100: ");
        int marks=in.nextInt();
        Grade(marks);

    }
    static  void Grade(int marks){
        if (marks> 90 && marks<=100){
            System.out.println("Grade is AA");
        }
        else if(marks>80&&marks<=90){
            System.out.println("Grade is AB");
        }
        else if(marks>70&&marks<=80){
            System.out.println("Grade is BB");
        }
        else if(marks>60&&marks<=70){
            System.out.println("Grade is BC");
        }
        else if(marks>50&&marks<=60) {
            System.out.println("Grade is CC");
        }
         else if(marks>40&&marks<=50){
                System.out.println("Grade is DD");
            }
         else if (marks<40) {

            System.out.println("Fail");
        }
         else{
            System.out.println("Invalid marks ");
        }

    }
}
