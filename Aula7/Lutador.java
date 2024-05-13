package Aula7;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public  Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates)
    {
        this.nome=nome;
        this.nacionalidade=nacionalidade;
        this.idade=idade;
        this. altura=altura;
        this.setPeso(peso);
        this.vitorias=vitorias;
        this.derrotas=derrotas;
        this.empates=empates;

    }
public void apresentar(){
System.out.println("Senhoras e senhores... CHEGOU A HORAAAAA, aprento a vocês:");
    System.out.println("lutador: "+getNome());
    System.out.println("Origem: "+ getNacionalidade());
    System.out.println(getIdade()+" anos");
    System.out.println(getAltura()+"M de altura");
    System.out.println("Pesando" +getPeso()+"kilos");
    System.out.println("Ganhou:"+getVitorias()+ " lutas");
    System.out.println("Perdeu: "+  getDerrotas()+ " lutas");
    System.out.println("Empatou: "+ getEmpates() +" lutas");
    
}
public void status(){

    System.out.println(getNome());
    System.out.println("É um peso "+ getCategoria());
    System.out.println(getVitorias()+" vitórias");
    System.out.println(getDerrotas()+" derrotas");
    System.out.println(getEmpates()+ " empates");


}
public void ganharLuta(){
    this.setVitorias(getVitorias()+1);

}
public void perderLuta(){
    this.setDerrotas(getDerrotas()+1);

}
public void empatarLuta(){
    this.setEmpates(getEmpates()+1);

}




//métodos acessores e modificadores
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getNacionalidade() {
    return nacionalidade;
}
public void setNacionalidade(String nacionalidade) {
    this.nacionalidade = nacionalidade;
}
public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}
public float getAltura() {
    return altura;
}
public void setAltura(float altura) {
    this.altura = altura;
}
public float getPeso() {
    return peso;
}
public void setPeso(float peso) {
    this.peso = peso;
    setCategoria(categoria);
}
public String getCategoria() {
    return categoria;
}
public void setCategoria(String categoria) {
    if(this.getPeso()<52.2){
        this.categoria="Invalido";
    }else if(this.getPeso()<=70.3){
        this.categoria="leve";
    }else if (this.getPeso()<=83.9){
    this.categoria = "Médio";
}else if(this.getPeso()<=120.2){
    this.categoria="Pesado";
}else{
    this.categoria="Invalido";
}
}
public int getVitorias() {
    return vitorias;
}
public void setVitorias(int vitorias) {
    this.vitorias = vitorias;
}
public int getDerrotas() {
    return derrotas;
}
public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
}
public int getEmpates() {
    return empates;
}
public void setEmpates(int empates) {
    this.empates = empates;
}



}
