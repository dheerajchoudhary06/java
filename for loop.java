import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
         
        System.out.println("enter any number: ");
        
           int a = k.nextInt();
           
        for(int i=1; i<=10; i++){
            int result = a*i;
            System.out.println(result);
        }   
    }
}
