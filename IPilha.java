public interface IPilha {
    public void push(Aluno info) throws Exception;
    public Aluno pop(); // remove e retorna
    public Aluno top(); //retorna sem removê-lo
    public boolean isEmpty();
    public int size();

}
