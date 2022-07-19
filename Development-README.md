# Development Notes for Oracle Cloud Infrastructure SDK for Java

## Build Profiles

- *default profile* - Compile and generate Javadoc.
- `dev` - Compile, reformat code and update licenses.
- `dev` with `-Ddev.profile.skip.javadoc=false` - Compile, reformat code and update licenses, generate Javadoc.
- `quick` - Only check for compilation errors, no Javadoc or tests.
- `jdk-17-and-above` - This profile is automatically used when JDK 17 or higher is detected. No Jacdoc generated and tests failures should be ignored. See the [Java 17 test failures](#Java17TestFailures) section in [Known Development Issues](#KnownDevelopmentIssues).

### Usage
To run a maven build with the `dev` profile and generate Javadoc, use
```
mvn install -Pdev -Ddev.profile.skip.javadoc=false
```

## Javadoc Generation
During javadoc generation, any javadocs with the template '*{{DOC_SERVER_URL}}*' will have that template replaced with the actual doc server URL.

## <a id="KnownDevelopmentIssues"></a>Known Development Issues

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

Test failures beyond these may be test failures that come from implemented changes. To run these tests sucessfully, use JDK 8 for now.