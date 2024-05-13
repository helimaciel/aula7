package Aula7;

public class Main {
    

        public static void main(String[] args){
        Lutador  l[]=new Lutador[6] ;
                l[0]=new Lutador("BobEsc","França",31,1.75f,68.9f,11,3,1);
                l[1]=new Lutador("Entervaldo","brasil",29,1.89f,95.6f,10,2,3);
                l[2]=new Lutador("Badboy","EUA",25,2.03f,97.4f,5,0,4);
                l[3]=new Lutador("Numberto","Alemão",33,1.86f,70,6,6,1);
                l[4]=new Lutador("Lockelson","Britanico",31,1.95f,86,1,2,4);
                l[5]=new Lutador("taberson","Peruano",26,1.59f,68.7f,6,3,7);


            Luta UEC01=new Luta();
                UEC01.marcaLuta(l[3], l[2]);
                UEC01.lutar();
               
}
}