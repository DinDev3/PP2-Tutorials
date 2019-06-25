public class Ex1 {
    public static void main(String[] args) {
        System.out.print("a. ");
        for (int i=0; i<=100; i+=5){
            System.out.print(i);
            if (i<100){
                System.out.print(", ");
            }
        }

        System.out.print("\nb. ");
        for (int n=1; n<=1024; n=n*2){
            System.out.print(n);
            if (n<1024){
                System.out.print(", ");
            }
        }
    }
}
