import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class EntradaDeTexto extends Diario {

	Date data;
	String texto;

	public void novaEntrada() {
		// TODO Auto-generated method stub
	}

	public boolean verificarLimite() {
		try {
			if (texto.length() > 140) {
				JOptionPane.showMessageDialog(null, "Texto muito longo. Limite de 140 caracteres");
				return false;
			} else
				return true;
		} catch (Exception e) {
			throw e;
		}

	}

	public boolean verificarVazio() {
		try {
			if (texto.equals(null) || texto.isEmpty() == true) {
				JOptionPane.showMessageDialog(null, "Texto vazio");
				return false;
			} else
				return true;
		} catch (Exception e) {
			throw e;
		}
	}

	public Date getData() {
		return data;
	}

	public String getDataFormat() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strData = formatter.format(data);
		return strData;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
