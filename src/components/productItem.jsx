import "../App.css";

function ProductItem({ name, price, oldPrice, img }) {
  return (
    <div className="flex flex-col">
      <img className="h-[60%]" src={img} alt="" />
      <div className="product-item">
        <p>{name}</p>
        <p>
          {price} {oldPrice && <span className="old-price">{oldPrice}</span>}
        </p>
      </div>
    </div>
  );
}

export default ProductItem;
