public abstract class Vendedor {

    //Atributos
    private String nome;
    private double vendas;
    private int pontosVendas;

    //Contrutor

    public Vendedor(String nome) {
        this.nome = nome;

    }

    //Métodos
    public void vender(int qtdVnedas){
        this.vendas = qtdVnedas;
        System.out.println("O(a) Vendedor(a) " + nome + "realizou " + this.vendas + " vendas");
    }

    public abstract int calcularPontos();

    public String getNomeCatergoria(){
        if (calcularPontos() <20 ){
            return "Novato";
        } else if (calcularPontos() <=30 ){
            return "Aprendiz";
        } else if (calcularPontos() <=40 ) {
            return "Bom";
        }
        return "Mestre";
    }

    public String mostrarCategoria(){
        int pontosVendas = calcularPontos();
        return "O(a) " + getNome() + "tem " + pontosVendas + "pontos e sua categoria é: " + getNomeCatergoria();
    }


    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getPontosVendas() {
        return pontosVendas;
    }

}
