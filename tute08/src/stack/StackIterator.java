package stack;

import java.util.Iterator;

public class StackIterator<E> implements Iterator<E> {

    private Stack<E> stack;

    public StackIterator(Stack<E> stack) {
        this.stack = stack;
    }

    @Override
    public boolean hasNext() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
    }

    @Override
    public E next() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'next'");
    }
}
