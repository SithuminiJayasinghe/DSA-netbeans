/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz;

import src.BanquetHall;
import impl.BReservationQueue;
import java.util.ArrayList;

/**
 *
 * @author nuclei
 */
public class Main {
    	public static void main(String[] ar) {
            
            
        ArrayList<BanquetHall> list=new ArrayList<BanquetHall>();

        BanquetHall b1=new BanquetHall(1,"bh1","colombo",100,"2019-10-01",1000,2000,3000);
        BanquetHall b2=new BanquetHall(2,"bh2","colombo",200,"2019-09-01",2000,3000,4000);
        BanquetHall b3=new BanquetHall(3,"bh2","kandy",300,"2019-08-01",3000,4000,5000);        
//        BanquetHall b4=new BanquetHall(4,"bh4","Jaffna",300,"2019-08-01",3000,4000,5000);

		BReservationQueue q1=new BReservationQueue(3);

		q1.enqueue(b1);
		q1.enqueue(b2);
		q1.enqueue(b3);
//		q1.enqueue(b4);


		System.out.println("-------Printing bamquet hall details------------");
		q1.dequeue().print();

		q1.dequeue().print();

//		q1.dequeue();
//		System.out.println(q1);
//
//		q1.enqueue(b1);		
//                System.out.println(q1);
//
//		q1.dequeue();
//                System.out.println(q1);
//
//		q1.dequeue();
//                System.out.println(q1);
            
        
            
            
		
	}
        
        
        
        
}