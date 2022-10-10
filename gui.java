import javax.swing.*;
public class gui{
    public gui(){
        JFrame system = new JFrame();
        JButton button = new JButton("Sandwichs");
        button.setBounds(100,0,100,30);
        system.add(button);

        JButton salad = new JButton("Salids");
        salad.setBounds(200, 0, 100, 30);
        system.add(salad);

        JButton drinks = new JButton("Drinks");
        drinks.setBounds(300, 0, 100, 30);
        system.add(drinks);

        system.setSize(500,500);
        system.setLayout(null);
        system.setVisible(true);



    }
    public static void main(String[] args){
        //creating the instance of JFrame
        new gui();
        
    }
}