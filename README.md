This was created with `sbt new scala/scala3.g8`, and I followed the smithy4s quickstart at `https://disneystreaming.github.io/smithy4s/docs/overview/quickstart` to setup the smithy codegen.

`sbt clean compile` results in the following error

```
~/git/experiments-scala$ sbt clean compile
[info] welcome to sbt 1.10.7 (Ubuntu Java 21.0.5)
[info] loading settings for project experiments-scala-build-build-build from metals.sbt...
[info] loading project definition from /home/dhruv/git/experiments-scala/project/project/project
[info] loading settings for project experiments-scala-build-build from metals.sbt...
[info] loading project definition from /home/dhruv/git/experiments-scala/project/project
[success] Generated .bloop/experiments-scala-build-build.json
[success] Total time: 4 s, completed Jan 28, 2025, 9:08:04 AM
[info] loading settings for project experiments-scala-build from metals.sbt, plugins.sbt...
[info] loading project definition from /home/dhruv/git/experiments-scala/project
[success] Generated .bloop/experiments-scala-build.json
[success] Total time: 2 s, completed Jan 28, 2025, 9:08:08 AM
[info] loading settings for project root from build.sbt...
[info] set current project to experiments-scala (in build file:/home/dhruv/git/experiments-scala/)
[info] Executing in batch mode. For better performance use sbt's shell
[success] Total time: 0 s, completed Jan 28, 2025, 9:08:11 AM
[info] compiling 5 Scala sources to /home/dhruv/git/experiments-scala/target/scala-3.6.3/classes ...
[error] -- [E100] Syntax Error: /home/dhruv/git/experiments-scala/target/scala-3.6.3/src_managed/main/scala/hello/package.scala:1:0 
[error] 1 |package object hello {
[error]   |^
[error]   |method hello must be called with () argument
[error]   |
[error]   | longer explanation available when compiling with `-explain`
[error] one error found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 15 s, completed Jan 28, 2025, 9:08:26 AM
```

## sbt project compiled with Scala 3

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).
