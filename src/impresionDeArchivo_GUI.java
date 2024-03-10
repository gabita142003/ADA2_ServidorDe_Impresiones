
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.PriorityQueue;
import java.util.Queue;

import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class impresionDeArchivo_GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNomArchivo;
	private JTextField textFecha;
	private JTextField textUsuario;
	private JTextField TítuloArchivoP;
	private JTextField TítuloImpresionL;
	private JTextField textPrioridad;
	private JTextField textContenido;
	private JTextField FondoAzulMarino;
	//Modelos del combo box
	public DefaultComboBoxModel comboTamaño = new DefaultComboBoxModel(); //Combo de tamaño archivo
    public DefaultComboBoxModel comboFormato = new DefaultComboBoxModel(); //combo del formato archivo
	//Modelos del  Jtlist 
    public  DefaultListModel modelArchivo = new DefaultListModel();         //Jtlist de la lista de archivos 
    public  DefaultListModel modelImpresiones = new DefaultListModel();     // Jtlist de la lista de impresiones 
    //Cola
    Queue<archivo> colaArchivos = new PriorityQueue<archivo>();
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
		setBounds(100, 100, 772, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbCrearArchivo = new JLabel("Crear Archivo");
		lbCrearArchivo.setBackground(new Color(98, 176, 255));
		lbCrearArchivo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbCrearArchivo.setBounds(102, 104, 147, 25);
		contentPane.add(lbCrearArchivo);
		
		JLabel lblNewLabel = new JLabel("SERVIDOR DE IMPRESIONES");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(227, 11, 340, 61);
		contentPane.add(lblNewLabel);
		
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
		
		JButton btnCrearArchivo = new JButton("Crear archivo");
		btnCrearArchivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String NombreArchivo= textNomArchivo.getText();
			String Contenido= textContenido.getText();
			String Fecha= textFecha.getText();
			String Usuario= textUsuario.getText();
			String Formato= comboFormato.getSelectedItem().toString();
			String Tamaño= comboTamaño.getSelectedItem().toString();
			
			
			
			}
			
		});
		btnCrearArchivo.setBounds(123, 527, 147, 40);
		contentPane.add(btnCrearArchivo);
		
		TítuloArchivoP = new JTextField();
		TítuloArchivoP.setFont(new Font("Tahoma", Font.BOLD, 14));
		TítuloArchivoP.setBackground(new Color(0, 128, 255));
		TítuloArchivoP.setText("ARCHIVO PENDIENTES");
		TítuloArchivoP.setHorizontalAlignment(SwingConstants.CENTER);
		TítuloArchivoP.setColumns(10);
		TítuloArchivoP.setBounds(368, 83, 350, 35);
		contentPane.add(TítuloArchivoP);
		
		TítuloImpresionL = new JTextField();
		TítuloImpresionL.setFont(new Font("Tahoma", Font.BOLD, 14));
		TítuloImpresionL.setBackground(new Color(0, 128, 255));
		TítuloImpresionL.setText("IMPRESIONES LISTAS");
		TítuloImpresionL.setHorizontalAlignment(SwingConstants.CENTER);
		TítuloImpresionL.setColumns(10);
		TítuloImpresionL.setBounds(368, 279, 350, 36);
		contentPane.add(TítuloImpresionL);
		
		JList JlistArchivosP = new JList();
		JlistArchivosP.setBounds(368, 129, 350, 139);
		contentPane.add(JlistArchivosP);
		
		JList JtlistImpresionL = new JList();
		JtlistImpresionL.setBounds(368, 334, 350, 148);
		contentPane.add(JtlistImpresionL);
		
		JButton btnImprimir = new JButton("Imprimir archivo");
		btnImprimir.setBounds(440, 503, 229, 30);
		contentPane.add(btnImprimir);
		
		JButton btnMostrarImpresiones = new JButton("Mostrar archivos pendientes");
		btnMostrarImpresiones.setBounds(440, 544, 229, 36);
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
		
		JLabel FondoAzul = new JLabel("Imagen Fodno");
		FondoAzul.setIcon(new ImageIcon("C:\\Users\\amycr\\Downloads\\FondoAzul.jpg"));
		FondoAzul.setBounds(0, 0, 756, 72);
		contentPane.add(FondoAzul);
		
		FondoAzulMarino = new JTextField();
		FondoAzulMarino.setBackground(new Color(98, 176, 255));
		FondoAzulMarino.setBounds(0, 68, 756, 523);
		contentPane.add(FondoAzulMarino);
		FondoAzulMarino.setColumns(10);
	}
}
