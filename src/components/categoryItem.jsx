import "../App.css";

function CategoryItem({ name, img }) {
  return (
    <div className="flex flex-col">
      <img src={img} alt="" />
      <div className="category-item">{name}</div>;
    </div>
  );
}

export default CategoryItem;
