# Zoo Digital

Exercício de Programação Orientada a Objetos em Java simulando um zoológico digital. Modela hierarquia de animais (mamíferos, aves, répteis, peixes) usando herança e interfaces para comportamentos compartilhados (correr, voar, nadar).

## Conceitos aplicados

- Herança (`Animal` como superclasse)
- Interfaces: `Corrida`, `Voo`, `Nado`
- Polimorfismo (`comer()`, `emitirSom()` sobrescritos por cada espécie)
- Casos de herança múltipla via interfaces (ex: `PeixeMorcego`)

## Como rodar

```bash
mvn compile exec:java -Dexec.mainClass="br.edu.atitus.Main"
```

ou importe como projeto Maven em qualquer IDE Java (17+) e rode `Main.java`.

## Autor

Vinícius Amaral de Oliveira — 1137962 — projeto acadêmico (ATITUS)