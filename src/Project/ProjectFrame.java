package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class ProjectFrame extends JFrame {

	private JPanel contentPane;
	private JTextField responseField;
	private String route; 
	private ReaderClass reader = new ReaderClass(route);
	private JTextField filtroField;

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
		setBounds(100, 100, 703, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		responseField = new JTextField();
		responseField.setBounds(10, 120, 409, 182);
		contentPane.add(responseField);
		responseField.setColumns(10);
		
		JButton SelectButton = new JButton("Seleccionar Archivo");
		SelectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				route = FileChooserConfig.getRoute();
				
			}
		});
		SelectButton.setBounds(188, 10, 143, 23);
		contentPane.add(SelectButton);
		
		JButton readButton = new JButton("Leer Archivo ");
		readButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			//responseField.setText(object.ReadArchive());
			}
		});
		readButton.setBounds(355, 10, 136, 23);
		contentPane.add(readButton);
		
		filtroField = new JTextField();
		filtroField.setText("Filtro");
		filtroField.setBounds(45, 50, 127, 20);
		contentPane.add(filtroField);
		filtroField.setColumns(10);
		
		JButton classButton = new JButton("Class");
		classButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UtilityClass utility = new UtilityClass();
				ActiveClass active = new ActiveClass();
				utility= active.searchClass(filtroField.getText(),reader.ReadArchive());
				
			}
		});
		classButton.setBounds(239, 49, 89, 23);
		contentPane.add(classButton);
		
		JButton edadButton = new JButton("Edad");
		edadButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UtilityClass utility = new UtilityClass();
				ActiveClass active = new ActiveClass();
				utility= active.searchEdad(Integer.parseInt(filtroField.getText()),reader.ReadArchive());
				
			}
		});
		edadButton.setBounds(355, 49, 89, 23);
		contentPane.add(edadButton);
		
		JButton locationButton = new JButton("Location");
		locationButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UtilityClass utility = new UtilityClass();
				ActiveClass active = new ActiveClass();
				utility= active.searchLocation(filtroField.getText(),reader.ReadArchive());
				
			}
		});
		locationButton.setBounds(239, 83, 89, 23);
		contentPane.add(locationButton);
		
		JButton diseaseButton = new JButton("Disease");
		diseaseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UtilityClass utility = new UtilityClass();
				ActiveClass active = new ActiveClass();
				utility= active.searchDisease(filtroField.getText(),reader.ReadArchive());
				
			}
		});
		diseaseButton.setBounds(355, 83, 89, 23);
		contentPane.add(diseaseButton);
		
	
	}
}
