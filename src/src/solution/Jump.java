package solution;

public class Jump {
        public int solution(int n) {
            int ans = 0;
            int[] charge={1};
            ans=DFS(charge,n);
            return ans;
        }

    private int DFS(int[] charge, int n) {
        if (1 == n) {
            return charge[0];
        }
        if (n % 2 != 0) {charge[0]+=1;
            DFS(charge , n - 1);
        }else{
            DFS(charge, n / 2);}
        return charge[0];
    }


    public static void main(String[] args) {
        Jump jump = new Jump();
        int result=0;
        System.out.println(jump.solution(5000));

    }
    }

