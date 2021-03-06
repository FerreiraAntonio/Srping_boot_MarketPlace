package dev.codescreen.marketplace.service.impl;

import dev.codescreen.marketplace.dto.ProductDto;
import dev.codescreen.marketplace.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of {@link ProductService} that stores products in memory.
 */



@Service
public class InMemoryProductService implements ProductService {
	
	private static final String NAME = "usuario_SQLight";
	private static final int VERSION = 1;

    /**
     * Method add new product to given store and returns info about created method.
     *
     * @param productDto    product dto that need to be created(added)
     * @param storeId       id of the store where new product need to be added
     * @return              created product dto
     */
    @Override
    public ProductDto addProduct(ProductDto productDto, Long storeId) {
        //TODO Implement
        throw new UnsupportedOperationException();
    }

    /**
     * Method to get product by it's id
     *
     * @param productId     the Id of product that we want to get
     * @return              returns the Optional object that keeping product dto
     */
    @Override
    public Optional<ProductDto> getProduct(Long productId) {
        //TODO Implement
        throw new UnsupportedOperationException();
    }

    /**
     * Method allows to find all products with given name
     *
     * @param productName   the name of the product we want to find
     * @return              list of products with given name sorted by product price (cheapest first)
     */
    @Override
    public List<ProductDto> findProductsByName(String productName) {
        //TODO Implement
        throw new UnsupportedOperationException();
    }

    /**
     * Method returns all the products from the single store by given store id
     *
     * @param storeId       the store id to get all products
     * @return              list of product from the store with given id
     */
    @Override
    public List<ProductDto> findProductsByStoreId(Long storeId) {
        //TODO Implement
        throw new UnsupportedOperationException();
    }
}
