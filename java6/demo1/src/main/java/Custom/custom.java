package Custom;
public class custom {
    public static class TableCustomer {
        public int tableId; // 餐桌编号

        public TableCustomer(int tableId) {
            this.tableId = tableId;
        }
    }

    public static class WechatCustomer {
        public String address; // 顾客地址
        public boolean takeout; // true 代表外卖，false 代表堂食

        public WechatCustomer(String address, boolean takeout) {
            this.address = address;
            this.takeout = takeout;
        }
    }
}