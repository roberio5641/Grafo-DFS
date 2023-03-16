public class Main {
    public static void main(String[] args) {
        Graph medicalFlowGraph = new Graph();


        String triagem = "Triagem";
        String consulta = "Consulta";
        String exames = "Exames";

        medicalFlowGraph.addVertex(triagem);
        medicalFlowGraph.addVertex(consulta);
        medicalFlowGraph.addVertex(exames);

        medicalFlowGraph.addEdge(triagem, consulta);
        medicalFlowGraph.addEdge(consulta, exames);
        medicalFlowGraph.addEdge(exames, consulta);

        medicalFlowGraph.printGraph();

        if (medicalFlowGraph.hasCycle())
            System.out.println("This graph has cycle");
        else
            System.out.println("This graph does not have cycle");
            System.out.println(" ");






        Graph DecisionTree = new Graph();

        DecisionTree.addVertex("Atendimento?");
        DecisionTree.addVertex("Plano?");
        DecisionTree.addVertex("Emergência");
        DecisionTree.addVertex("Instruções");
        DecisionTree.addVertex("Visita?");
        DecisionTree.addVertex("Instruções Visita");
        DecisionTree.addVertex("Informações?");
        DecisionTree.addVertex("Pesquisa");


        DecisionTree.addEdge("Atendimento?", "Plano?");
        DecisionTree.addEdge("Atendimento?", "Visita?");
        DecisionTree.addEdge("Plano?", "Instruções");
        DecisionTree.addEdge("Plano?", "Emergência");
        DecisionTree.addEdge("Visita?", "Instruções Visita");
        DecisionTree.addEdge("Informações?", "Pesquisa");

        DecisionTree.printGraph();

        if (DecisionTree.hasCycle())
            System.out.println("This graph has cycle");
        else
            System.out.println("This graph does not have cycle");

    }
}
