package day25;

import java.util.*;

public class test1 {
    static class edges {
        int src;
        int dest;
        int wt;

        public edges(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<edges> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edges(0, 1, 10));
        graph[0].add(new edges(0, 2, 15));
        graph[0].add(new edges(0, 3, 30));

        graph[1].add(new edges(1, 0, 10));
        graph[1].add(new edges(1, 3, 40));

        graph[2].add(new edges(2, 0, 15));
        graph[2].add(new edges(2, 3, 50));

        graph[3].add(new edges(3, 1, 40));
        graph[3].add(new edges(3, 2, 50));
    }

    static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        public Pair(int v, int c) {
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void kruskalsmst(ArrayList<edges> edges,int v)
    {
        Collections.sort(edges);
        int mstcost = 0;
        int count = 0;
        for(int i = 0 ; i < v-1;i++)
        {
            edges e = edges.get(i);
            int parA = find(e.src);
            int parB = find()
        }
    }

    public static void union(int a ,int b)
    {
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB])
        {
            [par[parB]]
        }
    }

    public static void main(String[] args) {

    }
}