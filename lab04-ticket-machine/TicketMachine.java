/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets at 500 cents.
     */
    public TicketMachine()
    {
        price = 500;
        balance = 0;
        total = 0;
    }

    /**
     * Creates a machine that issues tickets at the inputed value.
     */
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }
    
    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }
    
    /**
     * Sets the price of a ticket.
     */
    public void setPrice(int cost)
    {
        price = cost;
    }

    /**
     * Reduce price by given amount
     */
    public void discount(int amount)
    {
        price = price - amount;
    }
    
    /**
     * Prints out "Please insert the correct amount of money."
     */
    public void prompt()
    {
        System.out.println("Please Insert the correct amount of money.");
    }
    
    /**
     * Prints out the price of a ticket.
     */
    public void showPrice()
    {
        System.out.println("The price of a ticket is " + price + " cents.");
    }
    
    /**
     * Takes all the money out of the machine.
     * Sets the total to 0.
     */
    public void empty()
    {
        total = 0;
    }
    
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        // Clear the balance.
        balance = 0;
    }
}
