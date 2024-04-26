
public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual:"+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - TV ligada: "+smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Aumentando volume para:"+smartTv.volume);

        smartTv.mudarCanal(22);
        System.out.println("Mudando para o canal: "+smartTv.canal);    }
}