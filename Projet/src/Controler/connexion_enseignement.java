/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

/**
 *
 * @author sarahkardache
 */


/*
 * 
 * Librairies importées par notre groupe pour que le programme fonctionne
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import Modele.Enseignement;

public class connexion_enseignement {
   

    /**
     * Attributs prives : connexion JDBC, statement, ordre requete et resultat
     * requete
     */
    private Connection conn;
    private Statement stmt;
    private ResultSet rset;
    private ResultSetMetaData rsetMeta;
    /**
     * ArrayList public pour les tables
     */
    public ArrayList<String> tables = new ArrayList<>();
    /**
     * ArrayList public pour les requêtes de sélection
     */
    public ArrayList<String> requetes = new ArrayList<>();
    /**
     * ArrayList public pour les requêtes de MAJ
     */
    public ArrayList<String> requetesMaj = new ArrayList<>();

    public ArrayList<Enseignement> listeEnseignements = new ArrayList<>();

    /**
     * Constructeur avec 3 paramètres : nom, login et password de la BDD locale
     *
     * @param nameDatabase
     * @param loginDatabase
     * @param passwordDatabase
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     *
     */
    public connexion_enseignement() {
        //constructeur par defaut trop cool 
    }

    public connexion_enseignement(String nameDatabase, String loginDatabase, String passwordDatabase) throws SQLException, ClassNotFoundException {
        // chargement driver "com.mysql.jdbc.Driver"
        Class.forName("com.mysql.jdbc.Driver");

        // url de connexion "jdbc:mysql://localhost:3305/usernameECE"
        String urlDatabase = "jdbc:mysql://localhost:8889/" + nameDatabase;

        //création d'une connexion JDBC à la base 
        conn = DriverManager.getConnection(urlDatabase, loginDatabase, passwordDatabase);

        // création d'un ordre SQL (statement)
        stmt = conn.createStatement();
        //A AFFICHER DANS UN JFRAME 
        System.out.println("Connexion reussie");
      Enseignement E = null;
        String recup_id;
        String requete;
        String recup_tot;

        requete = "SELECT * FROM Enseignement";

        PreparedStatement preparedStatement = conn.prepareStatement(requete);

        rset = preparedStatement.executeQuery();

        while (rset.next()) {

            E = new Enseignement(rset.getInt("id"),rset.getInt("Classe.id"),rset.getInt("Discipline.id"),rset.getInt("Personne.id"));
           
            System.out.println(E.getId());
            System.out.println(E.getId_Classe());
            System.out.println(E.getId_Discipline());
            System.out.println(E.getId_Personne());

           listeEnseignements.add(E);
           
        }

    }

    /**
     * Constructeur avec 4 paramètres : username et password ECE, login et
     * password de la BDD à distance sur le serveur de l'ECE
     *
     * @param usernameECE
     * @param passwordECE
     * @param loginDatabase
     * @param passwordDatabase
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    //public Connexion(String usernameECE, String passwordECE, String loginDatabase, String passwordDatabase) throws SQLException, ClassNotFoundException {
    // chargement driver "com.mysql.jdbc.Driver"
    //  Class.forName("com.mysql.jdbc.Driver");
//System.out.println("Connexion reussie");
    // Connexion via le tunnel SSH avec le username et le password ECE
    //SSHTunnel ssh = new SSHTunnel(usernameECE, passwordECE);

    /* if (ssh.connect()) {
            System.out.println("Connexion reussie");

            // url de connexion "jdbc:mysql://localhost:3305/usernameECE"
            String urlDatabase = "jdbc:mysql://localhost:8889/" + usernameECE;

            //création d'une connexion JDBC à la base
            conn = DriverManager.getConnection(urlDatabase, loginDatabase, passwordDatabase);

            // création d'un ordre SQL (statement)
            stmt = conn.createStatement();

        }
     */
    /**
     * Méthode qui ajoute la table en parametre dans son ArrayList
     *
     * @param table
     */
    public void ajouterTable(String table) {
        tables.add(table);
    }

    /**
     * Méthode qui ajoute la requete de selection en parametre dans son
     * ArrayList
     *
     * @param requete
     */
    public void ajouterRequete(String requete) {
        requetes.add(requete);
    }

    /**
     * Méthode qui ajoute la requete de MAJ en parametre dans son ArrayList
     *
     * @param requete
     */
    public void ajouterRequeteMaj(String requete) {
        requetesMaj.add(requete);
    }

    /**
     * Méthode qui retourne l'ArrayList des champs de la table en parametre
     *
     * @param table
     * @return
     * @throws java.sql.SQLException
     */
    public ArrayList remplirChampsTable(String table) throws SQLException {
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery("select * from " + table);

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();

        // calcul du nombre de colonnes du resultat
        int nbColonne = rsetMeta.getColumnCount();

        // creation d'une ArrayList de String
        ArrayList<String> liste;
        liste = new ArrayList<>();
        String champs = "";
        // Ajouter tous les champs du resultat dans l'ArrayList
        for (int i = 0; i < nbColonne; i++) {
            champs = champs + " " + rsetMeta.getColumnLabel(i + 1);
        }

        // ajouter un "\n" à la ligne des champs
        champs = champs + "\n";

        // ajouter les champs de la ligne dans l'ArrayList
        liste.add(champs);

        // Retourner l'ArrayList
        return liste;
    }

    /**
     * Methode qui retourne l'ArrayList des champs de la requete en parametre
     *
     * @param requete
     * @return
     * @throws java.sql.SQLException
     */
    public ArrayList remplirChampsRequete(String requete) throws SQLException {
        // récupération de l'ordre de la requete
        rset = stmt.executeQuery(requete);

        // récupération du résultat de l'ordre
        rsetMeta = rset.getMetaData();

        // calcul du nombre de colonnes du resultat
        int nbColonne = rsetMeta.getColumnCount();

        // creation d'une ArrayList de String
        ArrayList<String> liste;
        liste = new ArrayList<String>();

        // tant qu'il reste une ligne 
        while (rset.next()) {
            String champs;
            champs = rset.getString(1); // ajouter premier champ

            // Concatener les champs de la ligne separes par ,
            for (int i = 1; i < nbColonne; i++) {
                champs = champs + "," + rset.getString(i + 1);
            }

            // ajouter un "\n" à la ligne des champs
            champs = champs + "\n";

            // ajouter les champs de la ligne dans l'ArrayList
            liste.add(champs);
        }

        // Retourner l'ArrayList
        return liste;
    }

    /**
     * Méthode qui execute une requete de MAJ en parametre
     *
     * @param requeteMaj
     * @throws java.sql.SQLException
     */
    public void executeUpdate(String requeteMaj) throws SQLException {
        stmt.executeUpdate(requeteMaj);
    }

    public void AjoutEnseignement(int id, int id_classe, int id_discipline, int id_personne ) {

        ///ATTENTION IL FAUT DEMANDER AUX MECS COMMENT ON FAIT PARCE QUE L'AJOUT VA FALLOIR LE FAIRE PAR TABLE HE MERCE.
        try {

            // stmt = conn.createStatement();
            String requete = "INSERT INTO Enseignement(id, Classe.id, Discipline.id, Personne.id) VALUES(";
            requete += id;
            requete += ",";
            requete += id_classe;
          requete += " , ";
           requete += id_discipline;
           requete += ",";
           requete += id_personne ; 
      
            requete += ")";
            System.out.println(requete);

            int executeUpdate = stmt.executeUpdate(requete);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void SupprimerEnseignement(int id) {

        ///ATTENTION IL FAUT DEMANDER AUX MECS COMMENT ON FAIT PARCE QUE L'AJOUT VA FALLOIR LE FAIRE PAR TABLE HE MERCE.
        try {

            // stmt = conn.createStatement();

            String requete = "DELETE FROM Enseignement WHERE id=";

            requete += id;
            System.out.println(requete);

            int executeUpdate = stmt.executeUpdate(requete);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void ModifierClasse(int id, int id_classe, int id_discipline, int id_enseignement) {

        ///ATTENTION IL FAUT DEMANDER AUX MECS COMMENT ON FAIT PARCE QUE L'AJOUT VA FALLOIR LE FAIRE PAR TABLE HE MERCE.
        try {

            String requete;
            requete = "UPDATE Enseignement SET Classe.id = ";
            requete += id_classe;
      requete += "WHERE id = " ; 
            requete += id;
            System.out.println(requete);

            int executeUpdate = stmt.executeUpdate(requete);
            
             String requete2;
            requete2 = "UPDATE Enseignement SET Discipline.id = ";
            requete2 += id_discipline;
      requete2 += "WHERE id = " ; 
            requete2 += id;
            System.out.println(requete2);

            int executeUpdate2 = stmt.executeUpdate(requete2);

             String requete3;
            requete3 = "UPDATE Enseignement SET Enseignement.id = ";
            requete3 += id_enseignement;
            requete3 += "WHERE id = " ; 
            requete2 += id;
            System.out.println(requete3);

            int executeUpdate3 = stmt.executeUpdate(requete3);

            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
