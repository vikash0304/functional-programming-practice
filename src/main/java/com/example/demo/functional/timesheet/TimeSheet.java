//package com.example.demo.functional.timesheet;
//
//import java.time.Instant;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class TimeSheet {
//
//    public static void main(String[] args) {
//        getTimeSheet(Arrays.asList(100, "sprint1",Arrays.asList(Instant.EPOCH.getEpochSecond())));
//
//        }
//
//    public static Map<String, Map<String, Long>> getTimeSheet(List<Issue> issues) {
//        return issues.stream()
//                .flatMap(i->i.workLogs.stream())
//                .collect(Collectors.groupingBy(w->getMonth(w.epochCreated),
//                        Collectors.groupingBy(w->w.userName, Collectors.summingLong(w->w.minutesWorked))));
//    }
//
////    public static String getMonth(long epoc) {
//////        return Instant.ofEpochMilli(epoc).
////    }
//
//
//}
