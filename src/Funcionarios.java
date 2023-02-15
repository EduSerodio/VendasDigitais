import java.util.ArrayList;

public class Funcionarios extends Vendedor{

    //Atributos
    private int anosAntiguidade;
    private ArrayList<Afiliados> afiliados;
    private int vendas;

    //Constutor
    public Funcionarios(String nome, int vendas) {
        super(nome);
    }

    //Métodos
    public void addFUncionarios(Afiliados afiliados){
        afiliados.add(afiliados);
        System.out.println("O " + afiliados.getNome() + "foi cooptado por " + this.getNome());
    }

    //Sobrescrita
    @Override
    public int calcularPontos() {
        return (int) (getVendas() * 5+5 * anosAntiguidade + 10 * afiliados.size());
    }



    //Getters and Setters
    public int getAnosAntiguidade() {
        return anosAntiguidade;
    }

    public void setAnosAntiguidade(int anosAntiguidade) {
        this.anosAntiguidade = anosAntiguidade;
    }

    public ArrayList<Afiliados> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(ArrayList<Afiliados> afiliados) {
        this.afiliados = afiliados;
    }
}
