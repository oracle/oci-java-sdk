# How to set Jipher as the FIPS Security Provider of an Application that is using Oracle Cloud Infrastructure SDK for Java

## Steps
1. Add this code in the main class (preferably in a static block) of your application. Make sure that this is called at a very early stage of the runtime execution. Otherwise, you may encounter an error like `Caused by: java.security.ProviderException: SunJSSE already initialized in non-FIPS mode`. This error is a result of the JSSE provider instance being initialized in non-FIPS mode before the JCEProviders class attempts to initialize the JSSE provider in FIPS mode, specifying `Jipher` JCE as its sole FIPS JCE provider.
   ```java
   static {
       // For Java 9 or later, if your application uses a JKS format truststore, such as the default 
       // Java truststore, set the javax.net.ssl.trustStoreType system property to jks. See the Jipher 
       // Troubleshooting Guide for more details. Otherwise, remove this line if the truststore used by
       // the application is in PKCS12 format.
       System.setProperty("javax.net.ssl.trustStoreType", "jks");
       // This system property setting directs the JCEProviders class to register JipherJCE as the 
       // highest priority security provider.
       System.setProperty("useJipherJceProvider", "true");
       // Executes the process of registering Jipher as the primary security provider.
       // This also adds BouncyCastle Fips as the secondary security provider.
       JCEProviders.load();
   }
   ```
2. Add com.oracle.pic.commons `core` dependency to be able to use `JCEProviders.load()`.
   ```xml
   <dependency>
       <groupId>com.oracle.pic.commons</groupId>
       <artifactId>core</artifactId>
       <version>${commons.core.version}</version>
   </dependency>
   ```
   Note:
   * `commons.core.version` needs to be set to the version that integrates well with `Jipher`, which at the time of this writing is `3.2.35`. This property needs to be added in the `properties` section of your `pom.xml`. Please check [Jipher JCE Pegasus Integration](https://confluence.oraclecorp.com/confluence/display/OCICRYPTO/Jipher+JCE+Pegasus+Integration) page for the latest version of `commons.core.version` that has been tested and verified with `Jipher`.
   ```xml
   <properties>
       ...
       <commons.core.version>3.2.35</commons.core.version>
   </properties>
   ```
3. The com.oracle.pic.commons `core` dependency from previous step brings `Jipher` (`jipher-jce` and `jipher-pki`) and `BouncyCastle FIPS` dependencies (`bc-fips` and `bcpkix-fips`). The call to `JCEProviders.load()` will require both `Jipher` and `BouncyCastle FIPS` dependencies as it needs to register `Jipher`  and `BouncyCastle FIPS` as the primary and secondary security provider, respectively. `BouncyCastle FIPS` will serve as a fallback for all the cryptographic methods that `Jipher` does not yet support.   
4. Exclude the already existing Bouncy Castle standard libraries from the `oci-java-sdk-common` as `BouncyCastle FIPS` dependencies brought in from the previous steps will be the replacement.
    ```xml
    <dependency>
        <groupId>com.oracle.oci.sdk</groupId>
        <artifactId>oci-java-sdk-common</artifactId>
        <scope>compile</scope>
        <version>${oci.java.sdk.version}</version>
        <!-- Remove Bouncy Castle Standard Libraries -->
        <exclusions>
            <exclusion>
                <groupId>org.bouncycastle</groupId>
                <artifactId>bcprov-jdk15to18</artifactId>
            </exclusion>
            <exclusion>
                <groupId>org.bouncycastle</groupId>
                <artifactId>bcpkix-jdk15to18</artifactId>
            </exclusion>
        </exclusions>
    </dependency>
    ```
5. Build and Run the application.

## Troubleshooting
1. The system property `java.security.debug` can be used to output debugging information that can help with various java security related issues. The value of this system property can be set as a comma-separated list of debugging options. An option called `jipher` can be used to provide debug information specific to the `Jipher` security provider. Another option called `provider` will output security provider debugging information that provide details as to which specific providers are being used. Both of these options can be used separately or together to verify `Jipher` usage.
   ```
   java -Djava.security.debug="debug,provider" -jar myapplication.jar
   ```
   To see a list of all debugging options, use the help setting: 
   ```
   java -Djava.security.debug=help
   ```
2. JSSE has a built-in debug facility and is activated by the system property `javax.net.debug` which can be useful when trying to understand SSL/TLS connection problems. Use `-Djavax.net.debug=help` to display the various options that can be used with this debugging feature.
3. The [Jipher Troubleshooting page](https://confluence.oraclecorp.com/confluence/display/OCICRYPTO/Jipher+Trouble+Shooting) enumerates a list of some `Jipher` issues that had been encountered and how to debug them.


## References:
* [Jipher JCE Usage Guide](https://confluence.oraclecorp.com/confluence/display/OCICRYPTO/Jipher+JCE+Usage+Guide)
* [Jipher Migration Guide](https://confluence.oraclecorp.com/confluence/display/OCICRYPTO/Jipher+Migration+Guide)
* [Jipher Release Notes](https://confluence.oraclecorp.com/confluence/display/OCICRYPTO/Jipher+Release+Notes)


