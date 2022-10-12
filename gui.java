import javax.swing.*;
public class gui{
    public gui(){
        JFrame system = new JFrame();
        JButton button = new JButton("Sandwiches");
        button.setBounds(300,0,100,50);
        system.add(button);

        JButton salad = new JButton("Salids");
        salad.setBounds(400, 0, 100, 50);
        system.add(salad);

        JButton cookie = new JButton("Cookies");
        cookie.setBounds(700, 0, 100, 50);
        system.add(cookie);

        JButton drinks = new JButton("Fountain Drinks");
        drinks.setBounds(300, 50, 200,50);
        system.add(drinks);

        JButton dessert = new JButton("Browie");
        dessert.setBounds(500, 50, 100,50);
        system.add(dessert);

        JButton fries = new JButton("Fries");
        fries.setBounds(600,50,100,50);
        system.add(fries);

        JButton nuggets = new JButton("nuggets");
        nuggets.setBounds(700, 50, 100, 50);
        system.add(nuggets);

        JButton club = new JButton("Grilled Chicken Club");
        club.setBounds(300, 100, 250, 50);
        system.add(club);

        JButton coolwrap = new JButton("Grilled Chicken Cool Wrap");
        coolwrap.setBounds(550, 100, 250, 50);
        system.add(coolwrap);

        JButton spicy = new JButton("Spicy Chicken Sandwich");
        spicy.setBounds(300, 150, 200, 50);
        system.add(spicy);

        JButton deluxe = new JButton("Chic-Fil-A Deluxe");
        deluxe.setBounds(500, 150, 150, 50);
        system.add(deluxe);

        JButton sdeluxe = new JButton("Spicy Deluxe");
        sdeluxe.setBounds(650, 150, 150, 50);
        system.add(sdeluxe);

        JButton sssalid = new JButton("Spicy Southwest Salad");
        sssalid.setBounds(300, 200, 200, 50);
        system.add(sssalid);

        JButton cobbsalad = new JButton("Cobb Salad");
        cobbsalad.setBounds(500, 200, 150, 50);
        system.add(cobbsalad);

        JButton marketsalid = new JButton("Market Salad");
        marketsalid.setBounds(650, 200, 150, 50);
        system.add(marketsalid);

        JButton frostedcoffee = new JButton("Frosted Coffee");
        frostedcoffee.setBounds(300,250,150,50);
        system.add(frostedcoffee);

        JButton lemonade = new JButton("Lemonade");
        lemonade.setBounds(450,250,150,50);
        system.add(lemonade);

        JButton IcedTea = new JButton("Ice Tea");
        IcedTea.setBounds(600,250,100,50);
        system.add(IcedTea);

        JButton milkshake = new JButton("Milkshake");
        milkshake.setBounds(700,250,100,50);
        system.add(milkshake);


        JButton manager = new JButton("Manager");
        manager.setBounds(0, 410, 100, 50);
        system.add(manager);

        JButton amount = new JButton("1");
        amount.setBounds(300, 410, 100, 50);
        system.add(amount);

        

        JButton amount2 = new JButton("2");
        amount2.setBounds(400, 410, 100, 50);
        system.add(amount2);

        system.setSize(800,500);
        system.setLayout(null);
        system.setVisible(true);



    }
    /*public static void main(String[] args){
        //creating the instance of JFrame
        new gui();
        
    }*/
}