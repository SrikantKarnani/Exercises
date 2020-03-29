/*
    Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And 
    Other Special Characters In A String.
 */

 fun main(args: Array<String>) {
      var str = "tTnQ3#2019"
        var count: Array<Int> = arrayOf(0,0,0,0,0)
        var ch = str.toCharArray()
        for(i in ch){
            var n = i.toInt()
            if(n>=48 && n<=57) count[0]++;
            else if(n>=65 && n<=90) count[1]++;
            else if(n>=97 && n<=122) count[2]++;
            else count[3]++;
        }
        println("Number of digits in $str is ${count[0]} which is " 
        + (count[0]*100.0/str.length) + " %");
        println("Number of Upper case in $str is ${count[1]} which is " 
        + (count[1]*100.0/str.length) + " %");
        println("Number of Lower case in $str is ${count[2]} which is " 
        + (count[2]*100.0/str.length) + " %");
        println("Number of Special Characters in $str is ${count[3]} which is " 
        + (count[3]*100.0/str.length) + " %");
 }

//  var str = "tffds %^fdVF#fw53T"
//     var digits = 0
//     var lowerCase = 0
//     var upperCase = 0
//     var specialChars = 0
//     val strLength = str.length
//     str.toCharArray().forEach {
//         when{
//             it.isDigit()->{digits++}
//             it.isUpperCase()->{upperCase++}
//             it.isLowerCase()->{lowerCase++}
//             else->{specialChars++}
//         }
//     }
//     println("""${(digits.toDouble() / strLength) * 100} digit""")
//     println("""${(lowerCase.toDouble() / strLength) * 100} lowerCase""")
//     println("""${(upperCase.toDouble() / strLength) * 100} upperCase""")
//     println("""${(specialChars.toDouble() / strLength) * 100} special""")
