public class BalancedBracketsTester {
    public static void main(String[] args) {
        BalancedBrackets balanced = new BalancedBrackets();
        BalancedAllBrackets allBalanced = new BalancedAllBrackets();

        //regular brackets test
        System.out.println("1. " + balanced.checkBalance("()")); // balanced
        System.out.println("2. " + balanced.checkBalance("(()((()(()((()))())))))")); //unbalanced
        System.out.println("3. " + balanced.checkBalance("((()))")); // balanced

        //all balanced brackets test
        System.out.println("4. " + allBalanced.checkBalance("({[]})"));  //balanced
        System.out.println("5. " + allBalanced.checkBalance("(({))}}"));  //unbalanced
        System.out.println("6. " + allBalanced.checkBalance("}]")); // unbalanced

        //example lines
        System.out.println("7. " + balanced.checkBalance("())")); //unbalanced
        System.out.println("8. " + balanced.checkBalance(")(()))")); //unbalanced

        //all balanced example lines
        System.out.println("9. " + allBalanced.checkBalance("(([{}]))")); //balanced
        System.out.println("10. " + allBalanced.checkBalance("{]()}")); // unbalanced
    }
}
