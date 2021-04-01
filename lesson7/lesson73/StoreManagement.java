package lesson7.lesson73;

import lesson7.lesson73.SmartPhone;
import lesson7.lesson73.Store;

public class StoreManagement {

    private Store[] stores;

    public static enum PHONE_TYPE {
        BLUETOOTH,
        _5G,
        WIFI,
        All
    }

    public StoreManagement() {
    }

    public StoreManagement(Store[] stores) {
        this.stores = stores;
    }
    
    public Store[] getStores() {
        return stores;
    }

    public void setStores(Store[] stores) {
        this.stores = stores;
    }

    public int countPhoneByType(PHONE_TYPE phone_type) {
        int count = 0;
        for (Store store : stores) {
            for (SmartPhone smartPhone : store.getPhones()) {
                switch (phone_type) {
                    case _5G:
                        if (smartPhone.isHas5G()) {
                            count++;
                        }
                        break;
                    case BLUETOOTH:
                        if (smartPhone.isHasBluetooth()) {
                            count++;
                        }
                        break;
                    case WIFI:
                        if (smartPhone.isHasWifi()) {
                            count++;
                        }
                        break;
                    default:
                        count++;
                }
            }
        }
        return count;
    }



    public Store getBestSellermaxmin(boolean getMax) {
        Store result = stores[0];
        for (Store store : stores) {
            if (getMax) {
                if (store.countTotalSold() >= result.countTotalSold()) {
                    result = store;
                }
            } else {
                if (store.countTotalSold() <= result.countTotalSold()) {
                    result = store;
                }
            }
        }
        return result;
    }


    public Store getrevenuemaxmin(boolean getMax) {
        Store revenue = stores[0];
        for (Store store : stores) {
            if (getMax) {
                if (store.getTotalRevenue() >= revenue.getTotalRevenue()) {
                    revenue = store;
                }
            } else {
                if (store.getTotalRevenue() <= revenue.getTotalRevenue()) {
                    revenue = store;
                }
            }
        }
        return revenue;
    }

}
