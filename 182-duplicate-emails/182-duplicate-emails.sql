# Write your MySQL query statement below
select P.email as Email  from Person as P group by email having count(email)>1; 