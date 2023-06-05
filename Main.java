public class Main {
    public static void main(String[] args) {
        String palavra1 = "arara";
        VerificadorPalindromo ver = new VerificadorPalindromo(palavra1);
        System.out.println(palavra1 + " é palíndromo? " + ver.verificador());
        ver.imprimirPilha();
        System.out.println("-------------------------------------------------------");

        // Alunos
        Aluno david = new Aluno("David", 13,7.8f);
        Aluno alicia = new Aluno("Alicia", 20, 8.4f);
        Aluno karen = new Aluno("Karen", 16, 5.9f);

        // Lista de Alunos
        ListaFila lista_fila_alunos = new ListaFila();

        lista_fila_alunos.inserir(david);
        lista_fila_alunos.inserir(alicia);
        lista_fila_alunos.inserir(karen);

        
        PilhaAluno pilha_aluno = new PilhaAluno(lista_fila_alunos.size());

        
        try{
            System.out.println("----Lista de alunos----");
            lista_fila_alunos.imprimirLista();
            while (!lista_fila_alunos.vazio()) {
                Aluno aluno = lista_fila_alunos.removeReturn();
                pilha_aluno.push(aluno);
            }

            while (!pilha_aluno.isEmpty()) {
                Aluno aluno = pilha_aluno.pop();
                lista_fila_alunos.inserir(aluno);
            }
            System.out.println("----Lista de alunos invertida----");
            lista_fila_alunos.imprimirLista();
        }catch(Exception error){
            System.out.println(error.getMessage()); 
        }
    }
}
