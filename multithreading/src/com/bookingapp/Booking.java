package com.bookingapp;

public class Booking implements Runnable {
        int  id;

    public Booking(int booking) {
        this.id = booking;
    }

    public int getBookingId() {
        return id;
    }

    public void setBookingId(int booking) {
        this.id = booking;
    }

    void processBooking(int id) {
        System.out.println("Booking Received with id " + id);
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
        }
    }

    void processPayment(int id) {
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
        }
        System.out.println("Payment processed for booking id " + id);
    }

    void confirmTicket(int id) {
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
        }
        System.out.println("Ticket confirmed for booking id " + id);
    }
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()  +" is processing request for id " + id);
            processBooking(id);
            processPayment(id);
            confirmTicket(id);
        } catch (Exception e) {
            System.out.println("Error during booking! terminating program");
            throw new RuntimeException(e);
        }
    }
}
