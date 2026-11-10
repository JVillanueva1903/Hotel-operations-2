public class Employee {

    // Private instance variables
    private final int employeeId;
    private final String name;
    private final String department;
    private final double payRate;
    private double hoursWorked;

    // Used for time tracking
    private int punchInTime;

    // Constructor
    public Employee(int employeeId, String name, String department,
                    double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchInTime = -1; // not currently punched in
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // Employee punches in
    public void punchIn(int time) {
        punchInTime = time;
    }

    // Employee punches out
    public void punchOut(int time) {
        if (punchInTime != -1) {
            hoursWorked += (time - punchInTime);
            punchInTime = -1; // reset after clocking out
        }
    }

    // Derived getter: Regular hours
    public double getRegularHours() {
        if (hoursWorked > 40) {
            return 40;
        }
        return hoursWorked;
    }

    // Derived getter: Overtime hours
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        }
        return 0;
    }

    // Derived getter: Total pay
    public double getTotalPay() {
        return (getRegularHours()  *;
    }}
