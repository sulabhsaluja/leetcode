# Write your MySQL query statement below
-- select distinct contest_id, ( count(user_id) group by contest_id * 100 / count(select distinct user_id from users) as percentage
select distinct contest_id,
round(count(user_id) * 100 / (select count(user_id) from users),2) as percentage
from register
group by contest_id 
order by percentage desc, contest_id;