package com.xworkz.table.dto;

public class StudentDTO {

        private String name;
        private int age;
        private String course;
        private String college;
        private double percentage;
        private boolean scholarship;
        private String city;
        private int yearOfStudy;
        private String contactNumber;
        private boolean hosteler;

        public StudentDTO(String name, int age, String course, String college, double percentage,
                          boolean scholarship, String city, int yearOfStudy, String contactNumber, boolean hosteler) {
            this.name = name;
            this.age = age;
            this.course = course;
            this.college = college;
            this.percentage = percentage;
            this.scholarship = scholarship;
            this.city = city;
            this.yearOfStudy = yearOfStudy;
            this.contactNumber = contactNumber;
            this.hosteler = hosteler;
        }

        @Override
        public String toString() {
            return "StudentDTO{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", course='" + course + '\'' +
                    ", college='" + college + '\'' +
                    ", percentage=" + percentage +
                    ", scholarship=" + scholarship +
                    ", city='" + city + '\'' +
                    ", yearOfStudy=" + yearOfStudy +
                    ", contactNumber='" + contactNumber + '\'' +
                    ", hosteler=" + hosteler +
                    '}';
        }
    }


