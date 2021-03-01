package banque;
import utilitaire.Date;
import java.util.Arrays;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Carte type
 */
public class Carte {
    private int[] code;
    private int nbTentatives = 3;
    private int numeroClient;
    private int numeroCompte;
    private Date dateValide;
    private Banque banque;

    /**
     * @param code
     * @param dateValide
     * @param banque
     * @param numeroClient
     * @param numeroCompte
     */
    public Carte(int[] code, Date dateValide, Banque banque, int numeroClient, int numeroCompte){
        this.code = code;
        this.numeroClient = numeroClient;
        this.numeroCompte = numeroCompte;
        this.dateValide = dateValide;
        this.banque = banque;
    }

    /**
     * @return date de validité de la carte bancaire
     */
    public Date getDateValid(){
        return dateValide;
    }

    /**
     * @return l'objet banque
     */
    public Banque getBanque(){
        return banque;
    }

    /**
     * @return le nombre de tentatives
     */
    public int getNbTentatives() {
        return nbTentatives;
    }

    /**
     * @return le numéro client
     */
    public int getNumeroClient(){
        return numeroClient;
    }

    /**
     * @return le numéro de compte du client
     */
    public int getNumeroCompte(){
        return numeroCompte;
    }

    /**
     * @param code
     * @return true si le code et juste, false si le code est faux ou que le nombre de tentative est dépassé
     */
    public boolean codeValide(int[] code){
        if(Arrays.equals(this.code, code) && nbTentatives > 0){
            return true;
        }
        else{
            nbTentatives--;
            return false;
        }
    }

    /**
     * @return true si la date de validité de la carte n'a pas été dépassé
     */
    public boolean dateValide(){
        LocalDate date = LocalDate.now();
        String jour = date.format(DateTimeFormatter.ofPattern("dd"));
        String mois = date.format(DateTimeFormatter.ofPattern("MM"));
        String annee = date.format(DateTimeFormatter.ofPattern("yyyy"));
        Date dateActuelle = new Date(Integer.parseInt(jour), Integer.parseInt(mois),Integer.parseInt(annee));
        return !dateActuelle.posterieurA(dateValide);

    }

    /**
     * @param banque
     * @param numeroClient
     * @param numeroCompte
     * @param valeur
     * Permet de faire un virement à partir de la carte bancaire d'un utilisateur vers le possesseur du tpe
     */
    public void payer (Banque banque, int numeroClient, int numeroCompte, float valeur){
        Client possesseurTerminal = banque.getClient(numeroClient);
        Compte compteAcrediter = possesseurTerminal.getCompte(numeroCompte);
        Client possesseurCarte = getBanque().getClient(getNumeroClient());
        Compte compteAdebiter = possesseurCarte.getCompte(getNumeroCompte());
        compteAdebiter.virer(valeur, compteAcrediter);
    }
}
