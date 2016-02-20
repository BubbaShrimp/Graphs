import java.util.Stack;

class Vertex
{
	public char label;
	public boolean wasVisited;
	
	public Vertex(char lab)
	{
		label = lab;
		wasVisited = false;
	}
}



class graph {
	private final int MAX_VERTS = 20;
	private Vertex vertexList[];
	private int adjMat[][];
	private int nVerts;
	
	public graph()
	{
		vertexList = new Vertex[MAX_VERTS];
		
		adjMat = new int[MAX_VERTS][MAX_VERTS];
		nVerts = 0;
		for(int j=0; j<MAX_VERTS; j++) //set adjacency matrix to 0
			for(int k=0; k<MAX_VERTS; k++)
				adjMat[j][k] = 0;
	}
	
	public void addVertex(char lab)
	{
		vertexList[nVerts++] = new Vertex(lab);
	}
	
	public void addEdge(int start, int end)
	{
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;
	}
	
	public void displayVertex(int v)
	{
		System.out.print(vertexList[v].label);
	}
	
	//returns an unvisited vertex adjacent to v
	public int getAdjUnvisitedVertex(int v)
	{
		for(int j=0; j <nVerts; j++)
			if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
				return j;
		return -1; //no such vertex
	}
	
	public void dfs()
	{
		vertexList[0].wasVisited = true;
		displayVertex(0);
		Stack<Integer> memory = new Stack<Integer>();
		memory.push(0);
		
		while(!memory.isEmpty())
		{
			//get an unvisited vertex adjacent to stack top
			int v = getAdjUnvisitedVertex(memory.peek());
			if(v == -1)
				memory.pop();
			else
			{
				vertexList[v].wasVisited = true;
				displayVertex(v);
				memory.push(v);
			}
		}
		
		//stack is empty
		for(int j=0; j<nVerts; j++) //reset flags
			vertexList[j].wasVisited = false;
	}

}


