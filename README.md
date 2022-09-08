# scala-bazel-quick-start

**Clone and run for a quick way to start a Scala project with bazel.**

This is a minimal Scala application. The application needs 
the following files

- `WORKSPACE` - Tells bazel where to find dependencies and how where to find rules to create scala libraries and binaries
- `BUILD` - Provides information to bazel on how to build the application

Learn more about [Bazel](https://bazel.build/)

## To Use

To clone and run this repository you'll need [Git](https://git-scm.com) and [Bazel](https://bazel.build/) and [JDK](https://www.oracle.com/java/technologies/downloads/) installed on your computer. From your command line:

```bash
# Clone this repository
git clone https://github.com/electron/electron-quick-start
# Go into the repository
cd scala-bazel-quick-start
# Build a binary
bazel build //:main_deploy.jar
# Run the app
java -jar bazel-bin/main_deploy.jar
```

## License

[CC0 1.0 (Public Domain)](LICENSE.md)
