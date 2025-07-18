import java.text.DecimalFormat;

public class buffer {    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();

        StringBuffer sb2 = new StringBuffer("name surname");

        StringBuffer sb3 = new StringBuffer(30);

        System.err.println(sb3.capacity());
        System.err.println(sb1.capacity());

        sb2.append("sos");
        System.out.println(sb2);

        // its methods are same as string builder


        // RandomString rs = new RandomString();

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        String str = "kc,s wjeifks jqkm,e jwncn";
        String rep = str.replaceAll("\\s", "");
        System.out.println(rep);

        DecimalFormat deci = new DecimalFormat("0.000");
        System.out.println(deci.format(6.2));
    }
}
