
public class Product {
	double price =10 ;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    public double getPrice(float quantity) {
	return quantity*price ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Product P = new Product();
 System.out.println("Price"+ P.getPrice(2));  
 }
	
}
