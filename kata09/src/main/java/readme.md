# In fact this week’s prices are

  Item   Unit      Special
         Price     Price
  --------------------------
    A     50       3 for 130
    B     30       2 for 45
    C     20
    D     15



# interface

co = CheckOut.new(pricing_rules)
co.scan(item)
co.scan(item)
    :    :
price = co.total