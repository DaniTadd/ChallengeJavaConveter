package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import challengeConversor2.Metodos;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Temperaturas extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textTempEntrada;
	private JRadioButton rdbtnFarPartida, rdbtnCelsiusPartida, rdbtnKelvinPartida,
	rdbtnFarSalida, rdbtnCelsiusSalida, rdbtnKelvinSalida;
	private ButtonGroup entrada, salida;
	private JLabel lblTempSalida, lblUnidadEntrada;
	private JButton btnConvertir, btnMonedas;

	// CONSTRUCTOR ===========================================
	
	public Temperaturas() {
	
		// JFrame principal ================================= 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// LABELS ======================================================================
		
		JLabel lblNewLabel = new JLabel("Temperaturas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 18));
		lblNewLabel.setBounds(0, 10, 434, 25);
		contentPane.add(lblNewLabel);
		
		lblUnidadEntrada = new JLabel("°C");
		lblUnidadEntrada.setHorizontalAlignment(SwingConstants.LEFT);
		lblUnidadEntrada.setBounds(140, 60, 51, 31);
		contentPane.add(lblUnidadEntrada);
		
		lblTempSalida = new JLabel("0.0 °C");
		lblTempSalida.setHorizontalAlignment(SwingConstants.CENTER);
		lblTempSalida.setBounds(280, 60, 80, 35);
		contentPane.add(lblTempSalida);
		
		// RADIO BUTTONS ===========================================================
		
		rdbtnCelsiusPartida = new JRadioButton("Celsius");
		rdbtnCelsiusPartida.setBounds(60, 115, 110, 25);
		rdbtnCelsiusPartida.setSelected(true);
		contentPane.add(rdbtnCelsiusPartida);
		
		rdbtnFarPartida = new JRadioButton("Fahrenheit");
		rdbtnFarPartida.setBounds(60, 140, 110, 25);
		contentPane.add(rdbtnFarPartida);
		
		rdbtnKelvinPartida = new JRadioButton("Kelvin");
		rdbtnKelvinPartida.setBounds(60, 165, 110, 25);
		contentPane.add(rdbtnKelvinPartida);
		
		entrada = new ButtonGroup();
		entrada.add(rdbtnCelsiusPartida);
		entrada.add(rdbtnFarPartida);
		entrada.add(rdbtnKelvinPartida);
		
		rdbtnCelsiusSalida = new JRadioButton("Celsius");
		rdbtnCelsiusSalida.setBounds(280, 115, 110, 25);
		rdbtnCelsiusSalida.setSelected(true);
		contentPane.add(rdbtnCelsiusSalida);
		
		rdbtnFarSalida = new JRadioButton("Fahrenheit");
		rdbtnFarSalida.setBounds(280, 140, 110, 25);
		contentPane.add(rdbtnFarSalida);
		
		rdbtnKelvinSalida = new JRadioButton("Kelvin");
		rdbtnKelvinSalida.setBounds(280, 165, 110, 25);
		contentPane.add(rdbtnKelvinSalida);
		
		salida = new ButtonGroup();
		salida.add(rdbtnCelsiusSalida);
		salida.add(rdbtnFarSalida);
		salida.add(rdbtnKelvinSalida);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(160, 195, 100, 25);
		btnConvertir.addActionListener(this);
		contentPane.add(btnConvertir);
		
		// INPUT ===================================================================
		
		textTempEntrada = new JTextField("0.0");
		textTempEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		textTempEntrada.setBounds(60, 60, 80, 35);
		contentPane.add(textTempEntrada);
		textTempEntrada.setColumns(10);
		
		btnMonedas = new JButton("Monedas");
		btnMonedas.setBounds(160, 230, 100, 25);
		btnMonedas.addActionListener(this);
		contentPane.add(btnMonedas);
		
		// ADD Action Listener to entry input units radio buttons
		for (JRadioButton btn : Arrays.asList(rdbtnFarPartida, rdbtnCelsiusPartida, rdbtnKelvinPartida)) {
			btn.addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ent = "Celsius"; // inicialización de variable requerida
		String sal = "Celsius"; // inicialización de variable requerida
		// For para marcar la unidad de salida adecuada
		for (JRadioButton btn : Arrays.asList(rdbtnFarPartida, rdbtnCelsiusPartida, rdbtnKelvinPartida)) {
			if (btn.isSelected()) { 
				switch (btn.getActionCommand()) {
				case "Celsius":
					lblUnidadEntrada.setText("°C");
					break;
				case "Fahrenheit":
					lblUnidadEntrada.setText("°F");
					break;
				case "Kelvin":
					lblUnidadEntrada.setText("K");
					break;
				}
			}
		}
		// CHQUEO DE USO DEL BUTTON CONVERTIR
		if (e.getSource() == btnConvertir) {
			 // for para verificar Temperatura de partida
			for (JRadioButton btn : Arrays.asList(rdbtnFarPartida, rdbtnCelsiusPartida, rdbtnKelvinPartida)) {
				if (btn.isSelected()) { 
					ent = btn.getActionCommand();
				}
			}
			 // for para verificar Temperatura deseada
			for (JRadioButton btn : Arrays.asList(rdbtnFarSalida, rdbtnCelsiusSalida, rdbtnKelvinSalida)) {
				if (btn.isSelected()) { 
					sal = btn.getActionCommand();
				}
			}
			// Llamado al método "Temperatures" para procesar la conversión
			String resultado = Metodos.Temperatures(ent, sal, Double.parseDouble(textTempEntrada.getText()));
			lblTempSalida.setText(resultado);
		} else if (e.getSource() == btnMonedas) {
			Monedas finframe = new Monedas();
			finframe.setVisible(true);
			dispose();
		}
	}
}