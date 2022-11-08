package lista;

public class ArrayList implements List {

	int[] data = new int[1000];
	int quantity = 0;
	
	
	public void add(int value) {
		data[quantity] = value;
		quantity++;
	}

	public void remove(int value) {
		int foundIndex = -1;
		//procurar
		for(int i =0; i< quantity ; i++) {
			if(data[i]==value) {
				foundIndex = i;
				break;
			}
		}
		
		if(foundIndex == -1) {// se o indice continua -1, então não achou
			return;
		}
		
		//copia por cima do elemento que queremos remover
		int lastIndex = quantity -1;
		for(int i = foundIndex; i<lastIndex; i++) {
			data[i] = data[i+1];
		}
		
		quantity --;
	}

	public String show() {
		String output = "";
		int i = 0;
		while (i < quantity) {
			output = output + " " + data[i];
			i++;
		}
		return output;
	}
	
	public void update(int position, int value) {
		int index = position -1;
		
		if(index < 0 || index >= quantity) {
			return;
		}
		
		this.data[index] = value;
	}

	public int size() {
		return quantity;
	}

}
