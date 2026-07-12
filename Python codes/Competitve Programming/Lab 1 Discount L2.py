def calculate_final_cost(items):
    subtotal =0
    for price, discount_price in items:
        item_cost= price -(price *discount_price/100)
        subtotal= subtotal + item_cost
    percentage_discount =0
    fixed_discount =0
    if subtotal > 500:
        percentage_discount= subtotal *0.10
    elif subtotal > 1000 :
        fixed_discount= 150
    discount = max(percentage_discount, fixed_discount)
    final_cost=subtotal - discount
    return int(final_cost)

n= int(input())
items = [tuple(map(int,input().split())) for _ in range(n)]
print(calculate_final_cost(items))