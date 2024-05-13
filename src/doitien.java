public class doitien {
    public static void main(String[] args) {
        double usd = 3;
        double vnd;
        vnd = usdToVnd(usd);
        System.out.println(vnd);
    }
        public static double usdToVnd (double usd){
            return usd * 23000;
        }

    }