package exercice1;

public class Categorie {
    public int valCategorie(int an) {
        int cat =0
                ;
        if((0 <= an) && (an <=10))
            cat= 1;
        else if ((11<= an) && (an <=20))
            cat =2;
        else cat=3;

        return cat;
    }
}