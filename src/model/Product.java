package model;

public class Product {
	private Integer toid;           // 主键，自动增长
	private String  productName;    // 产品名称
	private Float   price;          // 单价
	public Integer getToid() {
		return toid;
	}
	public void setToid(Integer toid) {
		this.toid = toid;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

}
