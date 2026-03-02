package ie.atu.exam_summer.oop_exam_summer_50.BookingService;

import ie.atu.exam_summer.oop_exam_summer_50.BookingModel.BookingModel;
import ie.atu.exam_summer.oop_exam_summer_50.BookingModel.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BookingService {
    private List<BookingModel> bookings = new ArrayList<>();
    private long bookingID = 1;

    public BookingModel addBookingModel(BookingModel bookingModel) {
        bookingModel.setBookingId(bookingID++);
        bookings.add(bookingModel);
        return bookingModel;
    }

    public List<BookingModel> getAllBookings() {
        return bookings;
    }

    public List<BookingModel> getBookingByID(String ID) {
        return bookings;
    }
}
