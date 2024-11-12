import "./App.css";
import CategoryItem from "./components/categoryItem";
import ProductItem from "./components/productItem";
import NavItem from "./components/navItem";
import SpecialOffer from "./components/specialOffer";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faBagShopping,
  faBars,
  faBorderAll,
  faFingerprint,
  faHouse,
  faUser,
} from "@fortawesome/free-solid-svg-icons";
import { faBell, faHeart } from "@fortawesome/free-regular-svg-icons";

function App() {
  return (
    <div className="App">
      <header className="search-bar flex justify-center items-center justify-around">
        <FontAwesomeIcon className="text-2xl cursor-pointer" icon={faBars} />
        <input
          type="text"
          placeholder="Search for brand, product or category"
        />
        <FontAwesomeIcon className="text-2xl cursor-pointer" icon={faHeart} />
        <FontAwesomeIcon className="text-2xl cursor-pointer" icon={faBell} />
      </header>

      <section className="categories">
        <button className="w-[6rem] h-[2rem] rounded-full border-[1px] border-gray-500">
          İtem
        </button>

        <div className="category-list grid grid-cols-2 gap-4 p-4">
          <CategoryItem name="By Product" img="/images/Frame 1171275237.png" />
          <CategoryItem name="By Needs" img="/images/Frame 1171275236.png" />
          <CategoryItem
            name="By Skin Type"
            img="/images/Frame 1171275238.png"
          />
          <CategoryItem
            name="Most Popular"
            img="/images/Frame 1171275239.png"
          />
        </div>
      </section>

      <section className="recommended">
        <h2 className="flex justify-around items-center">
          Recommended For You <span className="view-all">View all</span>
        </h2>
        <div className="recommended-list">
          <ProductItem
            img="public/images/products/image 67.png"
            name="Brightening Serum Arbutin 2% + Hyaluronic Acid"
            price="$18.99"
          />
          <ProductItem
            img="public/images/products/image 7 (3).png"
            name="Intensive Hydration Serum with Hyaluronic"
            price="$17.99"
          />
        </div>
      </section>

      <section className="browse-categories">
        <h2 className="flex justify-around items-center">
          Browse by Categories <span className="view-more ">View more</span>
        </h2>
        <div className="product-carousel">
          <ProductItem
            img="public/images/products/image 67 (1).png"
            name="Brightening & Lightening Vitamin C Serum 30 ML"
            price="$227.94"
            oldPrice="$329.90"
          />
          <ProductItem
            img="public/images/products/image 7 (1).png"
            name="Hydration Booster Daily Moisturizing Cream 50 ML"
            price="$197.94"
            oldPrice="$329.90"
          />
        </div>
      </section>

      <SpecialOffer />

      <footer className="nav-bar">
        <NavItem name="Home" icon={faHouse} />
        <NavItem name="Products" icon={faBorderAll} />
        <NavItem name="AI Scanner" icon={faFingerprint} />
        <NavItem name="My Cart" icon={faBagShopping} />
        <NavItem name="Profile" icon={faUser} />
      </footer>
    </div>
  );
}

export default App;
