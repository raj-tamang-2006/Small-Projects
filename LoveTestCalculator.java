import java.util.*;

class LoveTestCalculator{
    public static void Println(String s){
        System.out.println(s);
    }
    public static void Print(String s){
        System.out.print(s);
    }
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        Println("------------------------------------------");
        Println("Hello there, this is love test calculator here");
        Println("------------------------------------------");
        Print("Give the first person's Name: ");
        String name1 = sc.nextLine().trim();
        Print("Give the second person's Name: ");
        String name2 = sc.nextLine().trim();
        
        Println("The compatibility between "+name1+" and "+name2 + " is " + rand.nextInt(101)+ "%");
    }
}