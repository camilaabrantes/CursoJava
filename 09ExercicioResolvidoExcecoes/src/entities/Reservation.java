package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import entities.exception.DomainException;

public class Reservation {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		
		if(checkOut.before(checkIn)) {
			throw new DomainException("Error - data de Check out não pode ser anterior a data de Check in!");
		}		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public Date getCheckIn() {
		return checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		
		
	}

	public void updateDate(Date checkIn, Date checkOut) {
		Date today = new Date();
		if(checkOut.before(checkIn)) {
			throw new DomainException("Error - data de Check out não pode ser anterior a data de Check in!");
		}		
		if(checkIn.before(today) || checkOut.before(today)) {
			throw new DomainException("Error - data da reserva não pode ser anterior ao dia de hoje!");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public 	String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Reservation: Room ");
		sb.append(roomNumber);
		sb.append(", check in: ");
		sb.append(sdf.format(checkIn));
		sb.append(", check out: ");
		sb.append(sdf.format(checkOut));
		sb.append(", ");
		sb.append(duration());
		sb.append(" nights.");
		
		return sb.toString();
	}

}
