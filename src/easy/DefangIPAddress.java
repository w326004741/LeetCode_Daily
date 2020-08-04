package easy;

/**
 * @author Weichen Wang
 * @date 2020/7/18 - 10:56 AM
 * @description: No.1108 Defanging an IP address 清除IP地址
 * Question: Given a valid (IPv4) IP address, return a defanged version of that IP address. A defanged IP address replaces every period "." with "[.]".
 *
 * 总结： StringBuilder是一个可变对象，可以预分配缓冲区。这样往StringBuilder中新增字符时，不会创建新的临时对象。不容易浪费内存和影响Garbage Collection效率.
 */
public class DefangIPAddress {

    public String defangIPaddr(String address) {

        StringBuilder sb = new StringBuilder();

        for (char c : address.toCharArray()) {
            if (c == '.') {
                sb.append("[.]");
            } else
                sb.append(c);
        }
        return sb.toString();

        // 2： 这种方法的Runtime时间变长，且内存使用变大
//        String result = "";
//        result = address.replace(".", "[.]");
//        return result;
    }

    public static void main(String[] args) {
        String address = "255.100.50.0";
        DefangIPAddress defangIPAddress = new DefangIPAddress();
        defangIPAddress.defangIPaddr(address);
    }

}
