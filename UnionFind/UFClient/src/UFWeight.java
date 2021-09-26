package BaiTap.UnionFind.UFClient.src;

public class UFWeight {
    private int[] id;
    private int[] sz;


    public UFWeight(int n)
    {
        id = new int[n];
        sz = new int[n];

        for(int i=0;i<n;i++)
        {
            id[i] = i;
            sz[i] = 1;
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

        if(pid == qid) return;
        if(sz[pid] < sz[qid])
        {
            id[pid] = qid;
            sz[qid] += sz[pid];
        }
        else
        {
            id[qid] = pid;
            sz[pid] += sz[qid];
        }
    }
}
