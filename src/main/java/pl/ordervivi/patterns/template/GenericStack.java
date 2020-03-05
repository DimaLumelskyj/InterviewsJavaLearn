package pl.ordervivi.patterns.template;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class GenericStack<T> {
    private final List<T> stack;

    public GenericStack() {
        stack = new LinkedList<>();
    }

    public GenericStack(LinkedList<T> stack) {
        this.stack = stack;
    }

    public Optional<T> pop() {
        if (stack.size() == 0) {
            return Optional.empty();
        }
        return Optional.of(stack.remove(0));
    }

    public void push(final T object) {
        stack.add(0, object);
    }

    public GenericStack<T> filter(final StackPredicateGeneric<T> filter) {
        final LinkedList<T> initialState = new LinkedList<>();

        for (T object : stack) {
            if (filter.isValid(object)) {
                initialState.add(object);
            }
        }

        return new GenericStack<T>(initialState);
    }
}
