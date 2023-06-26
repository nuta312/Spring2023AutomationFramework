package codingbat.aygerim.WarmUp1HomeWorks;

public class WarmUp26JUne {
  public String everyNth(String str, int n) {
    String result = "";
  for (int i=0; i<str.length(); i = i + n) {
    result = result + str.charAt(i);
  }
  return result;
}
public String stringTimes(String str, int n) {
  String result = "";
  for (int i=0; i<n; i++){
    result = result + str;
  } return result;
}
public String frontTimes(String str, int n) {
  int f = 3;
if(f>str.length()){
  f=str.length();}
String front = str.substring (0, f);
String result="";
for (int i=0; i<n; i++){
  result = result+front;
} return result;
}
int countXX(String str) {
   int count = 0;
  for (int i = 0; i < str.length()-1; i++) {
    if (str.substring(i, i+2).equals("xx")) count++;
  }
  return count;
}
boolean doubleX(String str) {
   int i = str.indexOf("x");
  if (i == -1) return false;
  if (i+1 >= str.length()) return false; 
  return str.substring(i+1, i+2).equals("x");
}
}
