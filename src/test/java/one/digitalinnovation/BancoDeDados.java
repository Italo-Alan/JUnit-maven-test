package one.digitalinnovation;

import java.util.logging.Logger;


public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        //Faz algo
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao(){
        //Faz algo
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa){
        //Insere a pessoa no DB
        LOGGER.info("Inseriu dados");
    }
    public static void removeDados(Pessoa pessoa){
        //removeu a pessoa no DB
        LOGGER.info("Removeu dados");
    }
}
