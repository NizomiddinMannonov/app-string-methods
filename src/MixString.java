public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc","897"));
    }

    public static String mixString(String a, String b) {
        String res="";
        String qoldiq="";
        int uzunlik=0;
        if(a.length()>b.length()){
            uzunlik=b.length();
            qoldiq=a.substring(uzunlik);
        }else{
            uzunlik=a.length();
            qoldiq=b.substring(uzunlik);
        }
        for(int j=0; j<uzunlik;j++){
            res=res+a.charAt(j)+b.charAt(j);
        }
        return res+qoldiq;

    }
}
