package exceptions;

import tester.Traversal;

/**
 * A class to represent an empty list dataset of objects 
 * of the type <code>T</code> generated by the <CODE>{@link Traversal Traversal} T</CODE>
 * 
 */
public class MTListTr<T> implements AListTr<T> {
	public MTListTr(){
	}
	/** 
	 * Produce true if this <CODE>{@link Traversal Traversal}</CODE> 
	 * represents an empty dataset 
	 * 
	 * @return true - as this is an empty dataset
	 */
	public boolean isEmpty(){ 
		return true; 
	}

	/** 
	 * <P>Produce the first element in the dataset represented by this 
	 * <CODE>{@link Traversal Traversal}</CODE> </P>
	 * <P>Throws <code>UnsupportedOperationException</code> 
	 * if the dataset is empty.</P>
	 * 
	 * @return throws <code>UnsupportedOperationException</code>
	 */
	public T getFirst(){
		throw new UnsupportedOperationException(
				"Cannot access the first element of an empty data set");
	}

	/** 
	 * <P>Produce a <CODE>{@link Traversal Traversal}</CODE> 
	 * for the rest of the dataset </P>
	 * <P>Throws <code>UnsupportedOperationException</code> 
	 * if the dataset is empty.</P>
	 * 
	 * @return throws <code>UnsupportedOperationException</code>
	 */
	public Traversal<T> getRest(){
		throw new UnsupportedOperationException(
				"Cannot advance to the rest of an empty data set");
	}
  
	/**
	 * Does this list contain the given object?
	 * 
	 * @param that the given object
	 * @return false - always
	 */  
	public boolean contains(T that){ 
		return false;
	} 
}