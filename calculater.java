import java.util.*;
public class calculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int opration = sc.nextInt();

        /**
         1-> addtion:
         2-> subtration:
         3-> multiplication:
         4-> div /:
         5->division %:
         */
        switch (opration) {
            case 1: System.out.println(a+b);
            break;

            case 2: System.out.println(a-b);
            break;

            case 3: System.out.println(a*b);
            break;

            case 4: if(b==0)
            System.out.println("Invailed Dision");
            else{
                System.out.println(a/b);
            }
            break;
            case 5: if(b==0)
            System.out.println("invalid dision");
            else{
                System.out.println(a%b);
            }
                break;
        
            default: System.out.println("inalid");
                 break;
        }
    }
}
