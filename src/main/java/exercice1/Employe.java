package exercice1;

public class Employe {

    int annee;//anciennete dans l entreprise
    double salaireDeBase;//salaire de depart a l embauche

    public Employe(int a, double s){
        annee=a;
        salaireDeBase=s;
    }

    public int getAnnee(){return annee;}

    public double getSalaireDeBase() {
        return salaireDeBase;
    }

    public void setAnnee(int a){this.annee=a;}

    public void setSalaireDeBase(double s){this.salaireDeBase=s;}

    protected Categorie creerCategorie() {
        return new Categorie();
    }

    //salaire effectif de l employe calcule selon son anciennete sa categorie
    public double salaire() {
        double res=getSalaireDeBase();
        int an=getAnnee();
        Categorie ca = creerCategorie();
        int categ = ca.valCategorie(an);
        if (categ==1) res=res;
        else if (categ==2) res=res*1.1;
        else if (categ==3) res=res*1.2;
        return res;
    }

}