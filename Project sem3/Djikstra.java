// import java.util.ArrayList; 
import java.util.Scanner;

public class Djikstra {

	public static int output_dist[];

	static final int V = 10;

	int minDistance(int dist[], Boolean sptSet[]) {
		int min = Integer.MAX_VALUE, min_index = -1;

		for (int v = 0; v < V; v++)
			if (sptSet[v] == false && dist[v] <= min) {
				min = dist[v];
				min_index = v;
			}

		return min_index;
	}

	public static int getMinDistance(int[] dist, int destination) {
		return dist[destination];
	}

	void printSolution(int dist[], int source, String[] names) {
		String sourceName = names[source];
		System.out.println(
				"Vertex Name \t\t Distance from " + sourceName);
		for (int i = 0; i < V; i++) {
			if (dist[i] > 0 || i == source) {
				System.out.println(names[i] + " \t\t " + dist[i]);
			}
		}
	}

	int[] dijkstra(int graph[][], int src) {
		int dist[] = new int[V];

		Boolean sptSet[] = new Boolean[V];
		for (int i = 0; i < V; i++) {
			dist[i] = Integer.MAX_VALUE;
			sptSet[i] = false;
		}

		dist[src] = 0;

		for (int count = 0; count < V - 1; count++) {
			int u = minDistance(dist, sptSet);
			sptSet[u] = true;
			for (int v = 0; v < V; v++)
				if (!sptSet[v] && graph[u][v] != 0
						&& dist[u] != Integer.MAX_VALUE
						&& dist[u] + graph[u][v] < dist[v])
					dist[v] = dist[u] + graph[u][v];
		}
		return dist;
	}

	// static int destination_location;

	// public static int setDestLocation(int user_destination_location) {
	// 	destination_location = user_destination_location;
	// 	int final_dist = getMinDistance(output_dist, destination_location);
	// 	return final_dist;
	// }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] names = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };

		int graph[][] = new int[][] {
				{ 0, 3, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 3, 0, 1, 0, 0, 0, 0, 2, 0, 0 },
				{ 0, 1, 0, 2, 0, 0, 0, 5, 2, 0 },
				{ 0, 0, 2, 0, 2, 0, 1, 0, 0, 3 },
				{ 1, 0, 0, 2, 0, 2, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 2, 0, 5, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 5, 0, 0, 0, 0 },
				{ 0, 2, 5, 0, 0, 0, 0, 0, 3, 0 },
				{ 0, 0, 2, 0, 0, 0, 0, 3, 0, 1 },
				{ 0, 0, 0, 3, 0, 0, 0, 0, 1, 0 }
		};

		Djikstra t = new Djikstra();

		// take input from user here in form of integer.

		System.out.println("Enter the source location: ");
		int source = sc.nextInt() - 1;

		try {
			if (source >= 0 && source < graph.length) {
				System.out.println("VALID SOURCE LOCATION");
				output_dist = t.dijkstra(graph, source);
				t.printSolution(output_dist, source, names);
			} else {
				throw new Exception("Invalid source location");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
