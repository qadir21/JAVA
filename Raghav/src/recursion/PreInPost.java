package recursion;

public class PreInPost {
    public static void main(String[] args) {
        pip(3);
    }

    public static void pip(int n){
        if(n == 0) return;
        System.out.print(n + " "); // pre
        pip(n - 1);
        System.out.print(n + " "); // in
        pip(n - 1);
        System.out.print(n + " "); // post
    }
}