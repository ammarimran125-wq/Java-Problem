public class ps_on_methods {
    static void multiplication(int n){
        for(int i = 1; i <= 10; i++){
            System.out.format("%d x %d = %d\n" ,n, i, n*i);
        }
    }
    static void pattern1(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    static void pattern2(int n){
        for (int i = n; i > 0; i--) {   // reverse loop
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
        static int sumRec(int n){
        //base condition
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    static int fib(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        //problem 1
       // multiplication(9);
        // problem 2
      //  pattern2(4);
        // problem 3
       // int c = sumRec(4);
        //System.out.println(c);
        //problem 4
        //fibonacci series - 0,1,1,2,3,5,8,13,21,34,55......
        int result = fib(7);
        System.out.println(result);
    }
}
