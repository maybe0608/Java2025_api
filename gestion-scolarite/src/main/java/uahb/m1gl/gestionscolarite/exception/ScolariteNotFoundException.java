package uahb.m1gl.gestionscolarite.exception;
//recherche dans bd on ne trouve pas
public class ScolariteNotFoundException extends RuntimeException{
    public ScolariteNotFoundException(String message) {
        super(message);
    }
}
