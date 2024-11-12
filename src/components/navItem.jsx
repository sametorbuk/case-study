import { faFingerprint } from "@fortawesome/free-solid-svg-icons";
import "../App.css";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";

function NavItem({ name, icon }) {
  return (
    <div className="flex flex-col justify-center">
      <FontAwesomeIcon
        className={icon === faFingerprint ? "text-4xl " : ""}
        icon={icon}
      />
      <div className="nav-item">{name}</div>
    </div>
  );
}

export default NavItem;
