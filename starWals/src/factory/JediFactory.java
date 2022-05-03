package factory;
import observer.Observer;
import subject.Padawan;

public class JediFactory {
    public Observer criarPadawan(String nome){
        if (nome.equalsIgnoreCase("Padawan")){
            return new Padawan();
        }
        return null;
    }
}
