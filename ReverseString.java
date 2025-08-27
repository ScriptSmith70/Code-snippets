public class ReverseString{
    static String Reverse(String s){
        int n = s.length();
        String k = "";
        for (int i =n-1; i>=0; i--){
            k = k+s.charAt(i);
        }
        return k;
    }
    public static void main(String[] args){
        String k = "abcde";
        String ans = Reverse(k);
        System.out.println(ans);
    }
}