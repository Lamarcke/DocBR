package org.docbr;

import org.docbr.CPF;

public class Main {
    public static void main(String[] args) {
        CPF cpf = new CPF("62412397325");
        System.out.println(cpf.getCPF());
        System.out.println(cpf.getFormattedCPF());
    }
}
