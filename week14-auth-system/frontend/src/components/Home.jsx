import { useEffect } from "react";
import { useNavigate } from "react-router-dom";
import Navbar from "./Navbar";

function Home() {
  const navigate = useNavigate();
  const username = localStorage.getItem("username");

  useEffect(() => {
    if (!localStorage.getItem("userId")) {
      navigate("/login");
    }
  }, [navigate]);

  return (
    <div>
      <Navbar />
      <h2>Welcome, {username}!</h2>
    </div>
  );
}

export default Home;