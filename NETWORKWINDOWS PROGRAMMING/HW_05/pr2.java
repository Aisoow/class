public class pr2 {
    public static void main(String[] args) {
        String str1 = "Apple";							
        String str2 = "Banana";
        System.out.println("l在位置: " + str1.indexOf('l'));
        System.out.println("str2 no4: " + str2.charAt(4));
        System.out.println(str2.replace('a', 'b'));
        String str3 = str1.concat(str2);
        System.out.println("str1+str2= " + str3);
        System.out.println("印出str1子字串'pl': " + str1.substring(2, 4));
        System.out.println("str2從Bb開始? " + str2.startsWith("Bb"));
   }
    
}