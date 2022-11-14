import Logotype from '../../assets/img/logotipo.png';
import './style.css';


function Header() {

    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={Logotype} alt="DsMeta" />
                <h1>DSMeta</h1>
                <p>
                    Desenvolvido por <a href="#">@Manrriquez</a>
                </p>
            </div>
        </header>
    )
  }
  
  export default Header;
  