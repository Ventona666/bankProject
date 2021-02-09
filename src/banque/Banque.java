package banque;
import utilitaire.Date;
import banque.Client;

public class Banque {
    private int nbreClients = 0;
    private Client[] clients = new Client[100];

    public Banque(int nbreClients, Client[] clients) {
        this.nbreClients = nbreClients;
        this.clients = clients;
    }

    public int ajouterClient(String nom, Date date) {
        Client client = new Client("Gertrude", new Date(02, 02, 2000));

    }

    public Client getClient(int numeroClient){
        return clients[numeroClient];
    }

    public void afficherBilan(){
        float soldeTotal = 0;
        for(int i = 0; i < nbreClients; i++){
            soldeTotal += clients[i].soldeTotal();
        }
        System.out.println("Voici le solde total de la banque : " + soldeTotal + " €.");
    }

    public String genererAutorisation(Carte carte, float valeur){


    }
}
