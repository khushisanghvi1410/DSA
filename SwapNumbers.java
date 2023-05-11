public class SwapNumbers {
    static void swap(int a,int b){

        int temp=a;
        a=b;
        b=temp;
        
    }

    static void name(String name){
        name="Romil Sanghvi";
    }
    public static void main(String[] args){
        int a=45;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);
        
        
        String name="Khushi Sanghvi";
        name(name);
        System.out.println(name);
    }    
}
