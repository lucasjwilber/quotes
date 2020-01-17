# quotes

This app parses a json file of quotes and returns a random quote in the file formatted as ["quote" -author].

The app will query the Forismatic API for a random quote, and if the request times out, will instead return a quote from the local recentquotes.json file.

It uses Gson to parse the file and create an array of Quote class objects. It then gets a random index within the bounds of the array, checks that that isn't the same as the previous index, and returns the quote & author of the Quote at that index, formatted as "[quote] -[author]". There are ways to get a random string from the terminal:

-To get a random string from the Formismatic API (or the local file if that requet times out), enter `./gradlew run`.

-To get a random quote from a given author, enter `./gradlew run --args [author]`

-To get a random quote that contains a given word, enter `./gradlew run --args [word]`

-To force a random quote from the local saved file, enter `./gradlew run --args 'local'`


Tests were written with help from @dfa:
https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
