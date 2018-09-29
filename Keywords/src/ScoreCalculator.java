public class ScoreCalculator {
    public static void main(String[] args) {

    displayHighScorePosition("Kim",2);


    int totalScore = calculateHighScorePosition(1500);
        System.out.println("Total Score: "+totalScore);

    }

    public static void displayHighScorePosition(String playersName,int position){
        System.out.println(playersName+" managed to get into position "+position+" on high score table");
    }


    public static int calculateHighScorePosition(int playerScore){
            if (playerScore>1000){
                return 1000+(5*200);
            }else if (playerScore>500 && playerScore<1000){
                return 500+(4*100);
            }else if (playerScore>100 && playerScore<500){
                return 200+(3*50);
            }
            return -1;
    }

}
