# Write your MySQL query statement below
select distinct e1.employee_id, e1.department_id from employee e1
where e1.primary_flag = 'Y' or
employee_id in (
    select employee_id from employee
    group by employee_id
    having count(employee_id) = 1
)