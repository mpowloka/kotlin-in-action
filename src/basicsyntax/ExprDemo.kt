package basicsyntax

interface Expression

class Value (val value: Int) : Expression

class Sum (val left: Expression,val right: Expression) : Expression

fun evaluate(expr: Expression): Int {
    if (expr is Value) return expr.value
    if (expr is Sum) return evaluate(expr.left) + evaluate(expr.right)
    throw Exception("Wtf")
}

fun moreKotlinEvaluate (expr: Expression): Int = when(expr){
    is Value -> expr.value
    is Sum -> moreKotlinEvaluate(expr.left) + moreKotlinEvaluate(expr.right)
    else -> throw Exception("Wtf")
}
