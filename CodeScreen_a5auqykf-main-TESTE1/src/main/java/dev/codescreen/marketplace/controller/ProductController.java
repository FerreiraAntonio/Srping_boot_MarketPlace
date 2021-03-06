package dev.codescreen.marketplace.controller;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


import dev.codescreen.marketplace.model.Product;
import dev.codescreen.marketplace.repository.ProductRepository;
import dev.codescreen.marketplace.service.ProductService;
import dev.codescreen.marketplace.dto.ProductDto;

@Controller
@RestController
@RequestMapping("/product")
public class ProductController {
	

    // TODO: Implement Product APIs here
	
	 @Autowired
	    private ProductService productService;
	 
 @Autowired
    private ProductRepository productRepository;
	 

 
	///@GetMapping
//	public String hello(){
//		return "testando";
//	};
	
	
	@GetMapping
	public List<Product>listar(){
		return productRepository.findAll();} 
	
	
	/*
	private final ProductRepository productRepository;
	
	        	public ProductController(ProductRepository productRepository) {
			this.productRepository = productRepository;
	}

	        	@GetMapping("/")
				public List<ProductDto> findAll(){
					var products = productRepository.findAll();
	        		return (List<ProductDto>) products.stream ()
	        				.map((p)-> ProductDto.of(p))
	        				.collect(Collectors.toList());
	        	};
	  */
	   
	   
  
	     

	
}
