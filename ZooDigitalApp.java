package br.edu.atitus.vinicius_amaral.zoo_digital.app;

import br.edu.atitus.vinicius_amaral.zoo_digital.animais.*;
import br.edu.atitus.vinicius_amaral.zoo_digital.comportamentos.*;
import br.edu.atitus.vinicius_amaral.zoo_digital.especies.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooDigitalApp {

    private static final List<Animal> animais = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   BEM-VINDO AO ZOO DIGITAL v2.5");
        System.out.println("=========================================");

        int opcao = -1;
        while (opcao != 0) {
            exibirMenu();
            opcao = lerInteiro("Escolha uma opção: ");
            switch (opcao) {
                case 1 -> cadastrarAnimal();
                case 2 -> listarTodos();
                case 3 -> listarCorredores();
                case 4 -> listarNadadores();
                case 5 -> listarVoadores();
                case 6 -> listarPredadores();
                case 7 -> exibirTotal();
                case 0 -> System.out.println("\nAté logo! O Zoo Digital encerra suas atividades.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    // ── Menu ──────────────────────────────────────────────────────────────────
    private static void exibirMenu() {
        System.out.println("\n-----------------------------------------");
        System.out.println(" MENU PRINCIPAL");
        System.out.println("-----------------------------------------");
        System.out.println(" 1 - Cadastrar Animal");
        System.out.println(" 2 - Listar Todos os Animais");
        System.out.println(" 3 - Listar Animais Corredores");
        System.out.println(" 4 - Listar Animais Nadadores");
        System.out.println(" 5 - Listar Animais Voadores");
        System.out.println(" 6 - Listar Animais Predadores");
        System.out.println(" 7 - Exibir Total de Animais");
        System.out.println(" 0 - Sair");
        System.out.println("-----------------------------------------");
    }

    // ── Opção 1: Cadastrar ────────────────────────────────────────────────────
    private static void cadastrarAnimal() {
        System.out.println("\n--- CADASTRAR ANIMAL ---");
        System.out.println("Tipos disponíveis:");
        System.out.println(" 1-Cachorro  2-Gato      3-Golfinho  4-Lobo      5-Morcego");
        System.out.println(" 6-Pato      7-Pinguim   8-Aguia     9-Papagaio");
        System.out.println("10-PeixeMorcego  11-Traira  12-Piranha  13-Tubarao");
        System.out.println("14-Jacare    15-Cobra    16-Lagarto  17-Tartaruga");

        int tipo = lerInteiro("Tipo: ");
        System.out.print("Nome: ");
        String nome = scanner.nextLine().trim();
        int idade = lerInteiro("Idade (anos): ");

        Animal animal = switch (tipo) {
            case 1  -> new Cachorro(nome, idade);
            case 2  -> new Gato(nome, idade);
            case 3  -> new Golfinho(nome, idade);
            case 4  -> new Lobo(nome, idade);
            case 5  -> new Morcego(nome, idade);
            case 6  -> { System.out.print("Cor das penas: "); String c = scanner.nextLine().trim(); yield new Pato(nome, idade, c); }
            case 7  -> { System.out.print("Cor das penas: "); String c = scanner.nextLine().trim(); yield new Pinguim(nome, idade, c); }
            case 8  -> { System.out.print("Cor das penas: "); String c = scanner.nextLine().trim(); yield new Aguia(nome, idade, c); }
            case 9  -> { System.out.print("Cor das penas: "); String c = scanner.nextLine().trim(); yield new Papagaio(nome, idade, c); }
            case 10 -> new PeixeMorcego(nome, idade);
            case 11 -> new Traira(nome, idade);
            case 12 -> new Piranha(nome, idade);
            case 13 -> new Tubarao(nome, idade);
            case 14 -> new Jacare(nome, idade);
            case 15 -> new Cobra(nome, idade);
            case 16 -> new Lagarto(nome, idade);
            case 17 -> new Tartaruga(nome, idade);
            default -> null;
        };

        if (animal != null) {
            animais.add(animal); // Upcasting
            System.out.println("✔ " + animal.getNome() + " cadastrado com sucesso!");
        } else {
            System.out.println("Tipo inválido. Animal não cadastrado.");
        }
    }

    // ── Opção 2: Listar Todos ─────────────────────────────────────────────────
    private static void listarTodos() {
        System.out.println("\n--- TODOS OS ANIMAIS ---");
        if (animais.isEmpty()) { System.out.println("Nenhum animal cadastrado."); return; }
        for (Animal animal : animais) {
            System.out.println("\n" + animal);
            animal.comer();
            animal.emitirSom();
        }
    }

    // ── Opção 3: Corredores ───────────────────────────────────────────────────
    private static void listarCorredores() {
        System.out.println("\n--- ANIMAIS CORREDORES ---");
        boolean achou = false;
        for (Animal animal : animais) {
            if (animal instanceof Corrida corredor) {
                System.out.println("\n" + animal);
                corredor.correr();
                achou = true;
            }
        }
        if (!achou) System.out.println("Nenhum animal corredor cadastrado.");
    }

    // ── Opção 4: Nadadores ────────────────────────────────────────────────────
    private static void listarNadadores() {
        System.out.println("\n--- ANIMAIS NADADORES ---");
        boolean achou = false;
        for (Animal animal : animais) {
            if (animal instanceof Nado nadador) {
                System.out.println("\n" + animal);
                nadador.nadar();
                achou = true;
            }
        }
        if (!achou) System.out.println("Nenhum animal nadador cadastrado.");
    }

    // ── Opção 5: Voadores ─────────────────────────────────────────────────────
    private static void listarVoadores() {
        System.out.println("\n--- ANIMAIS VOADORES ---");
        boolean achou = false;
        for (Animal animal : animais) {
            if (animal instanceof Voo voador) {
                System.out.println("\n" + animal);
                voador.voar();
                achou = true;
            }
        }
        if (!achou) System.out.println("Nenhum animal voador cadastrado.");
    }

    // ── Opção 6: Predadores ───────────────────────────────────────────────────
    private static void listarPredadores() {
        System.out.println("\n--- ANIMAIS PREDADORES ---");
        boolean achou = false;
        for (Animal animal : animais) {
            if (animal instanceof Predacao predador) {
                System.out.println("\n" + animal);
                predador.cacar();
                achou = true;
            }
        }
        if (!achou) System.out.println("Nenhum animal predador cadastrado.");
    }

    // ── Opção 7: Total ────────────────────────────────────────────────────────
    private static void exibirTotal() {
        System.out.println("\n--- TOTAL DE ANIMAIS ---");
        System.out.println("Total de animais registrados: " + Animal.getContador());
    }

    // ── Utilitário: leitura segura de inteiro ─────────────────────────────────
    private static int lerInteiro(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String linha = scanner.nextLine().trim();
            try {
                return Integer.parseInt(linha);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
    }
}
