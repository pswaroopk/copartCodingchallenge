Team Members
Ashwin Kumar Muruganandam - Tag no (27) Email ID (axm164730@utdallas.edu)
Swaroop Kumar Pydisetty - Tag no (26) Email ID (skp150330@utdallas.edu)
Raghav Mathur - Tag no (25) Email ID (rxm162130@utdallas.edu)

Question 1 

Completed -
We have two tables, one is for the customer which has the user id and what facilities he will be needing. Second table is for Copart, it contains entries of all the copart offices with their facilities, zipcode, city and state. 

When the user provides the user id, we get the list of all the facilities he has subscribed for. Then for each of these facilities we find all the copart offices which provides those facilites and add its zipcode in an arraylist. 

Now for finding the nearest copart, we used Zip Code Api. We found distance between two zipcodes from the API. And we found the nearest copart facility. 

Yet to do - 

With the nearest zipcode, we can query the copart table and get the city and state for the copart office.    


Question 2

We used google api for this question. We got the result JSON file as a String. To traverse the list to get City and State we used Gson. 

We created Pojo class - Address. Result will be stored in this POjo Object.  

compile problem 2 using
javac problem2/*.java
execute by
java problem2.APIRequest
prompt: "Enter Zipcode: "
output: Dallas, TX

Question - 3

compile problem 3 using
javac problem3/DNASequencing.java
execute by
java problem3.DNASequencing input3.txt

Question - 4

compile problem 4 using
javac problem4/PieceOfCake.java
execute by
java problem4.PieceOfCake input4.txt

Project Ideas

Alexa, Deploy my code to Dev1

Since we dont have hardware, we went ahead and created android project for the same. It listens to the user, whenever we say the start, Build gets started. Similarly when we say stop, build gets stopped. Since we dont have access to deploying build manager part, we have simply printed "Build has started" or "Build has been stopped" based on the user input. We can easily integrate triggering process with this project for complete one. 

Code has been implemented and project is been uploaded. 


Event/Messageing queus:

When two inputs come simultaneously, we need to write the entry into the table by implementing synchronization via semaphores. This way mutual exclusion can be achieved and the data overlapping can be prevented. If the data entered is just time, we can get data accurate to a milli second and hence we dont need semaphores in this case. So based on the type of table entry, we can achieve mutual exclusion. 


