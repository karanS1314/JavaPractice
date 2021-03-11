package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

import graph.BuildingGraph.Edge;
import oopsRevision.generics.Pair;

public class Dijkstra {
	static class Pair implements Comparable<Pair>{
		int v;
		String psf;
		int wsf;
		
		Pair(int v , String psf , int wsf){
			this.v = v;
			this.psf = psf;
			this.wsf = wsf;
		}
		
		public int compareTo(Pair o) { 
			return this.wsf - o.wsf;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vert = sc.nextInt(); 
		// vertices aagyi
		
		ArrayList<Edge>[] graph = new ArrayList[vert];
		// it is assumed here that each vertex is between [0 to vert-1]
		
		for(int i=0;i<vert;i++) {
			graph[i] = new ArrayList<>();
		}
		int edges = sc.nextInt();
		
		for(int i=0; i<edges; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt = sc.nextInt();
			graph[src].add(new Edge(src, dest, wt));
			graph[dest].add(new Edge(dest, src, wt));
		}
		int strt = sc.nextInt();
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		boolean vis[] = new boolean[vert];
		pq.add(new Pair(strt , " ", 0));
		
		while(pq.size()>0) {
			Pair curr = pq.poll();
			
			if(vis[curr.v]==true) {
				continue;
			} 
			else {
				vis[curr.v] = true;
			}
			
			System.out.println(curr.v + " " + curr.psf + "@" + curr.wsf );
			
			for(Edge e : graph[curr.v]) {
				if(!vis[e.dest]) {
					pq.add(new Pair(e.dest , curr.psf + e.src , curr.wsf+e.wt));
				}
			}
			
		}

	}

}
