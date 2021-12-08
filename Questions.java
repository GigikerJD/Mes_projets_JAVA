package GameQR;

import java.util.LinkedList;
import java.util.Random;
import java.util.ArrayList;


public class Questions
{
    private String réponse;
    private String question;
    private String thème;
    private String niveau;
    private static LinkedList<String> listQuestion;

    public Questions(String thème,String niveau,String question, String réponse)
    {
        this.thème = thème;
        this.niveau = niveau;
        this.réponse = réponse;
        this.question = question;
        this.listQuestion = new LinkedList<>();
    }


    public LinkedList<String> getListQuestion(){return listQuestion;}

    public String getThème() {return thème;}

    public String getQuestion() {return question;}

    public String getRéponse() {return réponse;}

    public String getNiveau() {return niveau;}

    public static void addQuestion(String question)
    {
        listQuestion.add(question);
    }

    public static void TabQuestions()
    {
        for(String question : listQuestion)
        {
            System.out.println(question);
        }
    }

    public static void selectQuestion()
    {
        Random choix = new Random();
        int Monchoix = choix.nextInt(5,10);

        for(int q=0; q<Monchoix; q++)
        {
            Random rq = new Random();
            int index = rq.nextInt(0,listQuestion.size());
            System.out.println(listQuestion.get(index));
        }
    }


    public static void main(String[] args)
    {

    }
}
