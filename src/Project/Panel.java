package Project;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Panel extends JPanel {
	private JTextField txtBienvenidoALa;
	private JTextField responseField;
	private JButton buttonLeer;
	private String route; 
	
	

	/**
	 * Create the panel.
	 */
	public Panel() {
		
		JButton buttonSelect = new JButton("Seleccionar Archivo");
		buttonSelect.setBounds(219, 70, 180, 23);
		buttonSelect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				route = FileChooserConfig.getRoute();
			}
		});
		setLayout(null);
		add(buttonSelect);
		
		txtBienvenidoALa = new JTextField();
		txtBienvenidoALa.setBounds(64, 11, 476, 48);
		txtBienvenidoALa.setText("Bienvenido a la interfaz gráfica para leer archivos de texto, seleccione un archivo para continuar ");
		add(txtBienvenidoALa);
		txtBienvenidoALa.setColumns(10);
		
		responseField = new JTextField();
		responseField.setBounds(0, 133, 621, 351);
		add(responseField);
		responseField.setColumns(10);
		
		buttonLeer = new JButton("Leer Archivo");
		buttonLeer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ReaderClass.ReadArchive(route);
			}
		});
		buttonLeer.setBounds(229, 104, 170, 23);
		add(buttonLeer);
		
		
	}
	
	
	
}
