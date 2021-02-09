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

    public
}
