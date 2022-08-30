package co.com.Tyba.prueba.utils;

import java.security.SecureRandom;

public class NumberRandom {

        private static SecureRandom nr = new SecureRandom();

        private NumberRandom(){}

        public static String username(long min, long max){
            return String.valueOf(min + nr.nextInt((int) max));
        }

}
