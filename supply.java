import java.sql.*;
import java.util.Scanner;
import java.io.File;

/*
CSCE 315
9-27-2021 Lab
 */
public class supply {

  //Commands to run this script
  //This will compile all java files in this directory
  //javac *.java
  //This command tells the file where to find the postgres jar which it needs to execute postgres commands, then executes the code
  //Windows: java -cp ".;postgresql-42.2.8.jar" jdbcpostgreSQL
  //Mac/Linux: java -cp ".:postgresql-42.2.8.jar" jdbcpostgreSQL

  //MAKE SURE YOU ARE ON VPN or TAMU WIFI TO ACCESS DATABASE
  public static void main(String args[]) {

    //Building the connection with your credentials
    Connection conn = null;
    String teamNumber = "63";
    String sectionNumber = "905";
    String dbName = "csce331" + "_" + sectionNumber + "_" + teamNumber;
    String dbConnectionString = "jdbc:postgresql://csce-315-db.engr.tamu.edu/" + dbName;
    dbSetup myCredentials = new dbSetup(); 

    //Connecting to the database
    try {
        conn = DriverManager.getConnection(dbConnectionString, dbSetup.user, dbSetup.pswd);
     } catch (Exception e) {
        e.printStackTrace();
        System.err.println(e.getClass().getName()+": "+e.getMessage());
        System.exit(0);
     }

     System.out.println("Opened database successfully");

     try{
       //create a statement object
       Statement stmt = conn.createStatement();
      
       //Running a query
       //TODO: update the sql command here
       File supply_csv = new File("supply.csv");
       Scanner myReader = new Scanner(supply_csv);
       String sqpStatement = "";
       while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        String[] items = data.split(",");
        // for(int i = 0; i < 5; ++i){
        //     System.out.println(items[i]);
        // }
        String sqlStatement = "INSERT INTO supply (itemid, item, supplyquantity, units, date) VALUES(" + items[0] + ",'" + items[1] + "'," + items[2] + ",'" + items[3] + "','" + items[4] + "');";
        stmt.executeUpdate(sqlStatement);
       }


       //send statement to DBMS
       //This executeQuery command is useful for data retrieval
       
       //OR
       //This executeUpdate command is useful for updating data
       //int result = stmt.executeUpdate(sqlStatement);

       //OUTPUT
       //You will need to output the results differently depeninding on which function you use
       System.out.println("--------------------Query Results--------------------");
       //while (result.next()) {
       //System.out.println(result.getString("column_name"));
       //}
       //OR
       //System.out.println(result);
   } catch (Exception e){
       e.printStackTrace();
       System.err.println(e.getClass().getName()+": "+e.getMessage());
       System.exit(0);
   }

    //closing the connection
    try {
      conn.close();
      System.out.println("Connection Closed.");
    } catch(Exception e) {
      System.out.println("Connection NOT Closed.");
    }//end try catch
  }//end main
}//end Class
