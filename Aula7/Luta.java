package Aula7;

import java.util.Random;


public class Luta{
    private Lutador  desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;



    

public void marcaLuta(Lutador l1,Lutador l2){  
    if(( l1.getCategoria().equals(l2.getCategoria()))&& l1!=l2){
        this.aprovada=true;
        this.desafiado=l1;
        this.desafiante=l2;
    }else {
        this.aprovada=false;
        this.desafiado=null;
        this.desafiante=null;
    }
  

}
public void lutar(){

    if (this.aprovada){
        System.out.println("--------Desafiado-------");
        this.desafiado.apresentar();
        System.out.println("--------Desafiante------");
        this.desafiante.apresentar();
        Random aleatorio=new Random();
        int vencedor=aleatorio.nextInt(3);
        System.out.println("------------------------  RESULTADO  ----------------------");
        switch (vencedor) {
            case 0 -> {
                System.out.println("EMPATE entre "+ this.desafiado.getNome() +" e "+this.desafiante.getNome());
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
            }
            case 1 -> {
                System.out.println("Vencedor: "+ this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            }
            case 2 -> {
                System.out.println("Vencedor: DESAFIANTE "+ this.desafiante.getNome());
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
            }
        
          
        }

        System.out.println("-----------------------------------------------");
        

    }else{
        System.out.println("A luta não pode acontecer.");
    }

}







    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRound() {
        return round;
    }
    public void setRound(int round) {
        this.round = round;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}

