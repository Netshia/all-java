package com.ndivhuho.corejava.example2;

import java.util.Random;

public class PolicyNumberGenerator {
    private static final String PREFIX = "POL";  // Prefix for the policy number

    public static String generatePolicyNumber() {
        long timestamp = System.currentTimeMillis();  // Get the current timestamp
        System.out.println("Time Stamp: " + timestamp);

        Random random = new Random();
        int randomNumber = random.nextInt(10000);  // Generate a random number between 0 and 9999
        
        // Combine the timestamp and random number to form the policy number
        String policyNumber = PREFIX + timestamp + randomNumber;
        return policyNumber;
    }

    public static void main(String[] args) {
        String policyNumber = generatePolicyNumber();
        System.out.println("Generated Policy Number: " + policyNumber);
    }
}