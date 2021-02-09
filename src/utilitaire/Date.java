package utilitaire;

public class Date {
    private int jour;
    private int mois;
    private int an ;
    private int heure = 0;
    private int minutes = 0;
    private int seconde = 0;

    public Date(int jour, int mois, int an){
        this.jour = jour;
        this.mois = mois;
        this.an = an;
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAn() {
        return an;
    }

    public int getHeure() {
        return heure;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconde() {
        return seconde;
    }

    public String toString(){
        return ("[" + this.getHeure()+ ":" + this.getMinutes() + ":" + this.getSeconde() + " " + this.getJour() + "/" + this.getMois() + "/" + this.getAn()+"]");
    }

    public boolean posterieurA(Date date){ //TODO
        if(an < date.getAn() || mois < date.getMois() || jour < date.getJour() || heure < date.getHeure() || minutes < date.getMinutes() || seconde < date.getSeconde()){
            return true;
        }
        return false;
    }
}
