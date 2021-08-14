public class First {

    public static void main(String[] args) {

        System.out.println(stringChar("The"));
    }

    public static String stringChar(String string){
        String res="";
        for(int i=0; i<string.length();i++){
            res=res+string.charAt(i)+string.charAt(i);
        }
        return res;
    }
}
