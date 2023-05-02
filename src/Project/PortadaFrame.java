package Project;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class PortadaFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9158057826303917953L;
	private JPanel contentPane;
	private JTextField totalCasesField;
	public ProjectFrame frame = new ProjectFrame();
	private String route = "";
	private ReaderClass reader;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PortadaFrame frame = new PortadaFrame();
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
	public PortadaFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 619, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Alzheimer and Healthy Age data ");
		title.setFont(new Font("Tahoma", Font.PLAIN, 15));
		title.setBounds(185, 3, 217, 25);
		contentPane.add(title);
		
		JLabel definicion = new JLabel("El Alzheimer es un tipo de demencia \r\nque causa problemas con la memoria.\r\n\r\n");
		definicion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		definicion.setBounds(3, 116, 362, 47);
		contentPane.add(definicion);
		
		JLabel totalCases = new JLabel("Total Cases");
		totalCases.setFont(new Font("Tahoma", Font.PLAIN, 11));
		totalCases.setBounds(38, 208, 90, 25);
		contentPane.add(totalCases);
		
		totalCasesField = new JTextField();
		totalCasesField.setBounds(142, 210, 90, 25);
		contentPane.add(totalCasesField);
		totalCasesField.setColumns(10);
		
		JButton seleccion = new JButton("Seleccionar Archivo");
		seleccion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			route= FileChooserConfig.getRoute();
			frame.setVisible(true);
			reader = new ReaderClass(route);
			frame.setResultMatrix(reader.ReadArchive());
			totalCasesField.setText(Integer.toString(UtilityClass.total));
			}
		});
		seleccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		seleccion.setBounds(387, 224, 127, 25);
		contentPane.add(seleccion);
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon("images\\image2.jpg"));
		image.setBounds(358, 31, 246, 190);
		contentPane.add(image);
	}
}
