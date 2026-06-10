```markdown
# 🎒 PokéDex - Praticando POO em Java

Um projeto simples e divertido desenvolvido em **Java** para consolidar e colocar em prática os pilares fundamentais da **Programação Orientada a Objetos (POO)**. O projeto simula o funcionamento de uma PokéDex, controlando as características e ações de um Pokémon.

## 🧠 Conceitos de POO Aplicados

Neste projeto, apliquei de forma prática os seguintes conceitos fundamentais:

1. **Encapsulamento (`private`):** Os atributos do Pokémon (como `nome`, `tipo`, `nivel` e `evoluido`) foram protegidos usando o modificador `private`. Isso significa que eles não podem ser alterados diretamente de fora da classe, funcionando como a carcaça de um brinquedo que esconde os fios elétricos.
2. **Getters e Setters (Os botões de controle):** Para interagir com as propriedades escondidas do Pokémon, foram criados métodos públicos:
   * **Getters (`get`):** Servem para consultar uma informação (ex: *Qual o nome do Pokémon?*).
   * **Setters (`set`):** Servem para alterar uma informação com regras de segurança. No projeto, o método `setNivel` impede que o Pokémon receba um nível menor que 1 ou maior que 100.
   * **O método `is`:** Utilizado como o "get" para variáveis do tipo `boolean` (Verdadeiro/Falso), tornando a leitura do código mais natural (ex: `isEvoluido()` funciona como uma pergunta: *Está evoluído?*).
3. **Sobrecarga de Métodos (*Method Overloading*):** Criamos a ação `treinar()` com o mesmo nome, mas que reage de formas diferentes dependendo do que é passado para ela:
   * `treinar()`: Sem parâmetros, faz o Pokémon ganhar **+1 nível** por esforço padrão.
   * `treinar(String item)`: Se passarmos o texto `"Doce Raro"`, o método inteligente reconhece o item e aumenta o nível do Pokémon em **+5 de uma vez só**.
4. **Método `toString()` (O Painel de Informações):** Sobrescrevemos o método padrão para que, ao mandar exibir o objeto na tela, o Java entregue uma ficha técnica bonita e organizada com o resumo do Pokémon.

---

## 🛠️ Tecnologias Utilizadas

* **Java**
* **IntelliJ IDEA** (Ambiente de Desenvolvimento)
* **Git & GitHub** (Controle de versão e hospedagem)

---

## 🗂️ Estrutura do Código

O projeto é composto por duas classes principais:

### 1. `Pokemon.java`
Classe molde que possui os atributos privados, construtores (um completo e um simplificado que inicia no nível 1), métodos de acesso (get/set/is), os métodos sobrecarregados de treino e a formatação do `toString()`.

### 2. `Main.java`
Classe responsável por rodar o jogo, onde instanciamos o Pokémon (ex: *Charmander*), testamos os métodos de treino, usamos o `toString()` para ver o progresso e testamos a segurança do encapsulamento tentando forçar níveis inválidos.

---

## 🚀 Como Executar o Projeto

1. Clone o repositório para sua máquina:
   ```bash
   git clone [https://github.com/Rodrigoyu/pokeDex.git](https://github.com/Rodrigoyu/pokeDex.git)

    Abra o projeto na sua IDE (recomendado IntelliJ IDEA).

    Execute a classe Main.java.

Projeto desenvolvido com o objetivo de fixar os fundamentos de Java e Programação Orientada a Objetos de forma leve e prática! 🚀
