public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        var i = 0;
        var j = s.length()-1;
        char iHalf = ' ';
        char jHalf = ' ';

        while (i < j){
            while (i < s.length() && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            iHalf = Character.toLowerCase(s.charAt(i));
            while (j >= 0 && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            jHalf = Character.toLowerCase(s.charAt(j));

            if (iHalf != jHalf){
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
