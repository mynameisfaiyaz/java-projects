class Movies{
    private String name;

    public Movies(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movies{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lot of people";
    }
}

class IndependenceDay extends Movies{
    public IndependenceDay
}
public class Main {
    public static void main(String args[]){


        public static Movies randomMovie(){
            int randomNumber =(int) (Math.random() *5)+1);
            System.out.println("Random number generated was: "+randomNumber);
            switch (randomNumber){
                case 1:
                    return new Jaws();

            }
        }
    }
}
