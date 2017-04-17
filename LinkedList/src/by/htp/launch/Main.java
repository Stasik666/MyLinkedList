package by.htp.launch;

import by.htp.structure.MyLinkedList;

public class Main {

	public static void main(String[] args) {
		
		MyLinkedList<String> list = new MyLinkedList<String>();
		
		list.add("Stas");
		list.add("Vova");
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeLast();
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.add("Vova");
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}

}
