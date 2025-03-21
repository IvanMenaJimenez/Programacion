package Act_12_20;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int num,var;
        SuperCola C = new SuperCola();
        Scanner sc = new Scanner(System.in);
       
        do {
             var = sc.nextInt();
           
            
            switch (var) {
                case 1:
                   
                    C.desencolar1();
                    break;
                case 2:
                    C.desencolar2();
                    break;
                case 3:
                     num = sc.nextInt();
                    C.encolar1(num);
                    break;
                 case 4:
                      num = sc.nextInt();
                    C.encolar2(num);
                    break;
                default:
                    System.out.println("Esta mallllllll");            }
            var = sc.nextInt();
        } while (var > 0);
        
        C.desencolar2();
        System.out.println(C.lista2);
    }
    
}
