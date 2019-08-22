package org.grafos.teoriadosgrafos;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.util.SupplierUtil;


public class App {
	
    public static void main(String[] args) {
		
        Graph<String, DefaultEdge> graph = GraphTypeBuilder
                                           .directed()
                                           .allowingMultipleEdges(true)
                                           .allowingSelfLoops(true)
                                           .vertexSupplier(SupplierUtil.createStringSupplier())
                                           .edgeSupplier(SupplierUtil.createDefaultEdgeSupplier())
                                           .buildGraph();
                
        
        //metodos principais
        
        /**
         * metodo addVertex()
         * adiciona os vertices do grafo
         */
        String v0 = graph.addVertex();
        String v1 = graph.addVertex();
        String v2 = graph.addVertex();

        /**
         * metodo addEdge()
         * adiciona as ligaçoes entre os vertices (aresta)
         */
        graph.addEdge(v0, v1);
        graph.addEdge(v1, v2);
        graph.addEdge(v0, v2);

        /**
         * metodo vertexSet()
         * retorna os vertices contidos no grafo
         */
        System.out.println("Vertex:");
        for (String v : graph.vertexSet()) {
            System.out.println("vertex: " + v);
        }
        
        /**
         * metodo edgeSet()
         * retorna as arestas contidos no grafo
         */
        System.out.println("\nEdges:");
        for (DefaultEdge e : graph.edgeSet()) {
            System.out.println("edge: " + e);
        }
    }
}
