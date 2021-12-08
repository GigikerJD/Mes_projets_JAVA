package GameQR;

public class TestThèmes
{
    public static void main(String[] args) {
        Thèmes thème1 = new Thèmes("Sport");
        Thèmes thème2 = new Thèmes("Culture");
        Thèmes thème3 = new Thèmes("Voyage");
        Thèmes thème4 = new Thèmes("Famille");
        Thèmes thème5 = new Thèmes("Langue");
        Thèmes thème6 = new Thèmes("Danse");
        Thèmes thème7 = new Thèmes("Célébrité");
        Thèmes thème8 = new Thèmes("Jeux de société");
        Thèmes thème9 = new Thèmes("Technologie");
        Thèmes thème10 = new Thèmes("Voiture");

        Thèmes.addThèmes(thème1);
        Thèmes.addThèmes(thème2);
        Thèmes.addThèmes(thème3);
        Thèmes.addThèmes(thème4);
        Thèmes.addThèmes(thème5);
        Thèmes.addThèmes(thème6);
        Thèmes.addThèmes(thème7);
        Thèmes.addThèmes(thème8);
        Thèmes.addThèmes(thème9);
        Thèmes.addThèmes(thème10);


        Thèmes.Afficher_Thèmes();

        System.out.println("---------------------------------------------------------------");
        Thèmes.Select_Thèmes();

    }
}
