package org.example;

import org.example.entity.Questions;
import org.example.service.ExamService;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    static ExamService ser = new ExamService();
    public static void main( String[] args )
    {
       while(true){
           Scanner sc= new Scanner(System.in);
           System.out.println("Admin click 1\n" +
                   "Member click 2");
           int c=sc.nextInt();

           switch(c){
               case 1:
                     adminOperations(sc);
                     break;
               case 2:
                     memberOperations(sc);
                     break;
           }
       }



    }


    public static void adminOperations(Scanner sc){

        while(true){
            System.out.println("1.ADD QUESTIONS\n" +
                    "2.UPDATE QUESTIONS\n" +
                    "3.VIEW ALL QUESTIONS");
            int op=sc.nextInt();sc.nextLine();
            switch(op){
                case 1:
                      ser.addQuestion();
                      break;
                case 2:
                    ser.updateQuestion();
                    break;
                case 3:
                    List<Questions>list=ser.getAllQuestions();
                    for(Questions q:list){
                        System.out.println(q);
                    }
                    break;
                default:
                    System.out.println("Wrong choice");
                    sc.close();
                    System.exit(0);
            }

        }

    }

    public static void memberOperations(Scanner sc){
        while(true){
                System.out.println("1.Register \n" +
                        "2.Take test");
            int op=sc.nextInt();sc.nextLine();
            switch(op) {
                case 1:
                    ser.addMember();
                    break;
                case 2:
                    ser.takeExam();
                    break;
                default:
                    System.out.println("Wrong choice");
                    sc.close();
                    System.exit(0);

            }
        }
    }
}
