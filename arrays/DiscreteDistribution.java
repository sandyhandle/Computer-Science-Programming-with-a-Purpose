public class DiscreteDistribution{
    public static void main(String[] args){
        int limit = args.length-1;
        int n = Integer.parseInt(args[0]);

//        System.out.println(limit);
//        System.out.println(n);

        for(int i = 0; i < n; i++){
            System.out.print((int)(Math.random() * limit + 1) + " ");
        }
    }
}