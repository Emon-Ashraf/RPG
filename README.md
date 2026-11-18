# Dungeon RPG

A command-line dungeon game built with Java and Kotlin. Explore rooms, encounter monsters, and manage health and inventory through text commands.

## Features

- Move with commands such as `go north` and inspect your character with `status`.
- Search rooms for loot or traps and choose whether to rest.
- Fight or flee from random encounters and gain experience from victories.

## Getting Started

The Gradle build expects a Java 8 toolchain. Use a Java 8 JDK or make one available to Gradle, then build and start the Java entry point:

```sh
bash gradlew classes
java -cp build/classes/java/main ru.hits.Main
```

Type `exit` to leave the game.
