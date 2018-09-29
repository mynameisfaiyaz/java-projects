public class Methods {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int level = 7;
        int bonus = 200;

     int highScore = calculateScore(gameOver,score,level,bonus);
     System.out.println("Final Score: "+highScore);

        /*
        * whatever value is returned by the method  is sent back and placed the variable highScore
        * if the data-type of the highScore is not same as the data-type of methodd, then this will generate an error */
         gameOver = false;
         score = 5000;
         level = 7;
         bonus = 200;


         int highScore1 = calculateScore(gameOver,score,level,bonus);
         System.out.println("Final Score"+highScore1);

    }
    // Method reduces the effort of re-writing code
    //it can be called multiple times
    public static int calculateScore(boolean gameOver, int score, int level, int bonus){
        if (gameOver){
            int finalScore = score+(level*bonus);
            return finalScore;
        }else {
            return -1;//negative 1 means an error or false
        }
    }
}
