public class Aluno{
    private String nome;
    private int idade;
    private float nota;

    public Aluno(String nome, int idade, float nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;

        setNome(nome);
        setIdade(idade);
        setNota(nota);
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public float getNota(){
        return nota;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNota(float nota){
        this.nota = nota;
    }

    public String toString(){
        return "Nome: " + getNome() + " Idade: " + getIdade() + " Nota:" + getNota() + "\n";
    }
}
