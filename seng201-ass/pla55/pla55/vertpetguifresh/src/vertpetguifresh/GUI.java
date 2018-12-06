package vertpetguifresh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;

import java.awt.Image;
import java.util.ArrayList;

import net.miginfocom.swing.MigLayout;
import vertpet.foods.*;
import vertpet.pets.Pet;
import vertpet.toys.*;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLayeredPane;

import java.awt.FlowLayout;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.Font;
import javax.swing.JMenuItem;

public class GUI {

	private Instance run = new Instance();
	private JFrame frame;
	private JTextField txtPlayerName;
	private JTextField txtP1Pet1Name;
	private JTextField txtP1Pet2Name;
	private JTextField txtP1Pet3Name;
	private JTextField txtPlayer2Name;
	private JTextField txtPlayer3Name;
	private JTextField txtPlayer4Name;
	private JTextField txtPlayer5Name;
	private JTextField txtP2Pet1Name;
	private JTextField txtP3Pet1Name;
	private JTextField txtP4Pet1Name;
	private JTextField txtP5Pet1Name;
	private JTextField txtP2Pet2Name;
	private JTextField txtP3Pet2Name;
	private JTextField txtP4Pet2Name;
	private JTextField txtP5Pet2Name;
	private JTextField txtP2Pet3Name;
	private JTextField txtP3Pet3Name;
	private JTextField txtP4Pet3Name;
	private JTextField txtP5Pet3Name;
	private JPanel pnlP1 = new JPanel();
	private JPanel pnlP2 = new JPanel();
	private JPanel pnlP3 = new JPanel();
	private JPanel pnlP4 = new JPanel();
	private JPanel pnlP5 = new JPanel();
	private JPanel pnlP1Pet1 = new JPanel();
	private JPanel pnlP1Pet2 = new JPanel();
	private JPanel pnlP1Pet3 = new JPanel();
	private JPanel pnlP2Pet1 = new JPanel();
	private JPanel pnlP2Pet2 = new JPanel();
	private JPanel pnlP2Pet3 = new JPanel();
	private JPanel pnlP3Pet1 = new JPanel();
	private JPanel pnlP3Pet2 = new JPanel();
	private JPanel pnlP3Pet3 = new JPanel();
	private JPanel pnlP4Pet1 = new JPanel();
	private JPanel pnlP4Pet2 = new JPanel();
	private JPanel pnlP4Pet3 = new JPanel();
	private JPanel pnlP5Pet1 = new JPanel();
	private JPanel pnlP5Pet2 = new JPanel();
	private JPanel pnlP5Pet3 = new JPanel();
	private JPanel pnlAddPlayers = new JPanel();
	private JPanel pnlMain = new JPanel();
	private JComboBox<String> cmbP1Pet1Species = new JComboBox<String>();
	private JComboBox<String> cmbP1Pet2Species = new JComboBox<String>();
	private JComboBox<String> cmbP1Pet3Species = new JComboBox<String>();
	private JComboBox<String> cmbP2Pet1Species = new JComboBox<String>();
	private JComboBox<String> cmbP2Pet2Species = new JComboBox<String>();
	private JComboBox<String> cmbP2Pet3Species = new JComboBox<String>();
	private JComboBox<String> cmbP3Pet1Species = new JComboBox<String>();
	private JComboBox<String> cmbP3Pet2Species = new JComboBox<String>();
	private JComboBox<String> cmbP3Pet3Species = new JComboBox<String>();
	private JComboBox<String> cmbP4Pet1Species = new JComboBox<String>();
	private JComboBox<String> cmbP4Pet2Species = new JComboBox<String>();
	private JComboBox<String> cmbP4Pet3Species = new JComboBox<String>();
	private JComboBox<String> cmbP5Pet1Species = new JComboBox<String>();
	private JComboBox<String> cmbP5Pet2Species = new JComboBox<String>();
	private JComboBox<String> cmbP5Pet3Species = new JComboBox<String>();
	private JLabel lblTime = new JLabel();
	private JLabel lblDay = new JLabel();
	private JLabel lblCash = new JLabel();
	private JLabel lblCurrentPlayerName = new JLabel();
	private JPanel pnlPet1 = new JPanel();
	private JPanel pnlPet2 = new JPanel();
	private JPanel pnlPet3 = new JPanel();
	private JLabel lblPet1Name = new JLabel("Pet Name");
	private JLabel lblPet2Name = new JLabel("Pet Name");
	private JLabel lblPet3Name = new JLabel("Pet Name");
	private JLabel lblPet1Img = new JLabel("");
	private JLabel lblPet2Img = new JLabel("");
	private JLabel lblPet3Img = new JLabel("");
	private JLabel lblPet1Stats = new JLabel("Stats");
	private JLabel lblPet3Stats = new JLabel("Stats");
	private JLabel lblPet2Stats = new JLabel("Stats");
	private JLabel lblAllToys = new JLabel("AllToys");		
	private JLabel lblAllFood = new JLabel("AllFood");
	private String command = null;
	private JLabel lblMirrorimg = new JLabel("");		
	private JLabel lblRunningwheelimg = new JLabel("");		
	private JLabel lblFootballimg = new JLabel("");		
	private JLabel lblRadioimg = new JLabel("");	
	private JLabel lblTvimg = new JLabel("");		
	private JLabel lblLaserimg = new JLabel("");		
	private JLabel lblBouncyballimg = new JLabel("");		
	private JLabel lblAlltoys = new JLabel("AllToys");		
	private JLabel lblAllfood = new JLabel("AllFood");		
	private JLabel lblMoney = new JLabel("Money: $");			
	private JLabel lblTotalCostAmount = new JLabel("$0.00");	
	private JLabel lblMedicineimg = new JLabel("");			
	private JLabel lblFreshimg = new JLabel("");	
	private JLabel lblWaterimg = new JLabel("");	
	private JLabel lblCookimg = new JLabel("");			
	private JLabel lblMilk = new JLabel("Milk");		
	private JLabel lblMilkimg = new JLabel("");
	private JLabel lblChocolateimg = new JLabel("");	
	private JLabel lblJuiceimg = new JLabel("");		
	private JLabel lblCarrotsimg = new JLabel("");
	private JLabel lblSeedsimg = new JLabel("");	
	private JLabel lblBerriesimg = new JLabel("");		
	private JLabel lblKibbleimg = new JLabel("");		
	private JLabel lblAlcoholImg = new JLabel("");
	private JLabel lblMirror = new JLabel("Mirror");
	private JLabel lblTV = new JLabel("TV");		
	private JLabel lblLaser = new JLabel("Laser");		
	private JLabel lblRunningWheel = new JLabel("Running Wheel");		
	private JLabel lblFootball = new JLabel("Football");		
	private JLabel lblRadio = new JLabel("Radio");		
	private JLabel lblBouncyBall = new JLabel("Bouncy Ball");		
	private JLabel lblMedicine = new JLabel("Medicine");		
	private JLabel lblFreshMeat = new JLabel("Fresh Meat");		
	private JLabel lblWater = new JLabel("Water");		
	private JLabel lblCookedMeat = new JLabel("Cooked Meat");		
	private JLabel lblChocolate = new JLabel("Chocolate");		
	private JLabel lblJuice = new JLabel("Juice");		
	private JLabel lblCarrots = new JLabel("Carrots");		
	private JLabel lblSeeds = new JLabel("Seeds");		
	private JLabel lblBerries = new JLabel("Berries");		
	private JLabel lblKibble = new JLabel("Kibble");		
	private JLabel lblAlcohol = new JLabel("Alcohol");
	private JPanel pnlShop = new JPanel();
	private JLabel lblActionsRemaining = new JLabel("Actions Remaining: ");
	private JLabel lbl5RatingImg = new JLabel("");
	private JLabel lbl5Total = new JLabel("10000");		
	private JLabel lbl5ItemScore = new JLabel("0       ");		
	private JLabel lbl5Pet3Score = new JLabel("0       ");		
	private JLabel lbl5Pet3Name = new JLabel("Pet3Name");		
	private JLabel lbl5Pet2Score = new JLabel("0       ");		
	private JLabel lbl5Pet2Name = new JLabel("Pet2Name");		
	private JLabel lbl5Pet1Score = new JLabel("0       ");		
	private JLabel lbl5Pet1Name = new JLabel("Pet1Name");		
	private JLabel lbl5Name = new JLabel("P5Name");	
	private JLabel lbl4RatingImg = new JLabel("");		
	private JLabel lbl4Total = new JLabel("10000");
	private JLabel lbl4ItemScore = new JLabel("0       ");
	private JLabel lbl4Pet3Score = new JLabel("0       ");
	private JLabel lbl4Pet3Name = new JLabel("Pet3Name");
	private JLabel lbl4Pet2Score = new JLabel("0       ");
	private JLabel lbl4Pet2Name = new JLabel("Pet2Name");
	private JLabel lbl4Pet1Score = new JLabel("0       ");
	private JLabel lbl4Pet1Name = new JLabel("Pet1Name");
	private JLabel lbl4Name = new JLabel("P4Name");
	private JLabel lbl3RatingImg = new JLabel("");
	private JLabel lbl3Total = new JLabel("10000");
	private JLabel lbl3ItemScore = new JLabel("0       ");
	private JLabel lbl3Pet3Score = new JLabel("0       ");
	private JLabel lbl3Pet3Name = new JLabel("Pet3Name");
	private JLabel lbl3Pet2Score = new JLabel("0       ");
	private JLabel lbl3Pet2Name = new JLabel("Pet2Name");
	private JLabel lbl3Pet1Score = new JLabel("0       ");
	private JLabel lbl3Pet1Name = new JLabel("Pet1Name");
	private JLabel lbl3Name = new JLabel("P3Name");
	private JLabel lbl2RatingImg = new JLabel("");			
	private JLabel lbl2Total = new JLabel("10000");	
	private JLabel lbl2ItemScore = new JLabel("0       ");	
	private JLabel lbl2Pet3Score = new JLabel("0       ");
	private JLabel lbl2Pet3Name = new JLabel("Pet3Name");	
	private JLabel lbl2Pet2Score = new JLabel("0       ");
	private JLabel lbl2Pet2Name = new JLabel("Pet2Name");
	private JLabel lbl2Pet1Score = new JLabel("0       ");	
	private JLabel lbl2Pet1Name = new JLabel("Pet1Name");
	private JLabel lbl2Name = new JLabel("P2Name");	
	private JLabel lbl1RatingImg = new JLabel("");	
	private JLabel lbl1Total = new JLabel("10000");	
	private JLabel lbl1ItemScore = new JLabel("0       ");	
	private JLabel lbl1Pet3Score = new JLabel("0       ");
	private JLabel lbl1Pet3Name = new JLabel("Pet3Name");
	private JLabel lbl1Pet2Score = new JLabel("0       ");
	private JLabel lbl1Pet2Name = new JLabel("Pet2Name");	
	private JLabel lbl1Pet1Score = new JLabel("0       ");	
	private JLabel lbl1Pet1Name = new JLabel("Pet1Name");
	private JLabel lbl1name = new JLabel("P1Name");
	private JPanel pnlPlayer5Score = new JPanel();
	private JPanel pnlPlayer4Score = new JPanel();
	private JPanel pnlPlayer3Score = new JPanel();
	private JPanel pnlPlayer2Score = new JPanel();
	private JPanel pnlPlayer1Score = new JPanel();
	private int[] numPlayersPets = {3,3,3,3,3};
	private final JLabel lblGameLengthdays = new JLabel("Game Length (Days):");
	private final JTextField txtGameLength = new JTextField();
	private final JMenuBar menuBar = new JMenuBar();
	private final JButton btnSelectPet1 = new JButton("Select");
	private final JButton btnSelectPet2 = new JButton("Select");
	private final JButton btnSelectPet3 = new JButton("Select");
	private final JButton btnCancelAction = new JButton("Cancel Action");
	private JTextField txtRadioAmount;
	private JTextField txtRunningWheelAmount;
	private JTextField txtTVAmount;
	private JTextField txtBouncyBallAmount;
	private JTextField txtFootballAmount;
	private JTextField txtLaserAmount;
	private JTextField txtMirrorAmount;
	private JTextField txtKibbleAmount;
	private JTextField txtSeedAmount;
	private JTextField txtJuiceAmount;
	private JTextField txtMilkAmount;
	private JTextField txtWaterAmount;
	private JTextField txtMedicineAmount;
	private JTextField txtAlcoholAmount;
	private JTextField txtBerriesAmount;
	private JTextField txtCarrotsAmount;
	private JTextField txtChocolateAmount;
	private JTextField txtCookedMeatAmount;
	private JTextField txtFreshMeatAmount;
	private JLabel lblPenutsimg = new JLabel("");
	private JLabel lblPenuts = new JLabel("Penuts");
	private JTextField txtPenutsAmount = new JTextField();
	private boolean doneAction = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Launch the application.
	 */
	public void launch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public GUI() {
		intro();
	}
	
	/**
	 * Create the textures for the game over window.
	 */
	private void gameOverGUI(){
		
		JPanel pnlGameOver = new JPanel();
		frame.getContentPane().add(pnlGameOver, "cell 0 0,grow");
		pnlGameOver.setLayout(new MigLayout("", "[grow][grow][grow][grow][grow]", "[][grow]"));
		
		JLabel lblGameOver = new JLabel("Game Over");
		lblGameOver.setFont(new Font("Adobe Caslon Pro", Font.BOLD | Font.ITALIC, 20));
		pnlGameOver.add(lblGameOver, "cell 0 0 5 1,alignx center");

		pnlGameOver.add(pnlPlayer1Score, "cell 0 1,growy");
		pnlPlayer1Score.setLayout(new MigLayout("", "[][]", "[][][][][][][][][][][][]"));
		
		JLabel lbl1st = new JLabel("1ST");
		lbl1st.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 75));
		pnlPlayer1Score.add(lbl1st, "cell 0 0 2 1,alignx left");

		lbl1name.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		pnlPlayer1Score.add(lbl1name, "cell 0 1 2 1");
		
		JLabel lblScoreSummary = new JLabel("Score Summary");
		lblScoreSummary.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer1Score.add(lblScoreSummary, "cell 0 2 2 1");

		lbl1Pet1Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer1Score.add(lbl1Pet1Name, "cell 0 3,alignx left");

		lbl1Pet1Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer1Score.add(lbl1Pet1Score, "cell 1 3,alignx right");

		lbl1Pet2Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer1Score.add(lbl1Pet2Name, "cell 0 4,alignx left");

		lbl1Pet2Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer1Score.add(lbl1Pet2Score, "cell 1 4,alignx right");

		lbl1Pet3Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer1Score.add(lbl1Pet3Name, "cell 0 5,alignx left");

		lbl1Pet3Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer1Score.add(lbl1Pet3Score, "cell 1 5,alignx right");
		
		JLabel lblItemScore_1 = new JLabel("Item Score");
		lblItemScore_1.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer1Score.add(lblItemScore_1, "cell 0 6");

		lbl1ItemScore.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer1Score.add(lbl1ItemScore, "cell 1 6,alignx right");
		
		JLabel lblNewLabel = new JLabel("----------------------");
		lblNewLabel.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 13));
		pnlPlayer1Score.add(lblNewLabel, "cell 0 7 2 1");
		
		JLabel lblTotal_1 = new JLabel("Total");
		lblTotal_1.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer1Score.add(lblTotal_1, "cell 0 8");

		lbl1Total.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer1Score.add(lbl1Total, "cell 1 8,alignx right");
		
		JLabel label_4 = new JLabel("<html><br></html>");
		pnlPlayer1Score.add(label_4, "cell 0 9 2 1");
		
		JLabel lblP1Rating = new JLabel("Rating");
		lblP1Rating.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer1Score.add(lblP1Rating, "cell 0 10");

		pnlPlayer1Score.add(lbl1RatingImg, "cell 0 11");

		pnlGameOver.add(pnlPlayer2Score, "cell 1 1,growy");
		pnlPlayer2Score.setLayout(new MigLayout("", "[][]", "[][][][][][][][][][][][][]"));
		
		JLabel lbl2nd = new JLabel("2ND");
		lbl2nd.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 60));
		pnlPlayer2Score.add(lbl2nd, "cell 0 0 2 1");
		
		JLabel label = new JLabel("<html><br></html>");
		label.setFont(new Font("Tahoma", Font.PLAIN, 9));
		pnlPlayer2Score.add(label, "cell 0 1");

		lbl2Name.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		pnlPlayer2Score.add(lbl2Name, "cell 0 2 2 1");
		
		JLabel lblScoreSummary_1 = new JLabel("Score Summary");
		lblScoreSummary_1.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer2Score.add(lblScoreSummary_1, "cell 0 3 2 1");

		lbl2Pet1Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer2Score.add(lbl2Pet1Name, "cell 0 4");

		lbl2Pet1Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer2Score.add(lbl2Pet1Score, "cell 1 4,alignx right");

		lbl2Pet2Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer2Score.add(lbl2Pet2Name, "cell 0 5");

		lbl2Pet2Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer2Score.add(lbl2Pet2Score, "cell 1 5,alignx right");

		lbl2Pet3Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer2Score.add(lbl2Pet3Name, "cell 0 6");

		lbl2Pet3Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer2Score.add(lbl2Pet3Score, "cell 1 6,alignx right");
		
		JLabel lblItemScore = new JLabel("Item Score");
		lblItemScore.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer2Score.add(lblItemScore, "cell 0 7");

		lbl2ItemScore.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer2Score.add(lbl2ItemScore, "cell 1 7,alignx right");
		
		JLabel label_5 = new JLabel("---------------------");
		label_5.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 13));
		pnlPlayer2Score.add(label_5, "cell 0 8 2 1");
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer2Score.add(lblTotal, "cell 0 9");

		lbl2Total.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer2Score.add(lbl2Total, "cell 1 9,alignx right");
		
		JLabel label_17 = new JLabel("<html><br></html>");
		pnlPlayer2Score.add(label_17, "cell 0 10");
	
		JLabel label_13 = new JLabel("Rating");
		label_13.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer2Score.add(label_13, "cell 0 11");
		

		pnlPlayer2Score.add(lbl2RatingImg, "cell 0 12,alignx center");

		pnlGameOver.add(pnlPlayer3Score, "cell 2 1,growy");
		pnlPlayer3Score.setLayout(new MigLayout("", "[][]", "[][][][][][][][][][][][][]"));
		
		JLabel lbl3rd = new JLabel("3RD");
		lbl3rd.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 60));
		pnlPlayer3Score.add(lbl3rd, "cell 0 0 2 1");
		
		JLabel label_1 = new JLabel("<html><br></html>");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		pnlPlayer3Score.add(label_1, "cell 0 1");

		lbl3Name.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		pnlPlayer3Score.add(lbl3Name, "cell 0 2 2 1");
		
		JLabel lblScoreSummary_2 = new JLabel("Score Summary");
		lblScoreSummary_2.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer3Score.add(lblScoreSummary_2, "cell 0 3 2 1");

		lbl3Pet1Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer3Score.add(lbl3Pet1Name, "cell 0 4");

		lbl3Pet1Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer3Score.add(lbl3Pet1Score, "cell 1 4,alignx right");

		lbl3Pet2Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer3Score.add(lbl3Pet2Name, "cell 0 5");

		lbl3Pet2Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer3Score.add(lbl3Pet2Score, "cell 1 5,alignx right");

		lbl3Pet3Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer3Score.add(lbl3Pet3Name, "cell 0 6");

		lbl3Pet3Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer3Score.add(lbl3Pet3Score, "cell 1 6,alignx right");
		
		JLabel label_7 = new JLabel("Item Score");
		label_7.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer3Score.add(label_7, "cell 0 7");

		lbl3ItemScore.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer3Score.add(lbl3ItemScore, "cell 1 7,alignx right");
		
		JLabel label_10 = new JLabel("--------------------");
		label_10.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 13));
		pnlPlayer3Score.add(label_10, "cell 0 8 2 1");
		
		JLabel label_21 = new JLabel("Total");
		label_21.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer3Score.add(label_21, "cell 0 9");

		lbl3Total.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer3Score.add(lbl3Total, "cell 1 9");
		
		JLabel label_18 = new JLabel("<html><br></html>");
		pnlPlayer3Score.add(label_18, "cell 0 10");
		
		JLabel label_14 = new JLabel("Rating");
		label_14.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer3Score.add(label_14, "cell 0 11");

		pnlPlayer3Score.add(lbl3RatingImg, "cell 0 12");

		pnlGameOver.add(pnlPlayer4Score, "cell 3 1,growy");
		pnlPlayer4Score.setLayout(new MigLayout("", "[][]", "[][][][][][][][][][][][][]"));
		
		JLabel lbl4th = new JLabel("4TH");
		lbl4th.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 50));
		pnlPlayer4Score.add(lbl4th, "cell 0 0 2 1");
		
		JLabel label_2 = new JLabel("<html><br></html>");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		pnlPlayer4Score.add(label_2, "cell 0 1");

		lbl4Name.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		pnlPlayer4Score.add(lbl4Name, "cell 0 2 2 1");
		
		JLabel lblScoreSummary_3 = new JLabel("Score Summary");
		lblScoreSummary_3.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer4Score.add(lblScoreSummary_3, "cell 0 3 2 1");

		lbl4Pet1Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer4Score.add(lbl4Pet1Name, "cell 0 4");

		lbl4Pet1Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer4Score.add(lbl4Pet1Score, "cell 1 4,alignx right");

		lbl4Pet2Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer4Score.add(lbl4Pet2Name, "cell 0 5");

		lbl4Pet2Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer4Score.add(lbl4Pet2Score, "cell 1 5,alignx right");

		lbl4Pet3Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer4Score.add(lbl4Pet3Name, "cell 0 6");

		lbl4Pet3Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer4Score.add(lbl4Pet3Score, "cell 1 6,alignx right");
		
		JLabel label_8 = new JLabel("Item Score");
		label_8.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer4Score.add(label_8, "cell 0 7");

		lbl4ItemScore.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer4Score.add(lbl4ItemScore, "cell 1 7,alignx right");
		
		JLabel label_11 = new JLabel("-------------------");
		label_11.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 13));
		pnlPlayer4Score.add(label_11, "cell 0 8 2 1");
		
		JLabel label_22 = new JLabel("Total");
		label_22.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer4Score.add(label_22, "cell 0 9");

		lbl4Total.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer4Score.add(lbl4Total, "cell 1 9");
		
		JLabel label_19 = new JLabel("<html><br></html>");
		pnlPlayer4Score.add(label_19, "cell 0 10");
		
		JLabel label_15 = new JLabel("Rating");
		label_15.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer4Score.add(label_15, "cell 0 11");

		pnlPlayer4Score.add(lbl4RatingImg, "cell 0 12");
		
		pnlGameOver.add(pnlPlayer5Score, "cell 4 1,growy");
		pnlPlayer5Score.setLayout(new MigLayout("", "[][]", "[][][][][][][][][][][][][]"));
		
		JLabel lbl5th = new JLabel("5TH");
		lbl5th.setFont(new Font("Adobe Caslon Pro Bold", Font.BOLD | Font.ITALIC, 40));
		pnlPlayer5Score.add(lbl5th, "cell 0 0 2 1");
		
		JLabel label_3 = new JLabel("<html><br></html>");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		pnlPlayer5Score.add(label_3, "cell 0 1");

		lbl5Name.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 30));
		pnlPlayer5Score.add(lbl5Name, "cell 0 2 2 1");
		
		JLabel lblScoreSummary_4 = new JLabel("Score Summary");
		lblScoreSummary_4.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer5Score.add(lblScoreSummary_4, "cell 0 3 2 1");

		lbl5Pet1Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer5Score.add(lbl5Pet1Name, "cell 0 4");

		lbl5Pet1Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer5Score.add(lbl5Pet1Score, "cell 1 4,alignx right");

		lbl5Pet2Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer5Score.add(lbl5Pet2Name, "cell 0 5");

		lbl5Pet2Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer5Score.add(lbl5Pet2Score, "cell 1 5,alignx right");

		lbl5Pet3Name.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer5Score.add(lbl5Pet3Name, "cell 0 6");

		lbl5Pet3Score.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer5Score.add(lbl5Pet3Score, "cell 1 6,alignx right");
		
		JLabel label_9 = new JLabel("Item Score");
		label_9.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlPlayer5Score.add(label_9, "cell 0 7");

		lbl5ItemScore.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer5Score.add(lbl5ItemScore, "cell 1 7,alignx right");
		
		JLabel label_12 = new JLabel("-------------------");
		label_12.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 13));
		pnlPlayer5Score.add(label_12, "cell 0 8 2 1");
		
		JLabel label_23 = new JLabel("Total");
		label_23.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer5Score.add(label_23, "cell 0 9");

		lbl5Total.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlPlayer5Score.add(lbl5Total, "cell 1 9");
		
		JLabel label_20 = new JLabel("<html><br></html>");
		pnlPlayer5Score.add(label_20, "cell 0 10");
		
		JLabel label_16 = new JLabel("Rating");
		label_16.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 18));
		pnlPlayer5Score.add(label_16, "cell 0 11");
		
		pnlPlayer5Score.add(lbl5RatingImg, "cell 0 12");	
		
		updateScore();
	}
	
	/**
	 * Refreshes the game over window.
	 */
	private void updateScore(){
		setVisibility();
		ArrayList<Player> placements = getPlacements();
		int numPlayers = run.getPlayers().size();
		int pets = 0;
		int deadPets = 0;
		int totalScore = 0;
		switch(numPlayers){
		case 5:
			pnlPlayer5Score.setVisible(true);
			Player place5 = placements.get(4);
			lbl5Name.setText(place5.getName());
			pets = place5.getPets().size();
			switch(pets){
			case 3:
				lbl5Pet3Name.setText(place5.getPets().get(2).getName());
				lbl5Pet3Score.setText(Integer.toString(run.petScore(place5.getPets().get(2))));
				lbl5Pet3Name.setVisible(true);
				lbl5Pet3Score.setVisible(true);
			case 2:
				lbl5Pet2Name.setText(place5.getPets().get(1).getName());
				lbl5Pet2Score.setText(Integer.toString(run.petScore(place5.getPets().get(1))));	
				lbl5Pet2Name.setVisible(true);
				lbl5Pet2Score.setVisible(true);
			case 1:
				lbl5Pet1Name.setText(place5.getPets().get(0).getName());
				lbl5Pet1Score.setText(Integer.toString(run.petScore(place5.getPets().get(0))));
				lbl5Pet1Name.setVisible(true);
				lbl5Pet1Score.setVisible(true);
				break;
			}
			deadPets = place5.getDeadPets().size();
			switch(deadPets){
			case 3:
				lbl5Pet1Name.setText(place5.getDeadPets().get(2).getName());
				lbl5Pet1Score.setText(Integer.toString(-5000));
				lbl5Pet1Name.setVisible(true);
				lbl5Pet1Score.setVisible(true);
			case 2:
				lbl5Pet2Name.setText(place5.getDeadPets().get(1).getName());
				lbl5Pet2Score.setText(Integer.toString(-5000));	
				lbl5Pet2Name.setVisible(true);
				lbl5Pet2Score.setVisible(true);
			case 1:
				lbl5Pet3Name.setText(place5.getDeadPets().get(0).getName());
				lbl5Pet3Score.setText(Integer.toString(-5000));
				lbl5Pet3Name.setVisible(true);
				lbl5Pet3Score.setVisible(true);
				break;
			}
			lbl5ItemScore.setText(Integer.toString(run.itemScore(place5)));
			totalScore = run.getPlayerScore(place5);
			lbl5Total.setText(Integer.toString(totalScore));
			if (totalScore >= 25000){
				Image img = new ImageIcon(this.getClass().getResource("/diamond.png")).getImage();
				lbl5RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 20000){
				Image img = new ImageIcon(this.getClass().getResource("/gold.png")).getImage();
				lbl5RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 15000){
				Image img = new ImageIcon(this.getClass().getResource("/silver.png")).getImage();
				lbl5RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 10000){
				Image img = new ImageIcon(this.getClass().getResource("/bronze.png")).getImage();
				lbl5RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 5000){
				Image img = new ImageIcon(this.getClass().getResource("/up.png")).getImage();
				lbl5RatingImg.setIcon(new ImageIcon(img));
			}
			else{
				Image img = new ImageIcon(this.getClass().getResource("/down.png")).getImage();
				lbl5RatingImg.setIcon(new ImageIcon(img));
			}
		case 4:
			pnlPlayer4Score.setVisible(true);
			Player place4 = placements.get(3);
			lbl4Name.setText(place4.getName());
			pets = place4.getPets().size();
			switch(pets){
			case 3:
				lbl4Pet3Name.setText(place4.getPets().get(2).getName());
				lbl4Pet3Score.setText(Integer.toString(run.petScore(place4.getPets().get(2))));
				lbl4Pet3Name.setVisible(true);
				lbl4Pet3Score.setVisible(true);
			case 2:
				lbl4Pet2Name.setText(place4.getPets().get(1).getName());
				lbl4Pet2Score.setText(Integer.toString(run.petScore(place4.getPets().get(1))));	
				lbl4Pet2Name.setVisible(true);
				lbl4Pet2Score.setVisible(true);
			case 1:
				lbl4Pet1Name.setText(place4.getPets().get(0).getName());
				lbl4Pet1Score.setText(Integer.toString(run.petScore(place4.getPets().get(0))));
				lbl4Pet2Name.setVisible(true);
				lbl4Pet2Score.setVisible(true);
				break;
			}	
			deadPets = place4.getDeadPets().size();
			switch(deadPets){
			case 3:
				lbl4Pet1Name.setText(place4.getDeadPets().get(2).getName());
				lbl4Pet1Score.setText(Integer.toString(-5000));
				lbl4Pet1Name.setVisible(true);
				lbl4Pet1Score.setVisible(true);
			case 2:
				lbl4Pet2Name.setText(place4.getDeadPets().get(1).getName());
				lbl4Pet2Score.setText(Integer.toString(-5000));	
				lbl4Pet2Name.setVisible(true);
				lbl4Pet2Score.setVisible(true);
			case 1:
				lbl4Pet3Name.setText(place4.getDeadPets().get(0).getName());
				lbl4Pet3Score.setText(Integer.toString(-5000));
				lbl4Pet3Name.setVisible(true);
				lbl4Pet3Score.setVisible(true);
				break;
			}
			lbl4ItemScore.setText(Integer.toString(run.itemScore(place4)));
			totalScore = run.getPlayerScore(place4);
			lbl4Total.setText(Integer.toString(totalScore));
			if (totalScore >= 25000){
				Image img = new ImageIcon(this.getClass().getResource("/diamond.png")).getImage();
				lbl4RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 20000){
				Image img = new ImageIcon(this.getClass().getResource("/gold.png")).getImage();
				lbl4RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 15000){
				Image img = new ImageIcon(this.getClass().getResource("/silver.png")).getImage();
				lbl4RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 10000){
				Image img = new ImageIcon(this.getClass().getResource("/bronze.png")).getImage();
				lbl4RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 5000){
				Image img = new ImageIcon(this.getClass().getResource("/up.png")).getImage();
				lbl4RatingImg.setIcon(new ImageIcon(img));
			}
			else{
				Image img = new ImageIcon(this.getClass().getResource("/down.png")).getImage();
				lbl4RatingImg.setIcon(new ImageIcon(img));
			}
		case 3:
			pnlPlayer3Score.setVisible(true);
			Player place3 = placements.get(2);
			lbl3Name.setText(place3.getName());
			pets = place3.getPets().size();
			switch(pets){
			case 3:
				lbl3Pet3Name.setText(place3.getPets().get(2).getName());
				lbl3Pet3Score.setText(Integer.toString(run.petScore(place3.getPets().get(2))));
				lbl3Pet3Name.setVisible(true);
				lbl3Pet3Score.setVisible(true);
			case 2:
				lbl3Pet2Name.setText(place3.getPets().get(1).getName());
				lbl3Pet2Score.setText(Integer.toString(run.petScore(place3.getPets().get(1))));
				lbl3Pet2Name.setVisible(true);
				lbl3Pet2Score.setVisible(true);
			case 1:
				lbl3Pet1Name.setText(place3.getPets().get(0).getName());
				lbl3Pet1Score.setText(Integer.toString(run.petScore(place3.getPets().get(0))));
				lbl3Pet2Name.setVisible(true);
				lbl3Pet2Score.setVisible(true);
				break;
			}
			deadPets = place3.getDeadPets().size();
			switch(deadPets){
			case 3:
				lbl3Pet1Name.setText(place3.getDeadPets().get(2).getName());
				lbl3Pet1Score.setText(Integer.toString(-5000));
				lbl3Pet1Name.setVisible(true);
				lbl3Pet1Score.setVisible(true);
			case 2:
				lbl3Pet2Name.setText(place3.getDeadPets().get(1).getName());
				lbl3Pet2Score.setText(Integer.toString(-5000));	
				lbl3Pet2Name.setVisible(true);
				lbl3Pet2Score.setVisible(true);
			case 1:
				lbl3Pet3Name.setText(place3.getDeadPets().get(0).getName());
				lbl3Pet3Score.setText(Integer.toString(-5000));
				lbl3Pet3Name.setVisible(true);
				lbl3Pet3Score.setVisible(true);
				break;
			}
			lbl3ItemScore.setText(Integer.toString(run.itemScore(place3)));
			totalScore = run.getPlayerScore(place3);
			lbl3Total.setText(Integer.toString(totalScore));
			if (totalScore >= 25000){
				Image img = new ImageIcon(this.getClass().getResource("/diamond.png")).getImage();
				lbl3RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 20000){
				Image img = new ImageIcon(this.getClass().getResource("/gold.png")).getImage();
				lbl3RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 15000){
				Image img = new ImageIcon(this.getClass().getResource("/silver.png")).getImage();
				lbl3RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 10000){
				Image img = new ImageIcon(this.getClass().getResource("/bronze.png")).getImage();
				lbl3RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 5000){
				Image img = new ImageIcon(this.getClass().getResource("/up.png")).getImage();
				lbl3RatingImg.setIcon(new ImageIcon(img));
			}
			else{
				Image img = new ImageIcon(this.getClass().getResource("/down.png")).getImage();
				lbl3RatingImg.setIcon(new ImageIcon(img));
			}
		case 2:
			pnlPlayer2Score.setVisible(true);
			Player place2 = placements.get(1);
			lbl2Name.setText(place2.getName());
			pets = place2.getPets().size();
			switch(pets){
			case 3:
				lbl2Pet3Name.setText(place2.getPets().get(2).getName());
				lbl2Pet3Score.setText(Integer.toString(run.petScore(place2.getPets().get(2))));
				lbl2Pet3Name.setVisible(true);
				lbl2Pet3Score.setVisible(true);
			case 2:
				lbl2Pet2Name.setText(place2.getPets().get(1).getName());
				lbl2Pet2Score.setText(Integer.toString(run.petScore(place2.getPets().get(1))));	
				lbl2Pet2Name.setVisible(true);
				lbl2Pet2Score.setVisible(true);
			case 1:
				lbl2Pet1Name.setText(place2.getPets().get(0).getName());
				lbl2Pet1Score.setText(Integer.toString(run.petScore(place2.getPets().get(0))));
				lbl2Pet1Name.setVisible(true);
				lbl2Pet1Score.setVisible(true);
				break;
			}
			deadPets = place2.getDeadPets().size();
			switch(deadPets){
			case 3:
				lbl2Pet1Name.setText(place2.getDeadPets().get(2).getName());
				lbl2Pet1Score.setText(Integer.toString(-5000));
				lbl2Pet1Name.setVisible(true);
				lbl2Pet1Score.setVisible(true);
			case 2:
				lbl2Pet2Name.setText(place2.getDeadPets().get(1).getName());
				lbl2Pet2Score.setText(Integer.toString(-5000));	
				lbl2Pet2Name.setVisible(true);
				lbl2Pet2Score.setVisible(true);
			case 1:
				lbl2Pet3Name.setText(place2.getDeadPets().get(0).getName());
				lbl2Pet3Score.setText(Integer.toString(-5000));
				lbl2Pet3Name.setVisible(true);
				lbl2Pet3Score.setVisible(true);
				break;
			}
			lbl2ItemScore.setText(Integer.toString(run.itemScore(place2)));
			totalScore = run.getPlayerScore(place2);
			lbl2Total.setText(Integer.toString(totalScore));
			if (totalScore >= 25000){
				Image img = new ImageIcon(this.getClass().getResource("/diamond.png")).getImage();
				lbl2RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 20000){
				Image img = new ImageIcon(this.getClass().getResource("/gold.png")).getImage();
				lbl2RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 15000){
				Image img = new ImageIcon(this.getClass().getResource("/silver.png")).getImage();
				lbl2RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 10000){
				Image img = new ImageIcon(this.getClass().getResource("/bronze.png")).getImage();
				lbl2RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 5000){
				Image img = new ImageIcon(this.getClass().getResource("/up.png")).getImage();
				lbl2RatingImg.setIcon(new ImageIcon(img));
			}
			else{
				Image img = new ImageIcon(this.getClass().getResource("/down.png")).getImage();
				lbl2RatingImg.setIcon(new ImageIcon(img));
			}
		case 1:
			pnlPlayer1Score.setVisible(true);
			Player place1 = placements.get(0);
			lbl1name.setText(place1.getName());
			pets = place1.getPets().size();
			switch(pets){
			case 3:
				lbl1Pet3Name.setText(place1.getPets().get(2).getName());
				lbl1Pet3Score.setText(Integer.toString(run.petScore(place1.getPets().get(2))));
				lbl1Pet3Name.setVisible(true);
				lbl1Pet3Score.setVisible(true);
			case 2:
				lbl1Pet2Name.setText(place1.getPets().get(1).getName());
				lbl1Pet2Score.setText(Integer.toString(run.petScore(place1.getPets().get(1))));	
				lbl1Pet2Name.setVisible(true);
				lbl1Pet2Score.setVisible(true);
			case 1:
				lbl1Pet1Name.setText(place1.getPets().get(0).getName());
				lbl1Pet1Score.setText(Integer.toString(run.petScore(place1.getPets().get(0))));
				lbl1Pet1Name.setVisible(true);
				lbl1Pet1Score.setVisible(true);
				break;
			}
			deadPets = place1.getDeadPets().size();
			switch(deadPets){
			case 3:
				lbl1Pet1Name.setText(place1.getDeadPets().get(2).getName());
				lbl1Pet1Score.setText(Integer.toString(-5000));
				lbl1Pet1Name.setVisible(true);
				lbl1Pet1Score.setVisible(true);
			case 2:
				lbl1Pet2Name.setText(place1.getDeadPets().get(1).getName());
				lbl1Pet2Score.setText(Integer.toString(-5000));	
				lbl1Pet2Name.setVisible(true);
				lbl1Pet2Score.setVisible(true);
			case 1:
				lbl1Pet3Name.setText(place1.getDeadPets().get(0).getName());
				lbl1Pet3Score.setText(Integer.toString(-5000));
				lbl1Pet3Name.setVisible(true);
				lbl1Pet3Score.setVisible(true);
				break;
			}
			lbl1ItemScore.setText(Integer.toString(run.itemScore(place1)));
			totalScore = run.getPlayerScore(place1);
			lbl1Total.setText(Integer.toString(totalScore));
			if (totalScore >= 25000){
				Image img = new ImageIcon(this.getClass().getResource("/diamond.png")).getImage();
				lbl1RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 20000){
				Image img = new ImageIcon(this.getClass().getResource("/gold.png")).getImage();
				lbl1RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 15000){
				Image img = new ImageIcon(this.getClass().getResource("/silver.png")).getImage();
				lbl1RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 10000){
				Image img = new ImageIcon(this.getClass().getResource("/bronze.png")).getImage();
				lbl1RatingImg.setIcon(new ImageIcon(img));
			}
			else if (totalScore >= 5000){
				Image img = new ImageIcon(this.getClass().getResource("/up.png")).getImage();
				lbl1RatingImg.setIcon(new ImageIcon(img));
			}
			else{
				Image img = new ImageIcon(this.getClass().getResource("/down.png")).getImage();
				lbl1RatingImg.setIcon(new ImageIcon(img));
			}
			break;
		}
		frame.revalidate();
		frame.repaint();
	}
	
	/**
	 * Sets visibility initialization for game over window.
	 */
	private void setVisibility(){
		lbl5Pet3Name.setVisible(false);
		lbl5Pet3Score.setVisible(false);
		lbl5Pet2Name.setVisible(false);
		lbl5Pet2Score.setVisible(false);
		lbl5Pet1Name.setVisible(false);
		lbl5Pet1Score.setVisible(false);
		lbl4Pet3Name.setVisible(false);
		lbl4Pet3Score.setVisible(false);
		lbl4Pet2Name.setVisible(false);
		lbl4Pet2Score.setVisible(false);
		lbl4Pet1Name.setVisible(false);
		lbl4Pet1Score.setVisible(false);
		lbl3Pet3Name.setVisible(false);
		lbl3Pet3Score.setVisible(false);
		lbl3Pet2Name.setVisible(false);
		lbl3Pet2Score.setVisible(false);
		lbl3Pet1Name.setVisible(false);
		lbl3Pet1Score.setVisible(false);
		lbl2Pet3Name.setVisible(false);
		lbl2Pet3Score.setVisible(false);
		lbl2Pet2Name.setVisible(false);
		lbl2Pet2Score.setVisible(false);
		lbl2Pet1Name.setVisible(false);
		lbl2Pet1Score.setVisible(false);
		lbl1Pet3Name.setVisible(false);
		lbl1Pet3Score.setVisible(false);
		lbl1Pet2Name.setVisible(false);
		lbl1Pet2Score.setVisible(false);
		lbl1Pet1Name.setVisible(false);
		lbl1Pet1Score.setVisible(false);
		pnlPlayer5Score.setVisible(false);
		pnlPlayer4Score.setVisible(false);
		pnlPlayer3Score.setVisible(false);
		pnlPlayer2Score.setVisible(false);
		pnlPlayer1Score.setVisible(false);
	}
	
	/**
	 * Puts the players in order of their position in the game based of score.
	 * @return An ArrayList with the players in order of their position.
	 */
	private ArrayList<Player> getPlacements(){
		ArrayList<Player> placements = new ArrayList<Player>();
		int count = 0;
		int counter = 0;
		int movement = 0;
		ArrayList<Player> players = run.getPlayers();
		while (count < players.size()){
			Player max = players.get(count);
			movement = 0;
			while (placements.contains(max)){
				movement = movement + 1;
				if (!(movement + count < players.size())){
					movement = - count;
				}
				max = players.get(count + movement);
			}
			while (counter < players.size()){
				if (run.getPlayerScore(players.get(counter)) > run.getPlayerScore(max)){
					if (!placements.contains(players.get(counter))){
						max = players.get(counter);
					} 
				}
				counter = counter + 1;
			}
			placements.add(max);
			count = count + 1;
		}
		return placements;
	}

	/**
	 * Create the textures for the shop window.
	 */
	private void shopGUI(){
		frame.setJMenuBar(menuBar);
		txtPenutsAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		txtPenutsAmount.setColumns(10);
		
		frame.getContentPane().add(pnlShop, "cell 0 0,grow");
		pnlShop.setLayout(new MigLayout("", "[grow][grow]", "[grow][grow]"));
		
		JPanel pnlFood = new JPanel();
		pnlShop.add(pnlFood, "cell 0 0,grow");
		pnlFood.setLayout(new MigLayout("", "[][][][grow][][][][][grow]", "[][][][][][][][][][]"));
		
		JLabel lblAlcoholPrice = new JLabel("$"+new Alcohol().getCost());
		JLabel lblKibblePrice = new JLabel("$"+new Kibble().getCost());	
		JLabel lblBerriesPrice = new JLabel("$"+new Berries().getCost());	
		JLabel lblSeedsPrice = new JLabel("$"+new Seed().getCost());	
		JLabel lblCarrotsPrice = new JLabel("$"+new Carrot().getCost());
		JLabel lblChocolatePrice = new JLabel("$"+new Chocolate().getCost());	
		JLabel lblJuicePrice = new JLabel("$"+new Juice().getCost());	
		JLabel lblMilkPrice = new JLabel("$"+new Milk().getCost());
		JLabel lblCookedMeatPrice = new JLabel("$"+new CookedMeat().getCost());	
		JLabel lblWaterPrice = new JLabel("$"+new Water().getCost());	
		JLabel lblFreshMeatPrice = new JLabel("$"+new RawMeat().getCost());
		JLabel lblMedicinePrice = new JLabel("$"+new Medicine().getCost());	
		JLabel lblLaserPrice = new JLabel("$"+new Laser().getCost());	
		JLabel lblTVPrice = new JLabel("$"+new TV().getCost());	
		JLabel lblBouncyBallPrice = new JLabel("$"+new BouncyBall().getCost());	
		JLabel lblRadioPrice = new JLabel("$"+new Radio().getCost());	
		JLabel lblFootballPrice = new JLabel("$"+new Football().getCost());	
		JLabel lblRunningWheelPrice = new JLabel("$"+new RunningWheel().getCost());
		JLabel lblMirrorPrice = new JLabel("$"+new Mirror().getCost());
		JLabel lblPenutsPrice = new JLabel("$"+new Penuts().getCost());
		
		JLabel lblAvaliblefood = new JLabel("Avalible Food:");
		lblAvaliblefood.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		pnlFood.add(lblAvaliblefood, "cell 0 0 9 1");
		
		JLabel label = new JLabel("<html><br></html>");
		pnlFood.add(label, "cell 0 1");
		
		JLabel lblAmount_2 = new JLabel("Amount");
		lblAmount_2.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(lblAmount_2, "cell 3 1");
		
		JLabel lblAmount_3 = new JLabel("Amount");
		lblAmount_3.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(lblAmount_3, "cell 8 1");

		pnlFood.add(lblAlcoholImg, "cell 0 2");

		lblAlcohol.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblAlcohol, "cell 1 2");

		lblAlcoholPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblAlcoholPrice, "cell 2 2,alignx trailing");
		
		txtAlcoholAmount = new JTextField();
		txtAlcoholAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtAlcoholAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(txtAlcoholAmount, "cell 3 2,growx");
		txtAlcoholAmount.setColumns(10);

		pnlFood.add(lblKibbleimg, "cell 5 2");
	
		lblKibble.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblKibble, "cell 6 2");

		lblKibblePrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblKibblePrice, "cell 7 2,alignx trailing");
		
		txtKibbleAmount = new JTextField();
		txtKibbleAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtKibbleAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(txtKibbleAmount, "cell 8 2,growx");
		txtKibbleAmount.setColumns(10);

		pnlFood.add(lblBerriesimg, "cell 0 3");

		lblBerries.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblBerries, "cell 1 3");

		lblBerriesPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblBerriesPrice, "cell 2 3,alignx trailing");
		
		txtBerriesAmount = new JTextField();
		txtBerriesAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtBerriesAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(txtBerriesAmount, "cell 3 3,growx");
		txtBerriesAmount.setColumns(10);

		pnlFood.add(lblSeedsimg, "cell 5 3");

		lblSeeds.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblSeeds, "cell 6 3");

		lblSeedsPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblSeedsPrice, "cell 7 3,alignx trailing");
		
		txtSeedAmount = new JTextField();
		txtSeedAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtSeedAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(txtSeedAmount, "cell 8 3,growx");
		txtSeedAmount.setColumns(10);

		pnlFood.add(lblCarrotsimg, "cell 0 4");

		lblCarrots.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblCarrots, "cell 1 4");

		lblCarrotsPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblCarrotsPrice, "cell 2 4,alignx trailing");
		
		txtCarrotsAmount = new JTextField();
		txtCarrotsAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtCarrotsAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(txtCarrotsAmount, "cell 3 4,growx");
		txtCarrotsAmount.setColumns(10);

		pnlFood.add(lblJuiceimg, "cell 5 4");

		lblJuice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblJuice, "cell 6 4");

		lblJuicePrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblJuicePrice, "cell 7 4,alignx trailing");
		
		txtJuiceAmount = new JTextField();
		txtJuiceAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtJuiceAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(txtJuiceAmount, "cell 8 4,growx");
		txtJuiceAmount.setColumns(10);

		pnlFood.add(lblChocolateimg, "cell 0 5");

		lblChocolate.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblChocolate, "cell 1 5");
		

		lblChocolatePrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblChocolatePrice, "cell 2 5,alignx trailing");
		
		txtChocolateAmount = new JTextField();
		txtChocolateAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtChocolateAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(txtChocolateAmount, "cell 3 5,growx");
		txtChocolateAmount.setColumns(10);

		pnlFood.add(lblMilkimg, "cell 5 5");

		lblMilk.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblMilk, "cell 6 5");

		lblMilkPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblMilkPrice, "cell 7 5,alignx trailing");
		
		txtMilkAmount = new JTextField();
		txtMilkAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtMilkAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(txtMilkAmount, "cell 8 5,growx");
		txtMilkAmount.setColumns(10);

		pnlFood.add(lblCookimg, "cell 0 6");

		lblCookedMeat.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblCookedMeat, "cell 1 6");

		lblCookedMeatPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblCookedMeatPrice, "cell 2 6,alignx trailing");
		
		txtCookedMeatAmount = new JTextField();
		txtCookedMeatAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtCookedMeatAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(txtCookedMeatAmount, "cell 3 6,growx");
		txtCookedMeatAmount.setColumns(10);

		pnlFood.add(lblWaterimg, "cell 5 6");

		lblWater.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblWater, "cell 6 6");

		lblWaterPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblWaterPrice, "cell 7 6,alignx trailing");
		
		txtWaterAmount = new JTextField();
		txtWaterAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtWaterAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(txtWaterAmount, "cell 8 6,growx");
		txtWaterAmount.setColumns(10);

		pnlFood.add(lblFreshimg, "cell 0 7");

		lblFreshMeat.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblFreshMeat, "cell 1 7");

		lblFreshMeatPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblFreshMeatPrice, "cell 2 7,alignx trailing");
		
		txtFreshMeatAmount = new JTextField();
		txtFreshMeatAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtFreshMeatAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(txtFreshMeatAmount, "cell 3 7,growx");
		txtFreshMeatAmount.setColumns(10);

		pnlFood.add(lblMedicineimg, "cell 5 7");

		lblMedicine.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblMedicine, "cell 6 7");

		lblMedicinePrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlFood.add(lblMedicinePrice, "cell 7 7,alignx trailing");
		
		txtMedicineAmount = new JTextField();
		txtMedicineAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtMedicineAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlFood.add(txtMedicineAmount, "cell 8 7,growx");
		txtMedicineAmount.setColumns(10);
		
		pnlFood.add(lblPenutsimg, "cell 0 8");
		lblPenuts.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		
		pnlFood.add(lblPenuts, "cell 1 8");
		lblPenutsPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		
		pnlFood.add(lblPenutsPrice, "cell 2 8,alignx trailing");
		
		pnlFood.add(txtPenutsAmount, "cell 3 8,growx");
		
		JLabel label_1 = new JLabel("<html><br></html>");
		pnlFood.add(label_1, "cell 0 9");
		
		JPanel pnlShopPlayer = new JPanel();
		pnlShop.add(pnlShopPlayer, "cell 1 0 1 2,grow");
		pnlShopPlayer.setLayout(new MigLayout("", "[]", "[][][][][][][][][][][][][][]"));
		
		JLabel lblTotalCost = new JLabel("Total Cost:");
		lblTotalCost.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		pnlShopPlayer.add(lblTotalCost, "cell 0 0");

		lblTotalCostAmount.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		pnlShopPlayer.add(lblTotalCostAmount, "cell 0 1");
		
		JLabel label_7 = new JLabel("<html><br></html>");
		pnlShopPlayer.add(label_7, "cell 0 2");

		JLabel lblPlayerName = new JLabel(run.getCurrentPlayer().getName());	
		lblPlayerName.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		pnlShopPlayer.add(lblPlayerName, "cell 0 3");

		lblMoney.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 20));
		pnlShopPlayer.add(lblMoney, "cell 0 4");
		
		JLabel label_6 = new JLabel("<html><br></html>");
		pnlShopPlayer.add(label_6, "cell 0 5");
		
		JLabel lblFood = new JLabel("Food:");
		lblFood.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 20));
		pnlShopPlayer.add(lblFood, "cell 0 6");

		lblAllfood.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		lblAllfood.setText(run.getCurrentPlayer().getStringFoodInv());
		pnlShopPlayer.add(lblAllfood, "cell 0 7");
		
		JLabel label_4 = new JLabel("<html><br></html>");
		pnlShopPlayer.add(label_4, "cell 0 8");
		
		JLabel lblToys = new JLabel("Toys:");
		lblToys.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 20));
		pnlShopPlayer.add(lblToys, "cell 0 9");

		lblAlltoys.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		lblAlltoys.setText(run.getCurrentPlayer().getStringToyInv());
		pnlShopPlayer.add(lblAlltoys, "cell 0 10");
		
		JLabel label_5 = new JLabel("<html><br></html>");
		pnlShopPlayer.add(label_5, "cell 0 11");
		
		JButton btnBuy = new JButton("Buy");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Player player = run.getCurrentPlayer();
				double totalPrice = Double.parseDouble(lblTotalCostAmount.getText().substring(1));
				if (totalPrice < player.getMoney()){
					if (checkEnoughStock()){
						player.adjustMoney(-totalPrice);
						buyItems();
					}
					else{
						JOptionPane.showMessageDialog(null, "The shop does not have enough stock for that order at the moment.\n"
								+ "Please adjust your order or check back later.");
					}
				}
				else{
					JOptionPane.showMessageDialog(null, player.getName()+" you dont have enough money to buy all that.");
				}
				updateShop();
			}
		});
		btnBuy.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		pnlShopPlayer.add(btnBuy, "cell 0 12,growx");
		
		JButton btnLeave = new JButton("Leave");
		btnLeave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				pnlShop.removeAll();
				frame.repaint();
				run.useAction();
				mainGame();
			}
		});
		btnLeave.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		pnlShopPlayer.add(btnLeave, "cell 0 13,growx");
		
		JPanel pnlToys = new JPanel();
		pnlShop.add(pnlToys, "cell 0 1,grow");
		pnlToys.setLayout(new MigLayout("", "[][][][grow][][][][][grow]", "[][][][][][][]"));
		
		JLabel lblAvalibleToys = new JLabel("Avalible Toys:");
		lblAvalibleToys.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		pnlToys.add(lblAvalibleToys, "cell 0 0 9 1");
		
		JLabel label_2 = new JLabel("<html><br></html>");
		pnlToys.add(label_2, "cell 0 1");
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlToys.add(lblAmount, "cell 3 1");
		
		JLabel lblAmount_1 = new JLabel("Amount");
		lblAmount_1.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlToys.add(lblAmount_1, "cell 8 1");

		pnlToys.add(lblBouncyballimg, "cell 0 2");

		lblBouncyBall.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblBouncyBall, "cell 1 2");

		lblBouncyBallPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblBouncyBallPrice, "cell 2 2,alignx trailing");
		
		txtBouncyBallAmount = new JTextField();
		txtBouncyBallAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtBouncyBallAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlToys.add(txtBouncyBallAmount, "cell 3 2,growx");
		txtBouncyBallAmount.setColumns(10);

		pnlToys.add(lblRadioimg, "cell 5 2");

		lblRadio.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblRadio, "cell 6 2");

		lblRadioPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblRadioPrice, "cell 7 2,alignx trailing");
		
		txtRadioAmount = new JTextField();
		txtRadioAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtRadioAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlToys.add(txtRadioAmount, "cell 8 2,growx");
		txtRadioAmount.setColumns(10);

		pnlToys.add(lblFootballimg, "cell 0 3");

		lblFootball.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblFootball, "cell 1 3");

		lblFootballPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblFootballPrice, "cell 2 3,alignx trailing");
		
		txtFootballAmount = new JTextField();
		txtFootballAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtFootballAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlToys.add(txtFootballAmount, "cell 3 3,growx");
		txtFootballAmount.setColumns(10);

		pnlToys.add(lblRunningwheelimg, "cell 5 3");

		lblRunningWheel.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblRunningWheel, "cell 6 3");

		lblRunningWheelPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblRunningWheelPrice, "cell 7 3,alignx trailing");
		
		txtRunningWheelAmount = new JTextField();
		txtRunningWheelAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtRunningWheelAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlToys.add(txtRunningWheelAmount, "cell 8 3,growx");
		txtRunningWheelAmount.setColumns(10);

		pnlToys.add(lblLaserimg, "cell 0 4");

		lblLaser.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblLaser, "cell 1 4");

		lblLaserPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblLaserPrice, "cell 2 4,alignx trailing");
		
		txtLaserAmount = new JTextField();
		txtLaserAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtLaserAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlToys.add(txtLaserAmount, "cell 3 4,growx");
		txtLaserAmount.setColumns(10);

		pnlToys.add(lblTvimg, "cell 5 4");

		lblTV.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblTV, "cell 6 4");

		lblTVPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblTVPrice, "cell 7 4,alignx trailing");
		
		txtTVAmount = new JTextField();
		txtTVAmount.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void insertUpdate(DocumentEvent arg0) {updateTotalCost();}

			@Override
			public void removeUpdate(DocumentEvent arg0) {updateTotalCost();}
		});
		txtTVAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlToys.add(txtTVAmount, "cell 8 4,growx");
		txtTVAmount.setColumns(10);

		pnlToys.add(lblMirrorimg, "cell 0 5");
		
		
		lblMirror.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblMirror, "cell 1 5");
		
		
		lblMirrorPrice.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 20));
		pnlToys.add(lblMirrorPrice, "cell 2 5,alignx trailing");
		
		txtMirrorAmount = new JTextField();
		txtMirrorAmount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTotalCost();
			}
		});
		txtMirrorAmount.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 16));
		pnlToys.add(txtMirrorAmount, "cell 3 5,growx");
		txtMirrorAmount.setColumns(10);
		
		JLabel label_3 = new JLabel("<html><br></html>");
		pnlToys.add(label_3, "cell 0 6");
		updateShop();
		
		createMenuBar();
	}
	
	/**
	 * Updates the textures for the shop window.
	 */
	private void updateShop(){
		lblAlcohol.setText("Alcohol x"+run.shop.getInvAmount("Alcohol", "food"));
		lblBerries.setText("Berries x"+run.shop.getInvAmount("Berries", "food"));
		lblCarrots.setText("Carrots x"+run.shop.getInvAmount("Carrot", "food"));
		lblChocolate.setText("Chocolate x"+run.shop.getInvAmount("Chocolate", "food"));
		lblCookedMeat.setText("Cooked Meat x"+run.shop.getInvAmount("CookedMeat", "food"));
		lblJuice.setText("Juice x"+run.shop.getInvAmount("Juice", "food"));
		lblKibble.setText("Kibble x"+run.shop.getInvAmount("Kibble", "food"));
		lblMedicine.setText("Medicine x"+run.shop.getInvAmount("Medicine", "food"));
		lblMilk.setText("Milk x"+run.shop.getInvAmount("Milk", "food"));
		lblFreshMeat.setText("Fresh Meat x"+run.shop.getInvAmount("RawMeat", "food"));
		lblSeeds.setText("Seeds x"+run.shop.getInvAmount("Seed", "food"));
		lblWater.setText("Water x"+run.shop.getInvAmount("Water", "food"));
		lblBouncyBall.setText("Bouncy Ball x"+run.shop.getInvAmount("BouncyBall", "toy"));
		lblFootball.setText("Football x"+run.shop.getInvAmount("Football", "toy"));
		lblLaser.setText("Laser x"+run.shop.getInvAmount("Laser", "toy"));
		lblMirror.setText("Mirror x"+run.shop.getInvAmount("Mirror", "toy"));
		lblRadio.setText("Radio x"+run.shop.getInvAmount("Radio", "toy"));
		lblRunningWheel.setText("Running Wheel x"+run.shop.getInvAmount("RunningWheel", "toy"));
		lblTV.setText("TV x"+run.shop.getInvAmount("TV", "toy"));
		lblAllfood.setText(run.getCurrentPlayer().getStringFoodInv());
		lblAlltoys.setText(run.getCurrentPlayer().getStringToyInv());	
		lblMoney.setText("$"+Double.toString(Math.round(run.getCurrentPlayer().getMoney())));
		pnlShop.revalidate();
		pnlShop.repaint();		
	}
	
	/**
	 * Updates the total cost in the shop window.
	 */
	private void updateTotalCost(){
		double totalCost = 0;
		int amount = 0;
		Food[] food = run.shop.getAllFood();
		Toy[] toy = run.shop.getAllToys();
		String[] foodAmounts = {txtAlcoholAmount.getText(), txtBerriesAmount.getText(), 
				txtCarrotsAmount.getText(), txtChocolateAmount.getText(), txtCookedMeatAmount.getText(), 
				txtJuiceAmount.getText(), txtKibbleAmount.getText(), txtMedicineAmount.getText(), 
				txtMilkAmount.getText(), txtPenutsAmount.getText(), txtFreshMeatAmount.getText(), 
				txtSeedAmount.getText(), txtWaterAmount.getText()}; 
		String[] toyAmounts = {txtBouncyBallAmount.getText(), txtFootballAmount.getText(),
				txtLaserAmount.getText(), txtMirrorAmount.getText(), txtRadioAmount.getText(),
				txtRunningWheelAmount.getText(), txtTVAmount.getText()};
		int count = 0;
		try{
			while (count < food.length){
				if (foodAmounts[count].equals("")){amount = 0;}
				else{amount = Integer.parseInt(foodAmounts[count]);}
				if (amount < 0){throw new NumberFormatException();} 
				else{totalCost = totalCost + amount * food[count].getCost();}
				count = count + 1;
			}
			count = 0;
			while (count < toy.length){
				if (toyAmounts[count].equals("")){amount = 0;}
				else{amount = Integer.parseInt(toyAmounts[count]);}
				if (amount < 0){throw new NumberFormatException();} 
				else{totalCost = totalCost + amount * toy[count].getCost();}
				count = count + 1;
			}
		}
		catch(NumberFormatException exc){
			JOptionPane.showMessageDialog(null, "Amount to purchase must be a possitive number.");
		}
		lblTotalCostAmount.setText("$"+Double.toString(Math.round(totalCost)));
	}
	
	/**
	 * Checks if the shop has enough stock for what the player is ordering.
	 * @return Returns true is the shop has enough stock.
	 */
	private boolean checkEnoughStock(){
		boolean enough = true;
		int amount = 0;
		Food[] food = run.shop.getAllFood();
		Toy[] toy = run.shop.getAllToys();
		String[] foodAmounts = {txtAlcoholAmount.getText(), txtBerriesAmount.getText(), 
				txtCarrotsAmount.getText(), txtChocolateAmount.getText(), txtCookedMeatAmount.getText(), 
				txtJuiceAmount.getText(), txtKibbleAmount.getText(), txtMedicineAmount.getText(), 
				txtMilkAmount.getText(), txtPenutsAmount.getText(), txtFreshMeatAmount.getText(), 
				txtSeedAmount.getText(), txtWaterAmount.getText()}; 
		String[] toyAmounts = {txtBouncyBallAmount.getText(), txtFootballAmount.getText(),
				txtLaserAmount.getText(), txtMirrorAmount.getText(), txtRadioAmount.getText(),
				txtRunningWheelAmount.getText(), txtTVAmount.getText()};
		int count = 0;
		while (count < food.length){
			if (foodAmounts[count].equals("")){amount = 0;}
			else{amount = Integer.parseInt(foodAmounts[count]);}
			if (amount > run.shop.getInvAmount(food[count].getName(), "food")){enough = false;}
			count = count + 1;
		}
		count = 0;
		while (count < toy.length){
			if (toyAmounts[count].equals("")){amount = 0;}
			else{amount = Integer.parseInt(toyAmounts[count]);}
			if (amount > run.shop.getInvAmount(toy[count].getName(), "toy")){enough = false;}
			count = count + 1;
		}
		return enough;
	}
	
	/**
	 * Processes buying the items from the shop.
	 * This includes removing it from the shop and adding it to the players inventory.
	 */
	private void buyItems(){
		int amount = 0;
		Food[] food = run.shop.getAllFood();
		Toy[] toy = run.shop.getAllToys();
		String[] foodAmounts = {txtAlcoholAmount.getText(), txtBerriesAmount.getText(), 
				txtCarrotsAmount.getText(), txtChocolateAmount.getText(), txtCookedMeatAmount.getText(), 
				txtJuiceAmount.getText(), txtKibbleAmount.getText(), txtMedicineAmount.getText(), 
				txtMilkAmount.getText(), txtPenutsAmount.getText(), txtFreshMeatAmount.getText(), 
				txtSeedAmount.getText(), txtWaterAmount.getText()}; 
		String[] toyAmounts = {txtBouncyBallAmount.getText(), txtFootballAmount.getText(),
				txtLaserAmount.getText(), txtMirrorAmount.getText(), txtRadioAmount.getText(),
				txtRunningWheelAmount.getText(), txtTVAmount.getText()};
		int count = 0;
		while (count < food.length){
			if (foodAmounts[count].equals("")){amount = 0;}
			else{amount = Integer.parseInt(foodAmounts[count]);}
			while (amount > 0){
				run.shop.soldItem(food[count]);
				run.getCurrentPlayer().addFood(food[count]);
				amount = amount - 1;
			}
			count = count + 1;
		}
		count = 0;
		while (count < toy.length){
			if (toyAmounts[count].equals("")){amount = 0;}
			else{amount = Integer.parseInt(toyAmounts[count]);}
			while (amount > 0){
				run.shop.soldItem(toy[count]);
				run.getCurrentPlayer().addToy(toy[count]);
				amount = amount - 1;
			}
			count = count + 1;
		}
	}
	
	/**
	 * Create the textures for the main game window.
	 */
	private void mainGame(){
		frame.getContentPane().add(pnlMain, "cell 0 0,grow");
		pnlMain.setLayout(new MigLayout("", "[][grow][grow][grow]", "[][][][grow]"));
		
		JPanel pnlActions = new JPanel();
		pnlMain.add(pnlActions, "cell 0 0 1 4,grow");
		pnlActions.setLayout(new MigLayout("", "[][]", "[][][][][][][][][][][][][][][]"));
		
		lblCurrentPlayerName.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 30));
		pnlActions.add(lblCurrentPlayerName, "cell 0 0");
		
		lblActionsRemaining.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 16));
		pnlActions.add(lblActionsRemaining, "cell 0 1");
		
		JLabel label = new JLabel("<html><br></html>");
		pnlActions.add(label, "cell 0 2");
		
		JLabel lblActions = new JLabel("Actions:");
		lblActions.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 15));
		pnlActions.add(lblActions, "cell 0 3");
		
		JButton btnFeed = new JButton("Feed Pet");
		btnFeed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showSelectButtons();
				command = "feed";
				doneAction = false;
			}
		});
		pnlActions.add(btnFeed, "cell 0 4,growx");
		
		JButton btnPlay = new JButton("Play With Pet");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showSelectButtons();
				command = "play";
				doneAction = false;
			}
		});
		pnlActions.add(btnPlay, "cell 0 5,growx");
		
		JButton btnSleep = new JButton("Put Pet to Bed");
		btnSleep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showSelectButtons();
				command = "sleep";
				doneAction = false;
			}
		});
		pnlActions.add(btnSleep, "cell 0 6,growx");
		
		JButton btnToilet = new JButton("Take Pet to Toilet");
		btnToilet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showSelectButtons();
				command = "toilet";
				doneAction = false;
			}
		});
		pnlActions.add(btnToilet, "cell 0 7,growx");
		
		JButton btnWork = new JButton("Go to Work");
		btnWork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				run.getCurrentPlayer().goToWork();
				String event = run.useAction();
				if (!(event == null)){
					JOptionPane.showMessageDialog(null, event);
				}
				updateMain();
			}
		});
		pnlActions.add(btnWork, "cell 0 8,growx");
		
		JButton btnShop = new JButton("Visit Shop");
		btnShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().removeAll();
				pnlMain.removeAll();
				shopGUI();
			}
		});
		pnlActions.add(btnShop, "cell 0 9,growx");
		
		JButton btnSkipTurn = new JButton("Skip Turn");
		btnSkipTurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String events = run.changeCurrentPlayer();
				JOptionPane.showMessageDialog(null,events);
				updateMain();
			}
		});
		pnlActions.add(btnSkipTurn, "cell 0 10,growx");
		
		JLabel label_1 = new JLabel("<html><br><br><br></html>");
		pnlActions.add(label_1, "cell 0 11");
		

		lblDay.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		pnlActions.add(lblDay, "cell 0 12");
		
		
		lblTime.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		pnlActions.add(lblTime, "cell 0 13");
		
		JPanel pnlInv = new JPanel();
		pnlMain.add(pnlInv, "cell 1 1 3 1,grow");
		pnlInv.setLayout(new MigLayout("", "[grow][][grow][][][]", "[][grow][][][]"));
		
		JLabel lblFood = new JLabel("Food:");
		lblFood.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 20));
		pnlInv.add(lblFood, "cell 0 0");
		
		JLabel lblToys = new JLabel("Toys:");
		lblToys.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 20));
		pnlInv.add(lblToys, "cell 2 0");
		
		JLabel lblMoney = new JLabel("Money:");
		lblMoney.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 20));
		pnlInv.add(lblMoney, "cell 4 0");

		lblAllFood.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 16));
		pnlInv.add(lblAllFood, "cell 0 1 1 4,growy");
		
		lblAllToys.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 16));
		pnlInv.add(lblAllToys, "cell 2 1 1 4,growy");
		lblCash.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 20));
		
		pnlInv.add(lblCash, "cell 4 1");
		btnCancelAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				command = null;
				updateMain();
				doneAction = true;
			}
		});
		
		pnlInv.add(btnCancelAction, "cell 4 4");

		
		pnlMain.add(pnlPet1, "cell 1 3,growx,aligny bottom");
		pnlPet1.setLayout(new MigLayout("", "[]", "[][][][]"));

		pnlPet1.add(lblPet1Img, "cell 0 0");
		lblPet1Name.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
			
		pnlPet1.add(lblPet1Name, "cell 0 1");
		lblPet1Stats.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 20));
		

		pnlPet1.add(lblPet1Stats, "cell 0 2");
		btnSelectPet1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!doneAction){
					doCommand(0);
					doneAction = true;
				}
			}
		});
		
		pnlPet1.add(btnSelectPet1, "cell 0 3,growx");
	
		pnlMain.add(pnlPet2, "cell 2 3,growx,aligny bottom");
		pnlPet2.setLayout(new MigLayout("", "[]", "[][][][]"));
		
		pnlPet2.add(lblPet2Img, "cell 0 0");
		lblPet2Name.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		
		pnlPet2.add(lblPet2Name, "cell 0 1");
		lblPet2Stats.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 20));

		pnlPet2.add(lblPet2Stats, "cell 0 2");
		btnSelectPet2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!doneAction){
					doCommand(1);
					doneAction = true;
				}
			}
		});
		
		pnlPet2.add(btnSelectPet2, "cell 0 3,growx");
		
		pnlMain.add(pnlPet3, "cell 3 3,growx,aligny bottom");
		pnlPet3.setLayout(new MigLayout("", "[]", "[][][][]"));
		
		pnlPet3.add(lblPet3Img, "cell 0 0");
		lblPet3Name.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 25));
		
		pnlPet3.add(lblPet3Name, "cell 0 1");
		lblPet3Stats.setFont(new Font("Adobe Caslon Pro", Font.BOLD, 20));
		
		pnlPet3.add(lblPet3Stats, "cell 0 2");
		btnSelectPet3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!doneAction){
					doCommand(2);
					doneAction = true;
				}
			}
		});
		
		pnlPet3.add(btnSelectPet3, "cell 0 3,growx");
		
		JMenuBar menuBar_1 = new JMenuBar();
		frame.setJMenuBar(menuBar_1);
		updateMain();
		
		createMenuBar();
	}
	
	/**
	 * Updates the textures for the main game window.
	 */
	private void updateMain(){
		lblTime.setText("Time: "+run.getTime());
		lblDay.setText("Day: "+run.getCurrentDay());
		Player player = run.getCurrentPlayer();
		lblActionsRemaining.setText("Actions Remaining: "+run.getActionsRemaining());
		lblCurrentPlayerName.setText(player.getName());
		lblCash.setText(String.valueOf("$"+player.getMoney()));
		ArrayList<Pet> pets = player.getPets();
		int numPets = pets.size();
		switch(numPets){
		case 0:
			pnlPet1.setVisible(false);
		case 1: 
			pnlPet2.setVisible(false);
		case 2:
			pnlPet3.setVisible(false);
			break;
		}
		switch(numPets){
		case 3:
			pnlPet3.setVisible(true);
			lblPet3Name.setText(pets.get(2).getName());
			lblPet3Img.setIcon(getPetImg(pets.get(2).getSpecies(), true));
			lblPet3Stats.setText(pets.get(2).getStats());
			lblPet3Stats.setVisible(true);
		case 2:
			pnlPet2.setVisible(true);
			lblPet2Name.setText(pets.get(1).getName());
			lblPet2Img.setIcon(getPetImg(pets.get(1).getSpecies(), true));
			lblPet2Stats.setText(pets.get(1).getStats());
			lblPet2Stats.setVisible(true);
		case 1:
			lblPet1Name.setText(pets.get(0).getName());
			lblPet1Img.setIcon(getPetImg(pets.get(0).getSpecies(), true));
			lblPet1Stats.setText(pets.get(0).getStats());
			lblPet1Stats.setVisible(true);
			break;
		}
		ArrayList<Pet> deadPets = player.getDeadPets();
		int numDeadPets = deadPets.size();
		switch(numDeadPets){
		case 3:
			pnlPet1.setVisible(true);
			lblPet1Name.setText(deadPets.get(2).getName());
			lblPet1Img.setIcon(getPetImg(deadPets.get(2).getSpecies(), false));
			lblPet1Stats.setVisible(false);
		case 2:
			pnlPet2.setVisible(true);
			lblPet2Name.setText(deadPets.get(1).getName());
			lblPet2Img.setIcon(getPetImg(deadPets.get(1).getSpecies(), false));
			lblPet2Stats.setVisible(false);;
		case 1:
			pnlPet3.setVisible(true);
			lblPet3Name.setText(deadPets.get(0).getName());
			lblPet3Img.setIcon(getPetImg(deadPets.get(0).getSpecies(), false));
			lblPet3Stats.setVisible(false);;
			break;
		}
		lblAllFood.setText(player.getStringFoodInv());
		lblAllToys.setText(player.getStringToyInv());
		btnSelectPet1.setVisible(false);
		btnSelectPet2.setVisible(false);
		btnSelectPet3.setVisible(false);
		btnCancelAction.setVisible(false);
		pnlMain.revalidate();
		pnlMain.repaint();
		if (run.getGameOver()){
			frame.getContentPane().removeAll();
			gameOverGUI();
		}
	}
	
	/**
	 * Shows the select pet buttons for an action.
	 */
	private void showSelectButtons(){
		int numPets = run.getCurrentPlayer().getPets().size();
		btnCancelAction.setVisible(true);
		switch(numPets){
		case 3:
			btnSelectPet3.setVisible(true);
		case 2:
			btnSelectPet2.setVisible(true);
		case 1:
			btnSelectPet1.setVisible(true);
			break;
		}
	}
	
	/**
	 * Processes a command chosen.
	 */
	private void doCommand(int index){
		Player player = run.getCurrentPlayer();
		Pet pet = player.getPets().get(index);
		boolean success;
		switch(command){
		case "toilet":
			success = pet.goToilet();
			if (!success){
				JOptionPane.showMessageDialog(null, pet.getName() + " could not go to the toilet.");
			}
			break;
		case "sleep":
			success = pet.goToSleep();
			if (!success){
				JOptionPane.showMessageDialog(null, pet.getName() + " could not go to sleep. They are not tired.");
			}
			break;
		case "play":
			ArrayList<Boolean> chosenToy = getAllToy();
			useChosenToy(chosenToy, pet);
			break;
		case "feed":
			ArrayList<Boolean> chosenFood = getAllFood();
			useChosenFood(chosenFood, pet);
			break;
		}
		String event = run.useAction();
		if (!(event == null)){
			JOptionPane.showMessageDialog(null, event);
		}
		command = null;
		updateMain();
	}
	
	/**
	 * Uses the chosen food by the player on the chosen pet.
	 * @param chosen The items chosen to use.
	 * @param pet The pet chosen to feed.
	 */
	private void useChosenFood(ArrayList<Boolean> chosen, Pet pet){
		ArrayList<Food> allFood = run.getCurrentPlayer().getFoodInv();
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		int count = 0;
		while (count < allFood.size()){
			if (chosen.get(count)){
				run.eatFood(allFood.get(count), pet);
				indexes.add(count);
			}
			count = count + 1;
		}
		count = 0;
		while (count < indexes.size()){
			run.getCurrentPlayer().removeFood(allFood.get(indexes.get(count)));
			count = count + 1;
		}
	}

	/**
	 * Uses the chosen toys by the player on the chosen pet.
	 * @param chosen The items chosen to use.
	 * @param pet The pet chosen to play with.
	 */
	private void useChosenToy(ArrayList<Boolean> chosen, Pet pet){
		ArrayList<Toy> allToy = run.getCurrentPlayer().getToyInv();
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		int count = 0;
		boolean broke = false;
		while (count < allToy.size()){
			if (chosen.get(count)){
				broke = run.useToy(allToy.get(count), pet);
				if (broke){
					indexes.add(count);
					JOptionPane.showMessageDialog(null, allToy.get(count).getName() + " broke.");
					}
			}
			count = count + 1;
		}
		count = 0;
		while (count < indexes.size()){
			run.getCurrentPlayer().removeToy(allToy.get(indexes.get(count)));
			count = count + 1;
		}
	}
	
	/**
	 * Gets what food the player wants to feed to their pet.
	 * @return An ArrayList of the indexes of items the player wants to use.
	 */
	private ArrayList<Boolean> getAllFood(){
		ArrayList<JCheckBox> allFoodTick = new ArrayList<JCheckBox>();
		ArrayList<Food> allFood = run.getCurrentPlayer().getFoodInv();
		ArrayList<Boolean> selected = new ArrayList<Boolean>();
		int foodCount = 0;
		while (foodCount < allFood.size()){
			selected.add(false);
			allFoodTick.add(new JCheckBox(allFood.get(foodCount).getName(), selected.get(foodCount)));
			foodCount = foodCount + 1;
		}
		if (foodCount == 0){
			JOptionPane.showMessageDialog(null, "You have no food.");
		}
		else{
			JOptionPane.showMessageDialog(null, allFoodTick.toArray(new JCheckBox[0]), "What food would you like to use?", 3);
		}
		int count = 0;
		while (count < selected.size()){
			selected.set(count, allFoodTick.get(count).isSelected());
			count = count + 1;
		}
		return selected;
	}
	
	/**
	 * Gets what toys the player wants to use to play with their pet.
	 * @return An ArrayList of the indexes of items the player wants to use.
	 */
	private ArrayList<Boolean> getAllToy(){
		ArrayList<JCheckBox> allToyTick = new ArrayList<JCheckBox>();
		ArrayList<Toy> allToy = run.getCurrentPlayer().getToyInv();
		ArrayList<Boolean> selected = new ArrayList<Boolean>();
		int foodCount = 0;
		while (foodCount < allToy.size()){
			selected.add(false);
			allToyTick.add(new JCheckBox(allToy.get(foodCount).getName(), selected.get(foodCount)));
			foodCount = foodCount + 1;
		}
		if (foodCount == 0){
			JOptionPane.showMessageDialog(null, "You have no toys.");
		}
		else{
			JOptionPane.showMessageDialog(null, allToyTick.toArray(new JCheckBox[0]), "What toys would you like to use?", 3);
		}
		int count = 0;
		while (count < selected.size()){
			selected.set(count, allToyTick.get(count).isSelected());
			count = count + 1;
		}
		return selected;
	}
	
	/**
	 * Gets the image for the pet based off its species and if it is alive.
	 * @param species The species of the pet.
	 * @param isAlive Boolean if the pet is alive.
	 * @return ImageIcon of the pets picture.
	 */
	private Icon getPetImg(String species, boolean isAlive){
		Image img = new ImageIcon(this.getClass().getResource("/error.png")).getImage();
		if (isAlive){
			switch(species){
			case "Cat":
				img = new ImageIcon(this.getClass().getResource("/cat.png")).getImage();
				break;
			case "Dog":
				img = new ImageIcon(this.getClass().getResource("/dog.png")).getImage();
				break;
			case "Rabbit":
				img = new ImageIcon(this.getClass().getResource("/rabbit.png")).getImage();
				break;
			case "Elephant":
				img = new ImageIcon(this.getClass().getResource("/elephant.png")).getImage();
				break;	
			case "Bird":
				img = new ImageIcon(this.getClass().getResource("/bird.png")).getImage();
				break;
			case "Mouse":
				img = new ImageIcon(this.getClass().getResource("/mouse.png")).getImage();
				break;
			case "Human":
				img = new ImageIcon(this.getClass().getResource("/human.png")).getImage();
				break;	
			}
		}
		else{
			switch(species){
			case "Cat":
				img = new ImageIcon(this.getClass().getResource("/deadcat.png")).getImage();
				break;
			case "Dog":
				img = new ImageIcon(this.getClass().getResource("/deaddog.png")).getImage();
				break;
			case "Rabbit":
				img = new ImageIcon(this.getClass().getResource("/deadrabbit.png")).getImage();
				break;
			case "Elephant":
				img = new ImageIcon(this.getClass().getResource("/deadelephant.png")).getImage();
				break;	
			case "Bird":
				img = new ImageIcon(this.getClass().getResource("/deadbird.png")).getImage();
				break;
			case "Mouse":
				img = new ImageIcon(this.getClass().getResource("/deadmouse.png")).getImage();
				break;
			case "Human":
				img = new ImageIcon(this.getClass().getResource("/deadhuman.png")).getImage();
				break;	
			}
		}
		return (Icon) new ImageIcon(img);
	}
	
	/**
	 * Creates the textures for the game introduction.
	 */
	private void intro(){
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout(""));
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, "cell 0 0,alignx left");
		
		JButton button = new JButton("");
		Image img = new ImageIcon(this.getClass().getResource("/vertpet-intro3.png")).getImage();
		button.setIcon((Icon) new ImageIcon(img));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().remove(layeredPane);
				initialize();
			}
		});
		layeredPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		layeredPane.add(button);
	}
	
	/**
	 * Creates the textures for setting up the game.
	 */
	private void initialize() {
		txtGameLength.setColumns(10);
		frame.getContentPane().add(pnlAddPlayers, "cell 0 0,grow");
		pnlAddPlayers.setLayout(new MigLayout("", "[][][][][][][][][][][]", "[][][]"));
		
		JPanel panel_5 = new JPanel();
		pnlAddPlayers.add(panel_5, "cell 1 0 9 1");
		panel_5.setLayout(new MigLayout("", "[][][][][][][][grow][][][][][][grow]", "[][][]"));
		
		JLabel lblPlayers = new JLabel("How Many Players?");
		panel_5.add(lblPlayers, "cell 0 1");
		
		JButton btnReady = new JButton("Ready");
		btnReady.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean error = false;
				try{
					String[] names = {txtPlayerName.getText(), txtPlayer2Name.getText(),
							txtPlayer3Name.getText(), txtPlayer4Name.getText(), txtPlayer5Name.getText()};
					run.createPlayers(names);
					ArrayList<Player> players = run.getPlayers();
					int playerCount = 0;
					while (playerCount < run.getNumPlayers()){
						Player player = players.get(playerCount);
						int numPets = numPlayersPets[playerCount];
						String species = "";
						String name = "";
						int petCount = 0;
						switch(numPets){
						case 3:
							if (playerCount == 0){
								species = cmbP1Pet3Species.getSelectedItem().toString();
								name = txtP1Pet3Name.getText();}
							else if (playerCount == 1){
								species = cmbP2Pet3Species.getSelectedItem().toString();
								name = txtP2Pet3Name.getText();}
							else if (playerCount == 2){
								species = cmbP3Pet3Species.getSelectedItem().toString();
								name = txtP3Pet3Name.getText();}
							else if (playerCount == 3){
								species = cmbP4Pet3Species.getSelectedItem().toString();
								name = txtP4Pet3Name.getText();}
							else if (playerCount == 4){
								species = cmbP5Pet3Species.getSelectedItem().toString();
								name = txtP5Pet3Name.getText();}
							if (name.equals("")){
								JOptionPane.showMessageDialog(null, player.getName()+" your pet cannot have a blank name.");
								error = true;
							}
							else{player.addPet(species, name);}
						case 2:
							if (playerCount == 0){
								species = cmbP1Pet2Species.getSelectedItem().toString();
								name = txtP1Pet2Name.getText();}
							else if (playerCount == 1){
								species = cmbP2Pet2Species.getSelectedItem().toString();
								name = txtP2Pet2Name.getText();}
							else if (playerCount == 2){
								species = cmbP3Pet2Species.getSelectedItem().toString();
								name = txtP3Pet2Name.getText();}
							else if (playerCount == 3){
								species = cmbP4Pet2Species.getSelectedItem().toString();
								name = txtP4Pet2Name.getText();}
							else if (playerCount == 4){
								species = cmbP5Pet2Species.getSelectedItem().toString();
								name = txtP5Pet2Name.getText();}
							petCount = 0;
							while (petCount < player.getPets().size()){
								if (name.equals(player.getPets().get(petCount).getName())){
									JOptionPane.showMessageDialog(null, player.getName()+" you cannot have two pets with the same name.");
									error = true;
								}
								petCount = petCount + 1;
							}
							if (name.equals("")){
								JOptionPane.showMessageDialog(null, player.getName()+" your pet cannot have a blank name.");
								error = true;
							}
							else{player.addPet(species, name);}
						case 1:
							if (playerCount == 0){
								species = cmbP1Pet1Species.getSelectedItem().toString();
								name = txtP1Pet1Name.getText();}
							else if (playerCount == 1){
								species = cmbP2Pet1Species.getSelectedItem().toString();
								name = txtP2Pet1Name.getText();}
							else if (playerCount == 2){
								species = cmbP3Pet1Species.getSelectedItem().toString();
								name = txtP3Pet1Name.getText();}
							else if (playerCount == 3){
								species = cmbP4Pet1Species.getSelectedItem().toString();
								name = txtP4Pet1Name.getText();}
							else if (playerCount == 4){
								species = cmbP5Pet1Species.getSelectedItem().toString();
								name = txtP5Pet1Name.getText();}
							petCount = 0;
							while (petCount < player.getPets().size()){
								if (name.equals(player.getPets().get(petCount).getName())){
									JOptionPane.showMessageDialog(null, player.getName()+" you cannot have two pets with the same name.");
									error = true;
								}
								petCount = petCount + 1;
							}
							if (name.equals("")){
								JOptionPane.showMessageDialog(null, player.getName()+" your pet cannot have a blank name.");
								error = true;
							}
							else{player.addPet(species, name);}
							break;
						}
						playerCount = playerCount + 1;
					}
					try{
						int days = Integer.parseInt(txtGameLength.getText());
						run.setGameLength(days);
					}
					catch (NullPointerException exc){
						JOptionPane.showMessageDialog(null, "Please enter a number of days to play for.");
						error = true;
					}
					catch (NumberFormatException exc){
						JOptionPane.showMessageDialog(null, "Please enter a valid number for game length.");
						error = true;
					}
					}
				catch (NullPointerException exc){
					JOptionPane.showMessageDialog(null, "Each player must have a name.");
					error = true;
				}
				if (error){
					int playerCount = 0;
					while (playerCount < run.getNumPlayers()){
						run.getPlayers().get(playerCount).clearPets();
						playerCount = playerCount + 1;
					}
					run.clearPlayers();
				}
				else{
					frame.getContentPane().remove(pnlAddPlayers);
					mainGame();
				}
			}
		});
		
		JComboBox<String> cmbNumPlayers = new JComboBox<String>();
		cmbNumPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numPlayers = Integer.parseInt(cmbNumPlayers.getSelectedItem().toString());
				run.setNumPlayers(numPlayers);
				switch(numPlayers){
				case 1 :
					pnlP2.setVisible(false);
				case 2 :
					pnlP3.setVisible(false);
				case 3 :
					pnlP4.setVisible(false);
				case 4 :
					pnlP5.setVisible(false);
					break;
				}
				switch(numPlayers){
				case 5 :
					pnlP5.setVisible(true);
				case 4 :
					pnlP4.setVisible(true);
				case 3 :
					pnlP3.setVisible(true);
				case 2 :
					pnlP2.setVisible(true);
					break;
				}
			}
		});
		cmbNumPlayers.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5"}));
		cmbNumPlayers.setSelectedIndex(4);
		panel_5.add(cmbNumPlayers, "cell 1 1,growx");
		
		panel_5.add(lblGameLengthdays, "cell 6 1");
		
		panel_5.add(txtGameLength, "cell 7 1,growx");
		panel_5.add(btnReady, "cell 12 1");
		pnlAddPlayers.add(pnlP1, "cell 1 2");
		pnlP1.setLayout(new MigLayout("", "[grow]", "[][][][][grow][][grow][][grow]"));
		
		JLabel lblPlayer = new JLabel("Player 1");
		pnlP1.add(lblPlayer, "cell 0 0");
		
		txtPlayerName = new JTextField();
		pnlP1.add(txtPlayerName, "cell 0 1");
		txtPlayerName.setText("Name");
		txtPlayerName.setColumns(10);
		
		JComboBox<String> cmbP1NumPets = new JComboBox<String>();
		cmbP1NumPets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numPets = Integer.parseInt(cmbP1NumPets.getSelectedItem().toString().substring(0, 1));
				numPlayersPets[0] = numPets;
				switch(numPets){
				case 1 :
					pnlP1Pet2.setVisible(false);
				case 2 :
					pnlP1Pet3.setVisible(false);
					break;
				}
				switch(numPets){
				case 3 :
					pnlP1Pet3.setVisible(true);
				case 2 :
					pnlP1Pet2.setVisible(true);
					break;
				}
			}
		});
		pnlP1.add(cmbP1NumPets, "cell 0 2,growx");
		cmbP1NumPets.setModel(new DefaultComboBoxModel<String>(new String[] {"1 Pet", "2 Pets", "3 Pets"}));
		cmbP1NumPets.setSelectedIndex(2);
		
		pnlP1.add(pnlP1Pet1, "cell 0 4,grow");
		pnlP1Pet1.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel lblPet = new JLabel("Pet 1");
		pnlP1Pet1.add(lblPet, "cell 0 0");
		
		txtP1Pet1Name = new JTextField();
		pnlP1Pet1.add(txtP1Pet1Name, "cell 0 1");
		txtP1Pet1Name.setText("Pet Name");
		txtP1Pet1Name.setColumns(10);
		
		pnlP1Pet1.add(cmbP1Pet1Species, "cell 0 2,growx");
		cmbP1Pet1Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		
		pnlP1.add(pnlP1Pet2, "cell 0 6,grow");
		pnlP1Pet2.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel lblPet_1 = new JLabel("Pet 2");
		pnlP1Pet2.add(lblPet_1, "cell 0 0");
		
		txtP1Pet2Name = new JTextField();
		pnlP1Pet2.add(txtP1Pet2Name, "cell 0 1");
		txtP1Pet2Name.setText("Pet Name");
		txtP1Pet2Name.setColumns(10);
		
		pnlP1Pet2.add(cmbP1Pet2Species, "cell 0 2,growx");
		cmbP1Pet2Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		
		pnlP1.add(pnlP1Pet3, "cell 0 8,grow");
		pnlP1Pet3.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel lblPet_3 = new JLabel("Pet 3");
		pnlP1Pet3.add(lblPet_3, "cell 0 0");
		
		txtP1Pet3Name = new JTextField();
		pnlP1Pet3.add(txtP1Pet3Name, "cell 0 1");
		txtP1Pet3Name.setText("Pet Name");
		txtP1Pet3Name.setColumns(10);
		
		pnlP1Pet3.add(cmbP1Pet3Species, "cell 0 2,growx");
		cmbP1Pet3Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		pnlAddPlayers.add(pnlP2, "cell 3 2");
		pnlP2.setLayout(new MigLayout("", "[grow]", "[][][][][grow][][grow][][grow]"));
		
		JLabel lblPlayer_1 = new JLabel("Player 2");
		pnlP2.add(lblPlayer_1, "cell 0 0");
		
		txtPlayer2Name = new JTextField();
		pnlP2.add(txtPlayer2Name, "cell 0 1");
		txtPlayer2Name.setText("Name");
		txtPlayer2Name.setColumns(10);
		
		JComboBox<String> cmbP2NumPets = new JComboBox<String>();
		cmbP2NumPets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numPets = Integer.parseInt(cmbP2NumPets.getSelectedItem().toString().substring(0, 1));
				numPlayersPets[1] = numPets;
				switch(numPets){
				case 1 :
					pnlP2Pet2.setVisible(false);
				case 2 :
					pnlP2Pet3.setVisible(false);
					break;
				}
				switch(numPets){
				case 3 :
					pnlP2Pet3.setVisible(true);
				case 2 :
					pnlP2Pet2.setVisible(true);
					break;
				}
			}
		});
		pnlP2.add(cmbP2NumPets, "cell 0 2,growx");
		cmbP2NumPets.setModel(new DefaultComboBoxModel<String>(new String[] {"1 Pet", "2 Pets", "3 Pets"}));
		cmbP2NumPets.setSelectedIndex(2);
		
		pnlP2.add(pnlP2Pet1, "cell 0 4,grow");
		pnlP2Pet1.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel label = new JLabel("Pet 1");
		pnlP2Pet1.add(label, "cell 0 0");
		
		txtP2Pet1Name = new JTextField();
		pnlP2Pet1.add(txtP2Pet1Name, "cell 0 1");
		txtP2Pet1Name.setText("Pet Name");
		txtP2Pet1Name.setColumns(10);
		
		pnlP2Pet1.add(cmbP2Pet1Species, "cell 0 2,growx");
		cmbP2Pet1Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		
		pnlP2.add(pnlP2Pet2, "cell 0 6,grow");
		pnlP2Pet2.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel label_4 = new JLabel("Pet 2");
		pnlP2Pet2.add(label_4, "cell 0 0");
		
		txtP2Pet2Name = new JTextField();
		pnlP2Pet2.add(txtP2Pet2Name, "cell 0 1");
		txtP2Pet2Name.setText("Pet Name");
		txtP2Pet2Name.setColumns(10);
		
		pnlP2Pet2.add(cmbP2Pet2Species, "cell 0 2,growx");
		cmbP2Pet2Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		
		pnlP2.add(pnlP2Pet3, "cell 0 8,grow");
		pnlP2Pet3.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel label_8 = new JLabel("Pet 3");
		pnlP2Pet3.add(label_8, "cell 0 0");
		
		txtP2Pet3Name = new JTextField();
		pnlP2Pet3.add(txtP2Pet3Name, "cell 0 1");
		txtP2Pet3Name.setText("Pet Name");
		txtP2Pet3Name.setColumns(10);
		
		pnlP2Pet3.add(cmbP2Pet3Species, "cell 0 2,growx");
		cmbP2Pet3Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		pnlAddPlayers.add(pnlP3, "cell 5 2");
		pnlP3.setLayout(new MigLayout("", "[grow]", "[][][][][grow][][grow][][grow]"));
		
		JLabel lblPlayer_2 = new JLabel("Player 3");
		pnlP3.add(lblPlayer_2, "cell 0 0");
		
		txtPlayer3Name = new JTextField();
		pnlP3.add(txtPlayer3Name, "cell 0 1");
		txtPlayer3Name.setText("Name");
		txtPlayer3Name.setColumns(10);
		
		JComboBox<String> cmbP3NumPets = new JComboBox<String>();
		cmbP3NumPets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numPets = Integer.parseInt(cmbP3NumPets.getSelectedItem().toString().substring(0, 1));
				numPlayersPets[2] = numPets;
				switch(numPets){
				case 1 :
					pnlP3Pet2.setVisible(false);
				case 2 :
					pnlP3Pet3.setVisible(false);
					break;
				}
				switch(numPets){
				case 3 :
					pnlP3Pet3.setVisible(true);
				case 2 :
					pnlP3Pet2.setVisible(true);
					break;
				}
			}
		});
		pnlP3.add(cmbP3NumPets, "cell 0 2,growx");
		cmbP3NumPets.setModel(new DefaultComboBoxModel<String>(new String[] {"1 Pet", "2 Pets", "3 Pets"}));
		cmbP3NumPets.setSelectedIndex(2);
		
		pnlP3.add(pnlP3Pet1, "cell 0 4,grow");
		pnlP3Pet1.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel label_1 = new JLabel("Pet 1");
		pnlP3Pet1.add(label_1, "flowy,cell 0 0");
		
		txtP3Pet1Name = new JTextField();
		pnlP3Pet1.add(txtP3Pet1Name, "flowy,cell 0 1");
		txtP3Pet1Name.setText("Pet Name");
		txtP3Pet1Name.setColumns(10);
		
		pnlP3Pet1.add(cmbP3Pet1Species, "cell 0 2,growx");
		cmbP3Pet1Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		
		pnlP3.add(pnlP3Pet2, "cell 0 6,grow");
		pnlP3Pet2.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel label_5 = new JLabel("Pet 2");
		pnlP3Pet2.add(label_5, "cell 0 0");
		
		txtP3Pet2Name = new JTextField();
		pnlP3Pet2.add(txtP3Pet2Name, "cell 0 1");
		txtP3Pet2Name.setText("Pet Name");
		txtP3Pet2Name.setColumns(10);
		
		pnlP3Pet2.add(cmbP3Pet2Species, "cell 0 2,growx");
		cmbP3Pet2Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		
		pnlP3.add(pnlP3Pet3, "cell 0 8,grow");
		pnlP3Pet3.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel label_9 = new JLabel("Pet 3");
		pnlP3Pet3.add(label_9, "cell 0 0");
		
		txtP3Pet3Name = new JTextField();
		pnlP3Pet3.add(txtP3Pet3Name, "cell 0 1");
		txtP3Pet3Name.setText("Pet Name");
		txtP3Pet3Name.setColumns(10);
		
		pnlP3Pet3.add(cmbP3Pet3Species, "cell 0 2,growx");
		cmbP3Pet3Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		pnlAddPlayers.add(pnlP4, "cell 7 2");
		pnlP4.setLayout(new MigLayout("", "[grow]", "[][][][][grow][][][grow][]"));
		
		JLabel lblPlayer_3 = new JLabel("Player 4");
		pnlP4.add(lblPlayer_3, "cell 0 0");
		
		txtPlayer4Name = new JTextField();
		pnlP4.add(txtPlayer4Name, "cell 0 1");
		txtPlayer4Name.setText("Name");
		txtPlayer4Name.setColumns(10);
		
		JComboBox<String> cmbP4NumPets = new JComboBox<String>();
		cmbP4NumPets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numPets = Integer.parseInt(cmbP4NumPets.getSelectedItem().toString().substring(0, 1));
				numPlayersPets[3] = numPets;
				switch(numPets){
				case 1 :
					pnlP4Pet2.setVisible(false);
				case 2 :
					pnlP4Pet3.setVisible(false);
					break;
				}
				switch(numPets){
				case 3 :
					pnlP4Pet3.setVisible(true);
				case 2 :
					pnlP4Pet2.setVisible(true);
					break;
				}
			}
		});
		pnlP4.add(cmbP4NumPets, "cell 0 2,growx");
		cmbP4NumPets.setModel(new DefaultComboBoxModel<String>(new String[] {"1 Pet", "2 Pets", "3 Pets"}));
		cmbP4NumPets.setSelectedIndex(2);
		
		pnlP4.add(pnlP4Pet1, "cell 0 4,grow");
		pnlP4Pet1.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel label_2 = new JLabel("Pet 1");
		pnlP4Pet1.add(label_2, "cell 0 0");
		
		txtP4Pet1Name = new JTextField();
		pnlP4Pet1.add(txtP4Pet1Name, "cell 0 1");
		txtP4Pet1Name.setText("Pet Name");
		txtP4Pet1Name.setColumns(10);
		
		pnlP4Pet1.add(cmbP4Pet1Species, "cell 0 2,growx");
		cmbP4Pet1Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		
		pnlP4.add(pnlP4Pet2, "cell 0 6,grow");
		pnlP4Pet2.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel label_6 = new JLabel("Pet 2");
		pnlP4Pet2.add(label_6, "cell 0 0");
		
		txtP4Pet2Name = new JTextField();
		pnlP4Pet2.add(txtP4Pet2Name, "cell 0 1");
		txtP4Pet2Name.setText("Pet Name");
		txtP4Pet2Name.setColumns(10);
		
		pnlP4Pet2.add(cmbP4Pet2Species, "cell 0 2,growx");
		cmbP4Pet2Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		
		pnlP4.add(pnlP4Pet3, "cell 0 8,grow");
		pnlP4Pet3.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel label_10 = new JLabel("Pet 3");
		pnlP4Pet3.add(label_10, "cell 0 0");
		
		txtP4Pet3Name = new JTextField();
		pnlP4Pet3.add(txtP4Pet3Name, "cell 0 1");
		txtP4Pet3Name.setText("Pet Name");
		txtP4Pet3Name.setColumns(10);
		
		pnlP4Pet3.add(cmbP4Pet3Species, "cell 0 2,growx");
		cmbP4Pet3Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		pnlAddPlayers.add(pnlP5, "cell 9 2");
		pnlP5.setLayout(new MigLayout("", "[grow]", "[][][][][grow][][grow][][grow]"));
		
		JLabel lblPlayer_4 = new JLabel("Player 5");
		pnlP5.add(lblPlayer_4, "cell 0 0");
		
		txtPlayer5Name = new JTextField();
		pnlP5.add(txtPlayer5Name, "cell 0 1");
		txtPlayer5Name.setText("Name");
		txtPlayer5Name.setColumns(10);
		
		JComboBox<String> cmbP5NumPets = new JComboBox<String>();
		cmbP5NumPets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numPets = Integer.parseInt(cmbP5NumPets.getSelectedItem().toString().substring(0, 1));
				numPlayersPets[4] = numPets;
				switch(numPets){
				case 1 :
					pnlP5Pet2.setVisible(false);
				case 2 :
					pnlP5Pet3.setVisible(false);
					break;
				}
				switch(numPets){
				case 3 :
					pnlP5Pet3.setVisible(true);
				case 2 :
					pnlP5Pet2.setVisible(true);
					break;
				}
			}
		});
		pnlP5.add(cmbP5NumPets, "cell 0 2,growx");
		cmbP5NumPets.setModel(new DefaultComboBoxModel<String>(new String[] {"1 Pet", "2 Pets", "3 Pets"}));
		cmbP5NumPets.setSelectedIndex(2);
		
		pnlP5.add(pnlP5Pet1, "cell 0 4,grow");
		pnlP5Pet1.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel label_3 = new JLabel("Pet 1");
		pnlP5Pet1.add(label_3, "cell 0 0");
		
		txtP5Pet1Name = new JTextField();
		pnlP5Pet1.add(txtP5Pet1Name, "cell 0 1");
		txtP5Pet1Name.setText("Pet Name");
		txtP5Pet1Name.setColumns(10);
		
		pnlP5Pet1.add(cmbP5Pet1Species, "cell 0 2,growx");
		cmbP5Pet1Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		
		pnlP5.add(pnlP5Pet2, "cell 0 6,grow");
		pnlP5Pet2.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel label_7 = new JLabel("Pet 2");
		pnlP5Pet2.add(label_7, "cell 0 0");
		
		txtP5Pet2Name = new JTextField();
		pnlP5Pet2.add(txtP5Pet2Name, "cell 0 1");
		txtP5Pet2Name.setText("Pet Name");
		txtP5Pet2Name.setColumns(10);
		
		pnlP5Pet2.add(cmbP5Pet2Species, "cell 0 2,growx");
		cmbP5Pet2Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		
		pnlP5.add(pnlP5Pet3, "cell 0 8,grow");
		pnlP5Pet3.setLayout(new MigLayout("", "[]", "[][][]"));
		
		JLabel label_11 = new JLabel("Pet 3");
		pnlP5Pet3.add(label_11, "cell 0 0");
		
		txtP5Pet3Name = new JTextField();
		pnlP5Pet3.add(txtP5Pet3Name, "cell 0 1");
		txtP5Pet3Name.setText("Pet Name");
		txtP5Pet3Name.setColumns(10);
		
		pnlP5Pet3.add(cmbP5Pet3Species, "cell 0 2,growx");
		cmbP5Pet3Species.setModel(new DefaultComboBoxModel<String>(new String[] {"Cat", "Dog", "Elephant", "Human", "Mouse", "Rabbit"}));
		
		createMenuBar();
	}
	
	/**
	 * Creates the menu bar for the program.
	 */
	private void createMenuBar(){
		JMenuBar menuBar_1 = new JMenuBar();
		frame.setJMenuBar(menuBar_1);
		
		JMenu mnFile = new JMenu("File");
		menuBar_1.add(mnFile);
		
		JMenuItem mntmEndGame = new JMenuItem("End Game");
		mntmEndGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				run.setEndGame();
			}
		});
		mnFile.add(mntmEndGame);
		
		JMenu mnHelp_1 = new JMenu("Help");
		menuBar_1.add(mnHelp_1);
		
		JMenu mnPets_1 = new JMenu("Pets");
		mnHelp_1.add(mnPets_1);
		
		JMenuItem mntmGeneralPet = new JMenuItem("General");
		mntmGeneralPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoPets("general");
			}
		});
		mnPets_1.add(mntmGeneralPet);
		
		JMenuItem mntmCat = new JMenuItem("Cat");
		mntmCat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoPets("cat");
			}
		});
		mnPets_1.add(mntmCat);
		
		JMenuItem mntmDog = new JMenuItem("Dog");
		mntmDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoPets("dog");
			}
		});
		mnPets_1.add(mntmDog);
		
		JMenuItem mntmElephant = new JMenuItem("Elephant");
		mntmElephant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoPets("elephant");
			}
		});
		mnPets_1.add(mntmElephant);
		
		JMenuItem mntmHuman = new JMenuItem("Human");
		mntmHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoPets("human");
			}
		});
		mnPets_1.add(mntmHuman);
		
		JMenuItem mntmMouse = new JMenuItem("Mouse");
		mntmMouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoPets("mouse");
			}
		});
		mnPets_1.add(mntmMouse);
		
		JMenuItem mntmRabbit = new JMenuItem("Rabbit");
		mntmRabbit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoPets("rabbit");
			}
		});
		mnPets_1.add(mntmRabbit);
		
		JMenu mnFood = new JMenu("Food");
		mnHelp_1.add(mnFood);
		
		JMenuItem mntmGeneralFood = new JMenuItem("General");
		mntmGeneralFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("general");
			}
		});
		mnFood.add(mntmGeneralFood);
		
		JMenuItem mntmAlcohol = new JMenuItem("Alcohol");
		mntmAlcohol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("alcohol");
			}
		});
		mnFood.add(mntmAlcohol);
		
		JMenuItem mntmBerries = new JMenuItem("Berries");
		mntmBerries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("berries");
			}
		});
		mnFood.add(mntmBerries);
		
		JMenuItem mntmCarrots = new JMenuItem("Carrots");
		mntmCarrots.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("carrot");
			}
		});
		mnFood.add(mntmCarrots);
		
		JMenuItem mntmChocolate = new JMenuItem("Chocolate");
		mntmChocolate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("chocolate");
			}
		});
		mnFood.add(mntmChocolate);
		
		JMenuItem mntmCookedMeat = new JMenuItem("Cooked Meat");
		mntmCookedMeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("cookedmeat");
			}
		});
		mnFood.add(mntmCookedMeat);
		
		JMenuItem mntmJuice = new JMenuItem("Juice");
		mntmJuice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("juice");
			}
		});
		mnFood.add(mntmJuice);
		
		JMenuItem mntmKibble = new JMenuItem("Kibble");
		mntmKibble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("kibble");
			}
		});
		mnFood.add(mntmKibble);
		
		JMenuItem mntmMedicine = new JMenuItem("Medicine");
		mntmMedicine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("medicine");
			}
		});
		mnFood.add(mntmMedicine);
		
		JMenuItem mntmMilk = new JMenuItem("Milk");
		mntmMilk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("milk");
			}
		});
		mnFood.add(mntmMilk);
		
		JMenuItem mntmPenuts = new JMenuItem("Penuts");
		mntmPenuts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("penuts");
			}
		});
		mnFood.add(mntmPenuts);
		
		JMenuItem mntmFreshMeat = new JMenuItem("Fresh Meat");
		mntmFreshMeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("freshmeat");
			}
		});
		mnFood.add(mntmFreshMeat);
		
		JMenuItem mntmSeeds = new JMenuItem("Seeds");
		mntmSeeds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("seed");
			}
		});
		mnFood.add(mntmSeeds);
		
		JMenuItem mntmWater = new JMenuItem("Water");
		mntmWater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFood("water");
			}
		});
		mnFood.add(mntmWater);
		
		JMenu mnToys = new JMenu("Toys");
		mnHelp_1.add(mnToys);
		
		JMenuItem mntmGeneralToy = new JMenuItem("General");
		mntmGeneralToy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoToys("general");
			}
		});
		mnToys.add(mntmGeneralToy);
		
		JMenuItem mntmBouncyBall = new JMenuItem("Bouncy Ball");
		mntmBouncyBall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoToys("bouncyball");
			}
		});
		mnToys.add(mntmBouncyBall);
		
		JMenuItem mntmFootball = new JMenuItem("Football");
		mntmFootball.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoToys("football");
			}
		});
		mnToys.add(mntmFootball);
		
		JMenuItem mntmLaser = new JMenuItem("Laser");
		mntmLaser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoToys("laser");
			}
		});
		mnToys.add(mntmLaser);
		
		JMenuItem mntmMirror = new JMenuItem("Mirror");
		mntmMirror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoToys("mirror");
			}
		});
		mnToys.add(mntmMirror);
		
		JMenuItem mntmRadio = new JMenuItem("Radio");
		mntmRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoToys("radio");
			}
		});
		mnToys.add(mntmRadio);
		
		JMenuItem mntmRunningWheel = new JMenuItem("Running Wheel");
		mntmRunningWheel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoToys("runningwheel");
			}
		});
		mnToys.add(mntmRunningWheel);
		
		JMenuItem mntmTv = new JMenuItem("TV");
		mntmTv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoToys("tv");
			}
		});
		mnToys.add(mntmTv);
		
		JMenuItem mntmScoring = new JMenuItem("Scoring");
		mntmScoring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, run.readScoring());
			}
		});
		mnHelp_1.add(mntmScoring);
		
		JMenuItem mntmAboutGame = new JMenuItem("About Game");
		mntmAboutGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel words = new JLabel(run.readAbout());
				JPanel about = new JPanel();
				about.add(words);
				JScrollPane scroll = new JScrollPane(about);
				scroll.setPreferredSize(new Dimension(1000, 300));
				JOptionPane.showMessageDialog(null, scroll);
			}
		});
		mnHelp_1.add(mntmAboutGame);
	}
	
	/**
	 * Loads the information for a pet of species, type.
	 * @param type The species of the pet
	 */
	private void infoPets(String type){
		String message = "";
		Pet pet = new Pet("");
		String species = "$"+type.substring(0,1).toUpperCase()+"$";
		if (type.equals("cat")){message = pet.readDescription(species);}
		else if (type.equals("dog")){message = pet.readDescription(species);}
		else if (type.equals("elephant")){message = pet.readDescription(species);}
		else if (type.equals("human")){message = pet.readDescription(species);}
		else if (type.equals("mouse")){message = pet.readDescription(species);}
		else if (type.equals("rabbit")){message = pet.readDescription(species);}
		else if (type.equals("general")){message = pet.readDescription(species);}
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Loads the information for a type of food.
	 * @param type The type of food.
	 */
	private void infoFood(String type){
		String message = "";
		Food food = new Food();
		String species = "$"+type.substring(0,1).toUpperCase()+"$";
		if (type.equals("alcohol")){message = food.readDescription(species);}
		else if (type.equals("berries")){message = food.readDescription(species);}
		else if (type.equals("carrot")){message = food.readDescription(species);}
		else if (type.equals("chocolate")){
			species = "$D$";
			message = food.readDescription(species);}
		else if (type.equals("cookedmeat")){
			species = "$E$";
			message = food.readDescription(species);}
		else if (type.equals("juice")){message = food.readDescription(species);}
		else if (type.equals("general")){message = food.readDescription(species);}
		else if (type.equals("kibble")){message = food.readDescription(species);}
		else if (type.equals("medicine")){message = food.readDescription(species);}
		else if (type.equals("milk")){
			species = "$N$";
			message = food.readDescription(species);}
		else if (type.equals("penuts")){message = food.readDescription(species);}
		else if (type.equals("rawmeat")){message = food.readDescription(species);}
		else if (type.equals("seed")){message = food.readDescription(species);}
		else if (type.equals("water")){message = food.readDescription(species);}
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Loads the information for a type of toy.
	 * @param type The type of toy.
	 */
	private void infoToys(String type){
		String message = "";
		Toy toy = new Toy();
		String species = "$"+type.substring(0,1).toUpperCase()+"$";
		if (type.equals("bouncyball")){message = toy.readDescription(species);}
		else if (type.equals("laser")){message = toy.readDescription(species);}
		else if (type.equals("mirror")){message = toy.readDescription(species);}
		else if (type.equals("radio")){message = toy.readDescription(species);}
		else if (type.equals("runningwheel")){
			species = "$W$";
			message = toy.readDescription(species);}
		else if (type.equals("tv")){message = toy.readDescription(species);}
		else if (type.equals("general")){message = toy.readDescription(species);}
		else if (type.equals("football")){message = toy.readDescription(species);}
		JOptionPane.showMessageDialog(null, message);
	}
}
