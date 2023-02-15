public class Afiliados extends Vendedor{

    //Construtor
    public Afiliados(String nome) {
        super(nome);
    }

    //Sobrescrita
    @Override
    public int calcularPontos(){
        return (int) getVendas()*15;
    }


    //rever esse método
    public void add(Afiliados afiliados) {
    }

}
