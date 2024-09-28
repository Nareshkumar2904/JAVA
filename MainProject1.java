
import java.util.Scanner;

class MainProject1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // System.out.println("\t\t\t Processing ...");
        Thread.sleep(2000);
        System.out.println("\t\t\tWelcome to Swiggy"); // Entering into application
        System.out.println("\t\t\t-------------------");
        System.out.println("\t\t\t Processing ...");
        Thread.sleep(3000);
        System.out.println("\t\t\t*** Select the Hotel ***");
        System.out.println("1.Buhari\n2.A2B\n3.Amma Canteen\n4.Bilal");
        // System.out.println("\t\t\t Processing ...");
        Thread.sleep(3000);
        System.out.print("\t\t\tSelect the Hotel : "); // Selecting the respective hotels
        int hotel_name = sc.nextInt(); // Storing hotel name
        switch (hotel_name) {
            case 1: { // Entering into Buhari
                System.out.println("\t\t\t Processing ...");
                Thread.sleep(3000);
                System.out.println("\t\t\t*** Greeting from Buhari ***");
                System.out.println("\t\t\t---------------------------");
                // System.out.println("\t\t\t Processing ...");
                Thread.sleep(3000);
                System.out.println("\t\t\t*** Todays Menu ***");
                System.out.println("1.Mutton Biryani\n2.Chicken Biryani\n3.Chicken-65");
                // System.out.println("\t\t\t Processing ...");
                Thread.sleep(3000);
                System.out.print("\t\t\tSelect the Buhari menu : "); // Selecting menu
                int menu = sc.nextInt(); // Storing menu item
                switch (menu) {
                    case 1: {
                        System.out.print("\t\t\tSelect the quantity : "); //Selecting quantity
                        int qty = sc.nextInt(); // Storing quantity
                        System.out.print("\t\t\tEnter the price : "); // Entering price
                        double price = sc.nextDouble();// Storing value
                        double sys_bill = qty * price; // Calulating and Storing
                        Thread.sleep(4000);
                        System.out.println("\t\t\tTotal Bill: " + sys_bill + " Rs");
                        System.out.println("\t\t\t Processing ...");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Redirect to Payment Mode... ***");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Select Payment Mode ***");
                        System.out.println("1.G-pay\n2.Phonepe");
                        Thread.sleep(3000);
                        System.out.print("\t\t\tSelect the mode: "); //Selecting payment mode
                        int mode = sc.nextInt();//Storing payment mode
                        switch (mode) {
                            case 1: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            case 2: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid Records Found");
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.print("\t\t\tSelect the quantity : "); //Selecting quantity
                        int qty = sc.nextInt(); // Storing quantity
                        System.out.print("\t\t\tEnter the price : "); // Entering price
                        double price = sc.nextDouble();// Storing value
                        double sys_bill = qty * price; // Calulating and Storing
                        Thread.sleep(4000);
                        System.out.println("\t\t\tTotal Bill: " + sys_bill + " Rs");
                        System.out.println("\t\t\t Processing ...");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Redirect to Payment Mode... ***");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Select Payment Mode ***");
                        System.out.println("1.G-pay\n2.Phonepe");
                        Thread.sleep(3000);
                        System.out.print("\t\t\tSelect the mode: "); //Selecting payment mode
                        int mode = sc.nextInt();//Storing payment mode
                        switch (mode) {
                            case 1: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            case 2: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid Records Found");
                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.print("\t\t\tSelect the quantity : "); //Selecting quantity
                        int qty = sc.nextInt(); // Storing quantity
                        System.out.print("\t\t\tEnter the price : "); // Entering price
                        double price = sc.nextDouble();// Storing value
                        double sys_bill = qty * price; // Calulating and Storing
                        Thread.sleep(4000);
                        System.out.println("\t\t\tTotal Bill: " + sys_bill + " Rs");
                        System.out.println("\t\t\t Processing ...");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Redirect to Payment Mode... ***");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Select Payment Mode ***");
                        System.out.println("1.G-pay\n2.Phonepe");
                        Thread.sleep(3000);
                        System.out.print("\t\t\tSelect the mode: "); //Selecting payment mode
                        int mode = sc.nextInt();//Storing payment mode
                        switch (mode) {
                            case 1: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            case 2: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid Records Found");
                            }
                        }
                        break;
                    }
                    default: {
                        System.out.println("Invalid Records Found");
                    }
                }
                break;
            }
            case 2: {
                System.out.println("\t\t\t Processing ...");
                Thread.sleep(3000);
                System.out.println("\t\t\t*** Greeting from A2B ***");
                System.out.println("\t\t\t---------------------------");
                // System.out.println("\t\t\t Processing ...");
                Thread.sleep(3000);
                System.out.println("\t\t\t*** Todays Menu ***");
                System.out.println("1.Idli\n2.Vada\n3.Dosa");
                // System.out.println("\t\t\t Processing ...");
                Thread.sleep(3000);
                System.out.print("\t\t\tSelect the A2B menu : "); // Selecting menu
                int menu = sc.nextInt(); // Storing menu item
                switch (menu) {
                    case 1: {
                        System.out.print("\t\t\tSelect the quantity : "); //Selecting quantity
                        int qty = sc.nextInt(); // Storing quantity
                        System.out.print("\t\t\tEnter the price : "); // Entering price
                        double price = sc.nextDouble();// Storing value
                        double sys_bill = qty * price; // Calulating and Storing
                        Thread.sleep(4000);
                        System.out.println("\t\t\tTotal Bill: " + sys_bill + " Rs");
                        System.out.println("\t\t\t Processing ...");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Redirect to Payment Mode... ***");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Select Payment Mode ***");
                        System.out.println("1.G-pay\n2.Phonepe");
                        Thread.sleep(3000);
                        System.out.print("\t\t\tSelect the mode: "); //Selecting payment mode
                        int mode = sc.nextInt();//Storing payment mode
                        switch (mode) {
                            case 1: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            case 2: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid Records Found");
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.print("\t\t\tSelect the quantity : "); //Selecting quantity
                        int qty = sc.nextInt(); // Storing quantity
                        System.out.print("\t\t\tEnter the price : "); // Entering price
                        double price = sc.nextDouble();// Storing value
                        double sys_bill = qty * price; // Calulating and Storing
                        Thread.sleep(4000);
                        System.out.println("\t\t\tTotal Bill: " + sys_bill + " Rs");
                        System.out.println("\t\t\t Processing ...");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Redirect to Payment Mode... ***");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Select Payment Mode ***");
                        System.out.println("1.G-pay\n2.Phonepe");
                        Thread.sleep(3000);
                        System.out.print("\t\t\tSelect the mode: "); //Selecting payment mode
                        int mode = sc.nextInt();//Storing payment mode
                        switch (mode) {
                            case 1: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            case 2: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid Records Found");
                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.print("\t\t\tSelect the quantity : "); //Selecting quantity
                        int qty = sc.nextInt(); // Storing quantity
                        System.out.print("\t\t\tEnter the price : "); // Entering price
                        double price = sc.nextDouble();// Storing value
                        double sys_bill = qty * price; // Calulating and Storing
                        Thread.sleep(4000);
                        System.out.println("\t\t\tTotal Bill: " + sys_bill + " Rs");
                        System.out.println("\t\t\t Processing ...");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Redirect to Payment Mode... ***");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Select Payment Mode ***");
                        System.out.println("1.G-pay\n2.Phonepe");
                        Thread.sleep(3000);
                        System.out.print("\t\t\tSelect the mode: "); //Selecting payment mode
                        int mode = sc.nextInt();//Storing payment mode
                        switch (mode) {
                            case 1: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            case 2: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid Records Found");
                            }
                        }
                        break;
                    }
                    default: {
                        System.out.println("Invalid Records Found");
                    }
                }
                break;
            }
            case 3: {
                System.out.println("\t\t\t Processing ...");
                Thread.sleep(3000);
                System.out.println("\t\t\t*** Greeting from Amma Canteen ***");
                System.out.println("\t\t\t---------------------------");
                // System.out.println("\t\t\t Processing ...");
                Thread.sleep(3000);
                System.out.println("\t\t\t*** Todays Menu ***");
                System.out.println("1.Sambar Rice\n2.Lemon Rice\n3.Curd Rice");
                // System.out.println("\t\t\t Processing ...");
                Thread.sleep(3000);
                System.out.print("\t\t\tSelect the Amma Canteen menu : "); // Selecting menu
                int menu = sc.nextInt(); // Storing menu item
                switch (menu) {
                    case 1: {
                        System.out.print("\t\t\tSelect the quantity : "); //Selecting quantity
                        int qty = sc.nextInt(); // Storing quantity
                        System.out.print("\t\t\tEnter the price : "); // Entering price
                        double price = sc.nextDouble();// Storing value
                        double sys_bill = qty * price; // Calulating and Storing
                        Thread.sleep(4000);
                        System.out.println("\t\t\tTotal Bill: " + sys_bill + " Rs");
                        System.out.println("\t\t\t Processing ...");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Redirect to Payment Mode... ***");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Select Payment Mode ***");
                        System.out.println("1.G-pay\n2.Phonepe");
                        Thread.sleep(3000);
                        System.out.print("\t\t\tSelect the mode: "); //Selecting payment mode
                        int mode = sc.nextInt();//Storing payment mode
                        switch (mode) {
                            case 1: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            case 2: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid Records Found");
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.print("\t\t\tSelect the quantity : "); //Selecting quantity
                        int qty = sc.nextInt(); // Storing quantity
                        System.out.print("\t\t\tEnter the price : "); // Entering price
                        double price = sc.nextDouble();// Storing value
                        double sys_bill = qty * price; // Calulating and Storing
                        Thread.sleep(4000);
                        System.out.println("\t\t\tTotal Bill: " + sys_bill + " Rs");
                        System.out.println("\t\t\t Processing ...");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Redirect to Payment Mode... ***");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Select Payment Mode ***");
                        System.out.println("1.G-pay\n2.Phonepe");
                        Thread.sleep(3000);
                        System.out.print("\t\t\tSelect the mode: "); //Selecting payment mode
                        int mode = sc.nextInt();//Storing payment mode
                        switch (mode) {
                            case 1: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            case 2: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid Records Found");
                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.print("\t\t\tSelect the quantity : "); //Selecting quantity
                        int qty = sc.nextInt(); // Storing quantity
                        System.out.print("\t\t\tEnter the price : "); // Entering price
                        double price = sc.nextDouble();// Storing value
                        double sys_bill = qty * price; // Calulating and Storing
                        Thread.sleep(4000);
                        System.out.println("\t\t\tTotal Bill: " + sys_bill + " Rs");
                        System.out.println("\t\t\t Processing ...");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Redirect to Payment Mode... ***");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Select Payment Mode ***");
                        System.out.println("1.G-pay\n2.Phonepe");
                        Thread.sleep(3000);
                        System.out.print("\t\t\tSelect the mode: "); //Selecting payment mode
                        int mode = sc.nextInt();//Storing payment mode
                        switch (mode) {
                            case 1: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            case 2: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid Records Found");
                            }
                        }
                        break;
                    }
                    default: {
                        System.out.println("Invalid Records Found");
                    }
                }
                break;
            }
            case 4: {
                System.out.println("\t\t\t Processing ...");
                Thread.sleep(3000);
                System.out.println("\t\t\t*** Greeting from Bilal ***");
                System.out.println("\t\t\t---------------------------");
                // System.out.println("\t\t\t Processing ...");
                Thread.sleep(3000);
                System.out.println("\t\t\t*** Todays Menu ***");
                System.out.println("1.Mutton Biryani\n2.Chicken Biryani\n3.Prawn Briyani");
                // System.out.println("\t\t\t Processing ...");
                Thread.sleep(3000);
                System.out.print("\t\t\tSelect the Bilal menu : "); // Selecting menu
                int menu = sc.nextInt(); // Storing menu item
                switch (menu) {
                    case 1: {
                        System.out.print("\t\t\tSelect the quantity : "); //Selecting quantity
                        int qty = sc.nextInt(); // Storing quantity
                        System.out.print("\t\t\tEnter the price : "); // Entering price
                        double price = sc.nextDouble();// Storing value
                        double sys_bill = qty * price; // Calulating and Storing
                        Thread.sleep(4000);
                        System.out.println("\t\t\tTotal Bill: " + sys_bill + " Rs");
                        System.out.println("\t\t\t Processing ...");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Redirect to Payment Mode... ***");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Select Payment Mode ***");
                        System.out.println("1.G-pay\n2.Phonepe");
                        Thread.sleep(3000);
                        System.out.print("\t\t\tSelect the mode: "); //Selecting payment mode
                        int mode = sc.nextInt();//Storing payment mode
                        switch (mode) {
                            case 1: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            case 2: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid Records Found");
                            }
                        }
                        break;
                    }
                    case 2: {
                        System.out.print("\t\t\tSelect the quantity : "); //Selecting quantity
                        int qty = sc.nextInt(); // Storing quantity
                        System.out.print("\t\t\tEnter the price : "); // Entering price
                        double price = sc.nextDouble();// Storing value
                        double sys_bill = qty * price; // Calulating and Storing
                        Thread.sleep(4000);
                        System.out.println("\t\t\tTotal Bill: " + sys_bill + " Rs");
                        System.out.println("\t\t\t Processing ...");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Redirect to Payment Mode... ***");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Select Payment Mode ***");
                        System.out.println("1.G-pay\n2.Phonepe");
                        Thread.sleep(3000);
                        System.out.print("\t\t\tSelect the mode: "); //Selecting payment mode
                        int mode = sc.nextInt();//Storing payment mode
                        switch (mode) {
                            case 1: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            case 2: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid Records Found");
                            }
                        }
                        break;
                    }
                    case 3: {
                        System.out.print("\t\t\tSelect the quantity : "); //Selecting quantity
                        int qty = sc.nextInt(); // Storing quantity
                        System.out.print("\t\t\tEnter the price : "); // Entering price
                        double price = sc.nextDouble();// Storing value
                        double sys_bill = qty * price; // Calulating and Storing
                        Thread.sleep(4000);
                        System.out.println("\t\t\tTotal Bill: " + sys_bill + " Rs");
                        System.out.println("\t\t\t Processing ...");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Redirect to Payment Mode... ***");
                        Thread.sleep(3000);
                        System.out.println("\t\t\t*** Select Payment Mode ***");
                        System.out.println("1.G-pay\n2.Phonepe");
                        Thread.sleep(3000);
                        System.out.print("\t\t\tSelect the mode: "); //Selecting payment mode
                        int mode = sc.nextInt();//Storing payment mode
                        switch (mode) {
                            case 1: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            case 2: {
                                Thread.sleep(3000);
                                System.out.print("\t\t\tEnter the Bill amount: "); //Entering bill amount
                                int user_bill = sc.nextInt();// Storing bill amount    
                                if (sys_bill == user_bill) { // Checking Condition satisfies
                                    System.out.println("\t\t\t Processing ...");
                                    Thread.sleep(3000);
                                    int gen_otp = (int) (Math.random() * 999 + 999); // Generate  OTP
                                    System.out.println("\t\t\tOTP Gnerated is : " + gen_otp);
                                    System.out.print("\t\t\tEnter OTP : "); // Entering OTP 
                                    int user_otp = sc.nextInt(); // Storing OTP
                                    if (user_otp == gen_otp) { // Checking Condition satisfies
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println();
                                        System.out.println();
                                        System.out.println("\t\t\t*** Order Placed Successfully.... ***");
                                    } else {
                                        System.out.println("\t\t\t Processing ...");
                                        Thread.sleep(3000);
                                        System.out.println("Order failed....");
                                    }
                                } else {
                                    System.out.println("Order failed");
                                }
                                break;
                            }
                            default: {
                                System.out.println("Invalid Records Found");
                            }
                        }
                        break;
                    }
                    default: {
                        System.out.println("Invalid Records Found");
                    }
                }
                break;
            }
            default: {
                System.out.println("Invalid Input...");
                break;
            }
        }

    }
}
