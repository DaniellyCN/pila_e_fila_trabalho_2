public class Noh {
    Noh next;
    Aluno content;

    public Noh(Aluno content){
        this.content = content;
        next = null;
    }

    public Aluno getContent(){return content;}
    public Noh getNext(){return next;}
    public void setNext(Noh next){this.next = next;}
}
