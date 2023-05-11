public class NumberoccuringInaGivenNumber {
    public static void main(String args[])  {
        int a=12324;
        int count=0;
        while(a>0){
            int number=a%10;
            if(number==2){
                count++;
            }
            a=a/10;
        }

        System.out.println(count);
    }
}
