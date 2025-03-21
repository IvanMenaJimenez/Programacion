package Act_12_20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SuperCola {

    List lista1 = new ArrayList();
    List lista2 = new ArrayList();

    public SuperCola() {
    }

    public void encolar1(int a) {
        lista1.add(a);
    }

    public void encolar2(int a) {
        lista2.add(a);
    }

    public void desencolar1() {
        if (!lista1.isEmpty()) {
             lista1.remove(0); 
        }else{
            
            if (!lista2.isEmpty()) {
            lista2.remove(0);    
            }else{
                System.out.println("ESTA MALLLLLLL");
            }       
        }    
    }


     public void desencolar2() {
         
    
        if (!lista2.isEmpty()) {
             lista2.remove(0); 
        }else{
            
            if (!lista1.isEmpty()) {
            lista1.remove(0);    
            }else{
                System.out.println("ESTA MALLLLLLL");
            }       
        }    
    }
    
    
}
