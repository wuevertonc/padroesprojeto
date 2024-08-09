package br.com.guilhermevillaca.padroes.criacionais.prototype;

/**
 *
 * @author guilherme.villaca
 */
public class Principal {
    
    public static void main(String[] args) {
        
        //criar objeto original
        Documento documentoOriginal = 
                new Documento("Título Original", "Conteúdo Original");
        System.out.println("Documento Original: " + documentoOriginal);
        
        //criar o clone
        Documento documentoClone = documentoOriginal.clone();
        System.out.println("Documento Clone: " + documentoClone);        
        
        //alterar o clone
        documentoClone.setTitulo("Título Clone");
        documentoClone.setConteudo("Conteúdo Clone");
        
        System.out.println("--------------------------");
        System.out.println("Após Modificar o Clone");
        System.out.println("Documento Original: " + documentoOriginal);
        System.out.println("Documento Clone: " + documentoClone);        
        
    }

}
