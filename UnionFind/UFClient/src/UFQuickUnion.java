package BaiTap.UnionFind.UFClient.src;

public class UFQuickUnion {
    private int[] id;

    public UFQuickUnion(int n)
    {
        id = new int[n];
        for(int i=0;i<n;i++)
        {
            id[i] = i;
        }
    }

    public int getId(int i)
    {
        return id[i];
    }

    public int find(int u)
    {
        while(u!=id[u])
        {
            u = id[u];
        }
        return u;
    }

    public boolean connected(int u,int v)
    {
        return id[u] == id[v];
    }

    public void union(int u,int v)
    {
        int pid = find(u);
        int qid = find(v);
        id[pid] = qid;
    }
}
