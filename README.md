# quotes

This app parses a json file of quotes and returns a random quote in the file formatted as ["quote" -author].

It uses Gson to parse the json file and create an array of Quote class objects. It then gets a random index in that array and returns the quote & author of the Quote at that index, formatted as "[quote] -[author]".

To use this app from the terminal, enter `./gradlew run`.
To get a random quote from a given author, enter `./gradlew run --args [author]`

Tests were written with help from @dfa:
https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
