package com.simple.thread;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DuelClock {
    public static void main(String[] args) {
        // 한국시간 시계 쓰레드
        Thread koreaClock = new Thread(()->{
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("HH:mm:ss");
            while (true) {
                LocalDateTime nowkorea = LocalDateTime.now(
                        ZoneId.of("Asia/Seoul"));
                System.out.println("[한국시간]"+nowkorea.format(formatter));
                try {
                Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        // 미국시간 시계 쓰레드
        Thread New_yorkClock = new Thread(()->{
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("HH:mm:ss");
            while (true) {
                LocalDateTime nowkorea = LocalDateTime.now(
                        ZoneId.of("America/New_York"));
                System.out.println("[미국시간]" + nowkorea.format(formatter));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        // 데몬 쓰레드로 설정
        koreaClock.setDaemon(true);

        koreaClock.start();
        New_yorkClock.start();

        // 메인이 어느 정도 동작하도록 설정
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
