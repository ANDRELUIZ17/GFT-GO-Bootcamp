public class Main {
    public static void main(String[] args) {
        ifFlexa();
        ifSemFlexa();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }

    private static void ifFlexa () {
        int mes = 20;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4 ) {
                        System.out.println("Abril");
                    }
                    else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    }
                                                    else {
                                                        System.out.println("Mês indefinido! "); // essa não é uma boa Prática
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    private  static  void ifSemFlexa() {
        int mes = 9;

        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês indefinido! "); // Essa sim esta de acordo!
        }
    }
    private static void ifFerias () {
        String mes = "Julho";
        if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") { // não é uma boa prática
            System.out.println("Férias! ");
        }
    }

    private static  void ifMenor () {
        double salarioMensal = 1888.90d;
        double mediaSalario = 1500.50d;

        int quantidadeDepedentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDepedentes >= mediaDependentes)) { // não é uma boa prática
            System.out.println("Funcionario deve receber auxilio. ");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDepedentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) { // boa pratica tambem mas, da pra resumir ainda mais
            System.out.println("Funcionario deve receber auxilio. ");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println("Funcionario deve receber auxilio");
        }
        else { // boa prática bem resumida
            System.out.println("Funcionario não deve receber auxilio");
        }
    }

    private  static  void switchSemana () {
        String dia = "Terça";

        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia Inválido ");
                break;
        }
    }
    private static void switchNumero () {
        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido ");
                break;
        }
    }
    private  static void switchFerias () {
        String mes = "Dezembro";
        switch (mes) {
            case "Desembro":
            case "Julho":
            case "Janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês Indefinido ");
                break;
        }
    }

}


