public class Program {

    public static void main(String[] args) {

        boolean canexit = true;

        int day;
        int month;
        int year;

        // Create Date object
        Date objDate = new Date(1, 1, 2026);

        do {

            System.out.println("\n-------- MENU --------");
            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Display");
            System.out.println("6. Exit");

            System.out.println("Enter your choice");

            int choice = ConsoleInput.getInt();

            if (choice < 1 || choice > 6) {

                System.out.println("Invalid choice");
                continue;
            }

            switch (choice) {

                case 1: {

                    System.out.println("Enter the day");
                    day = ConsoleInput.getInt();

                    System.out.println("Enter the month");
                    month = ConsoleInput.getInt();

                    System.out.println("Enter the year");
                    year = ConsoleInput.getInt();

                    objDate.setDate(day, month, year);

                    System.out.println("Date set successfully");

                    break;
                }

                case 2: {

                    System.out.println("Enter the days to add");
                    day = ConsoleInput.getInt();

                    objDate.addDays(day);

                    System.out.println("Days added successfully");

                    break;
                }

                case 3: {

                    System.out.println("Enter the months to add");
                    month = ConsoleInput.getInt();

                    objDate.addMonth(month);

                    System.out.println("Months added successfully");

                    break;
                }

                case 4: {

                    System.out.println("Enter the years to add");
                    year = ConsoleInput.getInt();

                    objDate.addYear(year);

                    System.out.println("Years added successfully");

                    break;
                }

                case 5: {

                    System.out.println(
                        objDate.getDay() + "/" +
                        objDate.getMonth() + "/" +
                        objDate.getYear()
                    );

                    break;
                }

                case 6: {

                    System.out.println("Exiting the program");

                    canexit = false;

                    break;
                }
            }

        } while (canexit);
    }
}
