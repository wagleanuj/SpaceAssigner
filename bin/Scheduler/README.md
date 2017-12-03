# Space Assigner

## 3716 Project - Fall 2017
### Group 11
#### Repo: https://github.com/wagleanuj/SpaceAssigner
## Members

**Anuj Wagle**

**Prasanga Dhakal**

**Wenrui Zhen**

## Introduction 
This program, making use of some design patterns taught in class, allows the Principal to set the schedule for two spaces which can be further extended to support more spaces. For example principal can 
make schedule for gym by putting the available days and available times for the 
space. Then the coach can select an interval from the times that are available.

The principal can view all the pending bookings and select the bookings that he wants
to reject or accept. Then the user will be able to see which requests got accepted and 
rejected.
Once a schedule is created , it is saved in a txt file which can be extended to make use of databases.
 

## How to import and run:
1. Clone the repository
2. In eclipse go to  **File** > **Open Projects from File System** > **Directory** 
3. Choose the cloned project directory
4. Click Finish
5. Run `Test.java` as java application

## Contribution

* Anuj Wagle ( **10 points** )
	1. Made the class diagrams and the architechture for the program
	2. Made the GUI design
	3. **Contributions**:  `AddSpaces.java`, `UserBooking.java` , `Scheduler.java` and  `IntervalMapper.java`.

* Prasanga Dhakal(**10 points**)
	1. Made some GUI components
	2. **Contributions**: `Booking.java`, `CheckAcceptance.java`,`Test.java`, `Interval.java`
  

* Wenrui Zhen(**10 points**) 
	1. Made conflict handling part
  	2. Contributions: `Login.java`,`UserSelection.java`,`Day.java`  and `AdminPanel.java`
  `Booking.java`, and `Space.java`. 
   
Any questions can be forwarded to **aw7464@mun.ca**
 

## How to use the program
### Creating a Space
To make a schedule as a principal, login as administrator and click on add at the bottom.
Choose the location( GYM or STUDY ROOM). THen select the months you want the spot to be available
in .
Choose the start and end times and the days you want the spot to be available in .
Then submit the space. This will save the space.

### Requesting a Space
To request a space, simply login as a student then select the space then dhoose the times that you want to book
Then fill in your name and student number and interval you want and submit.

### Accepting and rejecting a request
To accept or reject, login as admin then click on the request you want to accept or reject,
then click accept or reject respectively.

### Checking acceptance as a student
To check whether your request got accepted or rejected, login as student and click on check bookings
You can see which spots got rejected and accepted. 
