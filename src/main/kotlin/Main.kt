fun main(args: Array<String>) {
   //define function that accept function
    val greetingFunction : (String,Int) -> String ={playerName,numBuildings ->
        val currentYear = 2018
        println("adding $numBuildings houses")
        "Welcome to SimVillage,$playerName! (copyright $currentYear"
    }
   runSimulation("Rawan",greetingFunction)
}
fun runSimulation(playerName:String,greetingFunction(String,Int)->String)
{ val numBuildings=Random.nextInt(1..3)
   println(greetingFunction(playerName,numBuildings))

}