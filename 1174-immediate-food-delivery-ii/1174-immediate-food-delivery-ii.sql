# Write your MySQL query statement below
select round ((select count(*) from delivery
where (customer_id, order_date) in(
    select customer_id, min(order_date)
    from delivery
    group by customer_id
)
and order_date = customer_pref_delivery_date )* 100.0 /
(select count(distinct customer_id) from delivery), 2) as immediate_percentage