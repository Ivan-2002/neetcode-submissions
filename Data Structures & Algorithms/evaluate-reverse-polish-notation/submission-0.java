class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {

                int b = stack.pop(); // right operand
                int a = stack.pop(); // left operand

                int result;
                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    default: // "/"
                        result = a / b;
                }

                stack.push(result);
            } else {
                // token is a number
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}