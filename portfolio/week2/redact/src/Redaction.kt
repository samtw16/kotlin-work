// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(text: String, takeouttext: String, replacement: Char = 'X'): String {
    val regex = Regex("\\b(${Regex.escape(takeouttext)})\\b", RegexOption.IGNORE_CASE)
    val result = text.replace(regex) { matchResult ->
        replacement.toString().repeat(matchResult.value.length)
    }
    return result
}