package listSenac;

public class Node {
	
	private int valor;
	private Node next;
		public int getValor() {
			return valor;
		}
		public void setValor(int valor) {
			this.valor = valor;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
		public Node() {
			
		}
		
		public Node(int n) { 
			this.valor = n;
		}
}
