# OCI Java SDK Gradle Native Image Executable Example

This folder contains an example of using the SDK with the Streaming service.
It depends on the `oci-java-sdk-streaming` module as well as `oci-java-sdk-common-httpclient-jersey`,
therefore using the OCI SDK Jersey client implementation.

The build configures the [Native Gradle Plugin](https://graalvm.github.io/native-build-tools/latest/gradle-plugin.html) to allow building executables
with GraalVM Native Image.

## Run the example

To run the example:

- Set the `ociJavaSdk` property in the [build.gradle](build.gradle) file to the required value.
- (Optionally) Install the required dependencies by running from the root directory:
  ```shell
  mvn install -pl bmc-streaming,bmc-common-httpclient-choices/bmc-common-httpclient-jersey -am -DskipTests
  ```
- (Optionally) Add the `mavenLocal()` as a repository in [build.gradle](build.gradle) if you performed previous step.
- Set your compartment id and execute the example with the required arguments:
  ```shell
  export COMPARTMENT_OCID="..."
  ./gradlew run --args=$COMPARTMENT_OCID
  ```

It is possible to execute any other example from the `bmc-examples` module by replacing the dependencies,
moving a different example java file and setting the `javaMainClass` Maven property.
To use Jersey3 simply change the `oci-java-sdk-common-httpclient-jersey` to `oci-java-sdk-common-httpclient-jersey3`
dependency.

## Run the example as Native Image executable

To execute the example as a [GraalVM](https://www.graalvm.org/) native image executable run:
- Perform the first 3 steps as above if required.
- Build the native executable:
  ```shell
  ./gradlew clean nativeBuild
  ```
- Run the native executable with the required arguments:
  ```shell
  export COMPARTMENT_OCID="..."
  ./build/native/nativeCompile/native-gradle-example $COMPARTMENT_OCID
  ```

### Native Image building for GraalVM Java 8 versions

Perform these steps prior to building with Java 8 distributions of GraalVM:
- Change version of the `org.graalvm.buildtools.native` plugin to version `0.9.25`.
- Add the following configuration in the end of `build.gralde`:
  ```groovy
  graalvmNative {
      binaries {
          main {
              richOutput = false
              buildArgs.add("--allow-incomplete-classpath")
              buildArgs.add("--report-unsupported-elements-at-runtime")
          }
      }
  }
  ```