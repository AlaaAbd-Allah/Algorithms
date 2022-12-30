package com.mycompany.sorting.algorithms;
import java.io.*;
import java.util.*;

public class BFSTraversal {
    private int vertex;
    private LinkedList<Integer> adj[];
    private Queue<Integer> queue;
    
    BFSTraversal(int v) {
        vertex = v;
        adj = new LinkedList[vertex];
        for(int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    void BFS(int n) {
        boolean nodes[] = new boolean[vertex];
        int a = 0;
        nodes[n] = true;
        queue.add(n);
        while(queue.size() != 0) {
            n = queue.poll();
            System.out.print(n + " ");
            for(int i = 0; i < adj[n].size(); i++) {
                a = adj[n].get(i);
                if(!nodes[a]) {
                    nodes[a] = true;
                    queue.add(a);
                }
            }
        }
    }
}
