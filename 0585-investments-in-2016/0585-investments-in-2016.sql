# Write your MySQL query statement below
select round(sum(tiv_2016), 2) as tiv_2016
from insurance where pid in
(select p1.pid 
    from insurance p1
    join insurance p2
    on p1.tiv_2015 = p2.tiv_2015
    and p1.pid != p2.pid
)
and pid not in
(
    select p1.pid
    from insurance p1
    join insurance p2
    on p1.lon = p2.lon
    and p1.lat = p2.lat
    and p1.pid != p2.pid
)