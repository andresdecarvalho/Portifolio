//nome do pacote
package portifolioprojeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.Toolkit;

//classe Tabuada
public class Tabuada extends JFrame {
	
	//labels declaradas
	private JPanel contentPane;
	private JTextField txtNumero;
	private JButton btnLimpar;
	private JLabel lblResultado0;
	private JLabel lblResultado1;
	private JLabel lblResultado2;
	private JLabel lblResultado3;
	private JLabel lblResultado4;
	private JLabel lblResultado5;
	private JLabel lblResultado6;
	private JLabel lblResultado7;
	private JLabel lblResultado8;
	private JLabel lblResultado9;
	private JLabel lblResultado10;
	private JLabel lblDigiteUmNumero;

	/**
	 * Launch the application.
	 */
	//comando que executa o frame
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabuada frame = new Tabuada();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tabuada() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Tabuada.class.getResource("/icones/calculadora.png")));
		setTitle("Tabuada");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 300, 437);
		contentPane =  new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//botão "OK" e função para fazer o calculo de tabuada
		JButton btnTabuada = new JButton("Tabuada");
		btnTabuada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		
		//botões e labels da tabuada ("Não alterar")
		lblResultado10 = new JLabel("");
		lblResultado10.setBounds(105, 358, 89, 14);
		contentPane.add(lblResultado10);
		
		lblResultado9 = new JLabel("");
		lblResultado9.setBounds(105, 333, 89, 14);
		contentPane.add(lblResultado9);
		
		lblResultado8 = new JLabel("");
		lblResultado8.setBounds(105, 308, 89, 14);
		contentPane.add(lblResultado8);
		
		lblResultado7 = new JLabel("");
		lblResultado7.setBounds(105, 283, 89, 14);
		contentPane.add(lblResultado7);
		
		lblResultado6 = new JLabel("");
		lblResultado6.setBounds(105, 258, 89, 14);
		contentPane.add(lblResultado6);
		
		lblResultado5 = new JLabel("");
		lblResultado5.setBounds(105, 231, 89, 14);
		contentPane.add(lblResultado5);
		
		lblResultado4 = new JLabel("");
		lblResultado4.setBounds(105, 206, 89, 14);
		contentPane.add(lblResultado4);
		
		lblResultado3 = new JLabel("");
		lblResultado3.setBounds(105, 181, 89, 14);
		contentPane.add(lblResultado3);
		
		lblResultado2 = new JLabel("");
		lblResultado2.setBounds(105, 156, 89, 14);
		contentPane.add(lblResultado2);
		
		lblResultado1 = new JLabel("");
		lblResultado1.setBounds(105, 131, 89, 14);
		contentPane.add(lblResultado1);
		
		lblResultado0 = new JLabel("");
		lblResultado0.setBounds(105, 110, 89, 14);
		contentPane.add(lblResultado0);
		btnTabuada.setToolTipText("Tabuada");
		btnTabuada.setBounds(48, 59, 89, 23);
		contentPane.add(btnTabuada);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(173, 22, 63, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		
		JTable table = new JTable();
		table.setBounds(48, 93, 188, 297);
		contentPane.add(table);
		btnLimpar.setBounds(147, 59, 89, 23);
		contentPane.add(btnLimpar);
		
		lblDigiteUmNumero = new JLabel("Digite um Numero :");
		lblDigiteUmNumero.setBounds(48, 25, 122, 14);
		contentPane.add(lblDigiteUmNumero);
	        }
	
		//função que executa o calculo
		public void calcular(){
			int valor,resultado; 
			valor = (int) Double.parseDouble(txtNumero.getText());		
			for (int ii = 0; ii <=10; ii++){
				System.out.println(ii);
				resultado = ii*valor;
				
				//função que exibe o resultado na tela
				if (ii==0) {
					lblResultado0.setText(valor + " x 0 = " + resultado);
				    }
				if (ii==1) {
					lblResultado1.setText(valor + " x 1 = " + resultado);
				    }
				if (ii==2) {
					lblResultado2.setText(valor + " x 2 = " + resultado);
					}
				if (ii==3) {
					lblResultado3.setText(valor + " x 3 = " + resultado);
					}
				if (ii==4) {
					lblResultado4.setText(valor + " x 4 = " + resultado);
					}
				if (ii==5) {
					lblResultado5.setText(valor + " x 5 = " + resultado);
					}
				if (ii==6) {
					lblResultado6.setText(valor + " x 6 = " + resultado);
					}
				if (ii==7) {
					lblResultado7.setText(valor + " x 7 = " + resultado);
					}
				if (ii==8) {
					lblResultado8.setText(valor + " x 8 = " + resultado);
					}
				if (ii==9) {
					lblResultado9.setText(valor + " x 9 = " + resultado);
					}
				if (ii==10) {
					lblResultado10.setText(valor + " x 10 = " + resultado);
					}
					
}
}
		//comando para limpar a tela
		private void limpar() {
			lblResultado0.setText(null);
			lblResultado1.setText(null);
			lblResultado2.setText(null);
			lblResultado3.setText(null);
			lblResultado4.setText(null);
			lblResultado5.setText(null);
			lblResultado6.setText(null);
			lblResultado7.setText(null);
			lblResultado8.setText(null);
			lblResultado9.setText(null);
			lblResultado10.setText(null);
			txtNumero.setText(null);
		
			
	}
		
}