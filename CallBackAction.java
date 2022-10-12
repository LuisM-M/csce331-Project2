//package application;

import java.text.SimpleDateFormat;  
import java.util.Date; 
import java.sql.*; 

public class CallBackAction {
    public static String orderDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");  
        Date date = new Date();  
        return formatter.format(date); 
}

public static String orderDateTime() {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    Date date = new Date();  
    return formatter.format(date); 
}

public static void updateTable(String sqlStatement) {
    //dbSetup hides my username and password
    dbSetup my = new dbSetup(); // ????
    //Building the connection
     Connection conn = null;
     try {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(
          "jdbc:postgresql://csce-315-db.engr.tamu.edu/csce331_905_63", 
           my.user, my.pswd);
     } catch (Exception e) {
        e.printStackTrace();
        System.err.println(e.getClass().getName()+": "+e.getMessage());
        System.exit(0);
     }//end try catch

     // System.out.println("Opened database successfully");

     try{
       //create a statement object
       Statement stmt = conn.createStatement();
    
       //send statement to DBMS
       //ResultSet result = stmt.executeQuery(sqlStatement);

   } catch (Exception e){
     System.out.println("Error accessing Database.");
   }
    //closing the connection
    try {
      conn.close();
      System.out.println("Connection Closed.");
    } catch(Exception e) {
      System.out.println("Connection NOT Closed.");
    }//end try catch
}
/*
public static int getFromTable(String sqlStatement) {
    //dbSetup hides my username and password
    dbSetup my = new dbSetup();  // ????
    //Building the connection
     Connection conn = null;
     try {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(
          "jdbc:postgresql://csce-315-db.engr.tamu.edu/csce331_905_63", 
           my.user, my.pswd);
     } catch (Exception e) {
        e.printStackTrace();
        System.err.println(e.getClass().getName()+": "+e.getMessage());
        System.exit(0);
     }//end try catch

     // System.out.println("Opened database successfully");

     try{
       //create a statement object
       Statement stmt = conn.createStatement();
    
       //send statement to DBMS
       ResultSet result = stmt.executeQuery(sqlStatement);
   } catch (Exception e){
     System.out.println("Error accessing Database.");
   }
    //closing the connection
    try {
      conn.close();
      System.out.println("Connection Closed.");
    } catch(Exception e) {
      System.out.println("Connection NOT Closed.");
    }//end try catch

    return 0; // dummy, need to change
  }

  public static float getFloatFromTable(String sqlStatement) {
    //dbSetup hides my username and password
    dbSetup my = new dbSetup();
    //Building the connection
     Connection conn = null;
     try {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(
          "jdbc:postgresql://csce-315-db.engr.tamu.edu/csce331_905_63", 
           my.user, my.pswd);
     } catch (Exception e) {
        e.printStackTrace();
        System.err.println(e.getClass().getName()+": "+e.getMessage());
        System.exit(0);
     }//end try catch

     // System.out.println("Opened database successfully");

     try{
       //create a statement object
       Statement stmt = conn.createStatement();
    
       //send statement to DBMS
       ResultSet result = stmt.executeQuery(sqlStatement);

   } catch (Exception e){
     System.out.println("Error accessing Database.");
   }
    //closing the connection
    try {
      conn.close();
      System.out.println("Connection Closed.");
    } catch(Exception e) {
      System.out.println("Connection NOT Closed.");
    }//end try catch

    return 0; // dummy, need to change
  }*/
}


