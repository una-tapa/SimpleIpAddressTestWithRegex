# Ip address test using Regex

## Background

Although performing DNS lookup itself is not bad, there is OWASP recommendation to use "Apache Commons Validator" or "Regex" as safer alternatives.
https://cheatsheetseries.owasp.org/cheatsheets/Server_Side_Request_Forgery_Prevention_Cheat_Sheet.html

This simple Java code is for me to try various Regular expression. 

## How to run
1. Compile
```
javac IpAddressTest.java
```
1. Run 
```
java IpAddressTest
```
## Output 

Test output
https://github.com/una-tapa/SimpleIpAddressTestWithRegex/blob/main/IpAddressTestOutput.txt

In this test, test string 2 & 3 are not likely to come in as a part of Http Request. 
