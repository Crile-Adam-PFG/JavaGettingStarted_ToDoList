package ToDo;

import java.util.Scanner;

class Screens {
    static String mainScreenDisplay() {
        Scanner s = new Scanner(System.in);

        System.out.println("                          Main Menu");
        System.out.println("\n");
        System.out.println("1.  Open ToDo List");
        System.out.println("2.  Display ToDo List");
        System.out.println("3.  Add a ToDo List");
        System.out.println("4.  Edit ToDo List");
        System.out.println("5.  Delete ToDo List");
        System.out.println("6.  Save ToDo List");
        System.out.println("7.  Exit");
        System.out.println("\n");
        System.out.println("Select Option");
        String u = s.nextLine();
        return u;
    }

    static void openToDoMenu() {
        Scanner s = new Scanner(System.in);
        String u = "";
        do {
            System.out.println("                          Open ToDo List");
            System.out.println("1. Enter FilePath");
            System.out.println("2. Return to MainMenu");
            u = s.nextLine();
        }
        while (!u.equals("2"));

    }

    static void displayToDoMenu() {
        Scanner s = new Scanner(System.in);
        String u = "";
        do {
            System.out.println("                          Display ToDo List");
            System.out.println("1. Show All Items");
            System.out.println("2. Show Completed Items");
            System.out.println("3. Show Incomplete Items");
            System.out.println("4. Return to MainMenu");
            u = s.nextLine();
        }
        while (!u.equals("4"));

    }

    static void addToDoMenu() {
        Scanner s = new Scanner(System.in);
        String u = "";
        do {
            System.out.println("                          Add ToDo Item");
            System.out.println("1. Enter New ToDo Item Info:");
            System.out.println("2. Return to MainMenu");
            u = s.nextLine();
        }
        while (!u.equals("2"));

    }

    static void editToDoMenu() {
        Scanner s = new Scanner(System.in);
        String u = "";
        do {
            System.out.println("                          Edit ToDo Item");
            System.out.println("1. Edit New ToDo Item Info:");
            System.out.println("2. Return to MainMenu");
            u = s.nextLine();
        }
        while (!u.equals("2"));

    }

    static void deleteToDoMenu() {
        Scanner s = new Scanner(System.in);
        String u = "";
        do {
            System.out.println("                          Delete ToDo Item");
            System.out.println("1. Delete New ToDo Item Info:");
            System.out.println("2. Return to MainMenu");
            u = s.nextLine();
        }
        while (!u.equals("2"));

    }

    static void saveToDoMenu() {
        Scanner s = new Scanner(System.in);
        String u = "";
        do {
            System.out.println("                          Save ToDo Item");
            System.out.println("1. Save ToDo Item Info:");
            System.out.println("2. Return to MainMenu");
            u = s.nextLine();
        }
        while (!u.equals("2"));

    }


}