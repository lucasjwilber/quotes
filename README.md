# quotes

This app parses a json file of quotes and returns a random quote in the file formatted as ["quote" -author].


It uses Gson to parse the json, and creates a Quote class object for each object in the json file. It then gets a random index, checks that that isn't the same as the previous index, and returns the quote & author of the Quote at that index, formatted as "[quote] -[author]". There are ways to get a random string from the terminal:

-To get a random string, enter `./gradlew run`.

-To get a random quote from a given author, enter `./gradlew run --args [author]`

-To get a random quote that contains a given word, enter `./gradlew run --args [word]`

Tests were written with help from @dfa:
https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
