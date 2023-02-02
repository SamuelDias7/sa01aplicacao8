package br.com.senaitagua.sa1.app8;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Piloto p = new Piloto();
		
		p.setNome(JOptionPane.showInputDialog("Informe o seu nome:"));
		p.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade")));
		
		if(p.verificarAposentadoria()) {
			new TelaAposentadoria().setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "Você não possui idade o sufiente:", "Aplicativo 8", JOptionPane.ERROR_MESSAGE);
		}
	}

}
