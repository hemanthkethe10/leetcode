fun main() {
    println(
        numUniqueEmails(
            arrayOf(
                "test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"
            )
        )
    )
}

fun numUniqueEmails(emails: Array<String>) {
    val seperatedList = emails.map { it.split("@") }
    println(seperatedList)
    val regex="[/+]".toRegex()
    println("str.kl+yrucgychk".replace(regex,"\\$\\$"))
}