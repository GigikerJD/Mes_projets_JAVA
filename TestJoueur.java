package GameQR;

public class TestJoueur
{
    public static void main(String[] args) {
        Joueur joueur1 = new Joueur("Ferrol","Nelgie");
        Joueur joueur2 = new Joueur("Ferrol","Rachid");
        Joueur joueur3 = new Joueur("Ferrol","Emma");
        Joueur joueur4 = new Joueur("Ferrol","Lincoln");
        Joueur joueur5 = new Joueur("Royer","Jemma");
        Joueur joueur6 = new Joueur("Fontinelle","Ginelle");
        Joueur joueur7 = new Joueur("Royer","Kethline");

        Joueur.addJoueur(joueur1);
        Joueur.addJoueur(joueur2);
        Joueur.addJoueur(joueur3);
        Joueur.addJoueur(joueur4);
        Joueur.addJoueur(joueur5);
        Joueur.addJoueur(joueur6);
        Joueur.addJoueur(joueur7);

        Joueur.TabJoueurs();

        System.out.println("--------------------------------------");

        Joueur.selectJoueur();
    }
}
