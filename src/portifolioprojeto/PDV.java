package portifolioprojeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PDV extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JButton btnLimpar;
	private JTextField lblMdia; 
	private JTextField txtMedia;
	private JTextField txtTroco;
	private JTextField txtValorpago;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PDV frame = new PDV();
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
	public PDV() {
		setResizable(false);
		//(Toolkit.getDefaultToolkit().getImage(PDV.class.getResource("/icones/calculadora.png")));
		setTitle("PDV");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 378, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValortotal = new JLabel("Valor Total");
		lblValortotal.setBounds(76, 47, 65, 17);
		contentPane.add(lblValortotal);
		
		JLabel lblDesconto = new JLabel("Desconto");
		lblDesconto.setBounds(81, 75, 60, 14);
		contentPane.add(lblDesconto);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(141, 42, 65, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(141, 72, 65, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		
		
		JButton btnCalcular = new JButton("");
		btnCalcular.setIcon(new ImageIcon(PDV.class.getResource("/icones/calculator.png")));
		btnCalcular.addActionListener(new ActionListener() {
			//evento "clicar" no botão
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setToolTipText("Calcular");
		btnCalcular.setBounds(258, 47, 64, 64);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setIcon(new ImageIcon(PDV.class.getResource("/icones/limpar.png")));
		btnLimpar.setToolTipText("Limpar");
		btnLimpar.setBounds(257, 149, 65, 61);
		contentPane.add(btnLimpar);
		
		JLabel lblTotal = new JLabel("Total com Desconto");
		lblTotal.setBounds(21, 106, 131, 14);
		contentPane.add(lblTotal);
		
		txtMedia = new JTextField();
		txtMedia.setBounds(141, 103, 65, 20);
		contentPane.add(txtMedia);
		txtMedia.setColumns(10);
		
		JLabel label = new JLabel("%");
		label.setBounds(211, 75, 37, 14);
		contentPane.add(label);
		
		JLabel lblTroco = new JLabel("Troco");
		lblTroco.setBounds(104, 168, 37, 17);
		contentPane.add(lblTroco);
		
		txtTroco = new JTextField();
		txtTroco.setBounds(141, 166, 65, 20);
		contentPane.add(txtTroco);
		txtTroco.setColumns(10);
		
		JLabel lblValorPago = new JLabel("Valor Pago");
		lblValorPago.setBounds(76, 137, 65, 14);
		contentPane.add(lblValorPago);
		
		txtValorpago = new JTextField();
		txtValorpago.setBounds(141, 134, 65, 20);
		contentPane.add(txtValorpago);
		txtValorpago.setColumns(10);
		
		JLabel lblDia = new JLabel("Data");
		lblDia.setBounds(47, 11, 65, 14);
		contentPane.add(lblDia);
		
		lblDia.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));		
		
		JLabel lblData_1 = new JLabel("Data :");
		lblData_1.setBounds(10, 11, 46, 14);
		contentPane.add(lblData_1);
		
		JLabel lblCaixa = new JLabel("CAIXA");
		lblCaixa.setBounds(122, 11, 48, 14);
		contentPane.add(lblCaixa);
	}
	//método para calcular a média
	private void calcular() {
		DecimalFormat formatador= new DecimalFormat("0.00");
		double nota1,nota2,media,troco1,troco2,troco;
		nota1 = Double.parseDouble(txtNota1.getText().replace(",","."));
		nota2 = Double.parseDouble(txtNota2.getText().replace(",","."));
		media = nota1-((nota1 * nota2)/100);
		txtMedia.setText(formatador.format(media));
		troco1 = Double.parseDouble(txtValorpago.getText().replace(",","."));
		troco = Double.parseDouble(txtMedia.getText().replace(",","."));
		troco = troco1-media;
		txtTroco.setText(formatador.format(troco));

	}
	//método para limpar
	private void limpar() {
		txtNota1.setText(null);
		txtNota2.setText(null);
		txtTroco.setText(null);
		txtMedia.setText(null);
		txtValorpago.setText(null);
	}
}
