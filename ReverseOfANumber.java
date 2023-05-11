public class ReverseOfANumber {
    static void sum(){
        System.out.println("Sum is "+45);
    }
    public static void main(String[] args){
        int number=123456;
        int count=0;
        int finalans=0;
        int a=number;
        while(a>0){
            a=a/10;
            count++;
        }
        System.out.println(count);
        while(count>=0){
            int rem=number%10;
            number=number/10;
            int c=(int)Math.pow(10, count-1)*rem;
            count--;
            finalans=c+finalans;
            
            
        }
        System.out.println(finalans);
        sum();
        
    }    
}
