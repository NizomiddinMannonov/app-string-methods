public class BobThere {
    public static void main(String[] args) {
        System.out.println(bobThere("b8sbibsbsb"));
    }
    public static boolean bobThere(String str){
        boolean res=false;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i)=='b'&&str.charAt(i+2)=='b'){
                res=true;
                break;
            }
        }
        return res;
    }
}   
