public class LargestNumber{
    public static void main(String args[]){
        int a =12;
        int b=89;
        int c=50;

        // find the larget number 
       if(a>b){
        if(a>c){
            System.out.println(a);
        }
        else{
            System.out.println(c);
        }
        
       }
       else{
        if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
       }

// alternative method
       int max=a;
       if(b>max){
        max=b;
       }
       if(c>max){
        max=c;
       }
       System.out.println(max);

       
    }
    
}