
val sentence = "WATCH OUT!"

val sentence2 = "1, 2! 3? a"

val MyPattern = "[^a-zA-Z]+".r


sentence2.matches(MyPattern.toString)

