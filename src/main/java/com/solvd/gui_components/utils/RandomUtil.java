package com.solvd.gui_components.utils;

import com.solvd.gui_components.enums.Month;

import java.util.Random;

public class RandomUtil {

    private final Random random = new Random();

    public String getRandomString(int length) {
        final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }

        return sb.toString();
    }

    public String getRandomNumber(int numDigits) {
        if (numDigits < 1) {
            throw new IllegalArgumentException("Number of digits must be at least 1.");
        }
        int min = (int) Math.pow(10, numDigits - 1);
        int max = (int) Math.pow(10, numDigits) - 1;
        int result = (int) (Math.random() * (max - min + 1) + min);
        return String.valueOf(result);
    }

    public int getRandomDay() {
        return random.nextInt(31) + 1;
    }

    public String getRandomMonth() {
        Month[] months = Month.values();
        return months[random.nextInt(months.length)].getMonth();
    }

    public int getRandomYear() {
        return random.nextInt(111) + 1913;
    }

    public String getRandomEmail() {
        String username = getRandomString(10);
        String domain = getRandomString(5);
        String email = username + "@" + domain + ".com";
        return email;
    }
}