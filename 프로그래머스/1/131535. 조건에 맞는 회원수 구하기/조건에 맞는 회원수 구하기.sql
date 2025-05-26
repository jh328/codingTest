select count(*)
from USER_INFO AS u
where u.JOINED LIKE '2021%'
and u.age between 20 and 29