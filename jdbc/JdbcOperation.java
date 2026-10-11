package jdbc;
import java.sql.*;
import java.util.ArrayList;

public class JdbcOperation {
    //creating or adding new entry

    public static boolean addStudent(Student s){
        String query="insert into students "+ "(id,name,age,marks)" + "values(?,?,?,?)";

        try{
            Connection conn=DBconnection.getconn();

            PreparedStatement ps= conn.prepareStatement(query);

            //now set parameters into values 

            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getAge());
            ps.setDouble(4, s.getMarks());

            return ps.executeUpdate()==1;

        }catch(Exception e){
          e.getMessage();
        }
        return false;

    }


    //read the values

    public static ArrayList<Student>readStudent(){
          //create arraylist
          ArrayList<Student>s=new ArrayList<>();
         
          String query="select id,name,age,marks" + " from students";


          try{
            Connection conn=DBconnection.getconn();

            PreparedStatement ps= conn.prepareStatement(query);
            
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                Student students=new Student((rs.getInt("id")),(rs.getString("name")),(rs.getInt("age")),(rs.getDouble("marks")));
                s.add(students);
            }
           
            return s;
            


        }catch(Exception e){
          e.getMessage();
        }
          return null;

    }

    //updating values
     
    public static boolean updateStudent(int id,double marks){
        String query="update  students set marks=? where id=?";

        try{
            Connection conn=DBconnection.getconn();

            PreparedStatement ps= conn.prepareStatement(query);

            //now set parameters into values 

           
            ps.setDouble(1, marks);
            ps.setInt(2, id);

           int result=ps.executeUpdate();

            return result==1;

        }catch(Exception e){
          e.getMessage();
        }
        return false;

    }

    //delete a student

    public static boolean deleteStudent(int id){
        String query="delete from students where id=?";

        try{
            Connection conn=DBconnection.getconn();

            PreparedStatement ps= conn.prepareStatement(query);

            //now set parameters into values 

            ps.setInt(1, id);
            


            return ps.executeUpdate()==1;

        }catch(Exception e){
          e.getMessage();
        }
        return false;

    }

    //read single result


    public static Student getstudentbyid(int id){
        
         
          String query="select id,name,age,marks" + " from students";


          try{
            Connection conn=DBconnection.getconn();

            PreparedStatement ps= conn.prepareStatement(query);
            
            ps.setInt(1,id);
            
            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                return new Student(rs.getInt("id"), rs.getString("name"),rs.getInt("age"),rs.getDouble("marks"));

            }
            else{
               return null;
            }
           
           
            


        }catch(Exception e){
          e.getMessage();
        }
          return null;

    }



          
    }

