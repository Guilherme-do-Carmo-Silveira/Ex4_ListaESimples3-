package controller;

import docarmo.ListaInt.Lista;
import docarmo.QuickSort.Ordenacao;

public class ListaMaiorController {

	public ListaMaiorController() {
		super();
	}

	public void Maiores(Lista l) {
		
		Ordenacao ord = new Ordenacao();
		
		int tam = l.size();
		int [] vt = new int [tam];
		
		for(int i = 0; i < tam; i++) {
			try {
				vt[i] = l.get(i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		ord.QuickSort(vt, 0, tam - 1);
		
		System.out.println("Os dois maiores valores da lista sao: " + vt[tam - 1] + " e " + vt[tam - 2]);		
	}
}
