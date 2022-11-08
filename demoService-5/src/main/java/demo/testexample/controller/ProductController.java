package demo.testexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.testexample.model.ProductModel;
import demo.testexample.service.ProductService;

@RestController
@RequestMapping("/product")
class ProductController {

	@Autowired
	ProductService productService;
	@PostMapping("/save")
	public String postProducts(@RequestBody ProductModel ProductModel) {
		productService.postProducts(ProductModel);
		return "product saved successfully";
	}
	@GetMapping("/getproducts")
	public List<ProductModel> getProducts() {
		List<ProductModel> lst=productService.getProducts();
		return lst;
	}
	
	@GetMapping("/getproductbyname/{pname}")
	public ProductModel getProductbyName(@PathVariable String pname) {
		ProductModel lst=productService.getProductbyName(pname);
		return lst;
	}
	
	@GetMapping("/getproductbypricelessthan1000/{price}")
	public List<ProductModel> getproductbypricelessthan1000(@PathVariable Integer price) {
		List<ProductModel> lst=productService.getproductbypricelessthan1000(price);
		return lst;
	}
	
	@GetMapping("/getproductbypricegreaterthan1200/{price}")
	public List<ProductModel> getproductbypricegreaterthan1200(@PathVariable Integer price) {
		List<ProductModel> lst=productService.getproductbypricegreaterthan1200(price);
		return lst;
	}
	
}
