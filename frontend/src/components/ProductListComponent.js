import React, {useState, useEffect} from 'react';
import {Link} from 'react-router-dom';
import ProductService from '../service/ProductService';



const ProductListComponent = () => {

    const [products, setProducts] = useState();

    useEffect(() => {
        ProductsService.getProducts().then((res)=>{
            setProducts(res.data);
        } );
    }, [] );


    return (
        <div>
            <h2 className="text_center">Product</h2>
            <div className="row">
                <Link to="/add-product" className="btn btn-primary">Add Product</Link>
            </div>
            <div className="row">
                <table className="table table-striped table-bordered">
                    <thead>
                        <tr>
                            <th>Product name</th>
                            <th>Product descripiton</th>
                            <th>Product price</th>
                            <th>Edit</th>
                        </tr>
                    </thead>
                    <tbody>
                        {products.map(product => (
                            <tr key={product.id}>
                                <td>{product.name}</td>
                                <td>{product.descripiton}</td>
                                <td>{product.price}</td>
                                <td>
                                    <Link to={`/update-product/${product.id}`}>Update</Link>
                                </td>
                            </tr>
                        ))}

                    <th>Edit</th>
                    </tbody>
                </table>
            </div>
        </div>
    );
};

export default ProductListComponent;