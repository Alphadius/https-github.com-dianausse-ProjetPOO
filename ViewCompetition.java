import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ViewCompetition extends JFrame {
	CardLayout card;
	Container c;

	public JTextField textfieldNomCompetition = new JTextField(20);
	private JButton creerComp = new JButton("Créer");

	ViewCompetition() {
		this.setTitle("menu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		c = getContentPane();
		card = new CardLayout(80, 30);
		c.setLayout(card);

		// PANEL DE LA PAGE INITIALE "NOUVEAU TOURNOI"
		JPanel boutonStart = new JPanel();
 		JButton start = new JButton("Nouveau Tournoi");
 		boutonStart.add(start);
 		c.add("menu", boutonStart);

 		JLabel labelGestionCompetition = new JLabel("Gestion de competition");

 		//////////////////////////
 		// PANEL CREER COMPETITION
 		//////////////////////////

 		JPanel creerCompetitionPanel = new JPanel(new BorderLayout());
 		creerCompetitionPanel.setLayout(new GridBagLayout());
 		GridBagConstraints gbc = new GridBagConstraints();
 		// gbc.weightx = 1;
 		// gbc.weighty = 1;

 		// Cellule contenant le LABEL "CRÉER UNE NOUVELLE COMPÉTITION"
 		gbc.gridx = 0;
 		gbc.gridwidth = 2;
 		gbc.gridheight = 2;
 		gbc.gridy = 0;
 		gbc.fill = GridBagConstraints.BOTH;
 		creerCompetitionPanel.add(new JLabel("Créer une nouvelle compétition"), gbc);

 		// Cellule contenant le TEXTFIELD du NOM DE LA COMPÉTITION
 		gbc.gridx = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.gridy = 3;
		textfieldNomCompetition.setText("Entrer le nom de la compétition");
		creerCompetitionPanel.add(textfieldNomCompetition, gbc);
 	
 		// Cellule contenant le BOUTON VALIDER
		gbc.gridx = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.gridy = 3;
		// ACTION LORSQUE LE BOUTON VALIDER (nom de la competition) EST CLIQUÉ
		// validerNomCompetition.addActionListener(new ActionListener() {
		// 	public void actionPerformed(ActionEvent e) {
		// 		// Action à effectuer quand le bouton "Valider" est cliqué, soit :
		// 		// Créer/modifier l'objet competition avec le nom entré
				
		// 		// Puis afficher la carte/page suivante :
		
		
		// 	}
		// });
		creerCompetitionPanel.add(creerComp, gbc);

 		c.add("competition", creerCompetitionPanel);


 		// ACTION DU BOUTON START DE LA PREMIERE PAGE
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(c, "competition");
			}
		});

		

		//frame.pack();

	}
	
	// Méthode qui récupère les données du textfield "Nom competition"
	// Voir comment l'utiliser avec le controlleur (comme dans l'exemple avec la calculette et les "getFirstNumber()" etc.)
	public String getNomCompetition() {
		return textfieldNomCompetition.getText();
	}
	public void addCompEntreeListener(ActionListener listenForvalidButton){
		
		creerComp.addActionListener(listenForvalidButton);
		
	}

	public void goChoixEquipe(){
			card.show(c, "choixEquipe");
			System.out.println("choix equipe");
		}
}