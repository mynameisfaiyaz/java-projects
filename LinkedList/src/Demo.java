import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();
        /*placesToVisit.add("Delhi");
        placesToVisit.add("Mumbai");
        placesToVisit.add("Hyderabad");
        placesToVisit.add("Chennai");
        placesToVisit.add("Bangalore");
*/

        addInOrder(placesToVisit, "Delhi");
        addInOrder(placesToVisit, "Mumbai");
        addInOrder(placesToVisit, "Hyderabad");
        addInOrder(placesToVisit, "Chennai");
        addInOrder(placesToVisit, "Bangalore");
        printList(placesToVisit);

        /*placesToVisit.add(1,"Kolkata");*/
        addInOrder(placesToVisit, "Kolkata");
        addInOrder(placesToVisit, "Delhi");
        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+ i.next());
        }
        System.out.println("===========================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparision =stringListIterator.next().compareTo(newCity);
            if(comparision ==0){
                // equal, do not add
                System.out.println(newCity + " already added as a destination ");
                return false;
            } else if(comparision > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparision < 0){
                // move on to next city


            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    public static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward =true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.getFirst() == "") {
            System.out.println("No cities the itenerary");
            return;
        }else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday over");
                    quit =true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    }else {
                        System.out.println("Reached the end of the list");
                    }
                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now visiting " + listIterator.previous());
                    }else {
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }



        }


    }


    private static void printMenu(){
        System.out.println("\nAvailable actions:\nPress");
        System.out.println("0 - To quit\n" +
                "1 - To go to the next city\n" +
                "2 - To go to the previous city\n" +
                "3 - Print Menu Options" );
    }


}
