import axios from 'axios';

PRODUCT_API_URL = "http://localhost:8000/api/products";

class ProductService {
    getPrdoucts(){
        return axios.get(PRODUCT_API_URL);
    }
    getProductsById(productId){
        return axios.get(`${PRODUCT_API_URL}/${productId}`);
    }
    deleteProduct(productId){
        return axios.delete(`${PRODUCT_API_URL}/${productId}`);
    }
    createProduct(product){
        return axios.post(PRODUCT_API_URL, product);
    }
    updateProduct(product, productId){
        return axios.put(`${PRODUCT_API_URL}/${productId}`);
    }
}

export default ProductService();