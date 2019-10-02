/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author nuclei
 */
public class BanquetHall {



    public int id;
    public String name;
    public String location;
    public int max_guests;
    public String date;
    public int menu_1;
    public int menu_2;
    public int menu_3;

    /**
     *
     * @param id
     * @param name
     * @param location
     * @param max_guests
     * @param date
     * @param menu_1
     * @param menu_3
     * @param menu_3
     */
    public BanquetHall(int id, String name, String location, int max_guests, String date, int menu_1, int menu_2, int menu_3) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.max_guests = max_guests;
        this.date = date;
        this.menu_1 = menu_1;
        this.menu_2 = menu_2;
        this.menu_3 = menu_3;

    }
    
    

    public void print() {
        System.out.println("\nCustomer name \t: " + id);
        System.out.println("Id \t\t: " + name);
        System.out.println("Total \t\t: " + location);
        System.out.println("Total \t\t: " + max_guests);
        System.out.println("Total \t\t: " + date);
        System.out.println("Total \t\t: " + menu_1);
        System.out.println("Total \t\t: " + menu_2);
        System.out.println("Total \t\t: " + menu_3);

    }

}
