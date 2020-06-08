package portifolioprojeto;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sobre extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			Sobre dialog = new Sobre();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Sobre");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 228);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblTexto1 = new JLabel("André Carvalho");								
			lblTexto1.setFont(new Font("Arial", Font.BOLD, 12));
			lblTexto1.setBounds(167, 62, 105, 14);
			contentPanel.add(lblTexto1);
		}
		
		JLabel lblTexto3 = new JLabel("Estudante de T.I");
		lblTexto3.setFont(new Font("Arial", Font.BOLD, 12));
		lblTexto3.setBounds(170, 112, 128, 14);
		contentPanel.add(lblTexto3);
		
		JLabel lblTexto2 = new JLabel("26 Anos");
		lblTexto2.setFont(new Font("Arial", Font.BOLD, 12));
		lblTexto2.setBounds(188, 87, 48, 14);
		contentPanel.add(lblTexto2);
		
		JLabel lblTexto4 = new JLabel("Futuro desenvolvedor Java");
		lblTexto4.setFont(new Font("Arial", Font.BOLD, 12));
		lblTexto4.setBounds(136, 137, 162, 14);
		contentPanel.add(lblTexto4);
		
		JLabel lblTexto5 = new JLabel("S\u00E3o Paulo 07/06/2019 Senac");
		lblTexto5.setFont(new Font("Arial", Font.BOLD, 12));
		lblTexto5.setBounds(38, 169, 75, 14);
		contentPanel.add(lblTexto5);
		
		JLabel lblTexto6 = new JLabel("Desenvolvido por:");
		lblTexto6.setFont(new Font("Arial", Font.BOLD, 12));
		lblTexto6.setBounds(38, 26, 128, 14);
		contentPanel.add(lblTexto6);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(346, 228, 88, 33);
			getContentPane().add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}

		
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				
				lblTexto5.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
			}
		}
		
	}
}
