
import java.util.Scanner;

public class QuestionServices{

    Question[] question=new Question[6];
    String[] sel=new String[6];

    public QuestionServices() {
        question[0]=new Question(1,"What is the capital of India?","Delhi","Mumbai","Kolkata","Chennai","Delhi");
        question[1]=new Question(2,"What is the capital of USA?","Washington DC","New York","Los Angeles","Chicago","Washington DC");
        question[2]=new Question(3,"What is the capital of UK?","London","Manchester","Birmingham","Liverpool","London");
        question[3]=new Question(4,"What is the capital of France?","Paris","Lyon","Marseille","Toulouse","Paris");
        question[4]=new Question(5,"What is the capital of Germany?","Berlin","Munich","Frankfurt","Hamburg","Berlin");
        question[5]=new Question(6,"What is the capital of Japan?","Tokyo","Osaka","Kyoto","Yokohama","Tokyo");
    }
    public void displayQuestion() {
        int i=0;
        for(Question q:question) {
                System.out.println("Question no: "+q.getId());
                System.out.println(q.getQuestion());
                System.out.println("1. "+q.getOpt1());
                System.out.println("2. "+q.getOpt2());
                System.out.println("3. "+q.getOpt3());
                System.out.println("4. "+q.getOpt4());
                Scanner sc=new Scanner(System.in);
                sel[i++]=sc.nextLine();
        }
        System.out.println("User selected answers are: ");
        for(String s:sel) {
            System.out.println(s);
        }
    }
    
    public void checkAnswer() {
        int i=0;
        for(Question q:question) {
            if(q.getAnswer().equalsIgnoreCase(sel[i++])) {
                System.out.println("Correct answer: "+sel[i-1]);
            }else {
                System.out.println("Incorrect answer: "+sel[i-1]+" and Correct answer is: "+q.getAnswer());
            }
        }
    }
 

    public void printResult() {
        int i=0;
        int score=0;
        for(Question q:question) {
            if(q.getAnswer().equalsIgnoreCase(sel[i++])) {
                score++;
            }
        }
        int tq=100/question.length;
        score*=tq;
        System.out.println("Your score is: "+score);
    }
}

