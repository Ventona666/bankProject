package banque;


import java.util.Date;

public class Client {
    private String nom;
    private int nbComptes;
    private Compte [] comptes;
    private Date dateDeNaissance;

    public Client(String nom, Date dateDeNaissance){
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
        this.comptes = new Compte[100];
    }

    public String getNom(){
        return nom;
    }

    public Date getDate(){
        return dateDeNaissance;
    }

    public Compte getCompte(int valeur){
        return comptes[valeur];
    }

    public void afficherBilan(){
        for(int i = 0; i < nbComptes; i++){

        }
        System.out.println("");
    }

}
