SELECT orders.product_name FROM customers JOIN orders ON customers.id = orders.customer_id
WHERE customers.name = ?;