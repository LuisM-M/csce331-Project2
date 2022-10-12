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
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        splitPane.setRightComponent(tabbedPane);
        
        JPanel bkfst_panel = new JPanel();
        tabbedPane.addTab("Breakfast", null, bkfst_panel, null);
        
        JPanel meal_panel = new JPanel();
        tabbedPane.addTab("Meals", null, meal_panel, null);
        
        JLabel dummyEntrees = new JLabel("Dummy");  // for capturing panel clicking
        meal_panel.add(dummyEntrees);

        JButton meal_1 = new JButton("1");
        meal_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                //this.foodId = 1;
        		//System.out.println("meal 1");
                dummyEntrees.setText("1");
        	}
        });
        meal_panel.add(meal_1);
        
        JButton meal_2 = new JButton("2");
        meal_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                dummyEntrees.setText("2");
        		System.out.println("meal 2");
        	}
        });
        meal_panel.add(meal_2);
        
        JTabbedPane entree_panel = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.addTab("Entrees", null, entree_panel, null);
        
        JPanel entree1_panel = new JPanel();
        entree_panel.addTab("1", null, entree1_panel, null);
        GridBagLayout gbl_entree1_panel = new GridBagLayout();
        gbl_entree1_panel.columnWidths = new int[]{0, 0, 0, 0};
        gbl_entree1_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_entree1_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
        gbl_entree1_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        entree1_panel.setLayout(gbl_entree1_panel);
        
        String[] cheeseChoices = {"None", "American", "Colby Jack", "Pepper Jack"};
        String[] lettuceChoices = {"None", "Regular", "Extra"};
        String[] tomatoChoices = {"None", "Regular", "Extra"};
        String[] pickleChoices = {"None", "Regular", "Extra"};
        String[] baconChoices = {"None", "One Serving", "Extra"};
        String[] sauceChoices = {"None", "Ketchup", "Mustard", "Chick-Fil-A", "Polynesian", "Barbeque", "Honey Mustard", "Garden Herb Ranch", "Zesty Buffalo", "Sweet and Spicy Siracha"};
        
        JLabel cheeseLabel = new JLabel("Cheese");
        GridBagConstraints gbc_lbl_3_1_1 = new GridBagConstraints();
        gbc_lbl_3_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_1.gridx = 0;
        gbc_lbl_3_1_1.gridy = 0;
        entree1_panel.add(cheeseLabel, gbc_lbl_3_1_1);
        
        JComboBox cheeseComboBox = new JComboBox(cheeseChoices);
        GridBagConstraints gbc_box_3_1_1 = new GridBagConstraints();
        gbc_box_3_1_1.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_1.gridx = 2;
        gbc_box_3_1_1.gridy = 0;
        entree1_panel.add(cheeseComboBox, gbc_box_3_1_1);
        
        JLabel lettuceLabel = new JLabel("Lettuce");
        GridBagConstraints gbc_lbl_3_1_2 = new GridBagConstraints();
        gbc_lbl_3_1_2.anchor = GridBagConstraints.BASELINE;
        gbc_lbl_3_1_2.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_2.gridx = 0;
        gbc_lbl_3_1_2.gridy = 1;
        entree1_panel.add(lettuceLabel, gbc_lbl_3_1_2);
        
        JComboBox lettuceComboBox = new JComboBox(lettuceChoices);
        GridBagConstraints gbc_box_3_1_2 = new GridBagConstraints();
        gbc_box_3_1_2.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_2.gridx = 2;
        gbc_box_3_1_2.gridy = 1;
        entree1_panel.add(lettuceComboBox, gbc_box_3_1_2);
        
        JLabel tomatoLabel = new JLabel("Tomato");
        GridBagConstraints gbc_lbl_3_1_3 = new GridBagConstraints();
        gbc_lbl_3_1_3.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_3.gridx = 0;
        gbc_lbl_3_1_3.gridy = 2;
        entree1_panel.add(tomatoLabel, gbc_lbl_3_1_3);
        
        JComboBox tomatoComboBox = new JComboBox(tomatoChoices);
        GridBagConstraints gbc_box_3_1_3 = new GridBagConstraints();
        gbc_box_3_1_3.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_3.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_3.gridx = 2;
        gbc_box_3_1_3.gridy = 2;
        entree1_panel.add(tomatoComboBox, gbc_box_3_1_3);
        
        JLabel picklesLabel = new JLabel("Pickles");
        GridBagConstraints gbc_lbl_3_1_4 = new GridBagConstraints();
        gbc_lbl_3_1_4.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_4.gridx = 0;
        gbc_lbl_3_1_4.gridy = 3;
        entree1_panel.add(picklesLabel, gbc_lbl_3_1_4);
        
        JComboBox picklesComboBox = new JComboBox(pickleChoices);
        GridBagConstraints gbc_box_3_1_4 = new GridBagConstraints();
        gbc_box_3_1_4.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_4.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_4.gridx = 2;
        gbc_box_3_1_4.gridy = 3;
        entree1_panel.add(picklesComboBox, gbc_box_3_1_4);
        picklesComboBox.setSelectedItem("Regular");
        
        JLabel baconLabel = new JLabel("Bacon");
        GridBagConstraints gbc_lbl_3_1_5 = new GridBagConstraints();
        gbc_lbl_3_1_5.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_5.gridx = 0;
        gbc_lbl_3_1_5.gridy = 4;
        entree1_panel.add(baconLabel, gbc_lbl_3_1_5);
        
        JComboBox baconComboBox = new JComboBox(baconChoices);
        GridBagConstraints gbc_box_3_1_5 = new GridBagConstraints();
        gbc_box_3_1_5.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_5.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_5.gridx = 2;
        gbc_box_3_1_5.gridy = 4;
        entree1_panel.add(baconComboBox, gbc_box_3_1_5);
        
        JLabel sauce1Label = new JLabel("Sauce Option 1");
        GridBagConstraints gbc_lbl_3_1_6 = new GridBagConstraints();
        gbc_lbl_3_1_6.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_6.gridx = 0;
        gbc_lbl_3_1_6.gridy = 5;
        entree1_panel.add(sauce1Label, gbc_lbl_3_1_6);
        
        JComboBox sauce1ComboBox = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_1_6 = new GridBagConstraints();
        gbc_box_3_1_6.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_6.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_6.gridx = 2;
        gbc_box_3_1_6.gridy = 5;
        entree1_panel.add(sauce1ComboBox, gbc_box_3_1_6);
        
        JLabel sauce2Label = new JLabel("Sauce Option 2");
        GridBagConstraints gbc_lbl_3_1_7 = new GridBagConstraints();
        gbc_lbl_3_1_7.insets = new Insets(0, 0, 5, 5);
        gbc_lbl_3_1_7.gridx = 0;
        gbc_lbl_3_1_7.gridy = 6;
        entree1_panel.add(sauce2Label, gbc_lbl_3_1_7);
        
        JComboBox sauce2ComboBox = new JComboBox(sauceChoices);
        GridBagConstraints gbc_box_3_1_7 = new GridBagConstraints();
        gbc_box_3_1_7.insets = new Insets(0, 0, 5, 0);
        gbc_box_3_1_7.fill = GridBagConstraints.HORIZONTAL;
        gbc_box_3_1_7.gridx = 2;
        gbc_box_3_1_7.gridy = 6;
        entree1_panel.add(sauce2ComboBox, gbc_box_3_1_7);
        
        JButton btnNewButton = new JButton("Add!");
        
        GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
        gbc_btnNewButton.gridx = 2;
        gbc_btnNewButton.gridy = 20;
        entree1_panel.add(btnNewButton, gbc_btnNewButton);
        
        JPanel entree2_panel = new JPanel();
        entree_panel.addTab("2", null, entree2_panel, null);
        
        JPanel salad_panel = new JPanel();
        tabbedPane.addTab("Salads", null, salad_panel, null);
        
        JPanel side_panel = new JPanel();
        tabbedPane.addTab("Sides", null, side_panel, null);
        
        JPanel drink_panel = new JPanel();
        tabbedPane.addTab("Drink", null, drink_panel, null);
        
        JPanel dessert_panel = new JPanel();
        tabbedPane.addTab("Desserts", null, dessert_panel, null);
        
        JPanel kid_panel = new JPanel();
        tabbedPane.addTab("Kids", null, kid_panel, null);
        
        JPanel panel_1 = new JPanel();
        splitPane.setLeftComponent(panel_1);
        
        JLabel lblNewLabel = new JLabel("YO you ain't seeing the basement bitch");
        panel_1.add(lblNewLabel);
        system.setVisible(true);
        
        btnNewButton.addActionListener(e->{
            String sql = "SELECT price from food where foodId=" + dummyEntrees.getText();
            String txt = lblNewLabel.getText();
            String cheese = cheeseComboBox.getSelectedItem().toString();
            String lettuce = lettuceComboBox.getSelectedItem().toString();
            String tomato = tomatoComboBox.getSelectedItem().toString();
            String pickles = picklesComboBox.getSelectedItem().toString();
            String bacon = baconComboBox.getSelectedItem().toString();
            String sauce = sauce1ComboBox.getSelectedItem().toString();
            txt = txt + "<br/><br/>======= Order " + CallBackAction.orderDateTime() + 
                    " ======<br/>Cheese: " + cheese + "<br/>Lettuce: " + lettuce +
                    "<br/>Tomato: " + tomato + "<br/>Pickles: " + pickles +
                    "<br/>Bacon: " + bacon + "<br/>Sauce: " + sauce ;

            lblNewLabel.setText("<html>" + txt + "<br/>" + sql + "<html>"); 
        });
        /*btnNewButton.addActionListener(actions);

        public ActionListener actions (new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == btnNewButton) {

                }
            }
        });*/
    }
    

    public static void main(String[] args){
        //creating the instance of JFrame
        new MainFrame();
        
    }
}