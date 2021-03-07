package th.co.tyre;

public class Main {

	public static void main(String[] args) {
		
		IProductFrontPage product1 = new Product("220", "สายชารต์มือถือ", "./img/product.png", "ขายแล้ว 100");
		System.out.println(product1.getTitle() + " ราคา " + product1.getSoldText() + " ชิ้น");

	}

}
