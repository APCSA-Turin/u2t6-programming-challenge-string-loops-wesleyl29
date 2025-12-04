package com.example.project;

public class StringLoops {

   public StringLoops() { }

   //WARM UP 
    // using a for loop remove all 'a' characters from input string
   public String removeA(String str) {
    
    for (int i = 0; i < str.length(); i++){
        if (str.substring(i, i+1).equals("a")){
            str = str.substring(0, str.indexOf("a"))+str.substring(str.indexOf("a")+1);
        }
        if (str.substring(0).equals("a")){
            str = "";
        }
    }   
    return str;
   }


   // WARM UP
   // using a while loop remove all 'a' characters from input string
   public String removeA2(String str) {
    int i = 0;
    while (i < str.length()){
        if (str.substring(i, i+1).equals("a")){
            str = str.substring(0, str.indexOf("a"))+str.substring(str.indexOf("a")+1);
        }
        if (str.substring(0).equals("a")){
            str = "";
        }
        i++;
    }
    return str;
   }


   //WARM UP 
   //Reverse a string by counting down from the end to the start
   public String reverseString(String str) {
    String revStr = "";
    for (int i = str.length(); i > 0; i--){
        revStr+=str.substring(i-1, i);
    }   
    return revStr;
   }


   //WARM UP
   //Reverse a string by counting up from the start to the end
   public String reverseString2(String str) {
    String revStr = "";
    for (int i = 0; i < str.length(); i++){
        revStr = str.substring(i, i+1)+revStr;
    }   
    return revStr;
   }


   // using a for loop
   public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
    for (int i = 0; i < origStr.length(); i++){
        if (origStr.substring(i, i+1).equals(searchChar)){
            origStr=origStr.substring(0, i)+replaceChar+origStr.substring(i+1);
        }
        if (origStr.substring(0, 1).equals(replaceChar)){
            origStr = replaceChar+origStr.substring(1);
        }
    }
    return origStr;
   }


   // using a while loop
   public String replaceCharacterV2(String searchChar, String origStr, String replaceChar) {
    int i = 0;   
    while (i<origStr.length()){
        if (origStr.substring(i, i+1).equals(searchChar)){
            origStr=origStr.substring(0, i)+replaceChar+origStr.substring(i+1);
        }
        if (origStr.substring(0, 1).equals(replaceChar)){
            origStr = replaceChar+origStr.substring(1);
        }
        i++;
    }
    return origStr;
   }

   public int countString(String searchString, String origString) {
    
        int count = 0;
        for (int i = 0; i < origString.length(); i++){
            int end = i + searchString.length();
            if (end > origString.length()){
                end = origString.length();
            }
            if (searchString.equals(origString.subSequence(i, end))){
                System.out.println(origString.subSequence(i, end));
                count++;
               
            }
           
        }
       return count;
   }
   

   public String removeString(String searchString, String origString) {
    
    while (origString.indexOf(searchString)!=-1){
        origString=origString.substring(0, origString.indexOf(searchString))+origString.substring(origString.indexOf(searchString)+searchString.length());
    }   
    return origString;
   }


   public void commaSeparated(int fromNum, int toNum) { //the tests will compare your printed output (not a returned string)
    String l = "";
    if (fromNum<=toNum){
        for (int i = fromNum; i <= toNum; i++){
        if (i == toNum){
            l+=i+"\n";
        } else {
            l+=i+", ";
        }
        
    } 
    } else {
        for (int i = fromNum; i >= toNum; i--){
            if (i == toNum){
            l+=i+"\n";
        } else {
            l+=i+", ";
        }
        }
    }
      
    System.out.println(l);
   }



   public boolean isPalindrome(String myString) {
    for (int i = 0; i < myString.length(); i++){
           if (myString.substring(i, i+1).equals(" ")){
              myString = myString.substring(0, i)+myString.substring(i+1);
           }
       }
    String revStr = "";
    for (int i = 0; i < myString.length(); i++){
        revStr = myString.substring(i, i+1)+revStr;
    }   
    if (myString.equals(revStr)){
        return true;
    }   
    return false;
   }


   public void multiPrint(String toPrint, int num) { //the tests will compare your printed output (not a returned string)
    String printed = "[";
    int count = 0;
    if (num <= 0){
        System.out.println("[]\n");
    } else {
    while (count < num-1){
        count++;
        printed+=toPrint+" ";
    }
    printed+=toPrint+"]\n";   
    System.out.println(printed);
}
   }
}
