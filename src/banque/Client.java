package banque;
import utilitaire.Date;

/**
 * Client type
 */
public class Client {
    private String nom;
    private int nbComptes;
    private Compte [] comptes;
    private Date dateDeNaissance;

    /**
     * @param nom
     * @param dateDeNaissance
     */
    public Client(String nom, Date dateDeNaissance){
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
        this.nbComptes = 1;
        this.comptes = new Compte[100];
    }

    /**
     * @return le nom
     */
    public String getNom(){
        return nom;
    }

    /**
     * @return la date de naissance
     */
    public Date getDate(){
        return dateDeNaissance;
    }

    /**
     * @param valeur
     * @return un compte du client
     */
    public Compte getCompte(int valeur){
        return comptes[valeur];
    }

    /**
     * Calcul et affiche la somme de tout les comptes du client
     */
    public void afficherBilan(){
        for(int i = 0; i < nbComptes; i++){
            System.out.println("Compte n°" + i + " : " + comptes[i].getSolde() + " €.");
        }
    }

    /**
     * @return le solde de tout les comptes du client
     */
    public float soldeTotal(){
        float soldeT = 0;
        for(int i = 0; i < nbComptes; i++){
            soldeT += comptes[i].getSolde();
        }
        return soldeT;
    }

    /**
     * Affiche le solde total du client
     */
    public void afficherSolde(){
        float soldeT = soldeTotal();
        System.out.println("Solde total : " + soldeT + " €.");
    }

    /**
     * Permet d'ajouter un nouveau compte au client
     * @return le nombre de compte du client
     */
    public int ajouterCompte(){
        comptes[nbComptes] = new Compte(0);
        nbComptes++;
        return nbComptes;
    }
}
