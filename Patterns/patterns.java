import java.util.Scanner;
import java.lang.Math;

public class patterns {
    static void pattern_1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_2(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_3(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_4(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }

    static void pattern_5(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print((i+1) + " ");
            }
            System.out.println();
        }
    }

    static void pattern_6(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print((j) + " ");
            }
            System.out.println();
        }
    }
    
    static void pattern_7(int n){
        for(int i = 1; i<=n; i++){
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern_8(int n){
        for(int i = 0; i<n; i++){
            //space
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int k = 0; k<(n*2)-(i*2+1); k++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //combine pattern 7 & 8
    static void pattern_9(int n){
        //pattern_7
        for(int i = 1; i<=n; i++){
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        //pattern_8
        for(int i = 0; i<n; i++){
            //space
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int k = 0; k<(n*2)-(i*2+1); k++){
                System.out.print("*");
            }
            //space
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    static void pattern_10(int n){
        for(int i = 1; i<=2*n-1; i++){
            int star = i;
            if(i > n){
                star = 2*n-i;
            }

            for(int j = 1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_11(int n){
        int star = 0;
        for(int i = 0; i<n; i++){
            if(i % 2 == 0){
                star = 1;
            }
            else{
                star = 0;
            }
            for(int j = 0; j<=i; j++){
                System.out.print(star + " ");
                star = 1 - star;
            }
            System.out.println();
        }
    }
    
    static void pattern_12(int n){
        for(int i = 0; i<n; i++){
            //num
            for(int j = 0; j<=i; j++){
                System.out.print(j+1);
            }
            //space
            for(int j = 0; j < (n*2)-(i*2)-2; j++){
                System.out.print(" ");
            }
            //num
            for(int j = i; j>=0; j--){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    
    static void pattern_13(int n){
        int num = 1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(num + "  ");
                num++;
            }
            System.out.println();
        }
    }
    
    static void pattern_14(int n){
        for(int i = 0; i<n ; i++){
            for(char ch = 'A'; ch <= 'A' + i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
    static void pattern_15(int n){
        for(int i = 0; i<n ; i++){
            for(char ch = 'A'; ch < 'A' + n - i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        
    }
    
    static void pattern_16(int n){
        char ch = 'A';
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
    
    static void pattern_17(int n){
        for(int i = 1; i<=n; i++){
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            int flipPoint = (2*i-1)/2;
            char ch = 'A';
            for(int k = 1; k<=2*i-1; k++){
                System.out.print(ch);
                if(k <= flipPoint){    
                    ch++;
                }
                else{
                    ch--;
                }
            }
            //space
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    //Need fix!!
    static void pattern_18A(int n){
        char ch = (char) ('A' + n - 2);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                ch = (char) (ch - (2*i) + 1);
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
    static void pattern_18B(int n){
        for(int i = 0; i<n; i++){
            for(char ch = (char) ('E' - i); ch<='E'; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
    static void pattern_19(int n){
        for(int i = 0; i<n; i++){
            //star
            for(int j = 0; j<n-i; j++){
                System.out.print("*");
            }
            //space
            for(int k = 0; k<i*2; k++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i<n; i++){
            //star
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            //space
            for(int k = 0; k<(n*2)-(i*2+2); k++){
                System.out.print(" ");
            }
            //star
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern_20(int n){
        int flipPoint = n;
        int star = 0;
        for(int i = 0; i<2*n-1; i++){
            if(i < flipPoint){
                //star
                for(int j = 0; j<=star; j++){
                    System.out.print("*");
                }
                //space
                for(int j = 0; j<(n*2)-(i*2)-2; j++){
                    System.out.print(" ");
                }
                //star
                for(int j = 0; j<=star; j++){
                    System.out.print("*");
                }
                System.out.println();
                star++;
            }
            else if(i >= flipPoint){
                //star
                for(int j = 1; j<star; j++){
                    System.out.print("*");
                }
                //space
                for(int j = 0; j<(i*2)-(n*2)+2; j++){
                    System.out.print(" ");
                }
                //star
                for(int j = 1; j<star; j++){
                    System.out.print("*");
                }
                System.out.println();
                star--;
            }
        }
    }
    
    static void pattern_21(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i == 0 || i == n-1 || j == 0 || j == n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    static void pattern_22(int n){
        for(int i = 0; i<n*2-1; i++){
            for(int j = 0; j<n*2-1; j++){
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int down = (2*n-2)-i;

                System.out.print((n)-(Math.min(Math.min(top, down), Math.min(left, right))));
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();

        for(int i = 0; i<t; i++){
            int line = scan.nextInt();
            pattern_21(line);
        }
    }
}
