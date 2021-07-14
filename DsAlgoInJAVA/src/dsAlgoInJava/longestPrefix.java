package dsAlgoInJava;

public class longestPrefix {

    public static String longestPrefix(String[] str){
        String longestPrefix = "";
        if (str == null || str.length == 0) {
            return longestPrefix;
        }

        int index = 0;
        for(char c : str[0].toCharArray()){
            for (int i =1; i < str.length; i++){
                if(index >= str[i].length() || c != str[i].charAt(index)){
                    return longestPrefix;
                }
            }
            longestPrefix +=c;
            index++;
        }

    return longestPrefix;

    }
    public static void main(String[] args) {
        String[] a = new String[]{"flower", "flow", "flight"};
        System.out.println(longestPrefix(a));
    }
}
