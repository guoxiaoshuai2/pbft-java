package com.gmail.woodyc40.pbft;

public interface Node<Op, R, T> {
    long timeout();

    int tolerance();

    Roster roster();

    Digester<Op, R, T> digester();

    Encoder<Op, R, T> encoder();

    Transport<T> transport();
}
