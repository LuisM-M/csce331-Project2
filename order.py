import random
import datetime

food_price=[4.29, 4.99, 4.65, 5.36, 7.49, 4.39, 7.49, 6.26, 7.49, 7.49, 7.29, 9.19, 9.19, 9.19, 2.29, 1.89, 1.45, 1.99, 4.09, 3.95, 2.15 ]
num_menu_items = len(food_price)

game_days = [datetime.date(2022, 10, 8), datetime.date(2022, 10, 15)]
start_date = datetime.date(2022, 10, 2)

minimum_weekly_sale = 15000
# set minimum gameday sale to be higher than non gameday
minimum_gameday_sale = (minimum_weekly_sale / 7) + 250

# referenced https://www.adamsmith.haus/python/answers/how-to-generate-a-random-date-between-two-dates-in-python
def random_date(start_date, end_date):
    time_between_dates = end_date - start_date
    days_between_dates = time_between_dates.days
    random_number_of_days = random.randrange(days_between_dates)
    random_date = start_date + datetime.timedelta(days=random_number_of_days)
    return random_date

def get_order_price(menuId, order_date):
	# generate random quantity ordered for specific food item
    food_quantity = random.randint(1, 4)    
    price = round(food_quantity * food_price[menuId], 2)
    order.write(f"{orderID}{','}{menuId}{','}{food_quantity}{','}{order_date}{','}{price}\n")
    return price

orderID = 1
game_days_idx = -1
game_day_week = False

with open ('order.csv', 'w') as order:
	order.write('order ID,Food ID,Quantity,Order date,Amount\n')

	# generate data for 3 weeks
	for week in range(3):	
		sale_total = 0
		game_day_orders = 0
		# set end_date to 7 days after start date
		end_date = start_date + datetime.timedelta(days=7)
		game_day_week = False
		game_day_sale = 0
		order_price = 0
		
		for w in game_days:
			if start_date <= w and w <= end_date:
				game_day_week = True
				game_days_idx += 1

		# as long as weekly sales < 15000, want to keep generating orders and write to csv
		while (sale_total < minimum_weekly_sale):            
			menu_id = random.randint(0, num_menu_items - 1)
			order_date = random_date(start_date, end_date)
			for g in game_days:
				if order_date in game_days:
					game_day = g
			order_price = get_order_price(menu_id, order_date)
			sale_total += order_price
			orderID += 1

		# calculate gameday sales to check if significantly higher than non-gameday
		if order_date in game_days:
			game_day_sale += order_price

		# generate more orders and write to csv if it is a game day
		while (game_day_week and (game_day_sale <= minimum_gameday_sale)):
			menu_id = random.randint(0, num_menu_items - 1)
			game_day_sale += get_order_price(menu_id, game_days[game_days_idx])
			orderID += 1			

		# reset to generate next week's orders
		start_date = end_date 

order.close()