package mejoraEntradas;

public class Entrada {


private int id;
private String TipoAsiento;
static int ValorAsiento;
private boolean acolchado;
private boolean reservado;



public int getId() {
	return id;
}




public void setId(int id) {
	this.id = id;
}



//getter and setter
public String getTipoAsiento() {
return TipoAsiento;
}

public void setTipoAsiento(String tipoAsiento) {
TipoAsiento = tipoAsiento;
}

public int getValorAsiento() {
return ValorAsiento;
}

public void setValorAsiento(int valorAsiento) {
ValorAsiento = valorAsiento;
}

public boolean isAcolchado() {
return acolchado;
}

public void setAcolchado(boolean acolchado) {
this.acolchado = acolchado;
}

public boolean isReservado() {
return reservado;
}

public void setReservado(boolean reservado) {
this.reservado = reservado;
}


//metodo
public Entrada(int id, String tipoAsiento, int valorAsiento, boolean reservado) {
super();
this.id = id;
this.TipoAsiento = "platea";
ValorAsiento = 5000;
this.reservado = false;

}


public String toString() {
String info = " ";
if (this.isReservado()) {
info += "Lo sentimos este asiendo ya esta reservado";
}else {
info +="  "+ reservado  + " ";
info +=" $"+ ValorAsiento + " ";


}


return info;
}


}