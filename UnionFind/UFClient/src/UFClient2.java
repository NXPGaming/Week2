package BaiTap.UnionFind.UFClient.src;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import static edu.princeton.cs.algs4.StdIn.*;

public class UFClient2 {
    public static void main(String []args){
        int N = readInt();
        UFWeight uf = new UFWeight(N);
        int count = 0;
        int maxCount=0;
        while (!StdIn.isEmpty()){
            int p = readInt();
            int q = readInt();
            if (!uf.connected(p, q)) {
                count++;
                uf.union(p, q);
                if(count == N - 1)
                {
                    System.out.println(maxCount);
                    return;
                }
            }
            maxCount++;
        }
        System.out.println("FAILED");
    }
}
