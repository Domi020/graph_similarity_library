package components.generators;

import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.graph.SimpleDirectedAdjacencyListGraph;
import dhbw.graphmetrics.graph.SimpleUndirectedAdjacencyListGraph;

import java.util.Random;

/**
 * R-MAT graph generator
 *
 * Adapted by implementation from Prof. Dr.-Ing. Olaf Herden
 */
public class RMATGenerator {

    public static Graph<Integer, Integer> generateUndirected(int k, int M, double alpha, double beta, double gamma) {
        int numberOfEdges = 0;
        int numberOfNodes = (int) Math.pow(2., (double) k);
        Random r = new Random();
        int[][] a = new int[numberOfNodes][numberOfNodes];

        while (numberOfEdges < M){
            int i = 0;
            int j = 0;
            for (int t=0;t<=k-1;t++){
                // Generate random number in (0,1)
                double dr = r.nextDouble();
                //System.out.println(dr);
                if ((dr >= alpha) && (dr<alpha+beta)){
                    j = j + (int) Math.pow(2., (double) (k-1-t));
                }
                else if ((dr >= alpha+beta) && (dr<alpha+beta+gamma)){
                    i = i + (int) Math.pow(2., (double) (k-1-t));
                }
                else if ((dr>=alpha+beta+gamma) && dr < 1){
                    i = i + (int) Math.pow(2., (double) (k-1-t));
                    j = j + (int) Math.pow(2., (double) (k-1-t));
                } // if
            } // for t
            if (a[i][j] == 0) {
                a[i][j]++;
                numberOfEdges++;
            }
        } // while m
        return generateUndirectedGraphFromMatrix(a);
    }

    public static Graph<Integer, Integer> generateWithoutDuplicates(int k, int M, double alpha, double beta, double gamma) {
        int numberOfEdges = 0;
        int numberOfNodes = (int) Math.pow(2., (double) k);
        int dx, dy = numberOfNodes / 2;
        Random r = new Random();
        int[][] a = new int[numberOfNodes][numberOfNodes];

        while (numberOfEdges < M){
            int i = 0;
            int j = 0;
            for (int t=0;t<=k-1;t++){
                // Generate random number in (0,1)
                double dr = r.nextDouble();
                //System.out.println(dr);
                if ((dr >= alpha) && (dr<alpha+beta)){
                    j = j + (int) Math.pow(2., (double) (k-1-t));
                }
                else if ((dr >= alpha+beta) && (dr<alpha+beta+gamma)){
                    i = i + (int) Math.pow(2., (double) (k-1-t));
                }
                else if ((dr>=alpha+beta+gamma) && dr < 1){
                    i = i + (int) Math.pow(2., (double) (k-1-t));
                    j = j + (int) Math.pow(2., (double) (k-1-t));
                } // if
            } // for t
            if (a[i][j] == 0 && !isInUpperPart(j,i)) {
                a[i][j]++;
                numberOfEdges++;
            }
        } // while m
        return generateUndirectedGraphFromMatrix(a);
    }

    public static Graph<Integer, Integer> generate(int k, int M, double alpha, double beta, double gamma){
        int numberOfEdges = 0;
        int numberOfNodes = (int) Math.pow(2., (double) k);
        Random r = new Random();
        int[][] a = new int[numberOfNodes][numberOfNodes];

        for (int m=1;m<=M;m++){
            int i = 0;
            int j = 0;
            for (int t=0;t<=k-1;t++){
                // Generate random number in (0,1)
                double dr = r.nextDouble();
                //System.out.println(dr);
                if ((dr >= alpha) && (dr<alpha+beta)){
                    j = j + (int) Math.pow(2., (double) (k-1-t));
                }
                else if ((dr >= alpha+beta) && (dr<alpha+beta+gamma)){
                    i = i + (int) Math.pow(2., (double) (k-1-t));
                }
                else if ((dr>=alpha+beta+gamma) && dr < 1){
                    i = i + (int) Math.pow(2., (double) (k-1-t));
                    j = j + (int) Math.pow(2., (double) (k-1-t));
                } // if
            } // for t
            a[i][j]++;
        } // for m
        // Remove multiple edges
        for (int i=0;i<numberOfNodes;i++){
            for (int j=0;j<numberOfNodes;j++){
                if (a[i][j]>0){
                    a[i][j]=1;
                    numberOfEdges++;
                }
            }
        }
        return generateGraphFromMatrix(a);
    }

    private static Graph<Integer, Integer> generateGraphFromMatrix(int[][] a) {
        Graph<Integer, Integer> graph = new SimpleDirectedAdjacencyListGraph<>();
        for(int i = 0; i<a.length; i++) {
            graph.addNode(i);
        }
        for(int i = 0; i<a.length; i++) {
            for(int j = 0; j<a[i].length; j++) {
                if (a[i][j] == 1 && i != j) {
                    graph.addEdge(i, j, 1);
                }
            }
        }
        return graph;
    }

    private static Graph<Integer, Integer> generateUndirectedGraphFromMatrix(int[][] a) {
        Graph<Integer, Integer> graph = new SimpleUndirectedAdjacencyListGraph<>();
        for(int i = 0; i<a.length; i++) {
            graph.addNode(i);
        }
        for(int i = 0; i<a.length; i++) {
            for(int j = 0; j<i; j++) {
                if (a[i][j] == 1) {
                    graph.addEdge(i, j, 1);
                }
            }
        }
        return graph;
    }

    private static boolean isInUpperPart(int x, int y) {
        return x > y;
    }
}
