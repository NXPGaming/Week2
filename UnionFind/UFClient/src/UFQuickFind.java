package BaiTap.UnionFind.UFClient.src;

public class UFQuickFind{
    private int[] id;

    public UFQuickFind(int n)
    {
        id = new int[n];
        for(int i=0;i<n;i++)
        {
            id[i] = i;
        }
    }

    public int find(int u)
    {
        return id[u];
    }

    public boolean connected(int p,int q)
    {
        return id[p] == id[q];
    }

    public void union(int p,int q)
    {
        int pid = find(p);
        int qid = find(q);
        for(int i=0;i<id.length;i++)
        {
            if(id[i] == pid)
            {
                id[i] = qid;
            }
        }
    }

    public int getId(int i)
    {
        return id[i];
    }
}
