import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Lista implements FuncoesDaLista {

	ArrayList<EntradaDeTexto> lista = new ArrayList<EntradaDeTexto>();
	private static Lista INSTANCE = new Lista();
	
	public static Lista getInstance() {
		return INSTANCE;
	}

	public void salvarNaLista(EntradaDeTexto edt1) {
		lista.add(edt1);
	}

	public String selecionarNaLista(int i) {
		return lista.get(i).getTexto();
	}

	public String imprimirLista() {
		String str = "";
		for (EntradaDeTexto loop : lista) {
			str += "[Entrada nº " + (lista.indexOf(loop) + 1) + "] " + loop.getTexto() + " - " + loop.getDataFormat() + "\n";
		}
		return str;
	}

	public boolean verificarListaVazia() {
		if (lista.isEmpty() == true) {
			JOptionPane.showMessageDialog(null, "Lista vazia");
			return false;
		}
		else return true;
	}

	@Override
	public String toString() {
		return "Lista [lista=" + lista.get(1).getTexto() + "]";
	}

}
