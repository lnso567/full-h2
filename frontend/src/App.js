import logo from './logo.svg';
import './App.css';
import {BrowerRouter as Router, Route, Routes} from 'react-router-dom';
import ProductListComponent from './components/ProductListComponent'
import AddProductListComponent from './components/AddProductListComponentt'
import ProductListComponent from './components/UpdateProductComponent.js'








function App() {
  return (
      <Router>
        <div className="container">
          <Routes>
            <Router path="/" element={<ProductListComponent />} />
            <Router path="/products" element={<ProductListComponent />} />
            <Router path="/add-product" element={<AddProductListComponent />} />
            <Router path="/update-product/:id" element={<UpdateProductComponent />} />
          </Routes>
        </div>
      </Router>
  );
}

export default App;
