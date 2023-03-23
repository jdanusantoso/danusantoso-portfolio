import React, {useState} from "react";
import "./Product.css";
import { useStateValue } from "../ContextAPI/StateProvider";


function Product({ id, title, genre, image, description, price, rating }) {
  const [{ cart }, dispatch] = useStateValue();

  const addToCart = () => {
    dispatch({
      type: "ADD_TO_CART",
      item: {
        id: id,
        title: title,
        image: image,
        price: price,
        rating: rating,
      },
    });
  };

  return (
    <div className="product">
      <div className="product__info">
        <p>{title}</p>
        <p className="product__price">
          <small>$</small>
          <strong>{price}</strong>
        </p>
        
      </div>

      <img src={image} alt="" />

      <p id="description">{description}</p>

      <div>
        <div className="rating-genre-button">
        
        <div className="product__rating">
          {Array(rating)
            .fill()
            .map((_, i) => (
              <p>🌟</p>
            ))}
        </div>

        <p id="genre">{genre}</p>

        <button id="button" className="button" onClick={addToCart}>Add to Cart</button>
        </div>
      

      </div>

     
    </div>
  );
}

export default Product;