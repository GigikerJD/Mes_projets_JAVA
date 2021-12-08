package GameQR;

public class TestRC
{
    public static void main(String[] args) {

        RC questionRC1 = new RC("Etes-vous célibataire ?","Oui","Non");
        System.out.println(questionRC1.getQuestion());
        System.out.println(questionRC1.ReponseCorrect("facile"));

        RC questionRC2 =new RC("Aimez-vous le basketball ?","Oui","Oui");
        System.out.println(questionRC2.getQuestion());
        System.out.println(questionRC2.ReponseCorrect("facile"));
    }
}
