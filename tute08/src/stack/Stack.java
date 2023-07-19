package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * @param <E>
 * 
 */

//  nums = List<Integer>
// for (Integer num : nums) {

// }

public class Stack<E> implements Iterable<E> {
    // End of the list s the top of the stack
    ArrayList<E> stack = new ArrayList<>();
    
    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        stack.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        return stack.remove(stack.size() - 1);
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        if (stack.isEmpty()) {
            return null;
        }

        return stack.get(stack.size() - 1);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        // stack = [1, 2, 3, 4]
        // We want to terate over this: 4 -> 3 -> 2 -> 1
        // stack.iterator: 1 -> 2 -> 3 -> 4
        
        // copy = [4, 3, 2, 1]
        // copy.iterator() = 4 -> 3 -> 2 -> 1
        List<E> copy = new ArrayList<>(stack);
        Collections.reverse(copy);
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return stack.size();
    }
    
    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        ArrayList<E> copy = new ArrayList<>(stack);
        return copy;
    }

    public static Integer sumStack(Stack<? extends Integer> stack) {
        int total = 0;
        for (Integer num : stack) {
            total += num;
        }
        return total;
    }

    public static void prettyPrint(Stack<?> stack) {
        System.out.print("[");
        Iterator<?> iter = stack.iterator();

        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }

        System.out.println("]");
    }
        

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        prettyPrint(stack);

        ArrayList<String> inner_list = stack.toArrayList();
        inner_list.clear();
        inner_list.add("Goodbye");
    }

}