import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JList;

public class impresionDeArchivo_GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField FondoNoranja;
	private JTextField textNomArchivo;
	private JTextField textFecha;
	private JTextField textUsuario;
	private JTextField textArchivoP;
	private JTextField textImpresionL;
	private JTextField textPrioridad;
	private JTextField textContenido;
	private JTextField FondoAmarillo;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					impresionDeArchivo_GUI frame = new impresionDeArchivo_GUI();
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
	public impresionDeArchivo_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbCrearArchivo = new JLabel("Crear Archivo");
		lbCrearArchivo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbCrearArchivo.setBounds(88, 104, 138, 25);
		contentPane.add(lbCrearArchivo);
		
		JLabel lblNewLabel = new JLabel("SERVIDOR DE IMPRESIONES");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(211, -5, 330, 72);
		contentPane.add(lblNewLabel);
		
		FondoNoranja = new JTextField();
		FondoNoranja.setBackground(new Color(255, 150, 100));
		FondoNoranja.setBounds(0, 0, 756, 87);
		contentPane.add(FondoNoranja);
		FondoNoranja.setColumns(10);
		
		JLabel lbNombre = new JLabel("Nombre del archivo:");
		lbNombre.setBounds(20, 151, 113, 14);
		contentPane.add(lbNombre);
		
		textNomArchivo = new JTextField();
		textNomArchivo.setColumns(10);
		textNomArchivo.setBounds(140, 151, 168, 20);
		contentPane.add(textNomArchivo);
		
		JLabel lbContenido = new JLabel("Contenido:");
		lbContenido.setBounds(20, 176, 125, 25);
		contentPane.add(lbContenido);
		
		JLabel lbFecha = new JLabel("Fecha de creación:");
		lbFecha.setBounds(20, 303, 135, 14);
		contentPane.add(lbFecha);
		
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(140, 300, 168, 20);
		contentPane.add(textFecha);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(20, 335, 107, 14);
		contentPane.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setColumns(10);
		textUsuario.setBounds(74, 332, 234, 20);
		contentPane.add(textUsuario);
		
		JLabel lbFormatoDeImpresion = new JLabel("Formato de impresión");
		lbFormatoDeImpresion.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbFormatoDeImpresion.setBounds(51, 367, 198, 30);
		contentPane.add(lbFormatoDeImpresion);
		
		JLabel lbTamaño = new JLabel("Tamaño:");
		lbTamaño.setBounds(20, 408, 91, 14);
		contentPane.add(lbTamaño);
		
		JLabel lbFormato = new JLabel("Formato:");
		lbFormato.setBounds(20, 443, 91, 14);
		contentPane.add(lbFormato);
		
		JComboBox comboTamaño = new JComboBox();
		comboTamaño.setModel(new DefaultComboBoxModel(new String[] {"Carta", "Oficio", "A5", "B4"}));
		comboTamaño.setBounds(84, 404, 224, 22);
		contentPane.add(comboTamaño);
		
		JComboBox comboFormato = new JComboBox();
		comboFormato.setModel(new DefaultComboBoxModel(new String[] {"PDF", "WORD", "EXCEL", "TXT", "PNG", "JPG"}));
		comboFormato.setBounds(84, 439, 224, 22);
		contentPane.add(comboFormato);
		
		JButton btCrearArchivo = new JButton("Crear archivo");
		btCrearArchivo.setBounds(117, 505, 131, 23);
		contentPane.add(btCrearArchivo);
		
		textArchivoP = new JTextField();
		textArchivoP.setText("ARCHIVO PENDIENTES");
		textArchivoP.setHorizontalAlignment(SwingConstants.CENTER);
		textArchivoP.setColumns(10);
		textArchivoP.setBounds(350, 124, 176, 20);
		contentPane.add(textArchivoP);
		
		textImpresionL = new JTextField();
		textImpresionL.setText("IMPRESIONES LISTAS");
		textImpresionL.setHorizontalAlignment(SwingConstants.CENTER);
		textImpresionL.setColumns(10);
		textImpresionL.setBounds(543, 124, 176, 20);
		contentPane.add(textImpresionL);
		
		JList JlistArchivosP = new JList();
		JlistArchivosP.setBounds(350, 150, 173, 222);
		contentPane.add(JlistArchivosP);
		
		JList JtlistImpresionL = new JList();
		JtlistImpresionL.setBounds(543, 150, 173, 222);
		contentPane.add(JtlistImpresionL);
		
		JButton btImprimir = new JButton("Imprimir archivo");
		btImprimir.setBounds(440, 404, 229, 23);
		contentPane.add(btImprimir);
		
		JButton btnMostrarImpresiones = new JButton("Mostrar archivos pendientes");
		btnMostrarImpresiones.setBounds(440, 439, 229, 23);
		contentPane.add(btnMostrarImpresiones);
		
		JLabel lbPrioridad = new JLabel("Prioridad:");
		lbPrioridad.setBounds(20, 480, 58, 14);
		contentPane.add(lbPrioridad);
		
		textPrioridad = new JTextField();
		textPrioridad.setColumns(10);
		textPrioridad.setBounds(84, 474, 224, 20);
		contentPane.add(textPrioridad);
		
		textContenido = new JTextField();
		textContenido.setBounds(20, 198, 288, 87);
		contentPane.add(textContenido);
		textContenido.setColumns(10);
		
		FondoAmarillo = new JTextField();
		FondoAmarillo.setColumns(10);
		FondoAmarillo.setBackground(new Color(250, 240, 207));
		FondoAmarillo.setBounds(0, 78, 756, 461);
		contentPane.add(FondoAmarillo);
	}
}
