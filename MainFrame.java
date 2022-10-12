import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
public class MainFrame {
    public MainFrame(){
        JFrame system = new JFrame();

        system.setSize(1080,720);
        system.getContentPane().setLayout(null);
        system.setVisible(true);
        system.setVisible(true);
        system.setVisible(true);
        system.setVisible(true);
        system.setVisible(true);
        
        JSplitPane splitPane = new JSplitPane();
        splitPane.setBounds(10, 10, 1080, 720);
        system.getContentPane().add(splitPane);
        
        JPanel panel_1 = new JPanel();
        splitPane.setLeftComponent(panel_1);
        
        JLabel lblNewLabel = new JLabel("Chick-Fil-A Receipt System");
        panel_1.add(lblNewLabel);
        system.setVisible(true);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        splitPane.setRightComponent(tabbedPane);
        
        JPanel bkfst_panel = new JPanel();
        tabbedPane.addTab("Breakfast", null, bkfst_panel, null);
        
        JPanel meal_panel = new JPanel();
        tabbedPane.addTab("Meals", null, meal_panel, null);
        
        JButton meal_1 = new JButton("1");
        meal_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.out.println("meal 1");
        	}
        });
        meal_panel.add(meal_1);
        
        JButton meal_2 = new JButton("2");
        meal_panel.add(meal_2);
        
        JTabbedPane entree_panel = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.addTab("Entrees", null, entree_panel, null);
        
        JPanel entree1_panel = new JPanel();
        entree_panel.addTab("Chicken Sandwich", null, entree1_panel, null);
        GridBagLayout gbl_entree1_panel = new GridBagLayout();
        gbl_entree1_panel.columnWidths = new int[]{0, 0, 0, 0};
        gbl_entree1_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_entree1_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_entree1_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        entree1_panel.setLayout(gbl_entree1_panel);
        
        String[] breadChoices = {"White Bun (Buttered)", "Multigrain Brioche Bun", "Gluten Free Bun", "White Bun (Unbuttered)", "None"};
        String[] cheeseChoices = {"None", "American", "Colby Jack", "Pepper Jack"};
        String[] lettuceChoices = {"None", "Regular", "Extra"};
        String[] tomatoChoices = {"None", "Regular", "Extra"};
        String[] pickleChoices = {"None", "Regular", "Extra"};
        String[] baconChoices = {"None", "One Serving", "Extra"};
        String[] sauceChoices = {"None", "Ketchup", "Mustard", "Chick-Fil-A", "Polynesian", "Barbeque", "Honey Mustard", "Zesty Buffalo", "Sweet and Spicy Siracha", "Honey Roasted BBQ"};
        String[] dressingChoices = {"None", "Avocado Lime Ranch", "Garden Herb Ranch", "Zesty Apple Cider Vinaigrette", "Creamy Salsa", "Light Balsamic Vinaigrette", "Fat Free Honey Mustard", "Light Italian"};
        String[] jalapenoChoices = {"None", "One Serving", "Extra"};
        String[] nugCountChoices = {"8 ct", "12 ct"};
        String[] strCountChoices = {"3 ct", "4 ct"};
        
        JLabel breadLabel_3_1 = new JLabel("Bread");
        GridBagConstraints gbc_lbl_3_1_0 = new GridBagConstraints();
        gbc_lbl_3_1_0.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_0.gridx = 0;
        gbc_lbl_3_1_0.gridy = 0;
        entree1_panel.add(breadLabel_3_1, gbc_lbl_3_1_0);
        
        JComboBox breadComboBox_3_1 = new JComboBox(breadChoices);
        GridBagConstraints gbc_box_3_1_0 = new GridBagConstraints();
        gbc_box_3_1_0.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_0.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_0.gridx = 2;
        gbc_box_3_1_0.gridy = 0;
        entree1_panel.add(breadComboBox_3_1, gbc_box_3_1_0);
        
        JLabel cheeseLabel_3_1 = new JLabel("Cheese");
        GridBagConstraints gbc_lbl_3_1_1 = new GridBagConstraints();
        gbc_lbl_3_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_1.gridx = 0;
        gbc_lbl_3_1_1.gridy = 1;
        entree1_panel.add(cheeseLabel_3_1, gbc_lbl_3_1_1);
        
        JComboBox cheeseComboBox_3_1 = new JComboBox(cheeseChoices);
        GridBagConstraints gbc_box_3_1_1 = new GridBagConstraints();
        gbc_box_3_1_1.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_1.gridx = 2;
        gbc_box_3_1_1.gridy = 1;
        entree1_panel.add(cheeseComboBox_3_1, gbc_box_3_1_1);
        
        JLabel lettuceLabel_3_1 = new JLabel("Lettuce");
        GridBagConstraints gbc_lbl_3_1_2 = new GridBagConstraints();
        gbc_lbl_3_1_2.anchor = GridBagConstraints.BASELINE;
        gbc_lbl_3_1_2.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_2.gridx = 0;
        gbc_lbl_3_1_2.gridy = 2;
        entree1_panel.add(lettuceLabel_3_1, gbc_lbl_3_1_2);
        
        JComboBox lettuceComboBox_3_1 = new JComboBox(lettuceChoices);
        GridBagConstraints gbc_box_3_1_2 = new GridBagConstraints();
        gbc_box_3_1_2.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_2.gridx = 2;
        gbc_box_3_1_2.gridy = 2;
        entree1_panel.add(lettuceComboBox_3_1, gbc_box_3_1_2);
        
        JLabel tomatoLabel_3_1 = new JLabel("Tomato");
        GridBagConstraints gbc_lbl_3_1_3 = new GridBagConstraints();
        gbc_lbl_3_1_3.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_3.gridx = 0;
        gbc_lbl_3_1_3.gridy = 3;
        entree1_panel.add(tomatoLabel_3_1, gbc_lbl_3_1_3);
        
        JComboBox tomatoComboBox_3_1 = new JComboBox(tomatoChoices);
        GridBagConstraints gbc_box_3_1_3 = new GridBagConstraints();
        gbc_box_3_1_3.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_3.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_3.gridx = 2;
        gbc_box_3_1_3.gridy = 3;
        entree1_panel.add(tomatoComboBox_3_1, gbc_box_3_1_3);
        
        JLabel picklesLabel_3_1 = new JLabel("Pickles");
        GridBagConstraints gbc_lbl_3_1_4 = new GridBagConstraints();
        gbc_lbl_3_1_4.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_4.gridx = 0;
        gbc_lbl_3_1_4.gridy = 4;
        entree1_panel.add(picklesLabel_3_1, gbc_lbl_3_1_4);
        
        JComboBox picklesComboBox_3_1 = new JComboBox(pickleChoices);
        GridBagConstraints gbc_box_3_1_4 = new GridBagConstraints();
        gbc_box_3_1_4.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_4.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_4.gridx = 2;
        gbc_box_3_1_4.gridy = 4;
        entree1_panel.add(picklesComboBox_3_1, gbc_box_3_1_4);
        picklesComboBox_3_1.setSelectedItem("Regular");
        
        JLabel baconLabel_3_1 = new JLabel("Bacon");
        GridBagConstraints gbc_lbl_3_1_5 = new GridBagConstraints();
        gbc_lbl_3_1_5.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_5.gridx = 0;
        gbc_lbl_3_1_5.gridy = 5;
        entree1_panel.add(baconLabel_3_1, gbc_lbl_3_1_5);
        
        JComboBox baconComboBox_3_1 = new JComboBox(baconChoices);
        GridBagConstraints gbc_box_3_1_5 = new GridBagConstraints();
        gbc_box_3_1_5.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_5.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_5.gridx = 2;
        gbc_box_3_1_5.gridy = 5;
        entree1_panel.add(baconComboBox_3_1, gbc_box_3_1_5);
        
        JLabel sauce1Label_3_1 = new JLabel("Sauce Option 1");
        GridBagConstraints gbc_lbl_3_1_6 = new GridBagConstraints();
        gbc_lbl_3_1_6.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_6.gridx = 0;
        gbc_lbl_3_1_6.gridy = 6;
        entree1_panel.add(sauce1Label_3_1, gbc_lbl_3_1_6);
        
        JComboBox sauce1ComboBox_3_1 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_1_6 = new GridBagConstraints();
        gbc_box_3_1_6.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_6.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_6.gridx = 2;
        gbc_box_3_1_6.gridy = 6;
        entree1_panel.add(sauce1ComboBox_3_1, gbc_box_3_1_6);
        
        JLabel sauce2Label_3_1 = new JLabel("Sauce Option 2");
        GridBagConstraints gbc_lbl_3_1_7 = new GridBagConstraints();
        gbc_lbl_3_1_7.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_7.gridx = 0;
        gbc_lbl_3_1_7.gridy = 7;
        entree1_panel.add(sauce2Label_3_1, gbc_lbl_3_1_7);
        
        JComboBox sauce2ComboBox_3_1 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_1_7 = new GridBagConstraints();
        gbc_box_3_1_7.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_7.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_7.gridx = 2;
        gbc_box_3_1_7.gridy = 7;
        entree1_panel.add(sauce2ComboBox_3_1, gbc_box_3_1_7);
        
        JButton addButton_3_1 = new JButton("Add Chicken Sandwich!");
        addButton_3_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.out.println("Entree 1");
        		lblNewLabel.setText("Text should change upon click");
        	}
        });
        GridBagConstraints gbc_btn_3_1 = new GridBagConstraints();
        gbc_btn_3_1.gridx = 2;
        gbc_btn_3_1.gridy = 20;
        entree1_panel.add(addButton_3_1, gbc_btn_3_1);
        
        JPanel entree2_panel = new JPanel();
        entree_panel.addTab("Deluxe Sandwich", null, entree2_panel, null);
        GridBagLayout gbl_entree2_panel = new GridBagLayout();
        gbl_entree2_panel.columnWidths = new int[]{0, 0, 0, 0};
        gbl_entree2_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_entree2_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_entree2_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        entree2_panel.setLayout(gbl_entree2_panel);
        
        JLabel breadLabel_3_2 = new JLabel("Bread");
        GridBagConstraints gbc_lbl_3_2_0 = new GridBagConstraints();
        gbc_lbl_3_2_0.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_2_0.gridx = 0;
        gbc_lbl_3_2_0.gridy = 0;
        entree2_panel.add(breadLabel_3_2, gbc_lbl_3_2_0);

        JComboBox breadComboBox_3_2 = new JComboBox(breadChoices);  
        GridBagConstraints gbc_box_3_2_0 = new GridBagConstraints();
        gbc_box_3_2_0.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_2_0.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_2_0.gridx = 2;
        gbc_box_3_2_0.gridy = 0;
        entree2_panel.add(breadComboBox_3_2, gbc_box_3_2_0);

        JLabel cheeseLabel_3_2 = new JLabel("Cheese");
        GridBagConstraints gbc_lbl_3_2_1 = new GridBagConstraints();
        gbc_lbl_3_2_1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_2_1.gridx = 0;
        gbc_lbl_3_2_1.gridy = 1;
        entree2_panel.add(cheeseLabel_3_2, gbc_lbl_3_2_1);

        JComboBox cheeseComboBox_3_2 = new JComboBox(cheeseChoices);
        GridBagConstraints gbc_box_3_2_1 = new GridBagConstraints();
        gbc_box_3_2_1.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_2_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_2_1.gridx = 2;
        gbc_box_3_2_1.gridy = 1;
        entree2_panel.add(cheeseComboBox_3_2, gbc_box_3_2_1);
        cheeseComboBox_3_2.setSelectedItem("American");

        JLabel lettuceLabel_3_2 = new JLabel("Lettuce");
        GridBagConstraints gbc_lbl_3_2_2 = new GridBagConstraints();
        gbc_lbl_3_2_2.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_2_2.gridx = 0;
        gbc_lbl_3_2_2.gridy = 2;
        entree2_panel.add(lettuceLabel_3_2, gbc_lbl_3_2_2);

        JComboBox lettuceComboBox_3_2 = new JComboBox(lettuceChoices);
        GridBagConstraints gbc_box_3_2_2 = new GridBagConstraints();
        gbc_box_3_2_2.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_2_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_2_2.gridx = 2;
        gbc_box_3_2_2.gridy = 2;
        entree2_panel.add(lettuceComboBox_3_2, gbc_box_3_2_2);
        lettuceComboBox_3_2.setSelectedItem("Regular");

        JLabel tomatoLabel_3_2 = new JLabel("Tomato");
        GridBagConstraints gbc_lbl_3_2_3 = new GridBagConstraints();
        gbc_lbl_3_2_3.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_2_3.gridx = 0;
        gbc_lbl_3_2_3.gridy = 3;
        entree2_panel.add(tomatoLabel_3_2, gbc_lbl_3_2_3);

        JComboBox tomatoComboBox_3_2 = new JComboBox(tomatoChoices);
        GridBagConstraints gbc_box_3_2_3 = new GridBagConstraints();
        gbc_box_3_2_3.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_2_3.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_2_3.gridx = 2;
        gbc_box_3_2_3.gridy = 3;
        entree2_panel.add(tomatoComboBox_3_2, gbc_box_3_2_3);
        tomatoComboBox_3_2.setSelectedItem("Regular");

        JLabel picklesLabel_3_2 = new JLabel("Pickles");
        GridBagConstraints gbc_lbl_3_2_4 = new GridBagConstraints();
        gbc_lbl_3_2_4.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_2_4.gridx = 0;
        gbc_lbl_3_2_4.gridy = 4;
        entree2_panel.add(picklesLabel_3_2, gbc_lbl_3_2_4);

        JComboBox picklesComboBox_3_2 = new JComboBox(pickleChoices);
        GridBagConstraints gbc_box_3_2_4 = new GridBagConstraints();
        gbc_box_3_2_4.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_2_4.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_2_4.gridx = 2;
        gbc_box_3_2_4.gridy = 4;
        entree2_panel.add(picklesComboBox_3_2, gbc_box_3_2_4);
        picklesComboBox_3_2.setSelectedItem("Regular");

        JLabel baconLabel_3_2 = new JLabel("Bacon");
        GridBagConstraints gbc_lbl_3_2_5 = new GridBagConstraints();
        gbc_lbl_3_2_5.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_2_5.gridx = 0;
        gbc_lbl_3_2_5.gridy = 5;
        entree2_panel.add(baconLabel_3_2, gbc_lbl_3_2_5);

        JComboBox baconComboBox_3_2 = new JComboBox(baconChoices);
        GridBagConstraints gbc_box_3_2_5 = new GridBagConstraints();
        gbc_box_3_2_5.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_2_5.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_2_5.gridx = 2;
        gbc_box_3_2_5.gridy = 5;
        entree2_panel.add(baconComboBox_3_2, gbc_box_3_2_5);

        JLabel sauce1Label_3_2 = new JLabel("Sauce Option 1");
        GridBagConstraints gbc_lbl_3_2_6 = new GridBagConstraints();
        gbc_lbl_3_2_6.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_2_6.gridx = 0;
        gbc_lbl_3_2_6.gridy = 6;
        entree2_panel.add(sauce1Label_3_2, gbc_lbl_3_2_6);

        JComboBox sauce1ComboBox_3_2 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_2_6 = new GridBagConstraints();
        gbc_box_3_2_6.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_2_6.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_2_6.gridx = 2;
        gbc_box_3_2_6.gridy = 6;
        entree2_panel.add(sauce1ComboBox_3_2, gbc_box_3_2_6);

        JLabel sauce2Label_3_2 = new JLabel("Sauce Option 2");
        GridBagConstraints gbc_lbl_3_2_7 = new GridBagConstraints();
        gbc_lbl_3_2_7.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_2_7.gridx = 0;
        gbc_lbl_3_2_7.gridy = 7;
        entree2_panel.add(sauce2Label_3_2, gbc_lbl_3_2_7);

        JComboBox sauce2ComboBox_3_2 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_2_7 = new GridBagConstraints();
        gbc_box_3_2_7.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_2_7.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_2_7.gridx = 2;
        gbc_box_3_2_7.gridy = 7;
        entree2_panel.add(sauce2ComboBox_3_2, gbc_box_3_2_7);
        
        JButton addButton_3_2 = new JButton("Add Deluxe Sandwich!");
        addButton_3_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.out.println("Entree 2");
        	}
        });
        GridBagConstraints gbc_btn_3_2 = new GridBagConstraints();
        gbc_btn_3_2.gridx = 2;
        gbc_btn_3_2.gridy = 8;
        entree2_panel.add(addButton_3_2, gbc_btn_3_2);
        
        JPanel entree3_panel = new JPanel();
        entree_panel.addTab("Spicy Chicken Sandwich", null, entree3_panel, null);
        GridBagLayout gbl_entree3_panel = new GridBagLayout();
        gbl_entree3_panel.columnWidths = new int[] {0, 0, 0, 0};
        gbl_entree3_panel.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_entree3_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_entree3_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        entree3_panel.setLayout(gbl_entree3_panel);

        JLabel breadLabel_3_3 = new JLabel("Bread");
        GridBagConstraints gbc_lbl_3_3_0 = new GridBagConstraints();
        gbc_lbl_3_3_0.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_3_0.gridx = 0;
        gbc_lbl_3_3_0.gridy = 0;
        entree3_panel.add(breadLabel_3_3, gbc_lbl_3_3_0);

        JComboBox breadComboBox_3_3 = new JComboBox(breadChoices);
        GridBagConstraints gbc_box_3_3_0 = new GridBagConstraints();
        gbc_box_3_3_0.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_3_0.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_3_0.gridx = 2;
        gbc_box_3_3_0.gridy = 0;
        entree3_panel.add(breadComboBox_3_3, gbc_box_3_3_0);

        JLabel cheeseLabel_3_3 = new JLabel("Cheese");
        GridBagConstraints gbc_lbl_3_3_1 = new GridBagConstraints();
        gbc_lbl_3_3_1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_3_1.gridx = 0;
        gbc_lbl_3_3_1.gridy = 1;
        entree3_panel.add(cheeseLabel_3_3, gbc_lbl_3_3_1);

        JComboBox cheeseComboBox_3_3 = new JComboBox(cheeseChoices);
        GridBagConstraints gbc_box_3_3_1 = new GridBagConstraints();
        gbc_box_3_3_1.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_3_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_3_1.gridx = 2;
        gbc_box_3_3_1.gridy = 1;
        entree3_panel.add(cheeseComboBox_3_3, gbc_box_3_3_1);

        JLabel lettuceLabel_3_3 = new JLabel("Lettuce");
        GridBagConstraints gbc_lbl_3_3_2 = new GridBagConstraints();
        gbc_lbl_3_3_2.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_3_2.gridx = 0;
        gbc_lbl_3_3_2.gridy = 2;
        entree3_panel.add(lettuceLabel_3_3, gbc_lbl_3_3_2);

        JComboBox lettuceComboBox_3_3 = new JComboBox(lettuceChoices);
        GridBagConstraints gbc_box_3_3_2 = new GridBagConstraints();
        gbc_box_3_3_2.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_3_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_3_2.gridx = 2;
        gbc_box_3_3_2.gridy = 2;
        entree3_panel.add(lettuceComboBox_3_3, gbc_box_3_3_2);

        JLabel tomatoLabel_3_3 = new JLabel("Tomato");
        GridBagConstraints gbc_lbl_3_3_3 = new GridBagConstraints();
        gbc_lbl_3_3_3.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_3_3.gridx = 0;
        gbc_lbl_3_3_3.gridy = 3;
        entree3_panel.add(tomatoLabel_3_3, gbc_lbl_3_3_3);

        JComboBox tomatoComboBox_3_3 = new JComboBox(tomatoChoices);
        GridBagConstraints gbc_box_3_3_3 = new GridBagConstraints();
        gbc_box_3_3_3.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_3_3.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_3_3.gridx = 2;
        gbc_box_3_3_3.gridy = 3;
        entree3_panel.add(tomatoComboBox_3_3, gbc_box_3_3_3);

        JLabel picklesLabel_3_3 = new JLabel("Pickles");
        GridBagConstraints gbc_lbl_3_3_4 = new GridBagConstraints();
        gbc_lbl_3_3_4.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_3_4.gridx = 0;
        gbc_lbl_3_3_4.gridy = 4;
        entree3_panel.add(picklesLabel_3_3, gbc_lbl_3_3_4);

        JComboBox picklesComboBox_3_3 = new JComboBox(pickleChoices);
        GridBagConstraints gbc_box_3_3_4 = new GridBagConstraints();
        gbc_box_3_3_4.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_3_4.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_3_4.gridx = 2;
        gbc_box_3_3_4.gridy = 4;
        entree3_panel.add(picklesComboBox_3_3, gbc_box_3_3_4);
        picklesComboBox_3_3.setSelectedItem("Regular");

        JLabel baconLabel_3_3 = new JLabel("Bacon");
        GridBagConstraints gbc_lbl_3_3_5 = new GridBagConstraints();
        gbc_lbl_3_3_5.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_3_5.gridx = 0;
        gbc_lbl_3_3_5.gridy = 5;
        entree3_panel.add(baconLabel_3_3, gbc_lbl_3_3_5);

        JComboBox baconComboBox_3_3 = new JComboBox(baconChoices);
        GridBagConstraints gbc_box_3_3_5 = new GridBagConstraints();
        gbc_box_3_3_5.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_3_5.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_3_5.gridx = 2;
        gbc_box_3_3_5.gridy = 5;
        entree3_panel.add(baconComboBox_3_3, gbc_box_3_3_5);

        JLabel sauce1Label_3_3 = new JLabel("Sauce Option 1");
        GridBagConstraints gbc_lbl_3_3_6 = new GridBagConstraints();
        gbc_lbl_3_3_6.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_3_6.gridx = 0;
        gbc_lbl_3_3_6.gridy = 6;
        entree3_panel.add(sauce1Label_3_3, gbc_lbl_3_3_6);

        JComboBox sauce1ComboBox_3_3 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_3_6 = new GridBagConstraints();
        gbc_box_3_3_6.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_3_6.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_3_6.gridx = 2;
        gbc_box_3_3_6.gridy = 6;
        entree3_panel.add(sauce1ComboBox_3_3, gbc_box_3_3_6);

        JLabel sauce2Label_3_3 = new JLabel("Sauce Option 2");
        GridBagConstraints gbc_lbl_3_3_7 = new GridBagConstraints();
        gbc_lbl_3_3_7.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_3_7.gridx = 0;
        gbc_lbl_3_3_7.gridy = 7;
        entree3_panel.add(sauce2Label_3_3, gbc_lbl_3_3_7);

        JComboBox sauce2ComboBox_3_3 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_3_7 = new GridBagConstraints();
        gbc_box_3_3_7.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_3_7.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_3_7.gridx = 2;
        gbc_box_3_3_7.gridy = 7;
        entree3_panel.add(sauce2ComboBox_3_3, gbc_box_3_3_7);

        JButton addButton_3_3 = new JButton("Add Spicy Chicken Sandwich!");
        addButton_3_3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        System.out.println("Meal 3");
                }
        });
        GridBagConstraints gbc_btn_3_3 = new GridBagConstraints();
        gbc_btn_3_3.gridx = 2;
        gbc_btn_3_3.gridy = 8;
        entree3_panel.add(addButton_3_3, gbc_btn_3_3);
        
        JPanel entree4_panel = new JPanel();
        entree_panel.addTab("Spicy Deluxe Sandwich", null, entree4_panel, null);
        GridBagLayout gbl_entree4_panel = new GridBagLayout();
        gbl_entree4_panel.columnWidths = new int[]{0, 0, 0, 0};
        gbl_entree4_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_entree4_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_entree4_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        entree4_panel.setLayout(gbl_entree4_panel);

        JLabel breadLabel_3_4 = new JLabel("Bread");
        GridBagConstraints gbc_lbl_3_4_0 = new GridBagConstraints();
        gbc_lbl_3_4_0.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_4_0.gridx = 0;
        gbc_lbl_3_4_0.gridy = 0;
        entree4_panel.add(breadLabel_3_4, gbc_lbl_3_4_0);

        JComboBox breadComboBox_3_4 = new JComboBox(breadChoices);
        GridBagConstraints gbc_box_3_4_0 = new GridBagConstraints();
        gbc_box_3_4_0.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_4_0.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_4_0.gridx = 2;
        gbc_box_3_4_0.gridy = 0;
        entree4_panel.add(breadComboBox_3_4, gbc_box_3_4_0);

        JLabel cheeseLabel_3_4 = new JLabel("Cheese");
        GridBagConstraints gbc_lbl_3_4_1 = new GridBagConstraints();
        gbc_lbl_3_4_1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_4_1.gridx = 0;
        gbc_lbl_3_4_1.gridy = 1;
        entree4_panel.add(cheeseLabel_3_4, gbc_lbl_3_4_1);

        JComboBox cheeseComboBox_3_4 = new JComboBox(cheeseChoices);
        GridBagConstraints gbc_box_3_4_1 = new GridBagConstraints();
        gbc_box_3_4_1.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_4_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_4_1.gridx = 2;
        gbc_box_3_4_1.gridy = 1;
        entree4_panel.add(cheeseComboBox_3_4, gbc_box_3_4_1);
        cheeseComboBox_3_4.setSelectedItem("Pepper Jack");

        JLabel lettuceLabel_3_4 = new JLabel("Lettuce");
        GridBagConstraints gbc_lbl_3_4_2 = new GridBagConstraints();
        gbc_lbl_3_4_2.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_4_2.gridx = 0;
        gbc_lbl_3_4_2.gridy = 2;
        entree4_panel.add(lettuceLabel_3_4, gbc_lbl_3_4_2);

        JComboBox lettuceComboBox_3_4 = new JComboBox(lettuceChoices);
        GridBagConstraints gbc_box_3_4_2 = new GridBagConstraints();
        gbc_box_3_4_2.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_4_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_4_2.gridx = 2;
        gbc_box_3_4_2.gridy = 2;
        entree4_panel.add(lettuceComboBox_3_4, gbc_box_3_4_2);
        lettuceComboBox_3_4.setSelectedItem("Regular");

        JLabel tomatoLabel_3_4 = new JLabel("Tomato");
        GridBagConstraints gbc_lbl_3_4_3 = new GridBagConstraints();
        gbc_lbl_3_4_3.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_4_3.gridx = 0;
        gbc_lbl_3_4_3.gridy = 3;
        entree4_panel.add(tomatoLabel_3_4, gbc_lbl_3_4_3);

        JComboBox tomatoComboBox_3_4 = new JComboBox(tomatoChoices);
        GridBagConstraints gbc_box_3_4_3 = new GridBagConstraints();
        gbc_box_3_4_3.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_4_3.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_4_3.gridx = 2;
        gbc_box_3_4_3.gridy = 3;
        entree4_panel.add(tomatoComboBox_3_4, gbc_box_3_4_3);
        tomatoComboBox_3_4.setSelectedItem("Regular");

        JLabel picklesLabel_3_4 = new JLabel("Pickles");
        GridBagConstraints gbc_lbl_3_4_4 = new GridBagConstraints();
        gbc_lbl_3_4_4.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_4_4.gridx = 0;
        gbc_lbl_3_4_4.gridy = 4;
        entree4_panel.add(picklesLabel_3_4, gbc_lbl_3_4_4);

        JComboBox picklesComboBox_3_4 = new JComboBox(pickleChoices);
        GridBagConstraints gbc_box_3_4_4 = new GridBagConstraints();
        gbc_box_3_4_4.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_4_4.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_4_4.gridx = 2;
        gbc_box_3_4_4.gridy = 4;
        entree4_panel.add(picklesComboBox_3_4, gbc_box_3_4_4);
        picklesComboBox_3_4.setSelectedItem("Regular");

        JLabel baconLabel_3_4 = new JLabel("Bacon");
        GridBagConstraints gbc_lbl_3_4_5 = new GridBagConstraints();
        gbc_lbl_3_4_5.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_4_5.gridx = 0;
        gbc_lbl_3_4_5.gridy = 5;
        entree4_panel.add(baconLabel_3_4, gbc_lbl_3_4_5);

        JComboBox baconComboBox_3_4 = new JComboBox(baconChoices);
        GridBagConstraints gbc_box_3_4_5 = new GridBagConstraints();
        gbc_box_3_4_5.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_4_5.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_4_5.gridx = 2;
        gbc_box_3_4_5.gridy = 5;
        entree4_panel.add(baconComboBox_3_4, gbc_box_3_4_5);

        JLabel sauce1Label_3_4 = new JLabel("Sauce Option 1");
        GridBagConstraints gbc_lbl_3_4_6 = new GridBagConstraints();
        gbc_lbl_3_4_6.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_4_6.gridx = 0;
        gbc_lbl_3_4_6.gridy = 6;
        entree4_panel.add(sauce1Label_3_4, gbc_lbl_3_4_6);

        JComboBox sauce1ComboBox_3_4 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_4_6 = new GridBagConstraints();
        gbc_box_3_4_6.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_4_6.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_4_6.gridx = 2;
        gbc_box_3_4_6.gridy = 6;
        entree4_panel.add(sauce1ComboBox_3_4, gbc_box_3_4_6);

        JLabel sauce2Label_3_4 = new JLabel("Sauce Option 2");
        GridBagConstraints gbc_lbl_3_4_7 = new GridBagConstraints();
        gbc_lbl_3_4_7.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_4_7.gridx = 0;
        gbc_lbl_3_4_7.gridy = 7;
        entree4_panel.add(sauce2Label_3_4, gbc_lbl_3_4_7);

        JComboBox sauce2ComboBox_3_4 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_4_7 = new GridBagConstraints();
        gbc_box_3_4_7.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_4_7.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_4_7.gridx = 2;
        gbc_box_3_4_7.gridy = 7;
        entree4_panel.add(sauce2ComboBox_3_4, gbc_box_3_4_7);

        JButton addButton_3_4 = new JButton("Add Spicy Deluxe Sandwich!");
        addButton_3_4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        System.out.println("Meal 4");
                }
        });
        GridBagConstraints gbc_btn_3_4 = new GridBagConstraints();
        gbc_btn_3_4.gridx = 2;
        gbc_btn_3_4.gridy = 8;
        entree4_panel.add(addButton_3_4, gbc_btn_3_4);
        JPanel entree5_panel = new JPanel();
        entree_panel.addTab("Grilled Chicken Sandwich", null, entree5_panel, null);
        GridBagLayout gbl_entree5_panel = new GridBagLayout();
        gbl_entree5_panel.columnWidths = new int[]{0, 0, 0, 0};
        gbl_entree5_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_entree5_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_entree5_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        entree5_panel.setLayout(gbl_entree5_panel);

        JLabel breadLabel_3_5 = new JLabel("Bread");
        GridBagConstraints gbc_lbl_3_5_0 = new GridBagConstraints();
        gbc_lbl_3_5_0.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_5_0.gridx = 0;
        gbc_lbl_3_5_0.gridy = 0;
        entree5_panel.add(breadLabel_3_5, gbc_lbl_3_5_0);

        JComboBox breadComboBox_3_5 = new JComboBox(breadChoices);
        GridBagConstraints gbc_box_3_5_0 = new GridBagConstraints();
        gbc_box_3_5_0.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_5_0.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_5_0.gridx = 2;
        gbc_box_3_5_0.gridy = 0;
        entree5_panel.add(breadComboBox_3_5, gbc_box_3_5_0);
        breadComboBox_3_5.setSelectedItem("Multigrain Brioche Bun");

        JLabel cheeseLabel_3_5 = new JLabel("Cheese");
        GridBagConstraints gbc_lbl_3_5_1 = new GridBagConstraints();
        gbc_lbl_3_5_1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_5_1.gridx = 0;
        gbc_lbl_3_5_1.gridy = 1;
        entree5_panel.add(cheeseLabel_3_5, gbc_lbl_3_5_1);

        JComboBox cheeseComboBox_3_5 = new JComboBox(cheeseChoices);
        GridBagConstraints gbc_box_3_5_1 = new GridBagConstraints();
        gbc_box_3_5_1.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_5_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_5_1.gridx = 2;
        gbc_box_3_5_1.gridy = 1;
        entree5_panel.add(cheeseComboBox_3_5, gbc_box_3_5_1);

        JLabel lettuceLabel_3_5 = new JLabel("Lettuce");
        GridBagConstraints gbc_lbl_3_5_2 = new GridBagConstraints();
        gbc_lbl_3_5_2.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_5_2.gridx = 0;
        gbc_lbl_3_5_2.gridy = 2;
        entree5_panel.add(lettuceLabel_3_5, gbc_lbl_3_5_2);

        JComboBox lettuceComboBox_3_5 = new JComboBox(lettuceChoices);
        GridBagConstraints gbc_box_3_5_2 = new GridBagConstraints();
        gbc_box_3_5_2.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_5_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_5_2.gridx = 2;
        gbc_box_3_5_2.gridy = 2;
        entree5_panel.add(lettuceComboBox_3_5, gbc_box_3_5_2);
        lettuceComboBox_3_5.setSelectedItem("Regular");

        JLabel tomatoLabel_3_5 = new JLabel("Tomato");
        GridBagConstraints gbc_lbl_3_5_3 = new GridBagConstraints();
        gbc_lbl_3_5_3.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_5_3.gridx = 0;
        gbc_lbl_3_5_3.gridy = 3;
        entree5_panel.add(tomatoLabel_3_5, gbc_lbl_3_5_3);

        JComboBox tomatoComboBox_3_5 = new JComboBox(tomatoChoices);
        GridBagConstraints gbc_box_3_5_3 = new GridBagConstraints();
        gbc_box_3_5_3.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_5_3.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_5_3.gridx = 2;
        gbc_box_3_5_3.gridy = 3;
        entree5_panel.add(tomatoComboBox_3_5, gbc_box_3_5_3);
        tomatoComboBox_3_5.setSelectedItem("Regular");

        JLabel picklesLabel_3_5 = new JLabel("Pickles");
        GridBagConstraints gbc_lbl_3_5_4 = new GridBagConstraints();
        gbc_lbl_3_5_4.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_5_4.gridx = 0;
        gbc_lbl_3_5_4.gridy = 4;
        entree5_panel.add(picklesLabel_3_5, gbc_lbl_3_5_4);

        JComboBox picklesComboBox_3_5 = new JComboBox(pickleChoices);
        GridBagConstraints gbc_box_3_5_4 = new GridBagConstraints();
        gbc_box_3_5_4.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_5_4.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_5_4.gridx = 2;
        gbc_box_3_5_4.gridy = 4;
        entree5_panel.add(picklesComboBox_3_5, gbc_box_3_5_4);

        JLabel baconLabel_3_5 = new JLabel("Bacon");
        GridBagConstraints gbc_lbl_3_5_5 = new GridBagConstraints();
        gbc_lbl_3_5_5.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_5_5.gridx = 0;
        gbc_lbl_3_5_5.gridy = 5;
        entree5_panel.add(baconLabel_3_5, gbc_lbl_3_5_5);

        JComboBox baconComboBox_3_5 = new JComboBox(baconChoices);
        GridBagConstraints gbc_box_3_5_5 = new GridBagConstraints();
        gbc_box_3_5_5.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_5_5.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_5_5.gridx = 2;
        gbc_box_3_5_5.gridy = 5;
        entree5_panel.add(baconComboBox_3_5, gbc_box_3_5_5);

        JLabel sauce1Label_3_5 = new JLabel("Sauce Option 1");
        GridBagConstraints gbc_lbl_3_5_6 = new GridBagConstraints();
        gbc_lbl_3_5_6.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_5_6.gridx = 0;
        gbc_lbl_3_5_6.gridy = 6;
        entree5_panel.add(sauce1Label_3_5, gbc_lbl_3_5_6);

        JComboBox sauce1ComboBox_3_5 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_5_6 = new GridBagConstraints();
        gbc_box_3_5_6.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_5_6.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_5_6.gridx = 2;
        gbc_box_3_5_6.gridy = 6;
        entree5_panel.add(sauce1ComboBox_3_5, gbc_box_3_5_6);
        sauce1ComboBox_3_5.setSelectedItem("Honey Mustard");

        JLabel sauce2Label_3_5 = new JLabel("Sauce Option 2");
        GridBagConstraints gbc_lbl_3_5_7 = new GridBagConstraints();
        gbc_lbl_3_5_7.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_5_7.gridx = 0;
        gbc_lbl_3_5_7.gridy = 7;
        entree5_panel.add(sauce2Label_3_5, gbc_lbl_3_5_7);

        JComboBox sauce2ComboBox_3_5 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_5_7 = new GridBagConstraints();
        gbc_box_3_5_7.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_5_7.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_5_7.gridx = 2;
        gbc_box_3_5_7.gridy = 7;
        entree5_panel.add(sauce2ComboBox_3_5, gbc_box_3_5_7);

        JButton addButton_3_5 = new JButton("Add Grilled Sandwich!");
        addButton_3_5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        System.out.println("Meal 5");
                }
        });
        GridBagConstraints gbc_btn_3_5 = new GridBagConstraints();
        gbc_btn_3_5.gridx = 2;
        gbc_btn_3_5.gridy = 8;
        entree5_panel.add(addButton_3_5, gbc_btn_3_5);
        JPanel entree6_panel = new JPanel();
        entree_panel.addTab("Grilled Chicken Club Sandwich", null, entree6_panel, null);
        GridBagLayout gbl_entree6_panel = new GridBagLayout();
        gbl_entree6_panel.columnWidths = new int[]{0, 0, 0, 0};
        gbl_entree6_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_entree6_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_entree6_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        entree6_panel.setLayout(gbl_entree6_panel);

        JLabel breadLabel_3_6 = new JLabel("Bread");
        GridBagConstraints gbc_lbl_3_6_0 = new GridBagConstraints();
        gbc_lbl_3_6_0.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_6_0.gridx = 0;
        gbc_lbl_3_6_0.gridy = 0;
        entree6_panel.add(breadLabel_3_6, gbc_lbl_3_6_0);

        JComboBox breadComboBox_3_6 = new JComboBox(breadChoices);
        GridBagConstraints gbc_box_3_6_0 = new GridBagConstraints();
        gbc_box_3_6_0.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_6_0.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_6_0.gridx = 2;
        gbc_box_3_6_0.gridy = 0;
        entree6_panel.add(breadComboBox_3_6, gbc_box_3_6_0);
        breadComboBox_3_6.setSelectedItem("Multigrain Brioche Bun");

        JLabel cheeseLabel_3_6 = new JLabel("Cheese");
        GridBagConstraints gbc_lbl_3_6_1 = new GridBagConstraints();
        gbc_lbl_3_6_1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_6_1.gridx = 0;
        gbc_lbl_3_6_1.gridy = 1;
        entree6_panel.add(cheeseLabel_3_6, gbc_lbl_3_6_1);

        JComboBox cheeseComboBox_3_6 = new JComboBox(cheeseChoices);
        GridBagConstraints gbc_box_3_6_1 = new GridBagConstraints();
        gbc_box_3_6_1.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_6_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_6_1.gridx = 2;
        gbc_box_3_6_1.gridy = 1;
        entree6_panel.add(cheeseComboBox_3_6, gbc_box_3_6_1);
        cheeseComboBox_3_6.setSelectedItem("Colby Jack");

        JLabel lettuceLabel_3_6 = new JLabel("Lettuce");
        GridBagConstraints gbc_lbl_3_6_2 = new GridBagConstraints();
        gbc_lbl_3_6_2.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_6_2.gridx = 0;
        gbc_lbl_3_6_2.gridy = 2;
        entree6_panel.add(lettuceLabel_3_6, gbc_lbl_3_6_2);

        JComboBox lettuceComboBox_3_6 = new JComboBox(lettuceChoices);
        GridBagConstraints gbc_box_3_6_2 = new GridBagConstraints();
        gbc_box_3_6_2.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_6_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_6_2.gridx = 2;
        gbc_box_3_6_2.gridy = 2;
        entree6_panel.add(lettuceComboBox_3_6, gbc_box_3_6_2);
        lettuceComboBox_3_6.setSelectedItem("Regular");

        JLabel tomatoLabel_3_6 = new JLabel("Tomato");
        GridBagConstraints gbc_lbl_3_6_3 = new GridBagConstraints();
        gbc_lbl_3_6_3.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_6_3.gridx = 0;
        gbc_lbl_3_6_3.gridy = 3;
        entree6_panel.add(tomatoLabel_3_6, gbc_lbl_3_6_3);

        JComboBox tomatoComboBox_3_6 = new JComboBox(tomatoChoices);
        GridBagConstraints gbc_box_3_6_3 = new GridBagConstraints();
        gbc_box_3_6_3.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_6_3.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_6_3.gridx = 2;
        gbc_box_3_6_3.gridy = 3;
        entree6_panel.add(tomatoComboBox_3_6, gbc_box_3_6_3);
        tomatoComboBox_3_6.setSelectedItem("Regular");

        JLabel picklesLabel_3_6 = new JLabel("Pickles");
        GridBagConstraints gbc_lbl_3_6_4 = new GridBagConstraints();
        gbc_lbl_3_6_4.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_6_4.gridx = 0;
        gbc_lbl_3_6_4.gridy = 4;
        entree6_panel.add(picklesLabel_3_6, gbc_lbl_3_6_4);

        JComboBox picklesComboBox_3_6 = new JComboBox(pickleChoices);
        GridBagConstraints gbc_box_3_6_4 = new GridBagConstraints();
        gbc_box_3_6_4.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_6_4.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_6_4.gridx = 2;
        gbc_box_3_6_4.gridy = 4;
        entree6_panel.add(picklesComboBox_3_6, gbc_box_3_6_4);

        JLabel baconLabel_3_6 = new JLabel("Bacon");
        GridBagConstraints gbc_lbl_3_6_5 = new GridBagConstraints();
        gbc_lbl_3_6_5.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_6_5.gridx = 0;
        gbc_lbl_3_6_5.gridy = 5;
        entree6_panel.add(baconLabel_3_6, gbc_lbl_3_6_5);

        JComboBox baconComboBox_3_6 = new JComboBox(baconChoices);
        GridBagConstraints gbc_box_3_6_5 = new GridBagConstraints();
        gbc_box_3_6_5.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_6_5.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_6_5.gridx = 2;
        gbc_box_3_6_5.gridy = 5;
        entree6_panel.add(baconComboBox_3_6, gbc_box_3_6_5);
        baconComboBox_3_6.setSelectedItem("Regular");

        JLabel sauce1Label_3_6 = new JLabel("Sauce Option 1");
        GridBagConstraints gbc_lbl_3_6_6 = new GridBagConstraints();
        gbc_lbl_3_6_6.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_6_6.gridx = 0;
        gbc_lbl_3_6_6.gridy = 6;
        entree6_panel.add(sauce1Label_3_6, gbc_lbl_3_6_6);

        JComboBox sauce1ComboBox_3_6 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_6_6 = new GridBagConstraints();
        gbc_box_3_6_6.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_6_6.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_6_6.gridx = 2;
        gbc_box_3_6_6.gridy = 6;
        entree6_panel.add(sauce1ComboBox_3_6, gbc_box_3_6_6);
        sauce1ComboBox_3_6.setSelectedItem("Honey Mustard");

        JLabel sauce2Label_3_6 = new JLabel("Sauce Option 2");
        GridBagConstraints gbc_lbl_3_6_7 = new GridBagConstraints();
        gbc_lbl_3_6_7.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_6_7.gridx = 0;
        gbc_lbl_3_6_7.gridy = 7;
        entree6_panel.add(sauce2Label_3_6, gbc_lbl_3_6_7);

        JComboBox sauce2ComboBox_3_6 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_6_7 = new GridBagConstraints();
        gbc_box_3_6_7.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_6_7.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_6_7.gridx = 2;
        gbc_box_3_6_7.gridy = 7;
        entree6_panel.add(sauce2ComboBox_3_6, gbc_box_3_6_7);

        JButton addButton_3_6 = new JButton("Add Grilled Chicken Club Sandwich!");
        addButton_3_6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        System.out.println("Meal 6");
                }
        });
        GridBagConstraints gbc_btn_3_6 = new GridBagConstraints();
        gbc_btn_3_6.gridx = 2;
        gbc_btn_3_6.gridy = 8;
        entree6_panel.add(addButton_3_6, gbc_btn_3_6);
        
        JPanel entree7_panel = new JPanel();
        entree_panel.addTab("Grilled Spicy Deluxe", null, entree7_panel, null);
        GridBagLayout gbl_entree7_panel = new GridBagLayout();
        gbl_entree7_panel.columnWidths = new int[]{0, 0, 0, 0};
        gbl_entree7_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_entree7_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_entree7_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        entree7_panel.setLayout(gbl_entree7_panel);

        JLabel breadLabel_3_7 = new JLabel("Bread");
        GridBagConstraints gbc_lbl_3_7_0 = new GridBagConstraints();
        gbc_lbl_3_7_0.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_7_0.gridx = 0;
        gbc_lbl_3_7_0.gridy = 0;
        entree7_panel.add(breadLabel_3_7, gbc_lbl_3_7_0);

        JComboBox breadComboBox_3_7 = new JComboBox(breadChoices);
        GridBagConstraints gbc_box_3_7_0 = new GridBagConstraints();
        gbc_box_3_7_0.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_7_0.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_7_0.gridx = 2;
        gbc_box_3_7_0.gridy = 0;
        entree7_panel.add(breadComboBox_3_7, gbc_box_3_7_0);

        JLabel cheeseLabel_3_7 = new JLabel("Cheese");
        GridBagConstraints gbc_lbl_3_7_1 = new GridBagConstraints();
        gbc_lbl_3_7_1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_7_1.gridx = 0;
        gbc_lbl_3_7_1.gridy = 1;
        entree7_panel.add(cheeseLabel_3_7, gbc_lbl_3_7_1);

        JComboBox cheeseComboBox_3_7 = new JComboBox(cheeseChoices);
        GridBagConstraints gbc_box_3_7_1 = new GridBagConstraints();
        gbc_box_3_7_1.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_7_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_7_1.gridx = 2;
        gbc_box_3_7_1.gridy = 1;
        entree7_panel.add(cheeseComboBox_3_7, gbc_box_3_7_1);
        cheeseComboBox_3_7.setSelectedItem("Colby Jack");

        JLabel lettuceLabel_3_7 = new JLabel("Lettuce");
        GridBagConstraints gbc_lbl_3_7_2 = new GridBagConstraints();
        gbc_lbl_3_7_2.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_7_2.gridx = 0;
        gbc_lbl_3_7_2.gridy = 2;
        entree7_panel.add(lettuceLabel_3_7, gbc_lbl_3_7_2);

        JComboBox lettuceComboBox_3_7 = new JComboBox(lettuceChoices);
        GridBagConstraints gbc_box_3_7_2 = new GridBagConstraints();
        gbc_box_3_7_2.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_7_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_7_2.gridx = 2;
        gbc_box_3_7_2.gridy = 2;
        entree7_panel.add(lettuceComboBox_3_7, gbc_box_3_7_2);
        lettuceComboBox_3_7.setSelectedItem("Regular");

        JLabel tomatoLabel_3_7 = new JLabel("Tomato");
        GridBagConstraints gbc_lbl_3_7_3 = new GridBagConstraints();
        gbc_lbl_3_7_3.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_7_3.gridx = 0;
        gbc_lbl_3_7_3.gridy = 3;
        entree7_panel.add(tomatoLabel_3_7, gbc_lbl_3_7_3);

        JComboBox tomatoComboBox_3_7 = new JComboBox(tomatoChoices);
        GridBagConstraints gbc_box_3_7_3 = new GridBagConstraints();
        gbc_box_3_7_3.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_7_3.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_7_3.gridx = 2;
        gbc_box_3_7_3.gridy = 3;
        entree7_panel.add(tomatoComboBox_3_7, gbc_box_3_7_3);
        tomatoComboBox_3_7.setSelectedItem("Regular");

        JLabel picklesLabel_3_7 = new JLabel("Pickles");
        GridBagConstraints gbc_lbl_3_7_4 = new GridBagConstraints();
        gbc_lbl_3_7_4.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_7_4.gridx = 0;
        gbc_lbl_3_7_4.gridy = 4;
        entree7_panel.add(picklesLabel_3_7, gbc_lbl_3_7_4);

        JComboBox picklesComboBox_3_7 = new JComboBox(pickleChoices);
        GridBagConstraints gbc_box_3_7_4 = new GridBagConstraints();
        gbc_box_3_7_4.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_7_4.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_7_4.gridx = 2;
        gbc_box_3_7_4.gridy = 4;
        entree7_panel.add(picklesComboBox_3_7, gbc_box_3_7_4);
        picklesComboBox_3_7.setSelectedItem("Regular");

        JLabel baconLabel_3_7 = new JLabel("Bacon");
        GridBagConstraints gbc_lbl_3_7_5 = new GridBagConstraints();
        gbc_lbl_3_7_5.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_7_5.gridx = 0;
        gbc_lbl_3_7_5.gridy = 5;
        entree7_panel.add(baconLabel_3_7, gbc_lbl_3_7_5);

        JComboBox baconComboBox_3_7 = new JComboBox(baconChoices);
        GridBagConstraints gbc_box_3_7_5 = new GridBagConstraints();
        gbc_box_3_7_5.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_7_5.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_7_5.gridx = 2;
        gbc_box_3_7_5.gridy = 5;
        entree7_panel.add(baconComboBox_3_7, gbc_box_3_7_5);

        JLabel sauce1Label_3_7 = new JLabel("Sauce Option 1");
        GridBagConstraints gbc_lbl_3_7_6 = new GridBagConstraints();
        gbc_lbl_3_7_6.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_7_6.gridx = 0;
        gbc_lbl_3_7_6.gridy = 6;
        entree7_panel.add(sauce1Label_3_7, gbc_lbl_3_7_6);

        JComboBox sauce1ComboBox_3_7 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_7_6 = new GridBagConstraints();
        gbc_box_3_7_6.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_7_6.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_7_6.gridx = 2;
        gbc_box_3_7_6.gridy = 6;
        entree7_panel.add(sauce1ComboBox_3_7, gbc_box_3_7_6);

        JLabel sauce2Label_3_7 = new JLabel("Sauce Option 2");
        GridBagConstraints gbc_lbl_3_7_7 = new GridBagConstraints();
        gbc_lbl_3_7_7.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_7_7.gridx = 0;
        gbc_lbl_3_7_7.gridy = 7;
        entree7_panel.add(sauce2Label_3_7, gbc_lbl_3_7_7);

        JComboBox sauce2ComboBox_3_7 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_7_7 = new GridBagConstraints();
        gbc_box_3_7_7.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_7_7.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_7_7.gridx = 2;
        gbc_box_3_7_7.gridy = 7;
        entree7_panel.add(sauce2ComboBox_3_7, gbc_box_3_7_7);

        JButton addButton_3_7 = new JButton("Add Grilled Spicy Deluxe!");
        addButton_3_7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        System.out.println("Meal 7");
                }
        });
        GridBagConstraints gbc_btn_3_7 = new GridBagConstraints();
        gbc_btn_3_7.gridx = 2;
        gbc_btn_3_7.gridy = 8;
        entree7_panel.add(addButton_3_7, gbc_btn_3_7);
        
        JPanel entree8_panel = new JPanel();
        entree_panel.addTab("Nuggets", null, entree8_panel, null);
        GridBagLayout gbl_entree8_panel = new GridBagLayout();
        gbl_entree8_panel.columnWidths = new int[]{0, 0, 0, 0};
        gbl_entree8_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_entree8_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_entree8_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        entree8_panel.setLayout(gbl_entree8_panel);
        
        JLabel nugCountLabel_3_8 = new JLabel("Nugget Count");
        GridBagConstraints gbc_lbl_3_8_0 = new GridBagConstraints();
        gbc_lbl_3_8_0.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_8_0.gridx = 0;
        gbc_lbl_3_8_0.gridy = 0;
        entree8_panel.add(nugCountLabel_3_8, gbc_lbl_3_8_0);

        JComboBox nugCountComboBox_3_8 = new JComboBox(nugCountChoices);
        GridBagConstraints gbc_box_3_8_0 = new GridBagConstraints();
        gbc_box_3_8_0.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_8_0.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_8_0.gridx = 2;
        gbc_box_3_8_0.gridy = 0;
        entree8_panel.add(nugCountComboBox_3_8, gbc_box_3_8_0);
        
        JLabel sauce1Label_3_8 = new JLabel("Sauce Option 1");
        GridBagConstraints gbc_lbl_3_8_1 = new GridBagConstraints();
        gbc_lbl_3_8_1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_8_1.gridx = 0;
        gbc_lbl_3_8_1.gridy = 1;
        entree8_panel.add(sauce1Label_3_8, gbc_lbl_3_8_1);

        JComboBox sauce1ComboBox_3_8 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_8_1 = new GridBagConstraints();
        gbc_box_3_8_1.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_8_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_8_1.gridx = 2;
        gbc_box_3_8_1.gridy = 1;
        entree8_panel.add(sauce1ComboBox_3_8, gbc_box_3_8_1);

        JLabel sauce2Label_3_8 = new JLabel("Sauce Option 2");
        GridBagConstraints gbc_lbl_3_8_2 = new GridBagConstraints();
        gbc_lbl_3_8_2.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_8_2.gridx = 0;
        gbc_lbl_3_8_2.gridy = 2;
        entree8_panel.add(sauce2Label_3_8, gbc_lbl_3_8_2);

        JComboBox sauce2ComboBox_3_8 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_8_2 = new GridBagConstraints();
        gbc_box_3_8_2.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_8_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_8_2.gridx = 2;
        gbc_box_3_8_2.gridy = 2;
        entree8_panel.add(sauce2ComboBox_3_8, gbc_box_3_8_2);
        
        JButton addButton_3_8 = new JButton("Add Nuggets!");
        addButton_3_8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        System.out.println("Nuggets");
                }
        });
        GridBagConstraints gbc_btn_3_8 = new GridBagConstraints();
        gbc_btn_3_8.gridx = 2;
        gbc_btn_3_8.gridy = 3;
        entree8_panel.add(addButton_3_8, gbc_btn_3_8);
        
        JPanel entree9_panel = new JPanel();
        entree_panel.addTab("Grilled Nuggets", null, entree9_panel, null);
        GridBagLayout gbl_entree9_panel = new GridBagLayout();
        gbl_entree9_panel.columnWidths = new int[]{0, 0, 0, 0};
        gbl_entree9_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_entree9_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_entree9_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        entree9_panel.setLayout(gbl_entree9_panel);
        
        JLabel nugCountLabel_3_9 = new JLabel("Nugget Count");
        GridBagConstraints gbc_lbl_3_9_0 = new GridBagConstraints();
        gbc_lbl_3_9_0.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_9_0.gridx = 0;
        gbc_lbl_3_9_0.gridy = 0;
        entree9_panel.add(nugCountLabel_3_9, gbc_lbl_3_9_0);

        JComboBox nugCountComboBox_3_9 = new JComboBox(nugCountChoices);
        GridBagConstraints gbc_box_3_9_0 = new GridBagConstraints();
        gbc_box_3_9_0.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_9_0.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_9_0.gridx = 2;
        gbc_box_3_9_0.gridy = 0;
        entree9_panel.add(nugCountComboBox_3_9, gbc_box_3_9_0);
        
        JLabel sauce1Label_3_9 = new JLabel("Sauce Option 1");
        GridBagConstraints gbc_lbl_3_9_1 = new GridBagConstraints();
        gbc_lbl_3_9_1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_9_1.gridx = 0;
        gbc_lbl_3_9_1.gridy = 1;
        entree9_panel.add(sauce1Label_3_9, gbc_lbl_3_9_1);

        JComboBox sauce1ComboBox_3_9 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_9_1 = new GridBagConstraints();
        gbc_box_3_9_1.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_9_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_9_1.gridx = 2;
        gbc_box_3_9_1.gridy = 1;
        entree9_panel.add(sauce1ComboBox_3_9, gbc_box_3_9_1);

        JLabel sauce2Label_3_9 = new JLabel("Sauce Option 2");
        GridBagConstraints gbc_lbl_3_9_2 = new GridBagConstraints();
        gbc_lbl_3_9_2.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_9_2.gridx = 0;
        gbc_lbl_3_9_2.gridy = 2;
        entree9_panel.add(sauce2Label_3_9, gbc_lbl_3_9_2);

        JComboBox sauce2ComboBox_3_9 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_9_2 = new GridBagConstraints();
        gbc_box_3_9_2.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_9_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_9_2.gridx = 2;
        gbc_box_3_9_2.gridy = 2;
        entree9_panel.add(sauce2ComboBox_3_9, gbc_box_3_9_2);
        
        JButton addButton_3_9 = new JButton("Add Grilled Nuggets!");
        addButton_3_9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        System.out.println("Grilled Nuggets");
                }
        });
        GridBagConstraints gbc_btn_3_9 = new GridBagConstraints();
        gbc_btn_3_9.gridx = 2;
        gbc_btn_3_9.gridy = 3;
        entree9_panel.add(addButton_3_9, gbc_btn_3_9);
        
        JPanel entree10_panel = new JPanel();
        entree_panel.addTab("Chick-n Strips", null, entree10_panel, null);
        GridBagLayout gbl_entree10_panel = new GridBagLayout();
        gbl_entree10_panel.columnWidths = new int[]{0, 0, 0, 0};
        gbl_entree10_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_entree10_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_entree10_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        entree10_panel.setLayout(gbl_entree10_panel);
        
        JLabel strCountLabel_3_10 = new JLabel("Nugget Count");
        GridBagConstraints gbc_lbl_3_10_0 = new GridBagConstraints();
        gbc_lbl_3_10_0.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_10_0.gridx = 0;
        gbc_lbl_3_10_0.gridy = 0;
        entree10_panel.add(strCountLabel_3_10, gbc_lbl_3_10_0);

        JComboBox strCountComboBox_3_10 = new JComboBox(strCountChoices);
        GridBagConstraints gbc_box_3_10_0 = new GridBagConstraints();
        gbc_box_3_10_0.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_10_0.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_10_0.gridx = 2;
        gbc_box_3_10_0.gridy = 0;
        entree10_panel.add(strCountComboBox_3_10, gbc_box_3_10_0);
        
        JLabel sauce1Label_3_10 = new JLabel("Sauce Option 1");
        GridBagConstraints gbc_lbl_3_10_1 = new GridBagConstraints();
        gbc_lbl_3_10_1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_10_1.gridx = 0;
        gbc_lbl_3_10_1.gridy = 1;
        entree10_panel.add(sauce1Label_3_10, gbc_lbl_3_10_1);

        JComboBox sauce1ComboBox_3_10 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_10_1 = new GridBagConstraints();
        gbc_box_3_10_1.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_10_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_10_1.gridx = 2;
        gbc_box_3_10_1.gridy = 1;
        entree10_panel.add(sauce1ComboBox_3_10, gbc_box_3_10_1);

        JLabel sauce2Label_3_10 = new JLabel("Sauce Option 2");
        GridBagConstraints gbc_lbl_3_10_2 = new GridBagConstraints();
        gbc_lbl_3_10_2.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_10_2.gridx = 0;
        gbc_lbl_3_10_2.gridy = 2;
        entree10_panel.add(sauce2Label_3_10, gbc_lbl_3_10_2);

        JComboBox sauce2ComboBox_3_10 = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_10_2 = new GridBagConstraints();
        gbc_box_3_10_2.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_10_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_10_2.gridx = 2;
        gbc_box_3_10_2.gridy = 2;
        entree10_panel.add(sauce2ComboBox_3_10, gbc_box_3_10_2);
        
        JButton addButton_3_10 = new JButton("Add Chick-n Strips!");
        addButton_3_10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        System.out.println("Chick-n Strips");
                }
        });
        GridBagConstraints gbc_btn_3_10 = new GridBagConstraints();
        gbc_btn_3_10.gridx = 2;
        gbc_btn_3_10.gridy = 3;
        entree10_panel.add(addButton_3_10, gbc_btn_3_10);
        
        JPanel entree11_panel = new JPanel();
        entree_panel.addTab("Cool Wrap", null, entree11_panel, null);
        GridBagLayout gbl_entree11_panel = new GridBagLayout();
        gbl_entree11_panel.columnWidths = new int[]{0, 0, 0, 0};
        gbl_entree11_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_entree11_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_entree11_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        entree11_panel.setLayout(gbl_entree11_panel);
        
        JLabel dressing1Label_3_11 = new JLabel("Dressing Option 1");
        GridBagConstraints gbc_lbl_3_11_0 = new GridBagConstraints();
        gbc_lbl_3_11_0.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_11_0.gridx = 0;
        gbc_lbl_3_11_0.gridy = 0;
        entree11_panel.add(dressing1Label_3_11, gbc_lbl_3_11_0);

        JComboBox dressing1ComboBox_3_11 = new JComboBox(dressingChoices);
        GridBagConstraints gbc_box_3_11_0 = new GridBagConstraints();
        gbc_box_3_11_0.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_11_0.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_11_0.gridx = 2;
        gbc_box_3_11_0.gridy = 0;
        entree11_panel.add(dressing1ComboBox_3_11, gbc_box_3_11_0);
        
        JLabel dressing2Label_3_11 = new JLabel("Dressing Option 2");
        GridBagConstraints gbc_lbl_3_11_1 = new GridBagConstraints();
        gbc_lbl_3_11_1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_11_1.gridx = 0;
        gbc_lbl_3_11_1.gridy = 1;
        entree11_panel.add(dressing2Label_3_11, gbc_lbl_3_11_1);

        JComboBox dressing2ComboBox_3_11 = new JComboBox(dressingChoices);
        GridBagConstraints gbc_box_3_11_1 = new GridBagConstraints();
        gbc_box_3_11_1.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_11_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_11_1.gridx = 2;
        gbc_box_3_11_1.gridy = 1;
        entree11_panel.add(dressing2ComboBox_3_11, gbc_box_3_11_1);
        
        JButton addButton_3_11 = new JButton("Add Cool Wrap!");
        addButton_3_11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        System.out.println("Cool Wrap");
                }
        });
        GridBagConstraints gbc_btn_3_11 = new GridBagConstraints();
        gbc_btn_3_11.gridx = 2;
        gbc_btn_3_11.gridy = 3;
        entree11_panel.add(addButton_3_11, gbc_btn_3_11);
        
        JPanel salad_panel = new JPanel();
        tabbedPane.addTab("Salads", null, salad_panel, null);
        
        JPanel side_panel = new JPanel(new GridLayout(8,0,10,10));
        tabbedPane.addTab("Sides", null, side_panel, null);

        JButton mfries = new JButton("Medium Waffle Fries");
        side_panel.add(mfries);

        JButton lfries = new JButton("Large Waffle Fries");
        side_panel.add(lfries);

        JButton fruitcup = new JButton("Fruit Cup");
        side_panel.add(fruitcup);

        JButton side_salad = new JButton("Side Salad");
        side_panel.add(side_salad);

        JButton wafflechip = new JButton("Waffle Chips");
        side_panel.add(wafflechip);
        
        JPanel drink_panel = new JPanel(new GridLayout(5,0,10,10));
        tabbedPane.addTab("Drinks", null, drink_panel, null);

        JButton lemonade = new JButton("Lemonade");
        drink_panel.add(lemonade);

        JButton sicetea = new JButton("Sweetened Ice Tea");
        drink_panel.add(sicetea);

        JButton unicetea = new JButton("Unsweetened Ice Tea");
        drink_panel.add(unicetea);

        JButton sunjoy = new JButton("Sunjoy");
        drink_panel.add(sunjoy);

        JButton water = new JButton("Bottled Water");
        drink_panel.add(water);

        JButton fountain = new JButton("Fountain Drinks");
        drink_panel.add(fountain);
        
        JPanel dessert_panel = new JPanel(new GridLayout(7,0,5,5));
        tabbedPane.addTab("Treats", null, dessert_panel, null);

        JButton dessert = new JButton("Brownie");
        dessert_panel.add(dessert);

        JButton cookie = new JButton("Cookie");
        dessert_panel.add(cookie);

        JButton icecone = new JButton("Icedream Cone");
        dessert_panel.add(icecone);

        JButton icecup = new JButton("Icedream Cup");
        dessert_panel.add(icecup);

        JButton ccmilkshake = new JButton("Cookies & Cream Milkshake");
        dessert_panel.add(ccmilkshake);

        JButton cmilkshake = new JButton("Chocolate Milkshake");
        dessert_panel.add(cmilkshake);

        JButton smilkshake = new JButton("Strawberry Milkshake");
        dessert_panel.add(smilkshake);

        JButton vmilkshake = new JButton("Vanilla Milkshake");
        dessert_panel.add(vmilkshake);

        JButton frostedcoffee = new JButton("Frosted Coffee");
        dessert_panel.add(frostedcoffee);

        JButton frostedlemonade = new JButton("Frosted Lemonade");
        dessert_panel.add(frostedlemonade);
        
        JPanel kid_panel = new JPanel();
        tabbedPane.addTab("Kids", null, kid_panel, null);

        JPanel sauce_panel = new JPanel(new GridLayout(3,0,10,10));
        tabbedPane.addTab("Sauces",null,sauce_panel,null);

        JButton cf_sauce = new JButton("Chick-Fil-A sause");
        sauce_panel.add(cf_sauce);

        JButton bbq = new JButton("Barbeque Sauce");
        sauce_panel.add(bbq);

        JButton GardenRanch = new JButton("Garden Herb Ranch");
        sauce_panel.add(GardenRanch);

        JButton hmustard = new JButton("Honey Mustard");
        sauce_panel.add(hmustard);

        JButton polysauce = new JButton("Polynesian Sauce");
        sauce_panel.add(polysauce);

        JButton sssriracha = new JButton("Sweet & Spicy Sriraha");
        sauce_panel.add(sssriracha);

        JButton zesty = new JButton("Zesty Buffalo Sauce");
        sauce_panel.add(zesty);

        JButton roastedbbq = new JButton("Honey Roasted BBQ Sauce");
        sauce_panel.add(roastedbbq);
        
        

    }
    
    public static void main(String[] args){
        //creating the instance of JFrame
        new MainFrame();
        
    }
}