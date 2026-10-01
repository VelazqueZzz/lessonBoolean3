//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
const val REQUIRED_HUMIDITY = 20
const val WINTER_SEASON = "зима"
fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val season = "зима"
    val isFavorable = isSunny && isTentOpen && humidity == REQUIRED_HUMIDITY && season != WINTER_SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorable")
}