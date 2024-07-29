package day24;

import java.util.ArrayList;

public class test1 {
    static class edge {
        int src, dest;

        public edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void creategraph(ArrayList<edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 1));

        graph[1].add(new edge(0, 1));
        graph[1].add(new edge(0, 1));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));

        graph[4].add(new edge(4, 3));
    }

    public static boolean detectcycle(ArrayList<edge>[] graph)
    {
        boolean[] vis = new boolean[graph.length];
        for(int i = 0 ; i < graph.length;i++)
        {
            if(!vis[i])
            {
                if(detectcycleutil(graph,vis,i,-1))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean detectcycleutil(ArrayList<edge>[] graph,boolean)
    {
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e = graph[curr].get(i);
            if(!vis[e.dest])
            {
                if(detectcycleutil(graph,vis,i,-1))
                {
                    return true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge>[] graph = new ArrayList[v];
        creategraph(graph);

        if(detectcycle(graph))
        {
            System.out.println("cycle exixts in the graph");
        }
        else{
            System.out.println("no cycle in the graph");
        }
    }
}
