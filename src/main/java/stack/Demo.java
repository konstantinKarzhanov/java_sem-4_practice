package stack;

import java.util.Stack;

public class Demo {
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        String filteredString = input.replaceAll("[\\W_]", "").toLowerCase();

        //Push half of the string onto a stack
        int length = filteredString.length();

        for (int i = 0; i < length / 2; i++) { //n
            stack.push(filteredString.charAt(i));
        }

        //compare the second half of the string with the stack
        for (int i = (length + 1) / 2; i < length; i++) {
            if (stack.isEmpty() || stack.pop() != filteredString.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "Do geese see God";
//        String string = "mom";
        System.out.println("Is Palindrome: " + isPalindrome(string));
    }


//public class StackArrays {
//    int [] arr;
//    int topOfStack;
//
//    public StackArrays(int size){
//        this.arr = new int[size];
//        this.topOfStack = -1;
//        System.out.println("The stack is created with a size of: " + size);
//    }
//
//    //check whether a stack is empty
//    public boolean isEmpty (){
//        if (topOfStack == -1) {
//            System.out.println("Stack is empty");
//            return true;
//        } else
//            System.out.println("Stack is not empty");
//        return false;
//    }
//
//    //check if stack is full
//    public boolean isFull(){
//        if (topOfStack == arr.length -1) {
//            System.out.println("The stack is full");
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    //Inserting an element into a stack
//    public void push (int value) {
//        if (isFull()) {
//            System.out.println("The stack is full");
//        } else {
//            arr[topOfStack + 1] = value;
//            topOfStack++;
//            System.out.println("The value is successfully inserted");
//        }
//    }
//
//    //pop
//    //peek
//
//
//
//}


}