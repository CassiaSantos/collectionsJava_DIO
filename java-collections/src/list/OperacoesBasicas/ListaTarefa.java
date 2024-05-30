package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //quero um atributo que é uma lista de objetos do tipo Tarefa. Esse atributo/lista irá receber o nome de tarefaList.
    private List<Tarefa> tarefaList;

    //sempre que um objeto do tipo ListaTarefa for criado, haverá um atributo tarefaList com arrayList vazio.
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //adiciona tarefa na tarefaList
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaDeletar = new ArrayList<>();
        //Laço para identificar tarefas com mesmo nome;
        for (Tarefa tarefa: tarefaList){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaDeletar.add(tarefa);
            }
        }
        //remove todas as tarefas com a descrição informada:
        tarefaList.removeAll(tarefasParaDeletar);
    }

    //Método para retornar qauntidade de elementos no ArrayList:
    public int obterQtTotalTarefas(){
        return tarefaList.size();
    }

    //Método para obter a descrição das tarefas:
    public void obterDescricaoTarefa(){
        System.out.println(tarefaList);

    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Trabalhar");
        listaTarefa.adicionarTarefa("Dormir");
        listaTarefa.adicionarTarefa("Treinar");
        listaTarefa.adicionarTarefa("Estudar");

        listaTarefa.removerTarefa("Trabalhar");

        listaTarefa.obterDescricaoTarefa();
        System.out.println("O número de tarefas é: " + listaTarefa.obterQtTotalTarefas());
    }
}