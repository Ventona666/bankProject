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
            System.out.println("Compte n°" + i + " : " + comptes[i].getSolde() + " €.");
        }
    }

    public float soldeTotal(){
        float soldeT = 0;
        for(int i = 0; i < nbComptes; i++){
            soldeT += comptes[i].getSolde();
        }
        return soldeT;
    }

    public void afficherSolde(){
        float soldeT = soldeTotal();
        System.out.println("Solde total : " + soldeT + " €.");
    }

    public int ajouterCompte(){
        nbComptes++;
        return nbComptes;
    }

}
