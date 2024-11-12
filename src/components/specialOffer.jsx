import "../App.css";

function SpecialOffer() {
  return (
    <section className="special-offer">
      <h2>Special Offer</h2>

      <div className="flex">
        <div className="offer-box">
          <p>
            Get Special Offer <span>Up to $20</span>
          </p>
          <button>Order Now</button>
        </div>

        <img src="public/images/poster/poster 1.png" alt="" />
      </div>
    </section>
  );
}

export default SpecialOffer;
