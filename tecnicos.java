package Funcionarios;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 * Aluno_Marcos
 */

public class tecnicos {

    public static void main(String args[]){
        List<String> tecnicos = tecnicosDeRedes();
        gruposMasculinoEFemino(tecnicos);
    }

    //Criar as listas para cada grupo
    private static void gruposMasculinoEFemino(List<String> tecnicos) {
        System.out.println("**Grupos Masculino E Feminino**");
        HashMap<String, List<String>> grupos = new HashMap<>();

        for (String tecnico : tecnicos) {
            String[] partes = tecnico.split("-");
            String genero = partes[1];

            if (!grupos.containsKey(genero)) {
                grupos.put(genero, new ArrayList<>());
            }

            grupos.get(genero).add(partes[0]);
        }

        System.out.println("Masculinos: " + grupos.get("Masculino"));
        System.out.println("Femininos: " + grupos.get("Feminino"));
    }

    private static List<String> tecnicosDeRedes() {
        System.out.println("**Técnicos Em Redes**");

        List<String> tecnicos = new ArrayList<>();
        tecnicos.add("Marcos Barbosa-Masculino");
        tecnicos.add("Vanda Gomes-Feminino");
        tecnicos.add("Kleber Oliveira-Masculino");

        System.out.println("Técnicos De Redes Em Geral: " + tecnicos);

        return tecnicos;
    }
}