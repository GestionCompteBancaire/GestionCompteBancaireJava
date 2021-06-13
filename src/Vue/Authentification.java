package Vue;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import Modèle.Agent;
import Modèle.*;



public class Authentification extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentification frame = new Authentification();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 public void close(){
		 
		 WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
		 Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
		 
		 }

	/**
	 * Create the frame.
	 */
	public Authentification() {
		setBackground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 742, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 395, 426);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setIcon(new ImageIcon(Authentification.class.getResource("/images/con3_2.jpg")));
		panel.add(lblNewLabel_2);
		
		Button button = new Button("Se Connecter");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Agent a=new Agent();
				if(textField.getText().equals(a.getNomUtilisateur()) && passwordField.getText().equals(a.getMotPasse())) {
					FenetrePrinc fenetre = new FenetrePrinc();
					fenetre.setVisible(true);
					close();
				}else {
					JOptionPane erreur = new JOptionPane();
					erreur.showMessageDialog(null, "Probleme des données", "Erreur", JOptionPane.ERROR_MESSAGE);
					textField.setText("");
					passwordField.setText("");
				}
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 16));
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(new Color(255, 215, 0));
		button.setBounds(493, 327, 167, 41);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(438, 178, 246, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(438, 178, 246, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("Identifiant :");
		lblNewLabel.setForeground(new Color(0, 0, 102));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(438, 143, 146, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mot de passe :");
		lblNewLabel_1.setForeground(new Color(0, 0, 102));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel_1.setBounds(438, 235, 158, 27);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(438, 303, 246, 2);
		contentPane.add(separator_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordField.setBounds(438, 273, 246, 32);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("            X");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
		
			}
		});
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_3.setBounds(653, 11, 105, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("        Page de Connexion");
		lblNewLabel_4.setBackground(new Color(30, 144, 255));
		lblNewLabel_4.setForeground(new Color(30, 144, 255));
		lblNewLabel_4.setFont(new Font("Forte", Font.PLAIN, 27));
		lblNewLabel_4.setBounds(405, 42, 297, 56);
		contentPane.add(lblNewLabel_4);
	}
	
	
}
