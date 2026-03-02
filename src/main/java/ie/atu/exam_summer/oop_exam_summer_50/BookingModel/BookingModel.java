package ie.atu.exam_summer.oop_exam_summer_50.BookingModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import io.swagger.v3.oas.annotations.media.Schema;

public class BookingModel {
    @Schema(accessMode = Schema.AccessMode.READONLY)
    private Long bookingID;
    @NotBlank(message = "Student Email Is Required");
    private double roomNumber;
    private String studentEmail;
    @Positive(message = "Booking Date Must Be Valid");
    private String bookingDate;
    private double startHour;
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
        public void setBookingdate(String bookingDate) {
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