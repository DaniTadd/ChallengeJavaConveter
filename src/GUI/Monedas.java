package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import challengeConversor2.Metodos;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Monedas extends JFrame implements ActionListener {

// Componentes de la clase
	
	private JPanel contentPane;
	private JTextField textMontoConvertir;
	private JComboBox<Object> cBoxDivisaDestino;
	private JComboBox<Object> cBoxDivisaSalida;
	private JLabel resultadoMontoRecibir;
	private JButton btnConvertir, btnTemperaturas;
	
// Constructor de la clase	
	
	public Monedas() {
		
		// ========== PANEL PRINCIPAL ===========================================
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		String[] divisas = {"Seleccione la moneda", "Peso Argentino", "Dólar", "Euro", "Libra Esterlina", "Won", "Yen"};
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// ========= LLENADO DEL PANEL DENTRO DE LA VENTANA PRINCIPAL =============
		// LABELS	===============================================================
		JLabel lblMonedas = new JLabel("Conversor de Monedas");
			lblMonedas.setBounds(0, 10, 434, 25);
			lblMonedas.setFont(new Font("Rockwell", Font.PLAIN, 18));
			lblMonedas.setHorizontalAlignment(SwingConstants.CENTER);
			contentPane.add(lblMonedas);
		JLabel lblDivisaSalida = new JLabel("<html><div style='text-align: center;'>Divisa de<br>salida</div></html>");
			lblDivisaSalida.setBounds(25, 45, 150, 50);
			lblDivisaSalida.setHorizontalAlignment(SwingConstants.CENTER);
			lblDivisaSalida.setFont(new Font("Rockwell", Font.PLAIN, 18));
			contentPane.add(lblDivisaSalida);
		JLabel lblDivisaDestino = new JLabel("<html><div style='text-align: center;'>Divisa de<br>destino</div></html>");
			lblDivisaDestino.setBounds(250, 45, 150, 50);
			lblDivisaDestino.setHorizontalAlignment(SwingConstants.CENTER);
			lblDivisaDestino.setFont(new Font("Rockwell", Font.PLAIN, 18));
			contentPane.add(lblDivisaDestino);
		JLabel lblMontoConvertit = new JLabel("<html><div style='text-align: center;'>Monto a<br>convertir:</div></html>");
			lblMontoConvertit.setBounds(25, 150, 60, 35);
			lblMontoConvertit.setHorizontalAlignment(SwingConstants.CENTER);
			contentPane.add(lblMontoConvertit);
		JLabel lblMontoRecibir = new JLabel("<html><div style='text-align: center;'>Monto a<br>recibir:</div></html>");
			lblMontoRecibir.setBounds(250, 150, 60, 35);
			lblMontoRecibir.setHorizontalAlignment(SwingConstants.CENTER);
			contentPane.add(lblMontoRecibir);
			
		resultadoMontoRecibir = new JLabel();
		resultadoMontoRecibir.setBounds(310, 150, 90, 35);
		resultadoMontoRecibir.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(resultadoMontoRecibir);
		
		// COMBO BOXES ==========================================================
			
		cBoxDivisaSalida = new JComboBox<Object>(divisas);
		cBoxDivisaSalida.setBounds(25, 100, 150, 40);
		cBoxDivisaSalida.addActionListener(this);
		contentPane.add(cBoxDivisaSalida);
			
		cBoxDivisaDestino = new JComboBox<Object>(divisas);
		cBoxDivisaDestino.setBounds(250, 100, 150, 40);
		cBoxDivisaDestino.addActionListener(this);
		contentPane.add(cBoxDivisaDestino);
		
		// INPUT ==================================================================
		
		textMontoConvertir = new JTextField("0");
		textMontoConvertir.setBounds(85, 150, 90, 35);
		contentPane.add(textMontoConvertir);
		textMontoConvertir.setColumns(10);
			
		// BOTÓN =================================================================
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.setBounds(160, 195, 100, 25);
		btnConvertir.addActionListener(this);
		contentPane.add(btnConvertir);
		
		btnTemperaturas = new JButton("Temperaturas");
		btnTemperaturas.setBounds(160, 230, 100, 25);
		btnTemperaturas.addActionListener(this);
		contentPane.add(btnTemperaturas);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cBoxDivisaDestino || e.getSource() == btnConvertir) { // Detecta uso de JComboBox o botón Convertir
			int divisaSalida = cBoxDivisaSalida.getSelectedIndex();				   // Toma la divisa de partida
			int divisaDestino = cBoxDivisaDestino.getSelectedIndex();			   // Toma la divisa deseada
			double monto = Double.parseDouble(textMontoConvertir.getText());	   // Selecciona el texto ingresado y pasa a double
			String valor = Metodos.Currencies(divisaSalida, divisaDestino, monto); // Llamado a Método "Metodos"
			resultadoMontoRecibir.setText(valor);								   // Escritura del resultado en JLabel de resultado
		} else if (e.getSource() == btnTemperaturas) {
			Temperaturas frameTemp = new Temperaturas();
			frameTemp.setVisible(true);
			dispose();
		}
	}
}