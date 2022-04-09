import java.io.File
import java.io.BufferedReader
import java.nio.file.Paths
var hangman_pics = listOf("",
    """
     +---+
         |
         |
         |
       ===""",
    """
     +---+
     o   |
         |
         |
       ===""",
    """
     +---+
     o   |
     |   |
         |
       ===""",
    """
     +---+
     o   |
    /|   |
         |
       ===""",
    """
     +---+
     o   |
    /|\  |
         |
       ===""",
    """
     +---+
     o   |
    /|\  |
    /    |
       ===""",
    """
     +---+
     o   |
    /|\  |
    / \  |
       ===""")
fun getRandomWord(wordList :List<String>):String{
    val randomWord = wordList.random();
    return randomWord
}

fun displayGame(missedLetters: String, correctLetters: String, secretWord: String){ // Wyświetlamy Wisielca
    if(missedLetters.length < hangman_pics.size)
        println(hangman_pics[missedLetters.length])
    var empty = ""
    var lives = (hangman_pics.size -1) - missedLetters.length

    for (i in secretWord){
        if (i in correctLetters)
            empty += i.uppercase()
        else
            empty += "_"
    }
    println("HASŁO: " + empty)
    println("ŻYCIA: " + lives)

    print( "Wykorzystane litery: ")
    missedLetters.forEach { print(it.uppercase() + " ") }
    correctLetters.forEach { print(it.uppercase() + " ") }
    println("\n")
}

fun getGuess(guessedAlready: String):String{
    var guess = ""
    while (true){
        print("Zgadnij litere: ")
        guess = readLine().toString().lowercase()
        if(guess.length != 1)
            println("Wprowadź pojedyńczą literę")
        else if (guess !in "aąbcćdeęfghijklłmnńoópqrstuvwxyzźż" )
            println("Wprowadź literę !!!")
        else if (guess in guessedAlready )
            println("Podaj literę której jeszcze nie wprowadzono")
        else
            return guess
    }
}

fun playAgain():Boolean{
    print("Czy chcesz zagrać ponownie ? (Tak lub Nie):")
    return  readLine().toString().lowercase().startsWith('t')
}

fun main(args: Array<String>) {
    val path = Paths.get("").toAbsolutePath().toString()
    println("Working Directory = $path") // current working dir
    val bufferedReader: BufferedReader = File("$path/src/main/resources/slowa.txt").bufferedReader()
    val words = bufferedReader.use { it.readLines() } // odczytujemy słowa z pliku i tworzymy listę za pomocą buffera

    println("W I S I E L E C")
    var missedLetters = ""
    var correctLetters = ""
    var secretWord = getRandomWord(words)
    var gameIsDone = false
    var foundAllLetters: Boolean;
    while (true){ // Główna pętla gry
        displayGame(missedLetters, correctLetters, secretWord)
        var guess = getGuess(missedLetters + correctLetters)

        if(guess in secretWord) {
            correctLetters += guess

            foundAllLetters = true

            for (element in secretWord) {
                if (element !in correctLetters){
                    foundAllLetters = false
                    break
                }
            }
            if (foundAllLetters) {
                println("Gratulacje udało Ci się wygrać :)")
                gameIsDone = true
            }
        }

        else{
            missedLetters += guess
            if (missedLetters.length == (hangman_pics.size - 1)){
                gameIsDone = true
                displayGame(missedLetters, correctLetters, secretWord)
                println("Przegrałeś wyczerpałeś wszystkie życia: \n Odpowiedź: $secretWord")
            }
        }
            if (gameIsDone)
                if (playAgain()){
                    missedLetters = ""
                    correctLetters = ""
                    gameIsDone = false
                    secretWord = getRandomWord(words)
                }
                else
                    break

    }

}