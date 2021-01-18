package vista;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controlador.ControladorPanelLogging;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;;

@SuppressWarnings("serial")
public class PanelLogging extends JPanel{
	
	private ControladorPanelLogging cpl;
	
	private final JSeparator separator = new JSeparator();
	private final JSeparator separator_1 = new JSeparator();
	private final JSeparator separator_2 = new JSeparator();
	private final JSeparator separator_3 = new JSeparator();

	private JButton btnLogBezero, btnRegister, btnLogEstablezimendu;
	
	private JTextField tfBizena, tfEIzena;
	private JPasswordField psBezero, pfEstablezimendu;
	
	public PanelLogging(ControladorPanelLogging cpl) {
		this.cpl = cpl;
		
		setLayout(null);
//--------------------------------------------------------------------------------------------------------------------		
		btnLogBezero = new JButton("Logging");
		btnLogBezero.setBounds(50, 240, 125, 20);
		add(btnLogBezero);
		
		btnLogEstablezimendu = new JButton("Logging");
		btnLogEstablezimendu.setBounds(275, 240, 125, 20);
		add(btnLogEstablezimendu);
		
		btnRegister = new JButton("Registratu");
		btnRegister.setBounds(175, 275, 120, 20);
		add(btnRegister);
//--------------------------------------------------------------------------------------------------------------
		JLabel lblBezero = new JLabel("Bezero izena");
		lblBezero.setBounds(10, 35, 120, 14);
		add(lblBezero);
		
		tfBizena = new JTextField();
		tfBizena.setBounds(10, 60, 195, 25);
		add(tfBizena);
		tfBizena.setColumns(10);
		
		JLabel lblBPasahitza = new JLabel("Pasahitza");
		lblBPasahitza.setBounds(10, 115, 115, 14);
		add(lblBPasahitza);
		
		psBezero = new JPasswordField();
		psBezero.setBounds(10, 140, 195, 25);
		add(psBezero);
//-----------------------------------------------------------------------------------------------------------------			
		JLabel lblEstablezimendu = new JLabel("Establezimendu izena");
		lblEstablezimendu.setBounds(235, 35, 120, 14);
		add(lblEstablezimendu);
		
		tfEIzena = new JTextField();
		tfEIzena.setColumns(10);
		tfEIzena.setBounds(235, 60, 195, 25);
		add(tfEIzena);
		
		JLabel lblEPasahitza = new JLabel("Pasahitza");
		lblEPasahitza.setBounds(235, 115, 115, 14);
		add(lblEPasahitza);
		
		pfEstablezimendu = new JPasswordField();
		pfEstablezimendu.setBounds(235, 140, 195, 25);
		add(pfEstablezimendu);
//-----------------------------------------------------------------------------------------------------------------			
		JLabel lblEstablezimendua = new JLabel(" Establezimendua");
		lblEstablezimendua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEstablezimendua.setBounds(267, 5, 130, 20);
		add(lblEstablezimendua);

		JLabel lblBezeroa = new JLabel("Bezeroa");
		lblBezeroa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblBezeroa.setBounds(82, 5, 60, 20);
		add(lblBezeroa);
		
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(225, 0, 2, 270);
		add(separator);

		separator_1.setBounds(0, 30, 225, 7);
		add(separator_1);

		separator_2.setBounds(225, 30, 225, 7);
		add(separator_2);
		
		separator_3.setBounds(0, 270, 450, 2);
		add(separator_3);
//------------------------------------------------------------------------------------------------------------------	
		initializeEvents();
	}
	
	private void initializeEvents() {
		this.btnLogBezero.addActionListener(ListenerBtnLogBezero(this.cpl));
		this.btnLogEstablezimendu.addActionListener(ListenerBtnLogEstablezimendu(this.cpl));
		this.btnRegister.addActionListener(ListenerBtnRegister(this.cpl));
	}
//-------------------------------------------------------------------------------------------------------------------	
	private ActionListener ListenerBtnLogBezero(ControladorPanelLogging cpl) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Logging Bezero");
				//cpl.accionadoBottonMostrarPanelGeneros();
			}
		};
	}
//--------------------------------------------------------------------------------------------------------------	
	private ActionListener ListenerBtnLogEstablezimendu(ControladorPanelLogging cpl) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Logging Establezimendu");
				//cpl.accionadoBottonMostrarPanelGeneros();
			}
		};
	}
//----------------------------------------------------------------------------------------------------------------
	private ActionListener ListenerBtnRegister(ControladorPanelLogging cpl) {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Ejecutando evento Boton Register");
				cpl.accionadoBottonMostrarPanelRegister();
			}
		};
	}
}

