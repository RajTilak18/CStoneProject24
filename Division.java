public class Division {
    public static int div(int a, int b){
        if(b > a){
            throw new IllegalArgumentException("b cannot be less than a");
        } else{
            return a / b;
        }
    }
}
