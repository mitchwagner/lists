import java.util.Iterator;

/**
 * An interface for a (0-indexed) list.
 */
public interface List<E> {


    /**
     * Put the element e at the beginning of the list
     */
    public void prepend(E e);


    /**
     * Put the element e at the end of the list
     */
    public void append(E e);


    /**
     * Insert the element e at the specified index 
     */
    public void insert(E e, Long idx); 

    
    /**
     * Remove all elements from the list
     */
    public void clear();


    /**
     * Get the element at the specified index
     */
    public E get(Long idx);


    /**
     * Remove the element at the specified index
     */
    public void remove(Long idx);


    /**
     * Remove the first instance of the specified element
     */
    public void removeFirst(E e);


    /**
     * Remove all instances of the specified element
     */
    public void removeAll(E e);


    public Long size();

    
    public void isEmpty();


    public Iterator<E> iterator();

}
