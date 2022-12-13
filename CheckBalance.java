import java.util.Scanner;
public class CheckBalance{
    void ShowData(){
        int password = 2115, pin = 4444, balance = 10000;
        String id = "developer123";
        Scanner sc=new Scanner(System.in);
        System.out.println("***Login Yourself***");
        System.out.print("Enter your id : ");
        String user_id = sc.nextLine();
        System.out.print("Enter your password : ");
        int user_password = sc.nextInt();
        if(user_password == password || user_id == id){
            System.out.println("***You've logged in succefully***");
            System.out.print("Enter your name  : ");
            String name = sc.next();
            System.out.print("Enter your pin : ");
            int user_pin = sc.nextInt();
            if(user_pin == pin){
                System.out.println("***Showing Bank Balance***");
                System.out.println("Bank Balance : "+balance);
            }else{
                System.out.println("Incorrect Pin");
            }
        }else{
            System.out.println("Oops..! You have entered wrong input");
        }
    }
    public static void main(String[] args){
        CheckBalance c=new CheckBalance();
        c.ShowData();
    }
}
