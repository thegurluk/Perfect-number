import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("please enter a number:");
        int number= input.nextInt();
        int i=1;
        int total=0;

        do {
            if(number%i==0){
                total+=i;
            }
            i++;
        }while (i!=number);
        if(total==number){
            System.out.println("this number is perfect number.");
        }else {
            System.out.println("this number is not perfect number.");
        }
    }
}
