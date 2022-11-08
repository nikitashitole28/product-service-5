package demo.testexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.testexample.model.ProductModel;
import demo.testexample.repository.ProductRepo;
@Service
public class ProductService {

	@Autowired
	ProductRepo productRepo;

	public void postProducts(ProductModel productModel) {
		productRepo.save(productModel);
	}

	public List<ProductModel> getProducts() {
		Iterable<ProductModel> findAll = productRepo.findAll();
		return (List<ProductModel>) findAll;
	}

	public ProductModel getProductbyName(String pname) {
		ProductModel productModel=productRepo.getProductbyName(pname);
		return productModel;
	}

	public List<ProductModel> getproductbypricelessthan1000(Integer price) {
		List<ProductModel> productModel=productRepo.getproductbypricelessthan1000(price);
		return productModel;
	}

	public List<ProductModel> getproductbypricegreaterthan1200(Integer price) {
		List<ProductModel> productModel=productRepo.getproductbypricegreaterthan1200(price);
		return productModel;
	}

	 
	
}
