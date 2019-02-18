# VideoRentalSystem
The goal of this optional exercise is to design and implement a simple inventory control system for a small video rental store.
Define least two classes: a class Video to model a video and a class VideoStore to model the actual store.

Assume that an object of class Video has the following attributes:

A title;
a flag to say whether it is checked out or not; and
an average user rating.
Add instance variables for each of these attributes to the Video class.

In addition, you will need to add methods corresponding to the following:

being checked out;
being returned; and
receiving a rating.
The VideoStore class will contain at least an instance variable that references an array of videos (say of length 10). 
The VideoStore will contain the following methods:
addVideo(String): add a new video (by title) to the inventory;
checkOut(String): check out a video (by title);
returnVideo(String): return a video to the store;
receiveRating(String, int) : take a user's rating for a video; and
listInventory(): list the whole inventory of videos in the store.
Finally, create a VideoStoreLauncher class with a main() method which will test the functionality of your other two classes.
It should allow the following.
Add 3 videos: "The Matrix", "Godfather II", "Star Wars Episode IV: A New Hope".
Give several ratings to each video.
Rent each video out once and return it.
List the inventory after "Godfather II" has been rented out out.
Summary of design specs:

Store a library of videos identified by title.
Allow a video to indicate whether it is currently rented out.
Allow users to rate a video and display the percentage of users that liked the video.
Print the store's inventory, listing for each video:
its title,
the average rating,
and whether it is checked out or on the shelves.
