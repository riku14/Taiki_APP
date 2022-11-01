select *
from m_customer
Where CUST_NO = 
(
	select CREATE_PERSON from m_customer where CUST_ID = 'eee' 
) 