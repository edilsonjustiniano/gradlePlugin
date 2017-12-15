# Standalone Gradle Plugin

## How to use it
* How to build it

```
./gradlew clean build
```

* How to publish the artifacts to `.m2` home

```
./gradlew uploadArchives
```

* How to include in your build script

```groovy
//...
apply plugin 'br.inatel.angrydevs.pojo2json'
//...
dependencies {
    classpath 'br.inatel.angrydevs:pojo2json:0.0.1'
}
//...
```

* How to execute it

```prompt
./gradlew -q angry
```