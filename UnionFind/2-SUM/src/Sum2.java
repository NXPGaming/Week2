import edu.princeton.cs.algs4.In;

public class Sum2 {
    public static void main(String []args) {
        In in = new In("C:\\CTDL_GT\\algs4-data\\2Kints.txt"); // tạo luồng đọc từ file
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a

        for(int i=1;i<a.length;i++)
        {
            int x = a[i];
            int j = i-1;
            while(j >= 0 && x < a[j])
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = x;
        }

        for(int i=0;i<a.length-1;i++)
        {
            if(a[i] > 0)
            {
                return;
            }
            int lo = i+1, hi = a.length-1;
            while(lo <= hi)
            {
                int mid = lo + (hi - lo)/2;
                if(-a[i] < a[mid])
                {
                    hi = mid - 1;
                }
                else if(-a[i] > a[mid])
                {
                    lo = mid + 1;
                }
                else
                {
                    System.out.print(a[i] + " " + a[mid]+'\n');
                    break;
                }
            }
        }
    }
}
