# Oracle Cloud Infrastructure Java SDK - Shaded Full Jar

## About

This directory contains a Maven `pom.xml` file that allows you to use the shaded full jar (which contains most of the Oracle Cloud Infrastructure Java SDK's dependencies) in Maven, while automatically pulling in the dependencies that are not already contained in the shaded full jar.

## Usage

The pom.xml file in this directory, `bmc-shaded/bmc-shaded-full/pom.xml` depends on two other ancestor files, `pom.xml` and `bmc-shaded/pom.xml`.

Those will have to be installed in your Maven repository first:

    cd java-sdk
    mvn install:install-file -Dfile=pom.xml -Dpackaging=pom -DpomFile=pom.xml
    mvn install:install-file -Dfile=bmc-shaded/pom.xml -Dpackaging=pom -DpomFile=bmc-shaded/pom.xml

Download the latest release of the Java SDK from Github: https://github.com/oracle/oci-java-sdk/releases

Extract the `shaded/lib/oci-java-sdk-shaded-full-*.jar` file from the downloaded zip file.

Now you can install that zip file in your Maven repository:

    mvn install:install-file -Dfile=/path/to/oci-java-sdk-shaded-full-<version>.jar -Dpackaging=jar -DpomFile=bmc-shaded/bmc-shaded-full/pom.xml

You can now depend on the `com.oracle.oci.sdk:oci-java-sdk-shaded-full` artifact by including the following dependency in your own Maven `pom.xml` files:

    <dependencies>
      <dependency>
        <groupId>com.oracle.oci.sdk</groupId>
        <artifactId>oci-java-sdk-shaded-full</artifactId>
        <version> -- insert version here -- </version>
      </dependency>
    </dependencies>
