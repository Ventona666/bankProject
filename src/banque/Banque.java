package banque;
import utilitaire.Date;
import banque.Client;

/**
 * Banque type
 */
public class Banque {
    private int nbreClients = 0;
    private Client[] clients = new Client[100];

    /**
     * @param nbreClients
     * @param clients
     */
    public Banque(int nbreClients, Client[] clients) {
        this.nbreClients = nbreClients;
        this.clients = clients;
    }

    /**
     * @param nom
     * @param date
     * @return le nombre de client dans la banque
     */
    public int ajouterClient(String nom, Date date) {
        clients[nbreClients] = new Client(nom, date);
        nbreClients++;
        return nbreClients-1;
    }

    /**
     * @param numeroClient
     * @return l'objet client
     */
    public Client getClient(int numeroClient){
        return clients[numeroClient];
    }

    /**
     * Calcul et affiche la somme de tout les comptes de tout les clients de la banque
     */
    public void afficherBilan(){
        float soldeTotal = 0;
        for(int i = 0; i < nbreClients; i++){
            soldeTotal += clients[i].soldeTotal();
        }
        System.out.println("Voici le solde total de la banque : " + soldeTotal + " €.");
    }

    /**
     * @param carte
     * @param valeur
     * @return OK si le solde du client est bien supérieur à la valeur, si la valeur est inférieur à 1000 et que le
     * code saisi est valide, sinon KO
     */
    public String genererAutorisation(Carte carte, float valeur){


    }
}
