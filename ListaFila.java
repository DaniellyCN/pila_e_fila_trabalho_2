// Lista Simplesmente Encadeada
public class ListaFila implements IFila{
    private Noh primeiro;
    private int qtde_alunos;

    public ListaFila(){
        this.primeiro = null;
        qtde_alunos = 0;
    }

    public void inserir(Aluno aluno) {
        Noh novo = new Noh(aluno);
        
        if (vazio()) {
            primeiro = novo;
        } else {
            Noh atual = primeiro;
            
            while (atual.getNext() != null) {
                atual = atual.getNext();
            }
            
            atual.setNext(novo);
        }
        
        qtde_alunos++;
    }


    public boolean vazio(){
        if(primeiro == null){
            return true;
        }
        return false;
    }

    public boolean remove(Aluno aluno){
        Noh aux = primeiro;
        Noh previous = new Noh(aluno);
        qtde_alunos --;

        while(aux != null && aux.getContent() != aluno){
            previous = aux;
            aux = aux.getNext();
        }
        if(aux == null){
            return false;
        }else{
            previous.setNext(aux);
            return true;
        }
        
    }
    public int size(){
        return qtde_alunos;
    }

    public Aluno removeReturn() {
        if (vazio()) {
            System.out.println("A fila está vazia. Não é possível remover mais alunos.");
            return null;
        }

        Aluno alunoRemovido = primeiro.getContent();
        primeiro = primeiro.getNext();
        qtde_alunos--;

        return alunoRemovido;
    }

}
