package com.projeto.bilheteriacinema.exception;

public class RecursoNaoEncontradoException extends RuntimeException{

    public RecursoNaoEncontradoException() {
        super("Recurso não encontrado");
    }
    public RecursoNaoEncontradoException(String mensagem){
        super(mensagem);
    }
}