public class Main{ 
       
    void add(int x, int y) {
        int c = x + y;
        System.out.println("Sum is " + c);
    }

    void add(int k) {
        int J = k + k;
        System.out.println("Sum is " + J);
    }
    
    void add(int i, int m, int n) {
        int s = i + m + n;
        System.out.println("Sum is " + s);
    }

    public static void main(String[] args) {
        Main test = new Main();  

        test.add(10, 15);

        test.add(20);

        test.add(5, 10, 15);
    }
}
