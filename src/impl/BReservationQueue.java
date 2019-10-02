/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impl;

import java.util.ArrayList;
import src.BanquetHall;

/**
 *
 * @author nuclei
 */
public class BReservationQueue {

    private int size; //size of the queue
    private BanquetHall storage[]; //buffer
    private int front; //for the head of the list
    private int rear; // for the tail of the list

    //set size,first,last and storage 
    public BReservationQueue(int aSize) {
        this.size = aSize;
        this.front = -1;  //set the head
        this.rear = -1;  //set the tail
        storage = new BanquetHall[size]; // create an array to the given size 
    }

    //is the queue empty
    public boolean isEmpty() {
        return front == -1;
    }

    //is the queue full
    public boolean isFull() {
        return (front == 0 && rear == size - 1) || (front == rear + 1);
    }

    //Add
    public void enqueue(BanquetHall cs) throws IllegalStateException {
        if (isFull()) {
            throw new IllegalStateException("Queue is full:Overflow");
        } else //if the queue is not full,add to the rear
        {
            if (front == -1) //if the queue is empty, advance the first pointer
            {
                front = 0;
            }

            rear = (rear + 1) % size; // Going round and round concept. Advance the rear pointer
            storage[rear] = cs;  //insert the latest element at the rear of the queue
        }

    }

    //Remove
    public BanquetHall dequeue() throws IllegalStateException {
        BanquetHall cs = null;

        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty: Underflow");
        } else {
            cs = storage[front];

            if (front != rear) //queue has multiple elements
            {
                front = (front + 1) % size; //advance the front pointer. 
                //If the front is same as the size,then rest the size. repeats the array from the beginning
            } else {
                front = -1;
                rear = -1;
            }
        }

        return cs;
    }

    public ArrayList<BanquetHall> getAllBanquets() {
        ArrayList<BanquetHall> list = new ArrayList<BanquetHall>();
        for (int i = 0; i < storage.length; i++) {
            BanquetHall b = storage[i];
            list.add(b);
        }
        return list;
    }

    public BanquetHall getBanquetsByIndex(int i) {

        return storage[i];

    }
    
     public void removeByIndex(int index) {
        BanquetHall newStorage[] = new BanquetHall[this.size];
        int x = 0;
        for (int i = 0; i < storage.length; i++) {
            if(index != i){
//                System.out.println("----------------");
             BanquetHall b = storage[i];
             newStorage[x] = b;
             x = x+1;
            }
 
        }
       
        storage = newStorage;
 
    }
 
}
