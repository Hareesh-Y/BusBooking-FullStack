package com.booking.service.exception;

public class SeatAlreadyBookedException extends RuntimeException {
	public SeatAlreadyBookedException(String message) {
		super(message);
	}
}
