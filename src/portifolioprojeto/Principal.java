package portifolioprojeto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/icones/sobre.png")));
		setTitle("Portifolio");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSobre = new JButton("");
		btnSobre.setToolTipText("SOBRE");
		btnSobre.setIcon(new ImageIcon(Principal.class.getResource("/icones/sobre.png")));
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true); 
			}
		});
		btnSobre.setBounds(28, 27, 64, 64);
		contentPane.add(btnSobre);
		
		JButton btnImc = new JButton("");
		btnImc.setToolTipText("IMC");
		btnImc.setIcon(new ImageIcon(Principal.class.getResource("/icones/imc.png")));
		btnImc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Imc imc = new Imc();
				imc.setVisible(true);
			}
		});
		btnImc.setBounds(115, 27, 64, 64);
		contentPane.add(btnImc);
		
		JButton btnMedia = new JButton("");
		btnMedia.setIcon(new ImageIcon(Principal.class.getResource("/icones/media3.png")));
		btnMedia.setToolTipText("M\u00C9DIA");
		btnMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculoMedia calculomedia = new CalculoMedia();
				calculomedia.setVisible(true);
			}
		});
		btnMedia.setBounds(203, 27, 64, 64);
		contentPane.add(btnMedia);
		
		JButton btnJokenpo = new JButton("");
		btnJokenpo.setToolTipText("JOKENP\u00D4");
		btnJokenpo.setIcon(new ImageIcon(Principal.class.getResource("/icones/pedra.png")));
		btnJokenpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jokenpo jokenpo = new Jokenpo();
				jokenpo.setVisible(true);
			}
		});
		btnJokenpo.setBounds(288, 27, 64, 64);
		contentPane.add(btnJokenpo);
		
		JButton btnTabuada = new JButton("");
		btnTabuada.setToolTipText("TABUADA");
		btnTabuada.setIcon(new ImageIcon(Principal.class.getResource("/icones/tabuada.png")));
		btnTabuada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tabuada tabuada = new Tabuada();
				tabuada.setVisible(true);
			}
		});
		btnTabuada.setBounds(28, 113, 64, 64);
		contentPane.add(btnTabuada);
		
		JButton btnIdades = new JButton("");
		btnIdades.setIcon(new ImageIcon(Principal.class.getResource("/icones/media1.png")));
		btnIdades.setToolTipText("M\u00C9DIA IDADES");
		btnIdades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Idades idades = new Idades();
				idades.setVisible(true);
			}
		});
		btnIdades.setBounds(115, 113, 64, 64);
		contentPane.add(btnIdades);
		
		JButton btnPdv = new JButton("");
		btnPdv.setToolTipText("PDV");
		btnPdv.setIcon(new ImageIcon(Principal.class.getResource("/icones/PDV.png")));
		btnPdv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PDV pdv = new PDV();
				pdv.setVisible(true);
			}
		});
		btnPdv.setBounds(203, 113, 64, 64);
		contentPane.add(btnPdv);
		
		JButton btnDesafio = new JButton("");
		btnDesafio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Febre febre = new Febre();
				febre.setVisible(true);
			}
		});
		btnDesafio.setIcon(new ImageIcon(Principal.class.getResource("/icones/temp.png")));
		btnDesafio.setToolTipText("TEMPERATURA ");
		btnDesafio.setBounds(288, 113, 64, 64);
		contentPane.add(btnDesafio);
	}

}
