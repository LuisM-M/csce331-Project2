gameday1 = 8 # This is the date of the gameday
gameday2 = 15 # This is the date of the gameday
begin = 1
end = 22

# This is the quantities that these items are starting
napkin = 100
cups = 150
cup_lid = 150
cf_sauce = 1000
poly_sauce = 1000
chicken = 700
burger = 1100
fries = 1000
lettuce = 100
brownie = 200
lemonade = 50
batter = 15


# how to open and add things to the csv, learned from https://www.pythontutorial.net/python-basics/python-write-csv-file/
with open('supply.csv', 'w') as writer:
    writer.write("Item ID,Item, Supply quantity, Units, Date\n")

    # This is for the date for the 3 weeks
    for i in range(1,end+1):
        # On the gameday this how much is taken
        if i == gameday1 or i == gameday2:
            napkin -= 30
            cups -= 40
            cup_lid -= 40
            cf_sauce -= 300
            poly_sauce -= 150
            chicken -= 110
            burger -= 200
            fries -= 240
            lettuce -= 15
            brownie -= 45
            batter -= 5

        # Otherwise
        else:
            napkin -= 10
            cups -= 15
            cup_lid -= 15
            cf_sauce -= 150
            poly_sauce -= 50
            chicken -= 60
            burger -= 100
            fries -= 100
            lettuce -= 5
            brownie -= 15
            batter -= 2
        
        # if it is less than a certain amount, add back by the original number and add it into the list
        if napkin <= 5:
            napkin += 100

        writer.write('200,napkin,'+str(napkin)+',batches,10/'+str(i)+'/2022\n')

        
        if cups <= 15: 
            cups += 150
        
        
        writer.write('201,cups,'+str(cups)+',batches,10/'+str(i)+"/2022\n")

        
        if cup_lid <= 15:
            cup_lid += 150
        
        writer.write('202,cup lid,'+str(cup_lid)+',batches,10/'+str(i)+"/2022\n")


        if cf_sauce <= 100:
            cf_sauce += 1000
        
        writer.write('203,Chic-Fil-A Sauce,'+str(cf_sauce)+',saucer,10/'+str(i)+"/2022\n")

        
        if poly_sauce <= 50:
            poly_sauce += 1000
        
        writer.write('204,Polynesian Sauce,'+str(poly_sauce)+',saucer,10/'+str(i)+"/2022\n")

        
        if chicken <= 30:
            chicken += 700
        
        writer.write('205,Chicken,'+str(chicken)+',pounds,10/'+str(i)+"/2022\n")
        
        if burger <= 50:
            burger += 1100
        
        writer.write('206,Burger buns,'+str(burger)+',buns,10/'+str(i)+"/2022\n")

        if fries < 40:
            fries += 1000
        writer.write('207,Fries,'+str(fries)+',pounds,10/'+str(i)+"/2022\n")

        if lettuce < 5:
            lettuce += 100
        writer.write('208,Lettuce,'+str(lettuce)+',pounds,10/'+str(i)+"/2022\n")

        if brownie < 10:
            brownie += 200
        writer.write('209,Browie,'+str(brownie)+',pounds,10/'+str(i)+"/2022\n")

        if batter < 3:
            batter += 15
        writer.write('210,Batter,'+str(batter)+',pounds,10/'+str(i)+"/2022\n")
        









 








        
        
        
        







