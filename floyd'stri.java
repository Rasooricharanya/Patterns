public class floydstri {
    public static void floydTriangle(int n){
        int num = 1;
        for(int i=1;i<=n;i++){
            for(j=i;j<=i;j++){
                System.out.println(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=5;
        floydTriangle(n);
    }
}
