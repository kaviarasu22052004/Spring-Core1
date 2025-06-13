package Product.App;

public class ProductDetails {
	
	int pid;
	String pname;
	int price;
	
	ProductDetails(){
		
	}
	
	
	public ProductDetails(int pid, String pname, int price) {
		this.pid=pid;
		this.pname = pname;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDetails [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
	

}
