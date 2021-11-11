package generators;

import dhbw.graphmetrics.graph.Graph;
import dhbw.graphmetrics.graph.SimpleDirectedAdjacencyListGraph;

import java.util.Arrays;
import java.util.Random;

public class RMATGenerator {
    // Parameters
    //static double alpha = 0.2;
   // static double beta = 0.2;
    //static double gamma = 0.3;
   // static double delta = 0.3;

    //static int k = 4;


    //static int M = 100;

    //static String fileOutputName = "C:/TEMP/DSN/" + numberOfNodes + "_" + M + ".TGF";


    static int numberOfEdges = 0;

    public static int[][] a;

    public static void generate(int k, int M, double alpha, double beta, double gamma){

        int numberOfNodes = (int) Math.pow(2., (double) k);
        Random r = new Random();
        a = new int[numberOfNodes][numberOfNodes];

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
    }
/*
    public static void print(){
        for (int i=0;i<numberOfNodes;i++){
            for (int j=0;j<numberOfNodes;j++){
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Number of edges : " + numberOfEdges);
    }
*/
    public static Graph<Integer, Integer> generateGraphFromMatrix() {
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
/*
    public static void toTGFFile(String s){

        GetName germanFirstName = new GetName();

        try{
            // Anlegen eines Eingabe- und eines Ausgabeobjektes
            FileWriter ausgabeDateiFormat = new FileWriter(s);
            BufferedWriter ausgabeZeileFormat = new BufferedWriter(ausgabeDateiFormat);

            String actualOutputLine;

            // Knoten rausschreiben
            for (int i=0;i<numberOfNodes;i++){
                actualOutputLine = Integer.toString(i);
                actualOutputLine += " ";
                actualOutputLine += germanFirstName.getName();
                ausgabeZeileFormat.write(actualOutputLine);
                ausgabeZeileFormat.newLine();
            }
            // Trenner schreiben
            ausgabeZeileFormat.write("#");
            ausgabeZeileFormat.newLine();
            // Kanten rausschreiben
            for (int i=0;i<numberOfNodes;i++ ){
                for (int j=0;j<numberOfNodes;j++){
                    if ((a[i][j] == 1)){
                        actualOutputLine = Integer.toString(i) + " " + Integer.toString(j) + " " + "KNOWS";
                        ausgabeZeileFormat.write(actualOutputLine);
                        ausgabeZeileFormat.newLine();
                    }
                }
                System.out.println();
            }
            ausgabeZeileFormat.close();

        }
        catch (Throwable e) {;}

        System.out.println("Number of edges : " + numberOfEdges);
    }

 */
}
