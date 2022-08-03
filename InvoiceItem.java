public class InvoiceItem {
//    Exercise06
    String id;
    String desc;
    int qty;
    double uniprice;
    public InvoiceItem (String id, String desc, int qty, double uniprice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.uniprice=uniprice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUniprice() {
        return uniprice;
    }

    public void setUniprice(double uniprice) {
        this.uniprice = uniprice;
    }
    public double getTotal (){
        return uniprice*qty;
    }
    public String toString (){
        return "InvoiceItem [id="+id+","+"desc="+desc+",unitPrice="+uniprice+"]";
    }

    public static void main(String[] args) {
        InvoiceItem sony = new InvoiceItem("12232","12221",8893,33.2);
        System.out.println(sony.toString());
    }
}
