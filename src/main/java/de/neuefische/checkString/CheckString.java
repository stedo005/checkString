package de.neuefische.checkString;

public class CheckString {
    public static void main(String[] args) {
        String toCheck = "fancyrwrwerwerwerwerwerwerwe";
        System.out.println(checkString(toCheck));
    }

    public static boolean checkLength(String str){
        return  str.length() > 20;
    }

    public static boolean checkContain(String str){
        return str.contains("fancy");
    }

    public static boolean checkString(String str){
        return checkLength(str) && checkContain(str);
    }
}
