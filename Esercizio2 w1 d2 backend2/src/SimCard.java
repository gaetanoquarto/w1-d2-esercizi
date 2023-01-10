
public class SimCard {
	
    private String phoneNumber;
    private int credito = 0;

    private Chiamate[] listaChiamate;


    public SimCard(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.credito = 0;
        this.listaChiamate = new Chiamate[5];
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public Chiamate[] getListaChiamate() {
        return listaChiamate;
    }

    public void setListaChiamate(Chiamate[] listaChiamate) {
        this.listaChiamate = listaChiamate;
    }


    public void stampaDati() {
        System.out.println("Numero sim: " + this.phoneNumber);
        System.out.println("Credito residuo: " + this.credito);
        System.out.println("Lista chiamate del numero " + this.phoneNumber);
        System.out.println(listaChiamate[0].getNomeChiamata() + ", durata " + listaChiamate[0].getDurata() + " min");
        System.out.println(listaChiamate[1].getNomeChiamata() + ", durata " + listaChiamate[1].getDurata() + " min");
    }


}
