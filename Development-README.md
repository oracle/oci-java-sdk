# Development Notes for Oracle Cloud Infrastructure SDK for Java

## Build Profiles

- *default profile* - Compile and generate Javadoc.
- `dev` - Compile, reformat code and update licenses.
- `dev` with `-Ddev.profile.skip.javadoc=false` - Compile, reformat code and update licenses, generate Javadoc.
- `quick` - Only check for compilation errors, no Javadoc or tests.
- `jdk-17-and-above` - This profile is automatically used when JDK 17 or higher is detected. No Javadoc generated and tests failures should be ignored. See the [Java 17 test failures](#Java17TestFailures) section in [Known Development Issues](#KnownDevelopmentIssues).

### Usage
To run a maven build with the `dev` profile and generate Javadoc, use
```
mvn install -Pdev -Ddev.profile.skip.javadoc=false
```

## Javadoc Generation
During javadoc generation, any javadocs with the template '*{{DOC_SERVER_URL}}*' will have that template replaced with the actual doc server URL.

## <a id="KnownDevelopmentIssues"></a>Known Development Issues

### Errors may suddenly appear after updating to any of these JDK versions: 8u381, 11.0.20, 17.0.8, and 21.0.0.

The following error message might be encountered:
```
java.lang.ClassNotFoundException: com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
```
This issue is a result of the listed Java versions, which have a default maximum signature file size smaller than some Java SDK JARs.

To resolve this problem, you can run Maven with the following parameter:
`-Djdk.jar.maxSignatureFileSize=16000000`

If you're compiling with javac, you can use the following command:
`javac -J-Djdk.jar.maxSignatureFileSize=16000000 example.java`

The low default value in Java will be addressed and resolved in upcoming minor Java version releases.

### <a id="Java17TestFailures"></a> Java 17 test failures
If JDK 17 is used to build the OCI Java SDK, then there will be 5 unit tests that fail because of a test dependency that does not work well with more recent Java versions. To workaround this issue, ignore test failures with the `-Dmaven.test.failure.ignore` parameter:
```
mvn install -Dmaven.test.failure.ignore=true
```
The following tests should report errors: 
 - ConfigFileDelegationTokenUtilsTest
 - ConfigFileAuthenticationDetailsProviderTest
 - X509FederationClientTest
 - DefaultConfiguratorTest
 - RequestSignerImplTest
 - UploadManagerTest

Test failures beyond these may be test failures that come from implemented changes. To run these tests successfully, use JDK 8 for now.