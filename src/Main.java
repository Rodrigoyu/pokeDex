public  class Main {
    public static void main(String[]args){
        // 1. Cria o seu Pokémon inicial
        Pokemon meuPoke = new Pokemon("Charmander", "Fogo");

        // 2. Usa o toString para ver ele novinho
        System.out.println(meuPoke);

        // 3. Usa a Sobrecarga 1 (Treino normal)
        meuPoke.treinar();

        // 4. Usa a Sobrecarga 2 (Treino com item especial)
        meuPoke.treinar("Doce Raro");

        // 5. Tenta trapacear usando o Setter para colocar nível 999 (O encapsulamento vai barrar!)
        meuPoke.setNivel(999);

        // 6. Usa o Get para ver qual o nível final dele no painel
        System.out.println("Nível final do " + meuPoke.getNome() + ": " + meuPoke.getNivel());
    }
}