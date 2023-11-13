
public class Pessoa {
    private String _nome;
    private String _sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this._nome = nome;
        this._sobrenome = sobrenome;
    }

    public String get_nome() {
        return this._nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;

    }

    public String get_sobrenome() {
        return this._sobrenome;
    }

    public void set_sobrenome(String _sobrenome) {
        this._sobrenome = _sobrenome;
    }

    public String obterNomeCompleto() {
        return String.format("%s %s", get_nome(), get_sobrenome());
    }

}
