/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videostore;

/**
 *
 * @author Dan Herold
 * @version 2014.4.19
 * @param <E>
 */
public class SuperNode<E extends Comparable<E>> {

    private E e;

    public SuperNode() {

    }

    public E get() {
        return e;
    }
}
