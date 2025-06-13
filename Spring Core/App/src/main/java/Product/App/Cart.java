package Product.App;

public class Cart {
	
	int cartid;
	String name;
	int price;
	
	Cart(){
		
	}
	
	ProductDetails p1;
	
	public ProductDetails getP1() {
		return p1;
	}

	public void setP1(ProductDetails p1) {
		this.p1 = p1;
	}

	public Cart(int cartid, String name, int price, ProductDetails p1) {
		
		this.cartid = cartid;
		this.name = name;
		this.price= price;
		this.p1= p1;
		
	}
	
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", name=" + name + ", price=" + price + ", p1=" + p1 + "]";
	}
		

}
