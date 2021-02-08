package banque;


import java.util.Date;

public class Client {
    private String nom;
    private int nbComptes;

    public Client(String nom, Date dateDeNaissance){
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
    }
}
