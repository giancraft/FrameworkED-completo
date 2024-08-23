package teste;

import facade.ListaFacade;

public class Main {

	public static void main(String[] args) {
		ListaFacade<Integer> lista = new ListaFacade<>();
		lista.criarListaEncadeada();

		
		ListaFacade<String> listaCirc = new ListaFacade<>();
		listaCirc.criarListaCircular();
		
		ListaFacade<String> listaDupla = new ListaFacade<>();
		listaDupla.criarListaDuplamenteEncadeada();

		/*lista.addFirst(12345678);
		lista.addFirst(234899889);
		lista.addFirst(356247327);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		lista.addFirst(1);
		
		System.out.println(lista.printList());
		lista.desenharLista();
		System.out.println(lista.get(1));
		lista.removeFirst();
		System.out.println(lista.printList());
		lista.clear();
		System.out.println(lista.printList());
		lista.addLast(4);
		lista.addLast(5);
		lista.addLast(6);
		lista.addLast(7);
		System.out.println(lista.printList());
		lista.removeLast();
		System.out.println(lista.printList());
		lista.remove(8);
		System.out.println(lista.printList());
		System.out.println(lista.get(0));
		System.out.println(lista.size());*/
		
		/*listaCirc.addFirst("c");
		listaCirc.addFirst("b");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		listaCirc.addFirst("a");
		System.out.println(listaCirc.printList());
		listaCirc.desenharLista();
		listaCirc.removeLast();
		System.out.println(listaCirc.printList());
		listaCirc.remove("a");
		
		System.out.println(listaCirc.printList());
		System.out.println(listaCirc.get(0));
		listaCirc.clear();
		System.out.println(listaCirc.printList());
		listaCirc.addLast("d");
		listaCirc.addLast("e");
		listaCirc.addLast("f");
		listaCirc.addLast("g");
		System.out.println(listaCirc.printList());
		System.out.println(listaCirc.get(2));
		listaCirc.removeFirst();
		System.out.println(listaCirc.printList());
		listaCirc.remove("f");
		System.out.println(listaCirc.printList());
		System.out.println(listaCirc.size());*/
		
		/*listaDupla.addFirst("c");
		listaDupla.addFirst("b");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		listaDupla.addFirst("a");
		
		System.out.println(listaDupla.printList());
		System.out.println(listaDupla.size());
		System.out.println(listaDupla.get(0));
		listaDupla.desenharLista();
		listaDupla.removeFirst();
		System.out.println(listaDupla.printList());
		System.out.println(listaDupla.size());
		listaDupla.clear();
		
		System.out.println();
		
		listaDupla.addLast("d");
		listaDupla.addLast("e");
		listaDupla.addLast("f");
		
		System.out.println(listaDupla.printList());
		System.out.println(listaDupla.size());
		System.out.println(listaDupla.removeLast());
		System.out.println(listaDupla.printList());
		System.out.println(listaDupla.size());
		
		listaDupla.addLast("g");
		listaDupla.addLast("h");
		listaDupla.addLast("i");
		System.out.println(listaDupla.printList());
		System.out.println(listaDupla.size());*/
	}
}
