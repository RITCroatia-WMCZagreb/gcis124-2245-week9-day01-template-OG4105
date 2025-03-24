/*
@ASSESSME.USERID: og3150
@ASSESSME.AUTHOR: Omar Gradascevic
@ASSESSME.DESCRIPTION: CA W9 D1
@ASSESSME.ANALYZE: YES
*/

public interface Graph<E> {
    void add(E value);
    boolean contains(E value);
    int size();
    void connectDirected(E a,E b);
    void connectUndirected(E a,E b);
    boolean connected(E a,E b);
}   
