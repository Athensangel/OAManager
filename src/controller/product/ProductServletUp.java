package controller.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;
import service.ProductService;
import service.impl.ProductServiceImpl;

/**
 * Servlet implementation class ProductServletUp
 */
/**
 * 产品修改
 * @author cc
 *
 */
@WebServlet("/productServletUp")
public class ProductServletUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ProductService productService = new ProductServiceImpl();
	   
    public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServletUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String toid = request.getParameter("toid");
		Product product = productService.queryProductById(Integer.parseInt(toid));
		request.setAttribute("product", product);
		request.getRequestDispatcher("/views/product/productUpdate.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String toid = request.getParameter("toid");
		String productName = request.getParameter("productName");
		String price = request.getParameter("price");
		Product product = new Product();
		product.setToid(Integer.parseInt(toid));
		product.setProductName(productName);
		product.setPrice(Float.parseFloat(price));
		productService.updateProduct(product); //修改
		response.sendRedirect("productServlet"); //修改成功后跳转到列表页
	}

}
