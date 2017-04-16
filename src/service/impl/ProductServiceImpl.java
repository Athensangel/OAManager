package service.impl;

import java.util.List;

import dao.ProductDao;
import dao.impl.ProductDaoImpl;
import model.Product;
import service.ProductService;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao productDao =new ProductDaoImpl();

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> queryAllProducts() {
		return productDao.findAllProducts();
	}

	@Override
	public void deleteProductById(Integer toid) {
		productDao.delProductById(toid);
	}

	@Override
	public void saveProduct(Product product) {
		productDao.insertProduct(product);
	}
}
