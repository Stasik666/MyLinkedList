package by.htp.structure;

import java.util.NoSuchElementException;

public class MyLinkedList<E>{

	private int size = 0;
	
	private ListElement<E> header;
	
	public MyLinkedList(){
		header = new ListElement<E>(null,null,null);
		header.next = header.prev = header;
	}
	
	public int size() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void add(E element){
		ListElement newElement = new ListElement(element,header,header.prev);
		newElement.prev.next = newElement;
		newElement.next.prev = newElement;
		size++;
	}
	
	public E getFirst() {
	    final ListElement<E> f = header.next;
	    if (size() == 0)
	        throw new NoSuchElementException();
	        return f.element;
	}
	
	public E getLast() {
        final ListElement<E> l = header.prev;
        if (size() == 0)
            throw new NoSuchElementException();
        return l.element;
    }
	
	public E removeLast() {
        final ListElement<E> l = header.prev;
        if (size() == 0)
            throw new NoSuchElementException();
        return unlinkLast(l);
    }
	
	private E unlinkLast(ListElement<E> l) {
        final E element = l.element;
        final ListElement<E> prev = l.prev;
        l.element = null;
        l.prev = null;
        header.prev = prev;
        if (prev == null)
            header.next = null;
        else
            prev.next = null;
        size--;
        return element;
    }
	
    
	private static class ListElement<E>{
		
		private E element;
		private ListElement<E> next;
		private ListElement<E> prev;
		
		public ListElement(E element, ListElement<E> next,ListElement<E> prev){
			this.element = element;
			this.next = next;
			this.prev = prev;
		}

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

		public ListElement<E> getNext() {
			return next;
		}

		public void setNext(ListElement<E> next) {
			this.next = next;
		}

		public ListElement<E> getPrev() {
			return prev;
		}

		public void setPrev(ListElement<E> prev) {
			this.prev = prev;
		}
		
	}
}

