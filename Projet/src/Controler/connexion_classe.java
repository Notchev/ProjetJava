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

import Modele.Classe;

public class connexion_classe {
   

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

    public ArrayList<Classe> listeClasses = new ArrayList<>();

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
    public connexion_classe() {
        //constructeur par defaut trop cool 
    }

    public connexion_classe(String nameDatabase, String loginDatabase, String passwordDatabase) throws SQLException, ClassNotFoundException {
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
      Classe C = null;
        String recup_id;
        String requete;
        String recup_tot;

        requete = "SELECT * FROM Classe";

        PreparedStatement preparedStatement = conn.prepareStatement(requete);

        rset = preparedStatement.executeQuery();

        while (rset.next()) {

            C = new Classe(rset.getInt("id"),rset.getString("nom"),rset.getInt("id_Ecole"),rset.getInt("id_Niveau"),rset.getInt("id_AnneeScolaire"));
           
            System.out.println(C.getIdClasse());
            System.out.println(C.getNomClasse());
            System.out.println(C.getId_Ecole());
            System.out.println(C.getId_Niveau());
            System.out.println(C.getId_AnneeScolaire());

           listeClasses.add(C);
           
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

    public void AjoutClasse(int id, String nom, int id_ecole, int id_niveau, int id_anneesco ) {

        ///ATTENTION IL FAUT DEMANDER AUX MECS COMMENT ON FAIT PARCE QUE L'AJOUT VA FALLOIR LE FAIRE PAR TABLE HE MERCE.
        try {

            // stmt = conn.createStatement();
            String requete = "INSERT INTO Classe(id, nom, ecole_id, niveau_id, anneescolaire_id) VALUES(";
            requete += id;
            requete += ",'";
            requete += nom;
          requete += "' , ";
           requete += id_ecole;
           requete += ",";
           requete += id_niveau ; 
           requete += "," ; 
           requete += id_anneesco ; 
            requete += ")";
            System.out.println(requete);

            int executeUpdate = stmt.executeUpdate(requete);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void SupprimerClasse(int id) {

        ///ATTENTION IL FAUT DEMANDER AUX MECS COMMENT ON FAIT PARCE QUE L'AJOUT VA FALLOIR LE FAIRE PAR TABLE HE MERCE.
        try {

            // stmt = conn.createStatement();

            String requete = "DELETE FROM Classe WHERE id=";

            requete += id;
            System.out.println(requete);

            int executeUpdate = stmt.executeUpdate(requete);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void ModifierClasse(int id, String nom, int id_ecole, int id_niveau,int  id_anneesco) {

        ///ATTENTION IL FAUT DEMANDER AUX MECS COMMENT ON FAIT PARCE QUE L'AJOUT VA FALLOIR LE FAIRE PAR TABLE HE MERCE.
        try {

            String requete;
            requete = "UPDATE Classe SET nom =' ";
            requete += nom;
            requete += "' " ;
      requete += "WHERE id = " ; 
            requete += id;
            System.out.println(requete);

            int executeUpdate = stmt.executeUpdate(requete);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
