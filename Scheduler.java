package Scheduler;
import java.util.LinkedList;

public class Scheduler {
	private LinkedList<Space> acceptedSpaces = new LinkedList<>();
	private LinkedList<Space> availableSpaces = new LinkedList<>();
	private LinkedList<Booking> pendingBookings = new LinkedList<>();
	private LinkedList<Booking>acceptedBookings= new LinkedList<>();
	private LinkedList<Booking>rejectedBookings= new LinkedList<>();
	
	
	public void acceptBooking(Booking booking) {
		    this.pendingBookings.remove(booking);
		    this.acceptedBookings.add(booking);
		    
	}
	public LinkedList<Booking> getAcceptedBookings() {
		return acceptedBookings;
	}
	public void setAcceptedBookings(LinkedList<Booking> acceptedBookings) {
		this.acceptedBookings = acceptedBookings;
	}
	public LinkedList<Booking> getRejectedBookings() {
		return rejectedBookings;
	}
	public void setRejectedBookings(LinkedList<Booking> rejectedBookings) {
		this.rejectedBookings = rejectedBookings;
	}
	
	public void rejectBooking(Booking booking) {
		this.rejectedBookings.add(booking);
		pendingBookings.remove(booking);
		
	}
	

	public LinkedList<Space> getAcceptedSpaces() {
		return acceptedSpaces;
	}

	public LinkedList<Space> getAvailableSpaces() {
		return availableSpaces;
	}
	public void setAvailableSpaces(LinkedList<Space> sp) {
		availableSpaces=sp;
	}
	
	public void addAvailableSpace(Space space) {
		this.availableSpaces.add(space);
	}
	
	public LinkedList<Booking> getPendingBookings() {
		return pendingBookings;
	}
	
	public void submitBookingForReview(Booking booking) {
		this.pendingBookings.add(booking);
	}
	
	public void cancelBooking(Booking booking) {
		// for now only pending/unapproved bookings are able to
		// be cancelled. TODO allow cancelling accepted bookings
		this.pendingBookings.remove(booking);
	}
	
}
