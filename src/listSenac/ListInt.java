package listSenac;

public class ListInt {
	
	Node head;
	
	public void add(int n) {
		
		
		if (head  == null ) {
			head = new Node(n);
		} else {
			Node nodeAux = head;
			while (nodeAux.getNext() != null) {
				nodeAux.getNext();
			}
			nodeAux.setNext(new Node (n));
		}
			
	}
	
	public int size () {
		
		int contador = 0; 
		
		while (head.getNext() != null) {
			head.getNext();
			contador++;
		}
		return contador;
     }
	
	
}
	