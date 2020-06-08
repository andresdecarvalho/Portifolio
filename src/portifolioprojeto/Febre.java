package portifolioprojeto;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class Febre extends JFrame {

	private JPanel contentPane;
	private JTextField txtFebre;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Febre frame = new Febre();
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
	public Febre() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Febre.class.getResource("/icones/temp.png")));
		setResizable(false);
		//setIconImage(Toolkit.getDefaultToolkit().getImage(CalculoImc.class.getResource("/br/com/imc/icones/imc.png")));
		setTitle("Estado Febril");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 318, 143);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFebre = new JTextField();
		txtFebre.setBounds(47, 47, 43, 20);
		contentPane.add(txtFebre);
		txtFebre.setColumns(10);
		
		JLabel lblFebre = new JLabel("Temperatura");
		lblFebre.setBounds(47, 22, 90, 14);
		contentPane.add(lblFebre);
		
		JButton btnCalcular = new JButton("");
		btnCalcular.setIcon(new ImageIcon(Febre.class.getResource("/icones/temp.png")));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular(); 
			}
		});
		btnCalcular.setBounds(136, 22, 64, 64);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("");
		btnLimpar.setIcon(new ImageIcon(Febre.class.getResource("/icones/limpar.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar(); 
			}
		});
		btnLimpar.setBounds(222, 22, 64, 64);
		contentPane.add(btnLimpar);
		
		lblStatus = new JLabel("");
		//lblStatus.setIcon(new ImageIcon(Febre.class.getResource("/br/com/imc/icones/tabela_imc.jpg")));
		lblStatus.setBounds(31, 180, 423, 210);
		contentPane.add(lblStatus);
		
		JLabel lblc = new JLabel("\u00B0C");
		lblc.setBounds(100, 50, 37, 14);
		contentPane.add(lblc);
	}
	//método para calcular o Febre
	private void calcular() {
		DecimalFormat formatador = new DecimalFormat("0.00"); 
		double febre;
		febre = Double.parseDouble(txtFebre.getText().replace(",",".")); 
		txtFebre.setText(formatador.format(febre));
		if (febre >= 37.8 && febre < 38 ) {
			JOptionPane.showMessageDialog(null,"Você está com Febre Baixa!!"); 
		}else if(febre >= 38 && febre < 39) {
			JOptionPane.showMessageDialog(null,"Você está com Febre Moderada!!"); 
		}else if(febre >= 39 ) {
			JOptionPane.showMessageDialog(null,"Você está com Febre Alta!!");
		}else if(febre <= 37.7 ) {
			JOptionPane.showMessageDialog(null,"Você está sem Febre!!");	
	}
	}	
		//método para limpar campos
		private void limpar() {
			txtFebre.setText(null);
			
	}
}
