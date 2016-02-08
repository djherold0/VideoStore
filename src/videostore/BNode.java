/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videostore;

/**
 * A Binary Tree Node that holds data! Code I wrote in 2011 for another class,
 * modified to fit with this project
 *
 * @author Dan Herold
 * @version 2015.3.31
 * @param <E> the type of data the node holds
 */
public class BNode<E extends Comparable<E>> extends SuperNode {

    private E data;
    private BNode<E> left, right;

    /**
     * Constructor if passed only the data to hold
     *
     * @param d the data to hold
     */
    public BNode(E d) {
        data = d;
        left = right = null;
    }

    /**
     * A different constructor!
     *
     * @param d the data to hold
     * @param l the left child of the node
     * @param r the right child of the node
     */
    public BNode(E d, BNode<E> l, BNode<E> r) {
        data = d;
        left = l;
        right = r;
    }

    /**
     * Set the left node link
     *
     * @param l the new node
     */
    public void setL(BNode<E> l) {
        left = l;
    }

    /**
     * Set the right node link
     *
     * @param r the new node
     */
    public void setR(BNode<E> r) {
        right = r;
    }

    /**
     * Get the left node
     *
     * @return the left child of this node
     */
    public BNode<E> getL() {
        return left;
    }

    /**
     * Get the right node
     *
     * @return the right child of this node
     */
    public BNode<E> getR() {
        return right;
    }

    /**
     * Access the data this node holds
     *
     * @return the data held by the node
     */
    public E get() {
        return data;
    }

    /**
     * Set new data
     *
     * @param d the new data
     */
    public void set(E d) {
        data = d;
    }

    /**
     * the toString method
     *
     * @return String representation of the data in the node
     */
    @Override
    public String toString() {
        return data.toString();
    }

    /**
     * The compareTo method!!
     *
     * @param target what to compare with
     * @return -1 if the data is less than target, 0 if they are equal, and 1 if
     * the target is greater
     */
    public int compareTo(BNode<E> target) {
        return (((Comparable) (this.data)).compareTo((Comparable) (target.data)));
    }
}
