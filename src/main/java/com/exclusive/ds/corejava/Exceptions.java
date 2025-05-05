package com.exclusive.ds.corejava;

public class Exceptions {
    public static void main(String[] args) {
        ///doing
        try {
            if (10 > 5) {
                throw new ReportCreationException("Report is not creatable");
            }
        } catch (ReportCreationException reportCreationException) {
//            dao.enable
            System.out.println(reportCreationException.getMessage());

        } finally {
            System.out.println("finally here");
        }
    }
}

//---
//Exception -> Throwable -> Object