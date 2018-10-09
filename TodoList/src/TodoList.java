import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todoList =new ArrayList<>();


    public void addTodoList(String list){
        todoList.add(list);
    }

    public ArrayList<String> getTodoList() {
        return todoList;
    }

    public void printTodoList(){
        System.out.println("You have " + todoList.size() + " items in your todo list");
        for(int i=0; i<todoList.size(); i++){
            System.out.println((i+1) + ". " + todoList.get(i));
        }
    }

    public void modifyList(int position , String list){
        todoList.set(position,list);
        System.out.println("List " + (position+1) + " has been modified");
    }



    public void removeTodo(int position){
        todoList.remove(position);
    }




}
