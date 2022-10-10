import javax.swing.*;
public class gui{
    public gui(){
        JFrame system = new JFrame();
        JButton button = new JButton("Sandwichs");
        button.setBounds(300,0,100,50);
        system.add(button);

        JButton salad = new JButton("Salids");
        salad.setBounds(400, 0, 100, 50);
        system.add(salad);

        JButton drinks = new JButton("Drinks");
        drinks.setBounds(500, 0, 100,50);
        system.add(drinks);

        JButton dessert = new JButton("Desserts");
        dessert.setBounds(600, 0, 100,50);
        system.add(dessert);

        JButton manager = new JButton("Manger");
        manager.setBounds(0, 410, 100, 50);
        system.add(manager);

        system.setSize(800,500);
        system.setLayout(null);
        system.setVisible(true);



    }
    public static void main(String[] args){
        //creating the instance of JFrame
        new gui();
        
    }
}