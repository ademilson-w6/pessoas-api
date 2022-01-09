package com.crud.crudtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudTestApplication.class, args);


//        Pessoa p = new Pessoa();
//        p.setSaldo(201.0);
//        p.setNome("Joao");
//        p.setDataNascimento(LocalDate.of(1995, Month.DECEMBER, 25));
//
//
//        Pessoa p2 = new Pessoa();
//        p2.setSaldo(200.0);
//        p2.setDataNascimento(LocalDate.of(2000, Month.DECEMBER, 25));
//
//        List<Pessoa> pessoas = new ArrayList<>();
//        pessoas.add(p);
//        pessoas.add(p2);
//        //________________-FUNCTIONS LAMBDAS-______________________________INICIO
//        List<Integer> novidades = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        //limit, skip, distinct, filter, map, max, min, count, toLIST, groupingBy, joining
//
//
//        //agrupar pessoas por idade através da data de nascimento
//      String anos = pessoas.stream()
//              .map(e -> String.valueOf(e.getSaldo()))
//              .collect(Collectors.joining("  -  "));
//
//
//
//        System.out.println(anos);
//
////
////        // Antes do Java 8:
////        for (String novidade : novidades) {
////            System.out.println(novidade);
////        }
////        //   Como fica o código com uso de Lambda no Java 8:
////        novidades.forEach(n -> System.out.println(n));
////
////        novidades.forEach(System.out::println);
////        //_________________________________________________________________FIM
////
////
////        //__________________________DATA __________________________________INICIO
////        // Data Atual
////        LocalDate hoje = LocalDate.now();
////        System.out.println("Data Atual=" + hoje);
////
////        // Criando uma data passa os valores desejados
////        LocalDate natal2014 = LocalDate.of(2014, Month.DECEMBER, 25);
////        System.out.println("Natal de 2014=" + natal2014);
////
////        // Criando uma data inválido 31 abril — Não existe, pois abril só tem 30
////        // dias
////        // function
////
////        try {
////            LocalDate abril31_2014 = LocalDate.of(2014, Month.APRIL, 31);
////            System.out.println(abril31_2014);
////        } catch (DateTimeException e) {
////            System.err.println(e.getMessage());
////        }
////
////        // Data atual no Japão, Veja todas a zonas disponíveis em ZoneId javadoc
////
////        LocalDateTime agora = LocalDateTime.now();
////
////        LocalDate newYorkTime = LocalDate.now(ZoneId.of("Asia/Tokyo"));
////
////        System.out.println("AGORA=" + agora + "New York=" + newYorkTime);
////
////        //Retocedento os dias para obter uma data a partir da data base 01/01/1970
////        LocalDate dataBase = LocalDate.ofEpochDay(365);
////        System.out.println("365 dias a partir da data baase (01/01/1970)= " + dataBase);
////
////        //Obter o dia pelo número sequencial no ano.
////        LocalDate centessimoDia2014 = LocalDate.ofYearDay(2014, 100);
////        System.out.println("100º dia de 2014=" + centessimoDia2014);
////
////        //_________________________________________________________________FIM
////
////
////    }

    }
}
