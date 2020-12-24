package ch02;

public class Main {

	static int V;
	static int[][] parent;

	public static void main(String[] args){

		final int INF = 1000000000;

		int[][] graph = {
				{0,   5,  INF, 10},
				{INF, 0,   3, INF},
				{INF, INF, 0,   1},
				{INF, INF, INF, 0}
		};
		V = 4;
		parent = new int[4][4];
		for(int i=0; i<4; i++){
			for(int a=0; a<4; a++){
				if(i==a){parent[i][a] = i;}
				else if(graph[i][a]!=0 && graph[i][a] != INF){parent[i][a] = i;}
				else{parent[i][a] = -1;}
			}
		}
		floydwarshall(graph);
	}

	public static void floydwarshall(int[][] graph){
          
                int temp = 0;
		for(int a=0; a<V; a++){
			for(int b=0; b<V; b++){
				for(int c=0; c<V; c++){
                                        temp =  graph[b][a]+graph[a][c];
					if( temp < graph[b][c]){
						graph[b][c] = temp;
						parent[b][c] = a;
					}
				}
			}
		}

		for(int[] x: graph){
			for(int y: x){
				System.out.print(y+" ");
			}
			System.out.println();
		}

		System.out.println();
		for(int[] x: parent){
			for(int y: x){
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
