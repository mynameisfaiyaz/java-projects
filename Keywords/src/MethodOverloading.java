public class MethodOverloading {
    public static void main(String[] args) {

    int finalScore =     calculateScore("Kim",400);
        System.out.println("Final Score: "+finalScore);

     calculateScore(600);

     calculateScore();
    }

    /*
    * Method oveloading :
    * writing multiple methods with the same name but with different no. of parameters
    * we can also change the return type but it should have different signature
    *
    * */

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" has scored "+score);
        return 1000*score;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player "+" has scored "+score+" points");
        return 1000*score;
    }

    public static int calculateScore(){
        System.out.println("No Player name, no score ");
        return 0;
    }
}
