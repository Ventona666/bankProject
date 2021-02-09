package banque;
import utilitaire.Date;


public class Carte {
    private int[] code;
    private int nbTentatives = 3;
    private int numeroClient;
    private int numeroCompte;
    private Date dateValide;
    private Banque banque;

    public Carte(int[] code, Date dateValide, Banque banque, int numeroClient, int numeroCompte){
        this.code = code;
        this.numeroClient = numeroClient;
        this.numeroCompte = numeroCompte;
        this.dateValide = dateValide;
        this.banque = banque;
    }
    public Date getDateValid(){
        return dateValide;
    }

    public Banque getBanque(){
        return banque;
    }

    public int getNbTentatives() {
        return nbTentatives;
    }

    public boolean codeValide(int[] code){
        if(this.code == code && nbTentatives > 0){
            return true;
        }
        else{
            nbTentatives--;
            return false;
        }
    }

    public boolean dateValide(){
        if(dateActuelle < dateValide){
            return true;
        }
        return false;
    }

    public void payer (Banque banque, int numeroClient, int numeroCompte, float valeur){
        Client client = banque.getClient(numeroClient);
        Compte compte = client.getCompte(numeroCompte);
        compte.retrait(valeur);
    }

}
