package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ProjectFrame extends JFrame {

	private JPanel contentPane;
	private JTextField selectButton;
	private JTextField responseField;
	private String route; 
	private ReaderClass object = new ReaderClass(route);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectFrame frame = new ProjectFrame();
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
	public ProjectFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		selectButton = new JTextField();
		selectButton.setText("Bienvenido al lector de arhivos, para continuar seleccione un archivo ");
		selectButton.setBounds(43, 11, 350, 20);
		contentPane.add(selectButton);
		selectButton.setColumns(10);
		responseField = new JTextField();
		responseField.setBounds(10, 120, 414, 130);
		contentPane.add(responseField);
		responseField.setColumns(10);
		
		JButton SelectButton = new JButton("Seleccionar Archivo");
		SelectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				route = FileChooserConfig.getRoute();
			}
		});
		SelectButton.setBounds(138, 42, 143, 23);
		contentPane.add(SelectButton);
		
		JButton readButton = new JButton("Leer Archivo ");
		readButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			responseField.setText(object.ReadArchive());
			}
		});
		readButton.setBounds(145, 76, 136, 23);
		contentPane.add(readButton);
		
	
	}
	
	
	

}
