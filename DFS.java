/*
DEPTH FIRST SEARCH
------------------
*/

import java.util.*;

public class Graph {
	static int nv;
	static LinkedList<Integer> adj[];
	Graph(int n)
	{
		nv=n;
		adj = new LinkedList[n];
		for(int i = 0; i < n; i++)
			adj[i] = new LinkedList();
	}
	void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	void DFSTraversal(int v,boolean[] visited) 
	{
		visited[v]=true;
		System.out.print(v+" ");
		Iterator<Integer> it = adj[v].listIterator();
		while(it.hasNext())
		{
			int i=i.next();
			if(!visited[i])
				DFSTraverssal(i,visited)
		}
	}
}
class DFS
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of vertices : ");
		int nv=sc.cextInt();
		System.out.print("Enter no. of edges : ");
		int ne= sc.nextInt();
		Graph g = new Graph(nv);
		System.out.println("Enter edges : ");
		for(int i = 0; i < n; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			g.addEdge(x, y);
		}
		System.out.print("Enter Source Vertex : ");
		int s = sc.nextInt();
		System.out.print("The DFS Traversal is ");
		boolean[] visited = new boolean[nv];
		g.DFSs(s,visited);
		System.out.println();
		sc.close();
	}
}

/*
OUTPUT:
-------
Enter no of vertices : 5
Enter no. of edges : 8
Enter edges :
0 1
1 0
0 2
2 0
1 3
3 1
1 4
4 1
Enter Source Vertex : 0
The DFS Traversal is 0 1 3 4 2
*/
