public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee(
                101,
                "John Smith",
                "Sales",
                20.00,
                0
        );

        emp.punchIn(10);   // 10:00 AM
        emp.punchOut(12);  // 12:00 PM

        emp.punchIn(14);   // 2:00 PM
        emp.punchOut(18);  // 6:00 PM

        System.out.println("Hours Worked: " + emp.getHoursWorked());
        System.out.println("Total Pay: $" + emp.getTotalPay());
    }
}
