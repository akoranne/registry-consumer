package io.sarkkom.model;

/**
 * Created by ajaykoranne on 6/10/16.
 */
public class Reservation {
	private Long Id;
	private String reservationName;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getReservationName() {
		return reservationName;
	}

	public void setReservationName(String reservationName) {
		this.reservationName = reservationName;
	}

}
