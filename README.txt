To run this program:

Open the project folder in Netbeans.
Click on Run -> Set Project Configuration -> Customize
In the Arguments field, the valid choices are:
	SLL <numCustomers numVideos numRequests>
	DLL <numCustomers numVideos numRequests>
	BST <numCustomers numVideos numRequests>
	AVL <numCustomers numVideos numRequests>
The first argument designates the data structure to use for the data, if this is the only argument the program will open a menu system for 
manual creation of customers, videos, and requests.
If you wish to have my program generate random videos, customers, and requests, use arguments like this: SLL 1000 1000 1000
My program will automatically generate 1000 customers, 1000 videos, and 1000 requests. It will then use the designated data structure to perform
the number of requests, and it will output the time (in nanoseconds) that it took to complete all the requests with that data structure.