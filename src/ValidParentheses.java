import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("}"));
    }
    public static boolean isValid(String s) {
        var openPStack = new Stack<Character>();
        for (char p : s.toCharArray()) {
            if (p == '(' || p == '[' || p == '{') {
                openPStack.push(p);
            } else if (!openPStack.isEmpty() &&
                         (openPStack.peek() == p - 1 ||
                            openPStack.peek() == p - 2)) {
                openPStack.pop();
            } else {
                return false;
            }
        }
        return openPStack.isEmpty();
    }


}
