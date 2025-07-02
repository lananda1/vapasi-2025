package com.bookingapp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main  {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService=null;
        try {
            executorService = Executors.newFixedThreadPool(3);
            for (int i = 0; i < 5; i++) {
                executorService.submit(new Booking(i));
            }
        }  finally {
            if(executorService != null) executorService.shutdown();
        }
    }
}
