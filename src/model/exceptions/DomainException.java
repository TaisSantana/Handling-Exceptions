package model.exceptions;

//Runtime Exceptions - Compilador não obriga tratar
//Exception - obrigatório tratar
public class DomainException extends Exception{

    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }


}
