package exercice1;


import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeTest {


    Employe e=null;
    Categorie mockCategorie=null;

    @Before
    public void setE() {
        mockCategorie = EasyMock.createMock(Categorie.class);
    }


    //La catégorie existe
    @Test
    public void test1_1000(){
        EasyMock.expect(mockCategorie.valCategorie(1)).andReturn(1);
        EasyMock.replay(mockCategorie);
        // an<10 donc salaire=base
        e = new Employe(2,1000) {
            protected Categorie creerCategorie() {
                return mockCategorie;
            }
        };
        double res=e.salaire();
        double attendu=1000;
        Assert.assertEquals(res,attendu, 0.01);
    }

    @Test
    public void test1_1000bis(){

        Categorie mockCat = EasyMock.createMock(Categorie.class);
        Employe mockEmp = EasyMock.createMock(Employe.class);



        EasyMock.replay(mockCat);


        // an<10 donc salaire=base
        Employe instance =
                 EasyMock.partialMockBuilder(Employe.class)
                        .addMockedMethod("salaire")
                        .addMockedMethod("getAnnee")
                        .addMockedMethod("getSalaire")
                        .addMockedMethod("setSalaire");

        EasyMock.expect(mockCat.valCategorie(1)).andReturn(1);
        EasyMock.expect(instance.salaire();


        double res=e.salaire();
        double attendu=1000;
        Assert.assertEquals(res,attendu, 0.01);
    }

    @Test
    public void test1_5(){
        EasyMock.expect(mockCategorie.valCategorie(5)).andReturn(1);
        EasyMock.replay(mockCategorie);
        e = new Employe(5,100) {
            protected Categorie creerCategorie() {
                return mockCategorie;
            }
        };
        double res=e.salaire();
        double attendu=100;
        Assert.assertEquals(res,attendu, 0.01);
    }

    @Test
    public void test1_9(){
        EasyMock.expect(mockCategorie.valCategorie(9)).andReturn(1);
        EasyMock.replay(mockCategorie);
        e = new Employe(9,100) {
            protected Categorie creerCategorie() {
                return mockCategorie;
            }
        };
        double res=e.salaire();
        double attendu=100;
        Assert.assertEquals(res,attendu, 0.01);
    }


    @Test
    public void test1_10(){
        EasyMock.expect(mockCategorie.valCategorie(10)).andReturn(1);
        EasyMock.replay(mockCategorie);
        e = new Employe(10,100) {
            protected Categorie creerCategorie() {
                return mockCategorie;
            }
        };
        double res=e.salaire();
        double attendu=100;
        Assert.assertEquals(res,attendu, 0.01);
    }

    @Test
    public void test1_11(){
        EasyMock.expect(mockCategorie.valCategorie(11)).andReturn(2);
        EasyMock.replay(mockCategorie);
        e = new Employe(11,100) {
            protected Categorie creerCategorie() {
                return mockCategorie;
            }
        };
        double res=e.salaire();
        double attendu=110;
        Assert.assertEquals(res,attendu, 0.01);
    }

    @Test
    public void test1_15(){
        EasyMock.expect(mockCategorie.valCategorie(15)).andReturn(2);
        EasyMock.replay(mockCategorie);
        e = new Employe(15,100) {
            protected Categorie creerCategorie() {
                return mockCategorie;
            }
        };
        double res=e.salaire();
        double attendu=110;
        Assert.assertEquals(res,attendu, 0.01);
    }

    @Test
    public void test1_19(){
        EasyMock.expect(mockCategorie.valCategorie(19)).andReturn(2);
        EasyMock.replay(mockCategorie);
        e = new Employe(19,100) {
            protected Categorie creerCategorie() {
                return mockCategorie;
            }
        };
        double res=e.salaire();
        double attendu=110;
        Assert.assertEquals(res,attendu, 0.01);
    }

    @Test
    public void test1_20(){
        EasyMock.expect(mockCategorie.valCategorie(20)).andReturn(2);
        EasyMock.replay(mockCategorie);
        e = new Employe(20,100) {
            protected Categorie creerCategorie() {
                return mockCategorie;
            }
        };
        double res=e.salaire();
        double attendu=110;
        Assert.assertEquals(res,attendu, 0.01);
    }



    @Test
    public void test1_40(){
        EasyMock.expect(mockCategorie.valCategorie(40)).andReturn(3);
        EasyMock.replay(mockCategorie);
        e = new Employe(40,100) {
            protected Categorie creerCategorie() {
                return mockCategorie;
            }
        };
        double res=e.salaire();
        double attendu=120;
        Assert.assertEquals(res,attendu, 0.01);
    }
}
