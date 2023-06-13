package com.ndivhuho.corejava.example2;

import java.security.SecureRandom;

public class LongGenerator {

    public static void main(String[] args) {
        System.out.println(uniquePolicyNumberGenerator());
    }

    private static long bytesToLong(final byte[] bytes) {
        long value = 0;
        for (byte aByte : bytes) {
            value = (value << 8) + (aByte & 0xff);
        }
        return Math.abs(value);
    }
    /**
     * The method generate a random unique policy number by mean of using SecureRandom
     * By using SecureRandom the collusion rate is reduced significantly
     * @return long type value which is unique
     */
    private static long uniquePolicyNumberGenerator() {
        final SecureRandom secureRandom = new SecureRandom();
        final byte[] randomBytes = new byte[8];
        secureRandom.nextBytes(randomBytes);
        return bytesToLong(randomBytes);
    }
}
