public class VerificadorPalindromo{
    private char[] vetor;
    private String palavra;
    private int qtde_elementos;

    public VerificadorPalindromo(String palavra){
        this.palavra = palavra;
        qtde_elementos = getTamanhoPalavra();
        vetor = new char[qtde_elementos];
    }

    private int getTamanhoPalavra(){
        qtde_elementos = palavra.length();
        return qtde_elementos;
    }

    private void pushToVector(){
        int aux = 0;
        for(int i = qtde_elementos - 1; i >= 0; i--){
            char letra = palavra.charAt(aux);
            vetor[i] = letra;
            aux+=1;
        }
    }

    public boolean verificador(){
        pushToVector();
        int count = 0;
        for(int i = 0; i < qtde_elementos ; i++) {
            if(vetor[i] == palavra.charAt(i)){
                count+=1;
            }
        }
        if(count == qtde_elementos){
            return true;
        }
        return false;
    } 

    public void imprimirPilha(){
        System.out.print("Estado da pilha: ");
        for(int i = 0; i < qtde_elementos; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

}