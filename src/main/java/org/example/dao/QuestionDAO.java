package org.example.dao;

import org.example.entity.Questions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QuestionDAO {
    Connection con;
    PreparedStatement ps;
    public QuestionDAO(){
        try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Hexaware","root","sHjk#45%28");
        }
       catch(Exception e){
            System.out.println(e);
       }
    }
    public void addQuestion(Questions que) {
        try{
            String q="insert into Questions values(?,?,?,?,?,?,?,?)";
            ps=con.prepareStatement(q);
            ps.setInt(1,que.getQid());
            ps.setString(2,que.getText());
            ps.setString(3,que.getOptionA());
            ps.setString(4,que.getOptionB());
            ps.setString(5,que.getOptionC());
            ps.setString(6,que.getOptionD());
            ps.setString(7,que.getOptionE());
            ps.setString(8,que.getAnswer());
            int r=ps.executeUpdate();
            if(r>0)System.out.println("Question added");
            else System.out.println("Question not added");
        }
        catch(Exception e){

        }
    }

    public void updateQuestion(int id,String moans) {
        try{
            String q="update Questions set answer=? where qid=?";
            ps=con.prepareStatement(q);
            ps.setString(1,moans);
            ps.setInt(2,id);
            int r=ps.executeUpdate();
            if(r>0)System.out.println("Question updated");
            else System.out.println("Question not updated");

        }
        catch(Exception e){
            System.out.println(e);
        }
    }

     public List<Questions> getAllQuestions() {
        try{
            String q="select * from Questions";
            ps=con.prepareStatement(q);
            List<Questions>list=new ArrayList<Questions>();
            ResultSet rs=ps.executeQuery();
                while(rs.next()){
                    Questions que=new Questions(rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getString(8));
                    list.add(que);
                }
                return list;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
     }



}
