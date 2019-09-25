package statics;

import errorExceptionPlay.TestStactTrace;

import java.util.Calendar;
import java.util.Date;

public class TestBox {

    Integer i;
    int j;

    public void go(){
        j = i;
        System.out.println(j);
        System.out.println(i);
    }

    public static void main(String[] args) {
        TestBox t = new TestBox();
//        t.go();

        String s = "2";
        int y = Integer.parseInt(s);
        System.out.println(y);

        int h = 4;
        String hs = Integer.toString(h);
        String hss = ""+ h;

        System.out.println(hs);
        System.out.println(hss);

        System.out.println(String.format("%,d", 440_003_334, 655453));

        String d = String.format(" %tr, %<tA, %<tB %<td", new Date());
        System.out.println(d);

        Calendar cal = Calendar.getInstance();
        cal.set(2019, 9, 20);
        long day1 = cal.getTimeInMillis();
        System.out.println("milicent " + day1);
        day1 += 1000 * 60 * 60;
        System.out.println("after multiplied " + day1);
        cal.setTimeInMillis(day1);
        System.out.println("new hour " + cal.get(cal.HOUR_OF_DAY));

        Calendar c = Calendar.getInstance();
        c.add(c.DATE, 35);
        System.out.println("added 35 days " +  c.getTime());
    }
}
