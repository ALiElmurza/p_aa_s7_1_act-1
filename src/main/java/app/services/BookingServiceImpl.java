package app.services;

import app.entities.Booking;
import app.entities.Passenger;
import app.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) { this.bookingRepository = bookingRepository; }

    @Override
    public Optional<Booking> findByBookingNumber(Long bookingNumber) {
       return bookingRepository.findBookingByBookingNumber(bookingNumber);
    }

    @Override
    public Optional<Booking> findByContactPerson(Passenger contactPerson) {
        return bookingRepository.findBookingByContactPerson(contactPerson);
    }

    @Override
    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking update(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public boolean deleteByBookingNumber(Long bookingNumber) {
        return bookingRepository.deleteBookingByBookingNumber(bookingNumber);
    }

    @Override
    public List<Passenger> getAllPassengersWithBooking() {
        return bookingRepository.getAllPassengersWithBooking();
    }


}

