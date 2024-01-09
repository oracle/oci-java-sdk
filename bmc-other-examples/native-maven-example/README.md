# OCI Java SDK Maven Native Image Executable Example

This folder contains an example of using the SDK with the Streaming service.
It depends on the `oci-java-sdk-streaming` module as well as `oci-java-sdk-common-httpclient-jersey`,
therefore using the OCI SDK Jersey client implementation.

The build configures the [Native Maven Plugin](https://graalvm.github.io/native-build-tools/latest/maven-plugin.html) to allow building executables
with GraalVM Native Image.

## Run the example

To run the example:

- Set the `oci.java.sdk.version` property in the [pom.xml](pom.xml) file.
- (Optionally) Install the required dependencies by running from the root directory:
  ```shell
  mvn install -pl bmc-streaming,bmc-common-httpclient-choices/bmc-common-httpclient-jersey -am -DskipTests
  mvn install -pl bmc-bom
  ```
- Set your compartment id and execute the example with the required arguments:
  ```shell
  export COMPARTMENT_OCID="..."
  mvn install exec:java -Dexec.args=$COMPARTMENT_OCID
  ```

It is possible to execute any other example from the `bmc-examples` module by replacing the dependencies,
moving a different example java file and setting the `mainClass` Maven property.
To use Jersey3 simply change the `oci-java-sdk-common-httpclient-jersey` to `oci-java-sdk-common-httpclient-jersey3`
dependency.

## Run the example as Native Image executable

To execute the example as a [GraalVM](https://www.graalvm.org/) native image executable run:
- Perform the first 2 steps as above if required.
- Build the native executable:
  ```shell
  mvn clean package -Pnative
  ```
- Run the native executable with the required arguments:
  ```shell
  export COMPARTMENT_OCID="..."
  ./target/oci-java-sdk-examples $COMPARTMENT_OCID
  ```
  
### Building with GraalVM Java8

Prior to building with Java8 GraalVM distribution, perform these steps:
- Change the `native-maven-plugin.version` to `0.9.25` or prior.
- Add the following build arguments in the configurtion of the native build plugin:
  ```xml
  <plugin>
    <groupId>org.graalvm.buildtools</groupId>
    <artifactId>native-maven-plugin</artifactId>
    ...
    <configuration>
      ...
      <buildArgs>
        <buildArg>--allow-incomplete-classpath</buildArg>
        <buildArg>--report-unsupported-elements-at-runtime</buildArg>
      </buildArgs>
    </configuration>
  </plugin>
  ```
