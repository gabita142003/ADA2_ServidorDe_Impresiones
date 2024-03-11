

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.event.ListSelectionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class impresionDeArchivo_GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNomArchivo;
	private JTextField textFecha;
	private JTextField textUsuario;
	private JTextField textPrioridad;
	
	//Combo Box (Tamaño de archivo y Formato de archivo)
	public DefaultComboBoxModel comboTamaño = new DefaultComboBoxModel(); //Combo de tamaño archivo
    public DefaultComboBoxModel comboFormato = new DefaultComboBoxModel(); //combo del formato archivo
   
    // Jtlist (crear y imprimir archivo)
    public  DefaultListModel modelArchivo = new DefaultListModel(); //Jtlist de la lista de archivos 
    public  DefaultListModel modelImpresiones = new DefaultListModel();// Jtlist de la lista de impresiones 
    private JTextField textContenido;
    
    
    Queue<archivo> colaArchivos = new PriorityQueue<archivo>();
    private JTextField textTituloArchivo;
    private JTextField textTituloImpresiones;
    private final JTextField textColorAzul1 = new JTextField();
    private JTextField textColorAzul;
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
		setBounds(100, 100, 754, 627);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNombre = new JLabel("Nombre del archivo:");
		lbNombre.setBounds(20, 83, 125, 14);
		contentPane.add(lbNombre);
		
		textNomArchivo = new JTextField();
		textNomArchivo.setColumns(10);
		textNomArchivo.setBounds(139, 80, 168, 20);
		contentPane.add(textNomArchivo);
		
		JLabel lbContenido = new JLabel("Contenido:");
		lbContenido.setBounds(20, 108, 125, 14);
		contentPane.add(lbContenido);
		
		JLabel lbFecha = new JLabel("Fecha de creación:");
		lbFecha.setBounds(20, 261, 135, 14);
		contentPane.add(lbFecha);
		
		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(140, 258, 168, 20);
		contentPane.add(textFecha);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(20, 304, 107, 14);
		contentPane.add(lblUsuario);
		
		textUsuario = new JTextField();
		textUsuario.setColumns(10);
		textUsuario.setBounds(92, 301, 216, 20);
		contentPane.add(textUsuario);
		
		JLabel lbTamaño = new JLabel("Tamaño:");
		lbTamaño.setBounds(20, 348, 91, 14);
		contentPane.add(lbTamaño);
		
		JComboBox comboTamaño = new JComboBox();
		comboTamaño.setModel(new DefaultComboBoxModel(new String[] {"Carta", "Oficio"}));
		comboTamaño.setBounds(97, 344, 211, 22);
		contentPane.add(comboTamaño);
		
		JLabel lbFormato = new JLabel("Formato:");
		lbFormato.setBounds(20, 389, 70, 14);
		contentPane.add(lbFormato);
		
		JComboBox comboFormato = new JComboBox();
		comboFormato.setModel(new DefaultComboBoxModel(new String[] {"PDF", "WORD", "EXCEL", "PNG", "JPG"}));
		comboFormato.setBounds(97, 385, 211, 22);
		contentPane.add(comboFormato);
		
		JList JlistArchivosP = new JList();
		JlistArchivosP.setBounds(369, 127, 334, 129);
		contentPane.add(JlistArchivosP);
		
		JList JtlistImpresionL = new JList();
		JtlistImpresionL.setBounds(371, 315, 334, 147);
		contentPane.add(JtlistImpresionL);
		
		JButton btnMostrarImpresiones = new JButton("Mostrar archivos pendientes");
		btnMostrarImpresiones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!colaArchivos.isEmpty()) {
					String archivosPendientes= "Archivo en cola: \n";
					for ( archivo archivos : colaArchivos) {
						archivosPendientes += archivos.toString() +"\n";
					}
					JOptionPane.showMessageDialog(null, archivosPendientes);
				}
			}
		});
		btnMostrarImpresiones.setBounds(430, 540, 224, 37);
		contentPane.add(btnMostrarImpresiones);
		
		JButton btCrearArchivo = new JButton("Crear archivo");
		btCrearArchivo.setBounds(105, 475, 179, 23);
		contentPane.add(btCrearArchivo);
		
		JLabel lbFormato_1_1 = new JLabel("Prioridad:");
		lbFormato_1_1.setBounds(20, 430, 70, 14);
		contentPane.add(lbFormato_1_1);
		
		textPrioridad = new JTextField();
		textPrioridad.setToolTipText("");
		textPrioridad.setColumns(10);
		textPrioridad.setBounds(92, 427, 216, 20);
		contentPane.add(textPrioridad);
		
		textContenido = new JTextField();
		textContenido.setBounds(20, 133, 288, 101);
		contentPane.add(textContenido);
		textContenido.setColumns(10);
		
		JButton btnNewButton = new JButton("Imprimir archivo");
		

		btnNewButton.setBounds(430, 494, 224, 35);
		contentPane.add(btnNewButton);
		
		textTituloArchivo = new JTextField();
		textTituloArchivo.setText("ARCHIVO PENDIENTES");
		textTituloArchivo.setHorizontalAlignment(SwingConstants.CENTER);
		textTituloArchivo.setColumns(10);
		textTituloArchivo.setBounds(369, 92, 336, 30);
		contentPane.add(textTituloArchivo);
		
		textTituloImpresiones = new JTextField();
		textTituloImpresiones.setText("IMPRESIONES LISTAS");
		textTituloImpresiones.setHorizontalAlignment(SwingConstants.CENTER);
		textTituloImpresiones.setColumns(10);
		textTituloImpresiones.setBounds(370, 274, 334, 37);
		contentPane.add(textTituloImpresiones);
		
		JLabel lblNewLabel = new JLabel("SISTEMA DE IMPRESIÓN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(251, 12, 273, 42);
		contentPane.add(lblNewLabel);
		textColorAzul1.setBackground(new Color(71, 172, 226));
		textColorAzul1.setBounds(0, 0, 738, 72);
		contentPane.add(textColorAzul1);
		textColorAzul1.setColumns(10);
		
		textColorAzul = new JTextField();
		textColorAzul.setColumns(10);
		textColorAzul.setBackground(new Color(128, 210, 255));
		textColorAzul.setBounds(0, 31, 738, 568);
		contentPane.add(textColorAzul);
	}
}
