import java.util.Stack;
public class BalancedAllBrackets {
    public String checkBalance(String string) {
        Stack<Character> stack = new Stack<>();
        int j = 0;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if ( c == '(') {
                stack.push(c);
                j++;
            }
            else if (j > 0){

                if ( c == ')') {
                    stack.pop();
                    j--;
                }
            }
            else if (c == ')') {
                j--;
            }
        }
        if (j != 0) {
            return "unbalanced";
        }
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if ( c == '{') {
                stack.push(c);
                j++;
            }
            else if (j > 0){
                if (c == '}') {
                    stack.pop();
                    j--;
                }
            }
            else if (c == '}') {
                j--;
            }

        }
        if (j != 0) {
            return "unbalanced";
        }
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '[') {
                stack.push(c);
                j++;
            }
            else if (j > 0){
                if (c == ']') {
                    stack.pop();
                    j--;
                }
            }
            else if (c == ']') {
                j--;
            }
        }
        if (j != 0) {
            return "unbalanced";
        } else if (stack.empty()) {
            return "balanced";
        } else {
            return "unbalanced";
        }
    }
}
