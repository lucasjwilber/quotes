# quotes

This app parses a json file of quotes and returns a random quote in the array and its author.

It uses Gson to parse the json, and creates a Quote class object for each object in the json file. It then gets a random index, checks that that isn't the same as the previous index, and returns the quote & author of the Quote at that index, formatted as "[quote] -[author]".

To use this app from the terminal, enter `./gradlew run`.

Tests were written with help from @dfa:
https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println