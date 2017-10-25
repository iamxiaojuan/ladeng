package ladeng.work.sb.model;

public class productWithBLOBs extends product {
    private String buydesc;

    private String productdesc;

    public String getBuydesc() {
        return buydesc;
    }

    public void setBuydesc(String buydesc) {
        this.buydesc = buydesc == null ? null : buydesc.trim();
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc == null ? null : productdesc.trim();
    }
}