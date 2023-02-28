package app.services;

import app.entities.Booking;
import app.entities.Passenger;

import java.util.List;
import java.util.Optional;

/**
 * The service is designed to perform standard CRUD operations.
 * It is possible to get a list of all passengers.
 * Retrieve a passenger by booking number and contact details.
 */

public interface BookingService {

    /**
     * Booking search by number
     */
    Optional<Booking> findByBookingNumber(Long bookingNumber);

    /**
     * Booking search by buyer contacts
     */
    Optional<Booking> findByContactPerson(Passenger contactPerson);

    /**
     * Saving the essence of booking
     */
    Booking save(Booking booking);

    /**
     * Booking entity update
     */
    Booking update(Booking booking);

    /**
     * Deleting the entity Booking by number
     */
    boolean deleteByBookingNumber(Long bookingNumber);

    /**
     * Get a list of buyers with booking
     */
    List<Passenger> getAllPassengersWithBooking();
}
