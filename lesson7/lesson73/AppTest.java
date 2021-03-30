package lesson7.lesson73;

import java.util.Random;

public class AppTest {
    public static void main(String[] args) {
        // tạo danh sách cửa hàng..
        Store[] stores = new Store[5];
        Random random = new Random();
        for (int i = 0; i < stores.length; i++) {
            SmartPhone[] smartPhones = new SmartPhone[10];
            for (int j = 0; j < 10; j++) {
                SmartPhone smartPhone = new SmartPhone("Brand" + j, true, true, true, "ios"
                        , 1.5f, "red", 20, random.nextInt(10));
                smartPhones[j] = smartPhone;
            }
            stores[i] = new Store("Store_" + i, "Address of store" + i, smartPhones);
            System.out.println(stores[i].toString());
        }


        StoreManagement storeManagement = new StoreManagement(stores);


        // cửa hàng bán được nhiều điện thoại nhất..
        System.out.println("Cửa hàng bán được nhiều điện thoại nhất " + storeManagement.getBestSellermaxmin(true));
        System.out.println(storeManagement.getBestSellermaxmin(true).getName()
                + " đã bán được : " + storeManagement.getBestSellermaxmin(true).countTotalSold());


        // cửa hàng bán được ít điện thoại nhất..
        System.out.println("Cửa hàng bán được ít điện thoại nhất " + storeManagement.getBestSellermaxmin(false));
        System.out.println(storeManagement.getBestSellermaxmin(false).getName()
                + " đã bán được : " + storeManagement.getBestSellermaxmin(false).countTotalSold());


        // cửa hàng có doanh thu cao nhất ...
        System.out.println("Cửa hàng doanh thu cao nhất " + storeManagement.getrevenuemaxmin(true));
        System.out.println(storeManagement.getrevenuemaxmin(true).getName()
                + " Tổng doanh thu : " +storeManagement.getrevenuemaxmin(true).getTotalRevenue());

        // cửa hàn có doanh thu thấp nhất ...
        System.out.println("cửa hàng có doanh thu thấp nhất : " + storeManagement.getrevenuemaxmin(false));
        System.out.println(storeManagement.getrevenuemaxmin(false).getName()
                + "Tổng doanh thu : " +storeManagement.getrevenuemaxmin(false).getTotalRevenue());

        // số lượng điện thoại có 5G
        System.out.println("Số lượng điện thoại có 5G : " +storeManagement.countPhoneByType(StoreManagement.PHONE_TYPE._5G));

        // số lượng điện thoại có BLUETOOTH...
        System.out.println("Số lượng điện thoại có bluetooth : " + storeManagement.countPhoneByType(StoreManagement.PHONE_TYPE.BLUETOOTH));

        // số lượng điện thoại có WIFI...
        System.out.println("Số lượng điện thoại có bluetooth : " + storeManagement.countPhoneByType(StoreManagement.PHONE_TYPE.WIFI));



    }
}
