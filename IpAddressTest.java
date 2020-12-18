import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.List;

public class IpAddressTest {

    public static boolean isIpV4Format(String host) {
        Pattern ptn = Pattern.compile("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$");
        Matcher mtch = ptn.matcher(host);
        return mtch.find();
    }
    public static boolean isIpV6Format(String host) {
	return host.indexOf(".") == -1; 
    }

    public static void main(String[] args) {

	List<String> TEST_STRING = Arrays.asList(new String[]{
		"8.8.8.8",       //Google
		"69.89.31.226",  //Yahoo 
		"12a.111.222.123",  //one letter - This hostname is not likely to come in in the http request 
		"999.999.999.999",  //one letter - This hostname is not likely to come in in the http request 
		"2001:0db8:85a3:0000:0000:8a2e:0370:7334",   //IPv6 format 
		"w3.ibm.com"     //Good hostname
		});

	System.out.println("\nSSO Domain is available when the incoming host is NOT IP Address");
	System.out.println("This program checks if the input is IP address format  - v4 (69.89.31.226) nor v6 (2001:0db8:85a3:0000:0000:8a2e:0370:7334)\n"); 
	
	for (int i=0; i < TEST_STRING.size(); i++) {

	    String host = TEST_STRING.get(i); 
	    System.out.println("=== Test " + i + " : "  + host); 

	    System.out.println("Is " + host + " in IpV4Format?"  + " ->" + isIpV4Format(host));
	    System.out.println("Is " + host + " in IpV6Format?"  + " ->" + isIpV6Format(host)); 

	    if (isIpV4Format(host) || isIpV6Format(host)) {
		System.out.println("No SSO Domain available for " + host); 
	    } else {
		System.out.println("Domain name available for " + host); 
	    }
	    System.out.println("\n"); 
	}

    }


}
