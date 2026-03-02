package ie.atu.exam_summer.oop_exam_summer_50.BookingModel;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import io.swagger.v3.oas.annotations.media.Schema;

public class BookingModel {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private Long bookingID;
    @NotBlank(message = "Room Number Is Required.")
    private double roomNumber;
    @Email(message = "Student Email Is Required.")
    private String studentEmail;
    @FutureOrPresent(message = "Booking Date Is Invalid.")
    private String bookingDate;
    @FutureOrPresent(message = "Invalid Starting Hour.")
    private double startHour;
    @Positive(message = "Duration Hour(s) Must Be Greater Than One.")
    private double durationHours;


    public BookingModel() {}
        public BookingModel(Long bookingID, double roomNumber, String studentEmail, String bookingDate, double startHour, double durationHours) {
            this.bookingID = bookingID;
            this.roomNumber = roomNumber;
            this.studentEmail = studentEmail;
            this.bookingDate = bookingDate;
            this.startHour = startHour;
            this.durationHours = durationHours;
        }
        public Long getBookingID() {
            return bookingID;
        }
        public void setBookingId(Long bookingID) {
            this.bookingID = bookingID;
        }

        public double getRoomNumber() {
            return roomNumber;
        }
        public void setRoomNumber(double roomNumber) {
            this.roomNumber = roomNumber;
        }

        public String getStudentEmail() {
            return studentEmail;
        }
        public void setStudentEmail(String studentEmail) {
            this.studentEmail = studentEmail;
        }
        public String getBookingDate() {
            return bookingDate;
        }
        public void setBookingDate(String bookingDate) {
            this.bookingDate = bookingDate;
        }

        public double getStartHour() {
            return startHour;
        }
        public void setStartHour(double startHour) {
            this.startHour = startHour;
        }

        public double getDurationHours() {
            return durationHours;
        }
        public void setDurationHours(double durationHours) {
            this.durationHours = durationHours;
        }
    }