package Ejercicio7;

public class ReproductorMP3 implements ReproductorMusical {

    @Override
    public void detenerMúsica(String cancion) {
        System.out.println("Has detenido la cancion que estabas escuchando "+cancion);
        
    }

    @Override
    public void pausarMusica(String cancion) {
    System.out.println("Has pausado la canción que estabas escuchando "+cancion);        
    }

    @Override
    public void reproducirMusica(String cancion) {
        System.out.println("Está sonando la canción que has solicitado "+cancion);
    }
    
}
