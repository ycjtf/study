import io.vavr.control.Try;
import org.junit.Test;
import org.springframework.web.util.HtmlUtils;

import java.io.FileInputStream;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Administrator
 */
public class door {

    @Test
    public void t1() {
        Try<Integer> of = Try.of(() -> 1 / 0);
        System.out.println(of.get());
        Try.of(() -> new FileInputStream(""));

    }

    @Test
    public void tn() {
        Date date = new Date();
        System.out.println(date);
        Calendar instance = Calendar.getInstance();

        System.out.println(instance);
    }

    @Test
    public void t3() {
        String decode = HtmlUtils.htmlUnescape("http://123.206.98.172:8089/order/FastRpt/PDF_NEW.aspx?PrintType=Invoice&amp;order_id=698097&amp;InvoiceType=AutoSelect");
        System.out.println(decode);

    }

    @Test
    public void t2() {
        System.out.println((char) 0);
        System.out.println((int) '\u0001');
        System.out.println((int) '\u0002');
        for (int i = 0; i < 10000; i++) {
            System.out.println((char) (i));
        }
        A a = new A("1", "2", 3);
    }

    record A(String s1, String s2, Integer s3) {
        public String getS2(){
            return s2;
        }
    }

    class B {
        private String s1;
        private String s2;
        private Integer s3;

        public String getS1() {
            return s1;
        }

        public void setS1(String s1) {
            this.s1 = s1;
        }

        public String getS2() {
            return s2;
        }

        public void setS2(String s2) {
            this.s2 = s2;
        }

        public Integer getS3() {
            return s3;
        }

        public void setS3(Integer s3) {
            this.s3 = s3;
        }
    }
}
