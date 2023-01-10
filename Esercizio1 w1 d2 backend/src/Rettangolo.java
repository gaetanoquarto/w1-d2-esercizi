
public class Rettangolo {
	
	int altezza;
	int larghezza;

	public Rettangolo(int altezza, int larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
		

	}
	
	public double calcolaArea() {
		return this.altezza * this.larghezza;
	}
	public double calcolaPerimetro() {
		return (this.altezza + this.larghezza)*2;
	}
	
	
	public void stampaRettangolo() {
		System.out.println("L'area del rettangolo è: " + this.calcolaArea());
	    System.out.println("Il perimetro del rettangolo è: " + this.calcolaPerimetro());
	}
	
	public void calcolaDueRettangoli(Rettangolo r2) {
		System.out.println("La somma dell'area dei due rettangoli è: " + (this.calcolaArea() + r2.calcolaArea()));
		System.out.println("La somma dei perimetri dei due rettangoli è: " + (this.calcolaPerimetro() + r2.calcolaPerimetro()));
	}


}
