package challengeConversor2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import GUI.Monedas;
import GUI.Temperaturas;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

@SuppressWarnings("serial")
public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	JComboBox<Object> cBoxTipoConversor;

	// MAIN =========================================================
	
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

	// CONSTRUCTOR ======================================================================
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		String[] conver = {"Divisas", "Temperaturas"};
		cBoxTipoConversor = new JComboBox<Object>(conver);
		cBoxTipoConversor.setFont(new Font("Rockwell", Font.PLAIN, 18));
		cBoxTipoConversor.setBounds(150, 100, 150, 40);
		cBoxTipoConversor.addActionListener(this);
		contentPane.add(cBoxTipoConversor);
		
		JLabel lblNewLabel = new JLabel("Challenge Conversor");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 434, 40);
		contentPane.add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==cBoxTipoConversor) {
		int tipo = cBoxTipoConversor.getSelectedIndex();
			switch (tipo) {
			case 0:
				Monedas frameMoneda = new Monedas();
				frameMoneda.setVisible(true);
				dispose();
				break;
			case 1:
				Temperaturas frameTemp = new Temperaturas();
				frameTemp.setVisible(true);
				dispose();
				break;
			default:
				break;
			}
		}
		
	}
}