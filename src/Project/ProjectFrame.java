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
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ProjectFrame extends JFrame {

	private JPanel contentPane;
	private JTextField responseField;
	static String route; 
	private ReaderClass reader = new ReaderClass(route);
	
	private JTextField filtroField;
	private String [][] resultMatrix; 
	private JTextField txtNumberOfCases;
	private JTextField numCasesField;
	private JTextField percentageText;
	private JTextField percentageField;
	private JLabel image;
	private UtilityClass utility = new UtilityClass();

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

		percentageField = new JTextField();
		percentageField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		percentageField.setColumns(10);
		percentageField.setBounds(157, 269, 89, 20);
		contentPane.add(percentageField);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		responseField = new JTextField();
		responseField.setBounds(3, 3, 464, 234);
		contentPane.add(responseField);
		responseField.setColumns(10);
		
		JButton readButton = new JButton("Return to Home");
		readButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		readButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			responseField.setText("");
			resultMatrix = reader.ReadArchive();
			
			}
		});
		readButton.setBounds(492, 268, 136, 23);
		contentPane.add(readButton);
		
		filtroField = new JTextField();
		filtroField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		filtroField.setText("Filtro");
		filtroField.setBounds(562, 194, 127, 20);
		contentPane.add(filtroField);
		filtroField.setColumns(10);
		
		JButton classButton = new JButton("Class");
		classButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		classButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				responseField.setText("");
				UtilityClass utility = new UtilityClass();
				ActiveClass active = new ActiveClass();
				utility= active.searchClass(filtroField.getText(),resultMatrix);
				resultMatrix= utility.getMatrix();
				percentageField.setText(Double.toString(utility.getPercentage()));
				responseField.setText(UtilityClass.traduceMatrix(utility.getMatrix()));
			}
		});
		classButton.setBounds(470, 152, 89, 23);
		contentPane.add(classButton);
		
		JButton edadButton = new JButton("Edad");
		edadButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		edadButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				responseField.setText("");
				UtilityClass utility = new UtilityClass();
				ActiveClass active = new ActiveClass();
				utility= active.searchEdad(Integer.parseInt(filtroField.getText()),resultMatrix);
				resultMatrix= utility.getMatrix();
				percentageField.setText(Double.toString(utility.getPercentage()));
				responseField.setText(UtilityClass.traduceMatrix(utility.getMatrix()));
			}
		});
		edadButton.setBounds(470, 178, 89, 23);
		contentPane.add(edadButton);
		
		JButton locationButton = new JButton("Location");
		locationButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		locationButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				responseField.setText("");
				UtilityClass utility = new UtilityClass();
				ActiveClass active = new ActiveClass();
				utility= active.searchLocation(filtroField.getText(), resultMatrix);
				resultMatrix= utility.getMatrix();
				percentageField.setText(Double.toString(utility.getPercentage()));
				responseField.setText(UtilityClass.traduceMatrix(utility.getMatrix()));
				
			}
		});
		locationButton.setBounds(470, 230, 89, 23);
		contentPane.add(locationButton);
		
		JButton diseaseButton = new JButton("Disease");
		diseaseButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		diseaseButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				responseField.setText("");
				UtilityClass utility = new UtilityClass();
				ActiveClass active = new ActiveClass();
				utility= active.searchDisease(filtroField.getText(),resultMatrix);
				resultMatrix= utility.getMatrix();
				percentageField.setText(Double.toString(utility.getPercentage()));
				responseField.setText(UtilityClass.traduceMatrix(utility.getMatrix()));
			}
		});
		diseaseButton.setBounds(470, 204, 89, 23);
		contentPane.add(diseaseButton);
		
		txtNumberOfCases = new JTextField();
		txtNumberOfCases.setText("Number of cases");
		txtNumberOfCases.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtNumberOfCases.setBounds(41, 246, 89, 20);
		contentPane.add(txtNumberOfCases);
		txtNumberOfCases.setColumns(10);
		
		numCasesField = new JTextField();
		numCasesField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		numCasesField.setColumns(10);
		numCasesField.setBounds(157, 246, 89, 20);
		contentPane.add(numCasesField);
		
		percentageText = new JTextField();
		percentageText.setText("Percentage ");
		percentageText.setFont(new Font("Tahoma", Font.PLAIN, 11));
		percentageText.setColumns(10);
		percentageText.setBounds(41, 269, 89, 20);
		contentPane.add(percentageText);
		
		
		
		image = new JLabel("");
		image.setIcon(new ImageIcon("images\\image4.png"));
		image.setBounds(470, 3, 219, 146);
		contentPane.add(image);
		
	
	}
	
	
	
	public void setResultMatrix(String[][] matrix) {
		this.resultMatrix= matrix;
	}
}
