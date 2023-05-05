package view;

import controller.ListaMaiorController;
import docarmo.ListaInt.Lista;

public class main {

	public static void main(String[] args) {
		
		Lista l = new Lista();
		ListaMaiorController c = new ListaMaiorController();
		
		l.addFirst(3);
		try {
			l.addLast(5);
			l.addLast(8);
			l.addLast(12);
			l.addLast(9);
			l.addLast(7);
			l.addLast(6);
			l.addLast(2);
			l.addLast(3);
			l.addLast(7);
			l.addLast(16);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		c.Maiores(l);
	}

}
