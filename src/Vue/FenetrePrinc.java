package Vue;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

import Modèle.*;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import com.toedter.calendar.JDateChooser;

public class FenetrePrinc extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JDateChooser textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table_1;
	Banque banque=new Banque();
	
	/**
	 * Create the frame.
	 */
	public FenetrePrinc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 522);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gestion de donn\u00E9es");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Forte", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(258, 11, 270, 31);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 53, 328, 301);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nom :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(17, 20, 59, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pr\u00E9nom");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(17, 63, 59, 20);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("CIN :");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(17, 100, 59, 20);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("N\u00B0 de t\u00E9l\u00E9phone :");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1_3.setBounds(17, 142, 91, 20);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Solde :");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1_4.setBounds(17, 184, 59, 20);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Date de naissance :");
		lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_1_4_1.setBounds(10, 225, 98, 20);
		panel.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Adresse");
		lblNewLabel_1_4_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1_4_2.setBounds(10, 261, 59, 20);
		panel.add(lblNewLabel_1_4_2);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		
		textField.setBounds(112, 21, 197, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_1.setColumns(10);
		textField_1.setBounds(112, 64, 197, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
		});
		textField_2.setColumns(10);
		textField_2.setBounds(112, 101, 197, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				String num = textField_3.getText();
	            if (num.length()<10)
	            	textField_3.setEditable(true);
	            else 
	            	textField_3.setEditable(false);
			}
		});
		textField_3.setColumns(10);
		textField_3.setBounds(112, 142, 197, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		textField_4.setColumns(10);
		textField_4.setBounds(112, 184, 197, 20);
		panel.add(textField_4);
		
		textField_5 = new JDateChooser();
		textField_5.getCalendarButton().setBackground(new Color(255, 215, 0));
		textField_5.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_5.setBounds(112, 225, 197, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(112, 261, 197, 20);
		panel.add(textField_6);
		
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Compte c=new Compte(new Client(textField_2.getText(),textField.getText(),textField_1.getText(),textField_5.getDateFormatString(),textField_3.getText(),textField_6.getText()), Float.parseFloat(textField_4.getText()));				
				banque.ajouterClient(c);
				DefaultTableModel tblModel = (DefaultTableModel) table_1.getModel();
				Compte cc=(Compte) banque.listes.get((banque.listes.size())-1);
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				String data[]= {Integer.toString(cc.getnCompte()),cc.getClient().getCin(),cc.getClient().getNom(),cc.getClient().getPrenom(),String.valueOf(cc.getSoldeInitial()),String.valueOf(cc.getSoldeFinal()),String.valueOf(sdf.format(cc.getDateAction()))};
				tblModel.addRow(data);
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_3.setEditable(true);
				textField_4.setText("");
				textField_6.setText("");
				}
		});
		btnNewButton.setBackground(new Color(255, 215, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(10, 365, 89, 31);
		contentPane.add(btnNewButton);
		
		JButton btnCrditer = new JButton("Cr\u00E9diter ");
		btnCrditer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float montant = Float.parseFloat(JOptionPane.showInputDialog("Saisir le montant à crediter"));
				DefaultTableModel tblModel = (DefaultTableModel) table_1.getModel();
				String nCompte=tblModel.getValueAt(table_1.getSelectedRow(), 0).toString();
				for(int i=0;i<banque.listes.size();i++) {
					if(((Compte) banque.listes.get(i)).getnCompte()==Integer.parseInt(nCompte)) {
						try {
							((Compte) banque.listes.get(i)).getSoldeFinalCredit(montant);
							tblModel.setValueAt(((Compte) banque.listes.get(i)).getSoldeFinal() , table_1.getSelectedRow(), 5);
						
						} catch (PasDeSold e1) {
							JOptionPane jop2 = new JOptionPane();
							jop2.showMessageDialog(null, "Solde insuffisant", "Attention", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_2.setEditable(true);
				textField_3.setText("");
				textField_3.setEditable(true);
				textField_4.setText("");
				textField_4.setEditable(true);
				textField_6.setText("");
			}
		});
		btnCrditer.setBackground(new Color(255, 215, 0));
		btnCrditer.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnCrditer.setBounds(122, 365, 98, 31);
		contentPane.add(btnCrditer);
		
		JButton btnDbiter = new JButton("D\u00E9biter");
		btnDbiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float montant = Float.parseFloat(JOptionPane.showInputDialog("Saisir le montant à debiter"));
				DefaultTableModel tblModel = (DefaultTableModel) table_1.getModel();
				String nCompte=tblModel.getValueAt(table_1.getSelectedRow(), 0).toString();

				for(int i=0;i<banque.listes.size();i++) {
					if(((Compte) banque.listes.get(i)).getnCompte()==Integer.parseInt(nCompte)) {
							((Compte) banque.listes.get(i)).getSoldeFinalDebit(montant);
							tblModel.setValueAt(((Compte) banque.listes.get(i)).getSoldeFinal() , table_1.getSelectedRow(), 5);
						
					}
				}
				
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_2.setEditable(true);
				textField_3.setText("");
				textField_3.setEditable(true);
				textField_4.setText("");
				textField_4.setEditable(true);
				textField_6.setText("");
				
			}
		});
		btnDbiter.setBackground(new Color(255, 215, 0));
		btnDbiter.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnDbiter.setBounds(249, 365, 89, 31);
		contentPane.add(btnDbiter);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Liste des clients", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(348, 53, 434, 256);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		
		Object [][] donnees = { } ;
 
        String[] entetes = {"N° Compte", "CNI", "Nom", "Prenom", "Sold initial", "Sold final","Date"};
 
        TableModel tableModel = new DefaultTableModel(donnees, entetes);
		table_1 = new JTable(tableModel);
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel tblModel = (DefaultTableModel) table_1.getModel();
				
				String nCompte=tblModel.getValueAt(table_1.getSelectedRow(), 0).toString();
				String cin=tblModel.getValueAt(table_1.getSelectedRow(), 1).toString();
				String nom=tblModel.getValueAt(table_1.getSelectedRow(), 2).toString();
				String prenom=tblModel.getValueAt(table_1.getSelectedRow(), 3).toString();
				String soldeI=tblModel.getValueAt(table_1.getSelectedRow(), 5).toString();
				String nTele = null,date=null,adresse=null;
				for(int i=0;i<banque.listes.size();i++) {
					if(((Compte) banque.listes.get(i)).getnCompte()==Integer.parseInt(nCompte)) {
						 nTele = ((Compte) banque.listes.get(i)).getClient().getNumTelephone().toString();
						 date = ((Compte) banque.listes.get(i)).getClient().getDateNaissance().toString();
						 adresse = ((Compte) banque.listes.get(i)).getClient().getAdresse().toString();
					}
				}
				textField.setText(nom);
				textField_1.setText(prenom);
				
				textField_2.setText(cin);
				textField_2.setEditable(false);
				
				textField_3.setText(nTele);
				textField_3.setEditable(true);
				textField_4.setText(soldeI);
				textField_4.setEditable(false);
				
				textField_6.setText(adresse);
				
			}
		});
		table_1.setBounds(29, 53, 375, 151);
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setSize(414, 222);
		scrollPane.setLocation(10, 23);
		panel_1.add(scrollPane);
		
		
		JButton btnActualiser = new JButton("Modifier");
		btnActualiser.setBackground(new Color(255, 215, 0));
		btnActualiser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel tblModel=(DefaultTableModel) table_1.getModel();
				if (table_1.getSelectedRowCount () == 1) {
					//if single row is selected than update
					
					String Nom=textField.getText();
					String Prénom=textField_1.getText();
					String NumTel=textField_3.getText();
					String Adresse=textField_6.getText();
					String nCompte=tblModel.getValueAt(table_1.getSelectedRow(), 0).toString();
					
					// set update value on arraylist
					
					for(int i=0;i<banque.listes.size();i++) {
	                    if(((Compte) banque.listes.get(i)).getnCompte()==Integer.parseInt(nCompte)) {
	                           ((Compte) banque.listes.get(i)).getClient().setNom(Nom);
	                           ((Compte) banque.listes.get(i)).getClient().setPrenom(Prénom);
	                           ((Compte) banque.listes.get(i)).getClient().setNumTelephone(NumTel);
	                           ((Compte) banque.listes.get(i)).getClient().setAdresse(Adresse);
	                    }
	                }
					
					//set updated value on table row
					
					tblModel.setValueAt(Nom, table_1.getSelectedRow(), 2);
					tblModel.setValueAt(Prénom, table_1.getSelectedRow(), 3);
					
					//update message display
					
					JOptionPane.showMessageDialog(null, "Actualisation avec succés!!");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_2.setEditable(true);
					textField_3.setText("");
					textField_3.setEditable(true);
					textField_4.setText("");
					textField_4.setEditable(true);
					textField_6.setText("");
					textField_7.setText("0");
					modifierJtable(banque.listes);
				}else {
					if(table_1.getRowCount()==0) {
						
						JOptionPane.showMessageDialog( null, "La table est vide");
						
					}else{
						JOptionPane.showMessageDialog(null, "Veuillez selectionner une case pour l'actualiser!!");
						
					}
				}
				
			}
		});
		btnActualiser.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnActualiser.setBounds(388, 363, 107, 35);
		contentPane.add(btnActualiser);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel tblModel=(DefaultTableModel) table_1.getModel();
				String nCompte=tblModel.getValueAt(table_1.getSelectedRow(), 0).toString();
				if(table_1.getSelectedRowCount()==1) {
					tblModel.removeRow(table_1.getSelectedRow());
					for(int i=0;i<banque.listes.size();i++) {
	                    if(((Compte) banque.listes.get(i)).getnCompte()==Integer.parseInt(nCompte)) {
	                    	banque.listes.remove(i);
	                    }
	                }
					
					
				}else {
						JOptionPane.showMessageDialog(null,"veuillez sélectionner une ligne à supprimer.");
					}
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_2.setEditable(true);
				textField_3.setText("");
				textField_3.setEditable(true);
				textField_4.setText("");
				textField_4.setEditable(true);
				textField_6.setText("");
				textField_7.setText("");
				modifierJtable(banque.listes);
			}
		});
		btnSupprimer.setBackground(new Color(255, 215, 0));
		btnSupprimer.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSupprimer.setBounds(581, 363, 107, 35);
		contentPane.add(btnSupprimer);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Recherche", TitledBorder.LEADING, TitledBorder.TOP, null, Color.DARK_GRAY));
		panel_2.setToolTipText("hhhh");
		panel_2.setBounds(10, 413, 328, 58);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		
		JLabel lblNewLabel_1_3_1 = new JLabel("N\u00B0 de compte :");
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_3_1.setBounds(10, 27, 91, 20);
		panel_2.add(lblNewLabel_1_3_1);
		
		textField_7 = new JTextField();
		
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				ArrayList<Compte> comptes=banque.listes;
				DefaultTableModel tblModel=(DefaultTableModel) table_1.getModel();Compte cc;
				if(textField_7.getText().equals("") || textField_7.getText().equals("0")) {
					textField_7.setText("0");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_2.setEditable(true);
					textField_3.setText("");
					textField_3.setEditable(true);
					textField_4.setText("");
					textField_4.setEditable(true);
					textField_6.setText("");
					modifierJtable(comptes);
				}
				int cin = Integer.parseInt(textField_7.getText());
				
				for(int i=0;i<comptes.size();i++){
					if(comptes.get(i).getnCompte()==cin) {
						textField.setText(comptes.get(i).getClient().getNom());
						textField_1.setText(comptes.get(i).getClient().getPrenom());
						textField_2.setText(comptes.get(i).getClient().getCin());
						textField_2.setEditable(false);
						textField_3.setText(comptes.get(i).getClient().getNumTelephone());
						textField_3.setEditable(true);
						textField_4.setText(String.valueOf(comptes.get(i).getSoldeFinal()));
						textField_4.setEditable(false);
						textField_6.setText(comptes.get(i).getClient().getAdresse());
						
						while(tblModel.getRowCount() > 0)
							tblModel.removeRow(0);
						cc=comptes.get(i);
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						String data[]= {Integer.toString(cc.getnCompte()),cc.getClient().getCin(),cc.getClient().getNom(),cc.getClient().getPrenom(),String.valueOf(cc.getSoldeInitial()),String.valueOf(cc.getSoldeFinal()),String.valueOf(sdf.format(cc.getDateAction()))};
						tblModel.addRow(data);
						table_1.getSelectionModel().setSelectionInterval(0,0);
					}
				}
			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(111, 28, 197, 20);
		panel_2.add(textField_7);
		
		JButton btnTrierParNom = new JButton("Trier par Nom");
		btnTrierParNom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Compte> comptes=banque.trierNom();
				DefaultTableModel tblModel=(DefaultTableModel) table_1.getModel();
				modifierJtable(comptes);
			}
		});
		btnTrierParNom.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTrierParNom.setBackground(new Color(255, 215, 0));
		btnTrierParNom.setBounds(376, 413, 175, 35);
		contentPane.add(btnTrierParNom);
		
		JButton btnTrierParSold = new JButton("Trier par Sold");
		btnTrierParSold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Compte> comptes=banque.trierSolde();
				DefaultTableModel tblModel=(DefaultTableModel) table_1.getModel();
				while(tblModel.getRowCount() > 0)
					tblModel.removeRow(0);
				Compte cc;
				for(int i=0;i<comptes.size();i++){
					cc=comptes.get(i);
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String data[]= {Integer.toString(cc.getnCompte()),cc.getClient().getCin(),cc.getClient().getNom(),cc.getClient().getPrenom(),String.valueOf(cc.getSoldeInitial()),String.valueOf(cc.getSoldeFinal()),String.valueOf(sdf.format(cc.getDateAction()))};
					tblModel.addRow(data);
				}
			}
		});
		btnTrierParSold.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTrierParSold.setBackground(new Color(255, 215, 0));
		btnTrierParSold.setBounds(581, 413, 175, 35);
		contentPane.add(btnTrierParSold);
	
		
		
	}
	
	public void modifierJtable(ArrayList<Compte> comptes) {
		DefaultTableModel tblModel=(DefaultTableModel) table_1.getModel();
		while(tblModel.getRowCount() > 0)
			tblModel.removeRow(0);
		Compte cc;
		for(int i=0;i<comptes.size();i++){
			cc=comptes.get(i);
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			String data[]= {Integer.toString(cc.getnCompte()),cc.getClient().getCin(),cc.getClient().getNom(),cc.getClient().getPrenom(),String.valueOf(cc.getSoldeInitial()),String.valueOf(cc.getSoldeFinal()),String.valueOf(sdf.format(cc.getDateAction()))};
			tblModel.addRow(data);
		}
	}
}
