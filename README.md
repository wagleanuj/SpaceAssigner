# Scheduler
CS3716 Project
# CS3716 Group Project - Scheduling System

## Repository URL

You can find the repository at https://github.com/wagleanuj/CS3716Scheduler

## Course Details

* **Course Name:** Computer Science 3716 - Software Methodology
* **Instructor:** Dr. Adrian Fiech
* **Teaching Assistant:** Sipan Ye
* Memorial University of Newfoundland, St. John's, NL, Canada

## Group Details and Point Distribution

### Group 11

There are four members in our group. **Dr. Fiech is aware of this.**

* Anuj Wagle (aw7464@mun.ca)
* Prasanga Dhakal (pd4537@mun.ca
* Wenrui Zhen (wz8031@mun.ca)


### Point Distribution

The point distribution for three group memebers are as follow:

* Anuj Wagle - **10 points** - Anuj supervised the entire project
  and made critical development decisions. Anuj was responsible for
  object serialization, managing the Git repository and writing
  `AddSpaces.java`, 'UserBooking.java' , `Scheduler.java` and  'IntervalMapper.java'.

* Prasanga Dhakal - **10 points** - Prasanga composed the initial GUI design.
  Prasanga was also responsible for writing parts of `Booking.java`, `CheckAcceptance.java`,Test.java`, 'Interval.java'
  and various improvements to the code base.

* Wenrui Zhen - **10 points** - Wenrui was responsible for writing the
  code for handling conflict. Wenrui also wrote `Login.java`,'UserSelection.java','Day.java'  and `AdminPanel.java`
  `Booking.java`, and `Space.java`. He also focused on error handling
 and wrote the Eclipse **Instructions** at the
  end of this document..


 

## Instructions

1. Clone the repository: `git clone https://github.com/wagleanuj/SpaceAssigner`

2. Open Eclipse.

3. Click on **File** -> **New** -> **Java Project**

4. Uncheck the checkbox **Use Default Location**

5. Click on **Browse** and select the `CS3716Scheduler` repository you
   cloned in **Step 1**.

6. Click on **Finish**.

7. In Eclipse, right-click on the file **Test.java**, and then click on
   **Run As** -> **Java Application**

8. Enjoy our application! We hope you like it!

## Description
This program allows the Principal to set the schedule for two spaces which 
can be further extended to support more spaces. For example principal can 
make schedule for gym by putting the available days and available times for the 
space. Then the coach can select an interval from the times that are available.

The principal can view all the pending bookings and select the bookings that he wants
to reject or accept. Then the user will be able to see which requests got accepted and 
rejected.

All the objects implement `Serializable` and the schedule is saved by
serializing the Schedule object and the inner class objects and writing it to a file 'data.txt'. 
The object is reloaded from the file every time the program is started.

