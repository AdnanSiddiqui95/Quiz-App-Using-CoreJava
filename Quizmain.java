
public class Quizmain {

    public static void main(String[] args) {
        QuestionServices qs=new QuestionServices();
        qs.displayQuestion();
        qs.checkAnswer();
        qs.printResult();
    }
    
}
