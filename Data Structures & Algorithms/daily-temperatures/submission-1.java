class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    
    Stack<Integer> stack = new Stack<>();
    int size = temperatures.length;
    int[] result = new int[size];

    for(int i=0; i<size; i++){
            while (!stack.isEmpty() &&
                   temperatures[i] > temperatures[stack.peek()]){
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }

            stack.push(i);
        }
        return result;
    }
}
