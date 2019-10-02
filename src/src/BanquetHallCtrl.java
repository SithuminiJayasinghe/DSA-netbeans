/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;

/**
 *
 * @author nuclei
 */
public class BanquetHallCtrl {

    public ArrayList<BanquetHall> getListOfBanquet() {
        ArrayList<BanquetHall> list = new ArrayList<BanquetHall>();
        BanquetHall b1 = new BanquetHall(1, "bh1", "colombo", 100, "2019-10-01", 1000, 2000, 3000);
        BanquetHall b2 = new BanquetHall(2, "bh2", "colombo", 200, "2019-09-01", 2000, 3000, 4000);
        BanquetHall b3 = new BanquetHall(3, "bh2", "kandy", 300, "2019-08-01", 3000, 4000, 5000);
        BanquetHall b4 = new BanquetHall(4, "bh4", "Jaffna", 300, "2019-08-01", 3000, 4000, 5000);
        // ----- 10

        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

        return list;
    }
}
