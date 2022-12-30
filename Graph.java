package com.mycompany.sorting.algorithms;
import java.util.*;

public class Graph {
    private int vertex;
    private LinkedList<Integer> adj[];
    
    // create a graph
    Graph(int v){
        vertex = v;
        adj = new LinkedList[v];
        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }
    
    // add edge to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    
    // BFS algorithm
    void BFS(int s) {
        boolean visited[] = new boolean[vertex];
        LinkedList<Integer> queue = new LinkedList();
        visited[s] =true;
        queue.add(s);
        
        while(queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");
            
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]) {
                    visited[n] =true;
                    queue.add(n);
                }
            }
        }
    }
}

//        Graph g = new Graph(10);
//       
//        g.addEdge(0, 1);
//        g.addEdge(0, 2);
//        g.addEdge(0, 3);
//        g.addEdge(1, 3);
//        g.addEdge(2, 4);
//        g.addEdge(3, 5);
//        g.addEdge(3, 6);
//        g.addEdge(4, 7);
//        g.addEdge(4, 5);
//        
//        System.out.println("Breadth Frist Traversal for the graph is: ");
//        g.BFS(2);