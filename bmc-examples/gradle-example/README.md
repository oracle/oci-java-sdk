To run this example, you'll need to [install Gradle](https://gradle.org/install/).

In order to compile the project, there's a predefined function in the `build.gradle` file named `jar`.

Open a terminal in the `gradle-example` directory and execute the function by running:

```
$ gradle jar
``` 

A new `build` directory should be created which contains the `.jar` file.

You should now be able to run the application:

```
$ java -jar build/libs/GradleExample.jar "<compartmentId>"
```

The `<compartmentId>` argument is required for this example but generally, if the application does not expect arguments, simply run it:

```
$ java -jar build/libs/GradleExample.jar
```

Any example from the parent directory can run through Gradle as long as it can be found in the `gradle-example` project directory along with its local dependencies. The `Main-Class` attribute in the `build.gradle` file should also match the java class being executed.
