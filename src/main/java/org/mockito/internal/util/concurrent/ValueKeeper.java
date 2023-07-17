package org.mockito.internal.util.concurrent;

public interface ValueKeeper<T> {
    T get();

    void remove(T value);

    void clear();

    void expungeStaleEntries();

    void set(T value);
}
