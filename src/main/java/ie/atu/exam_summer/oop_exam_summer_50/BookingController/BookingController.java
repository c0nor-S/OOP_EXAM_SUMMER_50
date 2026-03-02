package ie.atu.exam_summer.oop_exam_summer_50.BookingController;

import ie.atu.exam_summer.oop_exam_summer_50.*;
import ie.atu.exam_summer.oop_exam_summer_50.BookingModel.BookingModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @GetMapping("/bookingID")
    public String getBookingID(@PathVariable Long bookingID, String roomNumber, String studentEmail, double bookingDate, double startHour, double durationHour) {
        return "Booking ID: " + bookingID + " Room Number: " + roomNumber + " Student Email: " + studentEmail + " Booking Date: " + bookingDate + " Start Hour: " + startHour + " Duration Hours: " + durationHour;
    }
}

