SELECT i.ANIMAL_ID, i.NAME 
from ANIMAL_OUTS o, ANIMAL_INS i
where o.ANIMAL_ID = i.ANIMAL_ID  
order by o.datetime - i.datetime desc
limit 2;