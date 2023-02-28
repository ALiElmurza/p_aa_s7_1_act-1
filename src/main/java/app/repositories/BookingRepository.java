package app.repositories;


import app.entities.Booking;
import app.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findBookingByBookingNumber(Long bookingNumber);

    Optional<Booking> findBookingByContactPerson(Passenger contactPerson);

    boolean deleteBookingByBookingNumber(Long bookingNumber);

    @Query("SELECT passengers FROM Booking")
    List<Passenger> getAllPassengersWithBooking();
}
