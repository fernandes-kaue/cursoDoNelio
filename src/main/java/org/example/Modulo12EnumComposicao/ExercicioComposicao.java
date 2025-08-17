package org.example.Modulo12EnumComposicao;

import java.util.Date;

public class ExercicioComposicao {
    public static void main(String[] args) {

    }

    class Department {
        private String name;

        public Department(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    class HourContract {
        private Date date;
        private Double valuePerHour;
        private Integer hours;

        public HourContract(Date date, Double valuePerHour, Integer hours) {
            this.date = date;
            this.valuePerHour = valuePerHour;
            this.hours = hours;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public Double getValuePerHour() {
            return valuePerHour;
        }

        public void setValuePerHour(Double valuePerHour) {
            this.valuePerHour = valuePerHour;
        }

        public Integer getHours() {
            return hours;
        }

        public void setHours(Integer hours) {
            this.hours = hours;
        }
    }

    enum WorkerLever {
        JUNIOR,
        MID_LEVER,
        SENIOR;
    }


}
