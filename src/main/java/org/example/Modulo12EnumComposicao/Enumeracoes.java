package org.example.Modulo12EnumComposicao;

/**
 * Classe base para exemplos e anotações sobre Enumerações (enums) em Java e
 * conceitos de composição usados no Módulo 12 do curso.
 * <p>
 * Esta classe, no momento, serve como um placeholder para centralizar a documentação.
 * Ela poderá ser expandida depois com exemplos concretos demonstrando como declarar
 * enums, associar dados e comportamento às constantes do enum e compor classes
 * utilizando enums como campos.
 * </p>
 *
 * <h2>Tópicos abordados</h2>
 * <ul>
 *   <li>O que é um enum e quando utilizá-lo.</li>
 *   <li>Adicionar campos e métodos às constantes do enum.</li>
 *   <li>Uso de enums para modelar conjuntos fixos de estados ou categorias.</li>
 *   <li>Composição de classes referenciando enums.</li>
 * </ul>
 *
 * <h2>Uso</h2>
 * <p>
 * Adicione pequenos exemplos executáveis ou métodos utilitários aqui no futuro,
 * ou mantenha esta classe como um hub de documentação para o módulo.
 * </p>
 *
 * @author Kaue
 * @since 2025-08-15
 * @version 1.0
 */
public class Enumeracoes {
    public static void main(String[] args) {
    /*
    O que é uma Enumeração?
    Enumeração é um tipo especial que serve para especificar de forma literal
    um conjunto de constantes relacionadas.

    Sua palavra chave no Java é: enum

    Vantagens: melhor semântica,
               código mais legível
               e auxiliado pelo compilador
     */

    // Como criar um Enum:
    enum OrderStatus {
        PENDING_PAYMENT,
        PROCESSING,
        SHIPPED,
        DELIVERED;
    }

    }
}
