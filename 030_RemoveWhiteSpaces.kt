fun main() {
    var sentence = "   Kot     lin is O pe n   So u r ce.  "
    println("Original sentence: $sentence")

    // replace(old chars, new chars) 
    var statement = sentence.trim()
    println("After trim: '$statement'")
    sentence = sentence.replace("\\s".toRegex(), "")
    println("After replacement: $sentence")
}

/*
In the above program, we use String's replace() method to remove and replace all whitespaces in the string sentence.

We've used regular expression \\s that finds all white space characters (tabs, spaces, new line character, etc.) in the string. Then, we replace it with "" (empty string literal).
 */