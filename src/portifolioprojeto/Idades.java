package portifolioprojeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Idades extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdade1;
	private JTextField txtIdade2;
	private JButton btnLimpar;
	private JTextField lblMedia; 
	private JTextField txtMedia;
	private JTextField txtIdade3;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Idades frame = new Idades();
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
	public Idades() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Idades.class.getResource("/icones/calculadora.png")));
		setTitle("Media de Idades");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 315, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdade1 = new JLabel("Idade 1");
		lblIdade1.setBounds(10, 14, 48, 14);
		contentPane.add(lblIdade1);
		
		JLabel lblIdade2 = new JLabel("Idade 2");
		lblIdade2.setBounds(10, 55, 48, 14);
		contentPane.add(lblIdade2);
		
		txtIdade1 = new JTextField();
		txtIdade1.setBounds(59, 11, 96, 20);
		contentPane.add(txtIdade1);
		txtIdade1.setColumns(10);
		
		txtIdade2 = new JTextField();
		txtIdade2.setBounds(59, 52, 96, 20);
		contentPane.add(txtIdade2);
		txtIdade2.setColumns(10);
		
		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			//evento "clicar" no botão
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setIcon(new ImageIcon(Idades.class.getResource("/icones/calculadora1.png")));
		btnCalcular.setToolTipText("Calcular");
		btnCalcular.setBounds(10, 154, 128, 128);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setIcon(new ImageIcon(Idades.class.getResource("/icones/limpar.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setBounds(161, 154, 128, 128);
		contentPane.add(btnLimpar);
		
		JLabel lblMedia = new JLabel("M\u00E9dia de Idades");
		lblMedia.setBounds(180, 41, 96, 14);
		contentPane.add(lblMedia);
		
		txtMedia = new JTextField();
		txtMedia.setBounds(189, 64, 58, 20);
		contentPane.add(txtMedia);
		txtMedia.setColumns(10);
		
		JLabel lblIdade3 = new JLabel("Idade 3");
		lblIdade3.setBounds(10, 92, 48, 14);
		contentPane.add(lblIdade3);
		
		txtIdade3 = new JTextField();
		txtIdade3.setBounds(59, 92, 96, 20);
		contentPane.add(txtIdade3);
		txtIdade3.setColumns(10);
				
	}
	//método para calcular a média
	private void calcular() {
		DecimalFormat formatador= new DecimalFormat();
		int idade1,idade2,idade3,media;
		idade1 = Integer.parseInt(txtIdade1.getText());
		idade2 = Integer.parseInt(txtIdade2.getText());
		idade3 = Integer.parseInt(txtIdade3.getText());
		media = (idade1 + idade2 + idade3)/3;
		txtMedia.setText(formatador.format(media)); 
		JOptionPane.showMessageDialog(null,"A Média de idades são : " + media);
	}
	
	//método para limpar
	private void limpar() {
		txtIdade1.setText(null);
		txtIdade2.setText(null);
		txtIdade3.setText(null);
		txtMedia.setText(null);
	}
}

