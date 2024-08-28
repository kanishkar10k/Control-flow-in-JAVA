import java.io.Reader;
import java.util.*;
class controlflow{
    public static void main(String[] args) {
        int week=0;
        char exit=' ';
        Scanner sc = new Scanner(System.in);
        do {
            exit=' ';
            week=sc.nextInt(); 
            if(week<1 || week>7){
                System.out.println("Invalid input");
            }
            else{
                switch (week) {
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");
                        break;
                    default:
                        break;
                }
            }
            while(exit!='n' && exit!='y'){
                System.out.println("Do you Wish to Exit(n/y)? :");
                exit=sc.next().charAt(0);
                if(exit!='y' && exit!='n'){
                    System.out.println("Invalid input");
                }
            }
        } while (exit!='y');
    }
}