public class XyBalanced {
    public static void main(String[] args) {
        System.out.println(xyBalance("x"));
    }

    public static boolean xyBalance(String str) {
        int x=-1;
        int y=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='x'){
                x=i;
            }
            if(str.charAt(i)=='y'){
                y=i;
            }
        }

        return y>x;
    }

}
