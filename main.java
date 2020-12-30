package machine;
import java.util.Scanner;

public class CoffeeMachine {

    public static void info(int w, int m, int cof, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(w + " of water");
        System.out.println(m + " of milk");
        System.out.println(cof + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }

    public static void choose(int water, int milk, int coffee, int cups, int money) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String option = scanner.nextLine();
        switch (option) {
            case "buy":
                System.out.println("");
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String cupCof = scanner.nextLine();
                switch (cupCof) {
                    case "1":
                        if (water >= 250 && coffee >= 16 && cups !=0) {
                            water -= 250;
                            coffee -= 16;
                            money += 4;
                            cups -= 1;
                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        } else {
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (coffee < 16) {
                                System.out.println("Sorry, not enough coffee!");
                                break;
                            } else {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                        }
                    case "2":
                        if (water >= 350 && milk >= 75 && coffee >= 20 && cups !=0) {
                            water -= 350;
                            milk -= 75;
                            coffee -= 20;
                            money += 7;
                            cups -= 1;
                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        } else {
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (coffee < 20) {
                                System.out.println("Sorry, not enough coffee!");
                                break;
                            }else {System.out.println("Sorry, not enough cups!");
                                break;
                            }
                        }
                    case "3":
                        if (water >= 200 && milk >= 100 && coffee >= 12 && cups !=0) {
                            water -= 200;
                            milk -= 100;
                            coffee -= 12;
                            money += 6;
                            cups -= 1;
                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        } else {
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            } else if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            } else if (coffee < 12) {
                                System.out.println("Sorry, not enough coffee!");
                                break;
                            }else {
                                System.out.println("Sorry, not enough cups!");
                                break;
                            }
                        }
                    case "back":
                        break;
                }
                break;
            case "fill":
                System.out.println("");
                System.out.println("Write how many ml of water do you want to add:");
                water += scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                milk += scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                coffee += scanner.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                cups += scanner.nextInt();
                break;
            case "take":
                System.out.println("I gave you $" + money);
                money = 0;
                break;
            case "remaining":
                System.out.println("");
                info(water, milk, coffee, cups, money);
                break;
            case "exit":
                System.exit(0);
        }
        choose(water, milk, coffee, cups, money);
    }
    public static void main(String[] args) {

        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cups = 9;
        int money = 550;
        choose(water, milk, coffee, cups, money);
    }
}