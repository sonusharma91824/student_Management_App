//package com.student.manage;
//
//import java.sql.*;
//
//public class StudentDao {
//    public static boolean insertStudentToDB(Student st) {
//     boolean f =false;
//    {
//    	try {
//    	   //jdbc code...
//    	Connection con =CP.createC();
//    	String q = "insert student(_sname , sphone,scity)values(?,?,?)";
//    	   //preparedStatement
//    	 PreparedStatement pstmt =con.prepareStatement(q);
//    	    // set the value of parameter 
//    	pstmt.setString(1, st.getStudentName());
//    	pstmt.setString(2, st.getStudentPhone());
//    	pstmt.setString(3, st.getStudentCity());
//        // execute......
//    	pstmt.executeUpdate();
//    	}
//    	catch(Exception e)
//    	{
//    		//TODO handle exception 
//    		e.printStackTrace();
//    	}
//     }
//	return f;
//    }}

package com.student.manage;

import java.sql.*;

public class StudentDao {
    public static boolean insertStudentToDB(Student st) {
        boolean f = false;
        try {
            // JDBC code...
            Connection con = CP.createC();
            String q = "INSERT INTO students(sname, sphone, scity) VALUES (?, ?, ?)";
            // Prepared statement
            PreparedStatement pstmt = con.prepareStatement(q);
            // Set the values of parameters
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(2, st.getStudentPhone());
            pstmt.setString(3, st.getStudentCity());
            // Execute the query
            pstmt.executeUpdate();
            f = true; // Update the flag to indicate successful insertion
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}

