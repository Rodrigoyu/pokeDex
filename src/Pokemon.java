public class Pokemon {
    private String nome;
    private String tipo;
    private int nivel;
    private boolean evoluido = false;


    public Pokemon(String nome,String tipo, int nivel, boolean evoluido) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.evoluido = evoluido;
    }

    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = 1;
        this.evoluido = false;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int novoNivel) {

        if(novoNivel <= 1 || novoNivel >= 100){
            System.out.println("Error");
        }else{
            this.nivel = novoNivel;
        }
    }

    public boolean isEvoluido() {
        return evoluido;
    }

    public void setEvoluido(boolean evoluido) {
        this.evoluido = evoluido;
    }

    public void treinar(){
        if(this.nivel < 100){
            this.nivel+=1;
            System.out.println("seu pokémon subiu de nível!");
        }else{
            System.out.println("seu pokémon está no nível máximo!");
        }
    }

    public void treinar(String doce){
        if (doce.equals("Doce Raro")){
            if (this.nivel + 5 < 100){
                this.nivel+= 5;
                System.out.println("seu Pokemon subiu de nivel!");
            }else{
                System.out.println("Seu pokémon está no nivel máximo!");
            }
        }else{
            System.out.println("esse item não funciona no seu pokémon");
        }
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nivel=" + nivel +
                ", evoluido=" + evoluido +
                '}';
    }
}
