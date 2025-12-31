import java.util.*;
class RBS {
    public static void main(String[] args) {
        Map<Integer,Character> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        map.put(0,'R');
        map.put(1,'P');
        map.put(2,'S');
        Random rand = new Random();
        char computer = map.get(rand.nextInt(3));
        
        System.out.println("----------------------------------------");
        System.out.println("Lets play a Rock, Paper and Scissor Game");
        System.out.println("----------------------------------------");
        
        System.out.print("Choose Rock, Paper or Scissor(R,P,S): ");
        char choice = sc.next().toUpperCase().charAt(0);
        
        if(choice == computer){
            System.out.println("Computer choose: "+ computer);
            System.out.println("Its a draw");
        }
        //for Rock
        else if(choice == 'R'){
            if(computer== 'P'){
                System.out.println("Computer choose: "+ computer);
                System.out.println("The computer won!");
            }
            else if(computer== 'S'){
                System.out.println("Computer choose: "+ computer);
                System.out.println("You won!");
            }
        }
        else if(choice == 'P'){
            if(computer== 'S'){
                System.out.println("Computer choose: "+ computer);
                System.out.println("The computer won!");
            }
            else if(computer== 'R'){
                System.out.println("Computer choose: "+ computer);
                System.out.println("You won!");
            }
        }
        else if (choice == 'S'){
            if(computer== 'P'){
                System.out.println("Computer choose: "+ computer);
                System.out.println("The computer won!");
            }
            else if(computer== 'R'){
                System.out.println("Computer choose: "+ computer);
                System.out.println("You won!");
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
