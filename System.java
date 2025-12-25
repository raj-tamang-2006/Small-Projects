import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    }
}

abstract class LibraryItem{
    private int itemId;
    private String title;
    private boolean isAvailable;
    
    LibraryItems(int i, String t, boolean a){
        this.itemId = i;
        this.title = t;
        this.isAvailable = a;
    }
    
    boolean borrowItem(){
        if(this.isAvailable) return false;
        
        return true;
    }
    
    boolean returnItem(){
        if(!isAvailable){
            isAvailable = true;
            System.out.println(title+" was returned successfully");
        }
        else{
            System.out.println(title+ " was never borrowed");
        }
    }
    
    void displayInfo(){
        System.out.println("Id: "+ itemId);
        System.out.println("Title : "+title);
        System.out.println("is Available: "+ isAvailable);
    }
    abstract int CalculateFine(int days);
}

class Book extends LibraryItem{
    String author;
    double fine = 0.20;
    Book(String id, String t, boolean a, String au){
        super(id,t,a);
        this.author = au;
    }
    
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Author: "+ author);
    }
    
    @Override
    int CalculateFine(int days){
        return fine*days;
    }
}

class Magazine extends LibraryItem{
    double fine = 0.10;
    int issueNumber;
    Book(String id, String t, boolean a, int i){
        super(id,t,a);
        this.issueNumber = i;
    }
    
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Issue Number: "+ issueNumber);
    }
    
    @Override
    int CalculateFine(int days){
        return fine*days;
    }
}
