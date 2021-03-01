package utilitaire;

/**
 * Date type
 */
public class Date {
    private int jour;
    private int mois;
    private int an ;
    private int heure = 0;
    private int minute = 0;
    private int seconde = 0;

    /**
     * @param jour
     * @param mois
     * @param an
     */
    public Date(int jour, int mois, int an){
        this.jour = jour;
        this.mois = mois;
        this.an = an;
    }

    /**
     * @return un int correspondant au jour
     */
    public int getJour() {
        return jour;
    }

    /**
     * @return un int correspondant au mois
     */
    public int getMois() {
        return mois;
    }

    /**
     * @return un int correspondant à l'année
     */
    public int getAn() {
        return an;
    }

    /**
     * @return un int correspondant à l'heure
     */
    public int getHeure() {
        return heure;
    }

    /**
     * @return un int correspondant aux minutes
     */
    public int getMinute() {
        return minute;
    }

    /**
     * @return un int correspondant aux secondes
     */
    public int getSeconde() {
        return seconde;
    }

    /**
     * @return un string de la date
     */
    public String toString(){
        return ("[" + this.getHeure()+ ":" + this.getMinute() + ":" + this.getSeconde() + " " + this.getJour() + "/" + this.getMois() + "/" + this.getAn()+"]");
    }

    /**
     * @param date
     * @return true si le paramètre date est antérieur à la date actuelle, false sinon
     */
    public boolean posterieurA(Date date){
        if (an > date.getAn()){
            return true;
        }
        else if (an == date.getAn() && mois > date.getMois()){
            return true;
        }
        else if (an == date.getAn() && mois == date.getMois() && jour > date.getJour()){
            return true;
        }
        else{
            return false;
        }
    }
}
