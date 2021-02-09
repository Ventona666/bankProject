package banque;

public class Terminal {
    private int numClient;
    private int numCompte;
    private Banque banque;

    public Terminal(Banque banque, int numClient, int numCompte){
        this.numClient = numClient;
        this.numCompte = numCompte;
        this.banque = banque;
    }

    public int payer(float valeur, Carte carte, int [] code){
        if(carte.codeValide(code)){
            Banque banque = carte.getBanque();
            String autorisation = banque.genererAutorisation(carte, valeur);
            if (autorisation.equals("OK")){
                Client client = banque.getClient(numClient);
                Compte compte = client.getCompte(numCompte);
                carte.payer(banque, client, compte, valeur);
            }
            else{
                System.out.println("Paiement refusé");
                return 0;
            }
        }
        else {
            System.out.println("Code invalide ou nombre de tentatives supérieur à 3");
            return 0;
        }
        return 1;
    }

}
