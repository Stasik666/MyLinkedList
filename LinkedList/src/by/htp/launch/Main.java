package by.htp.launch;

import by.htp.structure.MyArrayList;
import by.htp.structure.MyLinkedList;

public class Main {

	public static void main(String[] args) {
		
		MyLinkedList<String> list = new MyLinkedList<String>();
		MyArrayList arrayList = new MyArrayList();
		list.add("Stas");
		list.add("Vova");
		list.add("Gena");
		
		
		System.out.println(list.size());
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
//		list.removeLast();
//		System.out.println(list.size());
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		list.add("Vova");
//		System.out.println(list.size());
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		arrayList.addToList("Gena");
//		arrayList.addToList("Stas");
//		arrayList.addToList("Yura");
//		arrayList.addToList("Sveta");
//		arrayList.printArrayList();
//		arrayList.addToList("KKKKKK", 5);
//		arrayList.printArrayList();
		
	}

}
