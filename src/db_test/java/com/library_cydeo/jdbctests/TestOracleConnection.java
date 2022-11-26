package com.library_cydeo.jdbctests;

import java.sql.*;

public class TestOracleConnection {

    public static void main(String[] args) throws SQLException {

        String dbUrl = "jdbc:oracle:thin:@44.203.137.167:1521:XE";
        String dbUsername = "hr";
        String dbPassword = "hr";

        /*
            HOW TO INIT VARIABLES ?

                -- MAC --> OPT + ENTER
                -- WIN  --> ALT + ENTER

             */

        // DriverManager Class getCOnnection method will help to connect database
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

        // It helps us to execute queries
        Statement statement = conn.createStatement();

        // ResultSet will store data after execution.It stores only data (there is no table info )
        ResultSet rs = statement.executeQuery("select * from EMPLOYEES");

        /*
        How to run query from Java file
            - Click over Query (dont choose anywhere)
                - Mac --> CMD + Enter
                - Win --> CTRL + Enter
         */

        // GETTING DATA
        // next() --->
        rs.next();
        
        // pointer shows the first row
        
        // how to get data
        
        // rs.getInt(index) --> it returns integer. index start from 1 into SQL, it refers column position

//        System.out.println(rs.getInt(1));
//        System.out.println(rs.getString(1));
//
//        System.out.println(rs.getInt("REGION_ID"));
//        System.out.println(rs.getString("REGION_ID"));
//
//        // get Europe
//        System.out.println(rs.getString(2));
//        System.out.println(rs.getString("REGION_NAME"));
//
//        // get Americas
//        rs.next();
//        System.out.println(rs.getString(1) + " - " + rs.getString(2));
//        System.out.println(rs.getString("REGION_ID") + " - " + rs.getString("REGION_NAME"));
//
//        // get asia
//        rs.next();
//        System.out.println(rs.getString(1) + " - " + rs.getString(2));
//        System.out.println(rs.getString("REGION_ID") + " - " + rs.getString("REGION_NAME"));
//
//        // get Middle East and Africa
//        rs.next();
//        System.out.println(rs.getString(1) + " - " + rs.getString(2));
//        System.out.println(rs.getString("REGION_ID") + " - " + rs.getString("REGION_NAME"));

////         simple way (for loop)
//        for (int i = 0; i < 3 ; i++) {
//            rs.next();
//            System.out.println(rs.getString(1) + " - " + rs.getString(2));
//            System.out.println(rs.getString("REGION_ID") + " - " + rs.getString("REGION_NAME"));
//        }
//            simple way (while loop)
        while (rs.next()){
            System.out.println(rs.getString(1) + " - " + rs.getString(2));
        }


        // close connections
        rs.close();
        statement.close();
        conn.close();


    }

}
