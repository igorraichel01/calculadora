package br.com.amazing.calc.visao;


@FunctionalInterface
public interface MemoriaObservador {

	public void valorAlterado(String novoValor);
}
