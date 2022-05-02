package observers;

public abstract class CaracteristicaJedi {
    private String nome;
    public CaracteristicaJedi(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
