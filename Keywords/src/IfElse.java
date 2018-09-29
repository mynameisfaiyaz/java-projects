public class IfElse {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int level = 7;
        int bonus = 100;

        if (gameOver){//takes the predefined value
            int finalScore = score+(level*bonus);
            System.out.println("Total Score : "+finalScore);
        }else{
            System.out.println("You didn't crossed the level 7");
        }

    }
}
