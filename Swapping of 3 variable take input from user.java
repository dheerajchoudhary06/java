public class SwapThreeVariables {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();
 
        int temp = a;
        a = b;
        b = c;
        c = temp;

        System.out.println("Swapped values: a = " + a + ", b = " + b + ", c = " + c);
 
        scanner.close();
    }
}
