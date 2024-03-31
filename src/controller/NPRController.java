package controller;

import br.edu.fateczl.pilhainteiros.Pilha;

public class NPRController {

    public void insereValor(Pilha p, int valor) {
        p.push(valor);
    }

    public int npr(Pilha p, String op) throws Exception {
        if (p.size() < 2) {
            throw new Exception("Valores insuficientes na pilha para realizar a opera��o.");
        }

        int segundoValor = p.pop();
        int primeiroValor = p.pop();

        switch (op) {
            case "+":
                return primeiroValor + segundoValor;
            case "-":
                return primeiroValor - segundoValor;
            case "*":
                return primeiroValor * segundoValor;
            case "/":
                if (segundoValor == 0) {
                    throw new Exception("Divis�o por zero n�o � permitida.");
                }
                return primeiroValor / segundoValor;
            default:
                throw new Exception("Opera��o inv�lida.");
        }
    }
}
