/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;
import java.sql.*;
/**
 *
 * @author sarahkardache
 */
public class Connexion_bdd {
   
    public  void connexion_sql()
    {
Connection connexion = null;
try {
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Le pilote JDBC MySQL a été chargé");
connexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/java", "root", "root");
Statement state = connexion.createStatement();
ResultSet result = state.executeQuery("SELECT * FROM Ecole");
ResultSetMetaData resultMeta = result.getMetaData();
for(int i = 1; i <= resultMeta.getColumnCount(); i++)
System.out.print(resultMeta.getColumnName(i).toUpperCase() + " | ");
System.out.println();
while(result.next()){
for(int i = 1; i <= resultMeta.getColumnCount(); i++)
System.out.print(result.getObject(i).toString() + " | ");
System.out.println();
}
result.close();
state.close();
connexion.close();
} catch (Exception e) {
e.printStackTrace();
}
}

}
