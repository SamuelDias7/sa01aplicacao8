//definição do pacote
package br.com.senaitagua.sa1.app8;
import java.awt.FlowLayout;

//importação do pacote swing
import javax.swing.*;

//Como que é a herança em Java?
//herdando a classe JFrame
public class TelaAposentadoria extends JFrame{ //herança
	//Definindo um componente swing título
	JLabel titulo;
	//Definindo componentes swing -botões
	JButton btnGravar,btnLer,btnLimpar;
	//Definindo um caixa de texto para strings longas.
	JTextArea txtArea;
	
	//construtor 
	public TelaAposentadoria() {
		//referênciando o pai (superclasse)
		super("Aplicativo 8");
		getContentPane().setLayout(new FlowLayout());
		//instanciação do objeto título
		titulo = new JLabel("aplicativo 8 - Aposentadoria do Piloto");
		//instanciação dos botões
		btnGravar = new JButton("Gravar");
		btnLer = new JButton("Ler");
		btnLimpar = new JButton("Limpar");
		//instanciação da área de texto
		//(linha,coluna)
		txtArea = new JTextArea(5,10);
		getContentPane().add(titulo);
		getContentPane().add(txtArea);
		getContentPane().add(btnGravar);
		getContentPane().add(btnLer);
		getContentPane().add(btnLimpar);
		setSize(800,600);
		
	}
	
	
	

}