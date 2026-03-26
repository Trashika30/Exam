package org.example.dao;

import org.example.entity.Member;
import org.example.entity.Questions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

public class MemberDAO {
    Connection con;
    PreparedStatement ps;
    public MemberDAO(){
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Hexaware","root","sHjk#45%28");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


    public void register(Member m){
        try{
            String q="insert into Member values(?,?,?)";
            ps=con.prepareStatement(q);
            ps.setInt(1,m.getId());
            ps.setString(2,m.getName());
            ps.setString(3,m.getEmail());
            int r=ps.executeUpdate();
            if(r>0)System.out.println("Registered!");
            else System.out.println("Failed!");

        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void takeTest(){
        try{
            Scanner sc=new Scanner(System.in);
            QuestionDAO qo=new QuestionDAO();
            int marks=0;int total=0;
            List<Questions> list=qo.getAllQuestions();
            for(Questions q:list){
                total++;
                System.out.println(q);
                System.out.println("Enter your answer:");
                String ans=sc.nextLine();

                if(ans.equalsIgnoreCase(q.getAnswer())){
                    marks++;
                    System.out.println("Great!");
                }
                else{
                    System.out.println("Wrong answer!");
                    System.out.println("Correct option is:"+q.getAnswer());
                }
            }
            System.out.println("Your score: "+marks+"/"+total);
        }

        catch(Exception e){
            System.out.println(e);
        }
    }





}
