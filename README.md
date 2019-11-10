# camel-quartz-demo
Apache Camel with Quartz demo.
1. execute route in every 1 second and Repeat 10 times.
2. every 1 Minute, between 12-23PM, MON-FRI.

Field Name	Mandatory	Allowed Values	Allowed Special Characters </br>
Seconds	    YES	      0-59	          , - * /</br>
Minutes	    YES	      0-59	          , - * /</br>
Hours	      YES     	0-23	          , - * /</br>
Day of month	YES	    1-31          	, - * ? / L W</br>
Month	      YES	      1-12 or JAN-DEC	, - * /</br>
Day of week	YES     	1-7 or SUN-SAT	, - * ? / L #</br>
Year	      NO	 
