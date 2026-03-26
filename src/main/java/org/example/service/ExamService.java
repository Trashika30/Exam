package org.example.service;

import org.example.dao.MemberDAO;
import org.example.dao.QuestionDAO;
import org.example.entity.Member;
import org.example.entity.Questions;

import java.util.List;
import java.util.Scanner;

public class ExamService {


    Scanner sc=new Scanner(System.in);
    MemberDAO m=new MemberDAO();
    QuestionDAO q=new QuestionDAO();
    public ExamService() {

    }

    public void addQuestion(){
        System.out.println("Qno:");
        int qno=sc.nextInt();sc.nextLine();
        System.out.println("Type your question:");
        String text=sc.nextLine();
        System.out.println("Option A:");
        String optionA=sc.nextLine();
        System.out.println("Option B:");
        String optionB=sc.nextLine();
        System.out.println("Option C:");
        String optionC=sc.nextLine();
        System.out.println("Option D:");
        String optionD=sc.nextLine();
        System.out.println("Option E:");
        String optionE=sc.nextLine();
        System.out.println("Correct answer is :");
        String ans=sc.nextLine();
        Questions que=new Questions(qno,text,optionA,optionB,optionC,optionD,optionE,ans);
        q.addQuestion(que);
    }

    public void updateQuestion(){
        System.out.println("Qno:");
        int qno=sc.nextInt();sc.nextLine();
        System.out.println("Modified answer:");
        String ans=sc.nextLine();
        q.updateQuestion(qno,ans);
    }

    public List<Questions> getAllQuestions(){
       return  q.getAllQuestions();
    }

    public void takeExam(){
        m.takeTest();
    }

    public void addMember(){
       System.out.println("Member ID:");
        int mid=sc.nextInt();sc.nextLine();
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Email address:");
        String email=sc.nextLine();
        Member mem=new Member(mid,name,email);
        m.register(mem);
    }



}
