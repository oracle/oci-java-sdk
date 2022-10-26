# Oracle Cloud Infrastructure Java SDK Enforcer README

## Enforcer to prohibit mixing Oracle Cloud Infrastructure Java SDK Versions

Example:

```
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-enforcer-plugin</artifactId>
        <version>3.1.0</version>
        <dependencies>
          <dependency>
            <groupId>com.oracle.oci.sdk</groupId>
            <artifactId>oci-java-sdk-enforcer-rules</artifactId>
            <version>2.46.0</version> <!-- use latest version -->
            <optional>false</optional>
          </dependency>
        </dependencies>
        <executions>
          <execution>
            <id>enforce</id>
            <phase>verify</phase>
            <goals>
              <goal>enforce</goal>
            </goals>
            <configuration>
              <rules>
                <noMixedOciJavaSdkVersionsRule implementation="com.oracle.bmc.enforcer.rule.NoMixedOciJavaSdkVersionsRule">
                  <allowedDependencies>
                    <allowedDependency>com.oracle.oci.sdk:oci-java-sdk-common</allowedDependency>
                    <allowedDependency>com.oracle.oci.sdk:oci-java-sdk-circuitbreaker</allowedDependency>
                  </allowedDependencies>
                </noMixedOciJavaSdkVersionsRule>
              </rules>
            </configuration>
          </execution>
        </executions>
      </plugin>
```

Example output on failure:


```
[INFO] --- maven-enforcer-plugin:3.1.0:enforce (enforce) @ maven-test ---
[ERROR] Rule 0: com.oracle.bmc.enforcer.rule.NoMixedOciJavaSdkVersionsRule failed with message:
Multiple different versions of com.oracle.oci.sdk:oci-java-sdk* dependencies have been found.
Mixing different versions is not allowedDependencies.
Using version 2.37.0:
    com.oracle.oci.sdk:oci-java-sdk-identity:jar:2.37.0
Using version 1.5.10:
    com.oracle.oci.sdk:oci-java-sdk-addons-s2s:jar:1.5.10
Use 'mvn dependency:tree' to locate the source of the dependencies with the mixed versions.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
```

## Installation

If you have access to Maven Central, Maven should automatically download the enforcer rule. If you do not have access to Maven Central, you can install the `oci-java-sdk-enforcer-rules` Maven package in your local repository using the following command line:

```
mvn install:install-file -Dfile=buildTools/oci-java-sdk-enforcer-rules/lib/oci-java-sdk-enforcer-rules-2.46.0.jar -DpomFile=buildTools/oci-java-sdk-enforcer-rules/lib/oci-java-sdk-enforcer-rules-2.46.0.pom
```

Note that exact version (e.g. `2.46.0`) varies based on what version of the OCI Java SDK you downloaded and are using, and that the paths (i.e. `buildTools/oci-java-sdk-enforcer-rules/lib/`) are taken to be from the root of the ZIP file distributable.

For more information about installing Maven packages, see [Guide to installing 3rd party JARs](https://maven.apache.org/guides/mini/guide-3rd-party-jars-local.html).