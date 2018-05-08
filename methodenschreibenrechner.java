
package methodenschreibenrechenarten;


public class MethodenSchreibenRechenarten {
    public static void main(String[] args) {
        int a=4;
        int b= 3;
        int sum=0;
        
        for (int i=0;i<b; i++){
            sum=sum+a;
            
        }
        System.out.println(sum);
    }
    
public static int multiplikation(int a, int b){
       int sum=0;
       for (int i=0; i<b; i++){
       sum=sum+a;
       }
       return sum;
}

public static int division(int a, int b) {
        int ergebnis=0;
        int ausgang=a;
        while(ausgang>0){
           ausgang= ausgang-b;
           ergebnis++;
        }
        return ergebnis;
}

public static int potenz(int a, int b){
        int sum=1;
        for(int i=0; i<b; i++){
        sum=sum*a;
        }
        return sum;

}

}

