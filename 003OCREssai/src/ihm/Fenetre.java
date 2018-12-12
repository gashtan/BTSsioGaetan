package ihm;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {

	public Fenetre() {
		 final  JPanel pan = new JPanel();//Instanciation d'un objet JPanel
		  final JButton bouton = new JButton("Mon bouton");
		
		
		this.setTitle("Ma premi�re fen�tre Java");//D�finit un titre pour notre fen�tre		
		this.setSize(1200, 800);//D�finit sa taille : 1200 pixels de large et 400 pixels de haut		
		this.setLocationRelativeTo(null);//Nous demandons maintenant � notre objet de se positionner au centre		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Termine le processus lorsqu'on clique sur la croix rouge		
		//this.setContentPane(new Panneau());
		pan.setBackground(Color.ORANGE); //D�finition de sa couleur de fond
		//On d�finit le layout � utiliser sur le content pane

	    //Trois lignes sur deux colonnes

	    this.setLayout(new GridLayout(1, 1));

	    //On ajoute le bouton au content pane de la JFrame
	  //On cr�e un conteneur avec gestion horizontale

	   /* Box b1 = Box.createHorizontalBox();

	    b1.add(new JButton("Bouton 1"));

	    //Idem

	    Box b2 = Box.createHorizontalBox();

	    b2.add(new JButton("Bouton 2"));

	    b2.add(new JButton("Bouton 3"));

	    //Idem

	    Box b3 = Box.createHorizontalBox();

	    b3.add(new JButton("Bouton 4"));

	    b3.add(new JButton("Bouton 5"));

	    b3.add(new JButton("Bouton 6"));

	    //On cr�e un conteneur avec gestion verticale

	    Box b4 = Box.createVerticalBox();

	    b4.add(b1);

	    b4.add(b2);

	    b4.add(b3);


	    this.getContentPane().add(b4);
	     */  
	         
	    Bouton b10=new Bouton("essai"); 
	    this.getContentPane().add(b10);
	    

	    //this.setContentPane(pan);//On pr�vient notre JFrame que notre JPanel sera son content pane               
	    this.setVisible(true);//Et enfin, la rendre visible
	}
}
