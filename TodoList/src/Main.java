import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static TodoList todoList = new TodoList();

    public static void main(String[] args) {


        boolean quit = false;
        int choice =0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    todoList.printTodoList();
                    break;
                case 2:
                    addList();
                    break;
                case 3:
                    removeTodo();
                    break;
                case 4:
                    modifyList();
                    break;
                case 6:
                    quit =true;
                    break;
            }
        }
    }


    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\n0 - To print choice options");
        System.out.println("\n1 - To print Todo List");
        System.out.println("\n2 - To add new Todo in the list");
        System.out.println("\n3 - To remove Todo from the list");
        System.out.println("\n4 - To modify Todo list");
        System.out.println("\n6 - To quit the application");
    }

    public static void addList(){
        System.out.println("Please enter new Todo item in the list");
        todoList.addTodoList(scanner.nextLine());
    }

    public static void modifyList(){
        System.out.println("Enter list number");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter new Todo");
        String newTodo = scanner.nextLine();
        todoList.modifyList(position-1, newTodo);
    }


    public static void removeTodo(){
        System.out.println("Enter List number");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        todoList.removeTodo(itemNo-1);
    }





}
