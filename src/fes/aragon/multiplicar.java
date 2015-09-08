package fes.aragon;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author HECTOR
 */
@ManagedBean
@RequestScoped
public class multiplicar {
	private String cadena;
	private int valor;
	
	public String getCadena(){
		return cadena;
	}
	public void setCadena(String cadena){
		this.cadena = cadena;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getMul(){
		if(valor == 0){
			cadena = "";
		}else{
				for(int i=1;i<11;i++){
					if(i==1){
						cadena="";
					}
					cadena += "\n" + valor*i;
				}
		}
		return cadena;
	}

}
