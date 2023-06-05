public class PilhaAluno implements IPilha{
    private Aluno[] pilha_alunos;
    private int qtde_elementos;

    public PilhaAluno(int tamanho) {
        pilha_alunos = new Aluno[tamanho];
        qtde_elementos = 0;
    }

    public boolean isEmpty() {
        if(qtde_elementos == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return qtde_elementos;
    }

    public void push(Aluno aluno) throws Exception{
        if(qtde_elementos == pilha_alunos.length){
            throw new Exception("A pilha estourou, stackoverflow");
        }
        this.pilha_alunos[qtde_elementos] = aluno;
        qtde_elementos ++;
    }

    // remove o top da pilha e retorna ele
    public Aluno pop() {
        Aluno aux = null;
        if(isEmpty()){
            System.out.println("A pilha está vazia");
            return null;
        }
        aux = pilha_alunos[qtde_elementos - 1]; // atribuindo a aux o top da pilha
        pilha_alunos[qtde_elementos - 1] = null; // retirando o topo
        qtde_elementos --;
        return aux;
    }

    // retorna o topo sem removê - lo
    public Aluno top() {
        if(isEmpty()){
            System.out.println("A pilha está vazia");
            return null;
        }
        return pilha_alunos[qtde_elementos - 1]; 
    }
}

