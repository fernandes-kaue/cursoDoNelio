package org.example.Modulo12EnumComposicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExercicioComposicao {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker's data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        Double workerBaseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));

        System.out.println("How many contracts to this worker?");
        int contracts = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < contracts; i++) {
            System.out.print("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date (dd/MM/yyyy): ");
            Date contractDate = sdf.parse(sc.nextLine());
            System.out.print("Value per hour: ");
            Double contractValuePerHour = sc.nextDouble();
            System.out.print("Hours: ");
            Integer contractHours = sc.nextInt();
            sc.nextLine();

            HourContract contract = new HourContract(contractDate, contractValuePerHour, contractHours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for: " + monthAndYear + " :" + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }

    static class Department {
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

    static class HourContract {
        private Date date;
        private Double valuePerHour;
        private Integer hours;

        public HourContract(Date date, Double valuePerHour, Integer hours) {
            this.date = date;
            this.valuePerHour = valuePerHour;
            this.hours = hours;
        }

        public double totalValue() {
            return valuePerHour * hours;
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

    enum WorkerLevel {
        JUNIOR, MID_LEVEL, SENIOR;
    }

    static class Worker {
        private String name;
        private WorkerLevel level;
        private Double baseSalary;

        private Department department;
        private List<HourContract> contracts = new ArrayList<>();

        public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
            this.name = name;
            this.level = level;
            this.baseSalary = baseSalary;
            this.department = department;
        }

        public void addContract(HourContract contract) {
            contracts.add(contract);
        }

        public HourContract removeContract(HourContract contract) {
            HourContract aux = contract;
            contracts.remove(contract);
            return aux;
        }

        public double income(int year, int month) {
            double sum = baseSalary;
            Calendar cal = Calendar.getInstance();
            for (HourContract contract : contracts) {
                cal.setTime(contract.getDate());
                int c_year = cal.get(Calendar.YEAR);
                int c_month = 1 + cal.get(Calendar.MONTH);
                if (year == c_year && month == c_month) {
                    sum += contract.totalValue();
                }
            }

            return sum;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public WorkerLevel getLevel() {
            return level;
        }

        public void setLevel(WorkerLevel level) {
            this.level = level;
        }

        public Double getBaseSalary() {
            return baseSalary;
        }

        public void setBaseSalary(Double baseSalary) {
            this.baseSalary = baseSalary;
        }

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }

        public void setContracts(List<HourContract> contracts) {
            this.contracts = contracts;
        }
    }

    // não sei se vou conseguir dar continuidade de noite
    // então esse commit é só pela streak no GitHub

}
