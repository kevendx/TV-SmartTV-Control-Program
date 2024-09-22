
public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(10);

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Novo status - TV Ligada ? " + smartTv.ligada);
    }
}