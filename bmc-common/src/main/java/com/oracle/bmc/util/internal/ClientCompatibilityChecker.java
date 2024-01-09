/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import com.oracle.bmc.ClientRuntime;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ClientCompatibilityChecker {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ClientCompatibilityChecker.class);

    // properties in sdk.properties
    public static final String JAVA_MINIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME =
            "java.minimum.client.codegen.version";
    public static final String JAVA_MAXIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME =
            "java.maximum.client.codegen.version";
    // properties in client.properties
    public static final String JAVA_CLIENT_CODEGEN_VERSION_PROPERTY_NAME =
            "java.client.codegen.version";
    public static final String JAVA_MINIMUM_CLIENT_CODEGEN_VERSION_FROM_CLIENT_PROPERTY_NAME =
            "java.minimum.client.codegen.version.from.client";

    public enum VersionCompatibilityCheckMode {
        ALWAYS(new AlwaysVersionCompatibilityCheckModeImpl()),
        ONCE(new OnceVersionCompatibilityCheckModeImpl()),
        NEVER(new NeverVersionCompatibilityCheckModeImpl());

        private final VersionCompatibilityCheckModeImpl impl;

        VersionCompatibilityCheckMode(VersionCompatibilityCheckModeImpl impl) {
            this.impl = impl;
        }

        public static VersionCompatibilityCheckMode fromString(String s) {
            return VersionCompatibilityCheckMode.valueOf(s.toUpperCase());
        }

        public void logInitialMessage() {
            impl.logInitialMessage();
        }

        public Optional<Boolean> getPreviousResult(String clientClassName) {
            return impl.getPreviousResult(clientClassName);
        }

        public boolean setPreviousResult(String clientClassName, boolean previousResult) {
            return impl.setPreviousResult(clientClassName, previousResult);
        }
    }

    /**
     * This Java VM system property (which can be set using
     * -Doci.javasdk.disable.version.compatibility.check=NEVER, for example) controls how frequently
     * client compatibility should be checked.
     *
     * <p>Valid choices for this system property are "NEVER", "ONCE", and "ALWAYS". The default is
     * "ONCE".
     *
     * <p>"NEVER" does not perform any compatibility checks at all.
     *
     * <p>"ONCE", which is the default, performs the check once per client class.
     *
     * <p>"ALWAYS" performs the check every time a new client is instantiated.
     */
    public static final String OCI_JAVASDK_CLIENT_VERSION_COMPATIBILITY_CHECK_SYSTEM_PROPERTY_NAME =
            "oci.javasdk.client.version.compatibility.check";

    private final VersionCompatibilityCheckMode versionCompatibilityCheckMode;

    private final String minimumClientCodegenVersion;

    private final String maximumClientCodegenVersion;

    private final String sdkVersion;

    public ClientCompatibilityChecker(Properties sdkProperties) {
        this(sdkProperties, getVersionCompatibilityCheckModeFromSystemProperty());
    }

    private static VersionCompatibilityCheckMode
            getVersionCompatibilityCheckModeFromSystemProperty() {
        VersionCompatibilityCheckMode mode;
        try {
            String value =
                    System.getProperty(
                            OCI_JAVASDK_CLIENT_VERSION_COMPATIBILITY_CHECK_SYSTEM_PROPERTY_NAME,
                            VersionCompatibilityCheckMode.ONCE.name());
            mode = VersionCompatibilityCheckMode.fromString(value);
        } catch (RuntimeException rte) {
            mode = VersionCompatibilityCheckMode.ONCE;
        }
        return mode;
    }

    public ClientCompatibilityChecker(
            Properties sdkProperties, VersionCompatibilityCheckMode versionCompatibilityCheckMode) {
        this.sdkVersion = ClientRuntime.extractSdkVersionFromProperties(sdkProperties);
        this.minimumClientCodegenVersion = minClientCodegenVersion(sdkProperties);
        this.maximumClientCodegenVersion = maxClientCodegenVersion(sdkProperties);
        this.versionCompatibilityCheckMode = versionCompatibilityCheckMode;
        this.versionCompatibilityCheckMode.logInitialMessage();
    }

    static String minClientCodegenVersion(Properties sdkProperties) {
        return sdkProperties.getProperty(JAVA_MINIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME);
    }

    static String maxClientCodegenVersion(Properties sdkProperties) {
        return sdkProperties.getProperty(JAVA_MAXIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME);
    }

    public String getMinimumClientCodegenVersion() {
        return minimumClientCodegenVersion;
    }

    public String getMaximumClientCodegenVersion() {
        return maximumClientCodegenVersion;
    }

    public boolean isClientCodegenVersionCompatible(
            String clientClassName,
            String clientCodegenVersion,
            Optional<String> javaMinimumClientCodegenVersionFromClient,
            Logger logger) {
        Optional<Boolean> previousResult =
                versionCompatibilityCheckMode.getPreviousResult(clientClassName);
        if (previousResult.isPresent()) {
            return previousResult.get();
        }

        boolean minVersionHasError = false;
        boolean clientVersionHasError = false;

        Optional<ComparableVersion> maybeMinimumVerObj =
                ComparableVersion.buildComparableVersion(minimumClientCodegenVersion);
        if (!maybeMinimumVerObj.isPresent()) {
            // Not returning here, waiting for the check on clientCodegenVersion below to run as
            // well
            // We can thus be giving out all the errors in a single run
            minVersionHasError = true;
        }
        Optional<ComparableVersion> maybeClientVerObj =
                ComparableVersion.buildComparableVersion(clientCodegenVersion);
        if (!maybeClientVerObj.isPresent()) {
            clientVersionHasError = true;
        }

        if (minVersionHasError && !clientVersionHasError) {
            // minimum wasn't provided, but if the maximum was provided, we can maybe still compare
            Optional<ComparableVersion> maybeMaximumVerObj =
                    ComparableVersion.buildComparableVersion(maximumClientCodegenVersion);
            // if the client's common library version matches the maximum exactly, then that's
            // compatible
            if (maybeMaximumVerObj.isPresent()) {
                if (maybeClientVerObj.get().compareTo(maybeMaximumVerObj.get()) == 0) {
                    if (logger.isInfoEnabled()) {
                        logger.info(
                                String.format(
                                        "The client is compatible with the oci-java-sdk-common version '%s', "
                                                + "since it was generated with codegen version '%s', "
                                                + "which is exactly the maximum of the compatible codegen version range",
                                        sdkVersion, clientCodegenVersion));
                    }
                    return versionCompatibilityCheckMode.setPreviousResult(clientClassName, true);
                }
                // or if a minimum from the client is provided, if the common library's version is
                // between the
                // minimum from the client and the client version, that's compatible too
                if (javaMinimumClientCodegenVersionFromClient.isPresent()) {
                    ComparableVersion minimumVerFromClientObj =
                            new ComparableVersion(javaMinimumClientCodegenVersionFromClient.get());
                    if (minimumVerFromClientObj.compareTo(maybeMaximumVerObj.get()) <= 0
                            && maybeMaximumVerObj.get().compareTo(maybeClientVerObj.get()) <= 0) {
                        if (logger.isInfoEnabled()) {
                            logger.info(
                                    String.format(
                                            "The client is compatible with the oci-java-sdk-common version '%s', "
                                                    + "since it was generated using codegen version '%s', "
                                                    + "and at the time the client was generated, it was known that "
                                                    + "codegen version '%s' is backward-compatible to codegen version '%s'; "
                                                    + "therefore, the compatible codegen version range '%s' to '%s' applies",
                                            sdkVersion,
                                            clientCodegenVersion,
                                            clientCodegenVersion,
                                            javaMinimumClientCodegenVersionFromClient.get(),
                                            javaMinimumClientCodegenVersionFromClient.get(),
                                            clientCodegenVersion));
                        }
                        return versionCompatibilityCheckMode.setPreviousResult(
                                clientClassName, true);
                    }
                }
            }
        }

        if (minVersionHasError) {
            if (minimumClientCodegenVersion == null) {
                logger.warn(
                        JAVA_MINIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME
                                + " not found in sdk.properties file. Cannot determine if the client is compatible with the SDK common library");
            } else {
                logger.warn(
                        JAVA_MINIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME
                                + " '"
                                + minimumClientCodegenVersion
                                + " 'could not be parsed. Cannot determine if the client is compatible with the SDK common library");
            }
        }
        if (clientVersionHasError) {
            if (clientCodegenVersion == null) {
                logger.warn(
                        JAVA_CLIENT_CODEGEN_VERSION_PROPERTY_NAME
                                + " not found in client.properties file. Cannot determine if the client is compatible with the SDK common library");
            } else {
                logger.warn(
                        "java.client.common.library.version '"
                                + clientCodegenVersion
                                + "' could not be parsed. Cannot determine if the client is too old for the SDK common library");
            }
        }
        if (clientVersionHasError || minVersionHasError) {
            return versionCompatibilityCheckMode.setPreviousResult(clientClassName, false);
        }

        if (maybeClientVerObj.get().compareTo(maybeMinimumVerObj.get()) < 0) {
            if (logger.isWarnEnabled()) {
                logger.warn(
                        String.format(
                                "The client is too old for the oci-java-sdk-common version '%s'. "
                                        + "The client was generated with codegen version '%s', "
                                        + "but this oci-java-sdk-common version "
                                        + "is only backward-compatible down to codegen version '%s'",
                                sdkVersion, clientCodegenVersion, minimumClientCodegenVersion));
            }
            return versionCompatibilityCheckMode.setPreviousResult(clientClassName, false);
        }
        Optional<ComparableVersion> maybeMaximumVerObj =
                ComparableVersion.buildComparableVersion(maximumClientCodegenVersion);
        if (!maybeMaximumVerObj.isPresent()) {
            if (maximumClientCodegenVersion == null) {
                logger.warn(
                        JAVA_MAXIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME
                                + " not found in sdk.properties file. Cannot determine if the client is too new for the SDK common library");
            } else {
                logger.warn(
                        JAVA_MAXIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME
                                + " "
                                + maximumClientCodegenVersion
                                + " could not be parsed. Cannot determine if the client is too new for the SDK common library");
            }
            return versionCompatibilityCheckMode.setPreviousResult(clientClassName, false);
        }
        ComparableVersion maximumVerObj = new ComparableVersion(maximumClientCodegenVersion);

        if (maybeClientVerObj.get().compareTo(maximumVerObj) > 0) {
            boolean clientIsTooNew = true;
            if (javaMinimumClientCodegenVersionFromClient.isPresent()) {
                ComparableVersion minimumVerObj =
                        new ComparableVersion(javaMinimumClientCodegenVersionFromClient.get());
                if (minimumVerObj.compareTo(maybeMinimumVerObj.get()) == 0) {
                    clientIsTooNew = false;
                }
            }

            if (clientIsTooNew) {
                if (logger.isWarnEnabled()) {
                    if (javaMinimumClientCodegenVersionFromClient.isPresent()) {
                        logger.warn(
                                String.format(
                                        "The client is too new for the oci-java-sdk-common version '%s'. "
                                                + "The client was generated using codegen version '%s', "
                                                + "which is backward-compatible down to codegen version '%s', "
                                                + "but this version of oci-java-sdk-common requires codegen version '%s' "
                                                + "or older",
                                        sdkVersion,
                                        clientCodegenVersion,
                                        javaMinimumClientCodegenVersionFromClient.get(),
                                        maximumClientCodegenVersion));
                    }
                }
                return versionCompatibilityCheckMode.setPreviousResult(clientClassName, false);
            } else {
                if (logger.isInfoEnabled()) {
                    logger.info(
                            String.format(
                                    "The client is compatible with the oci-java-sdk-common version '%s', "
                                            + "since the client was generated using codegen version '%s', "
                                            + "and at the time the client was generated, "
                                            + "it was known that codegen version '%s' "
                                            + "is backward-compatible to codegen version '%s'; "
                                            + "therefore, the compatible codegen version range '%s' to '%s' applies",
                                    sdkVersion,
                                    clientCodegenVersion,
                                    clientCodegenVersion,
                                    minimumClientCodegenVersion,
                                    minimumClientCodegenVersion,
                                    clientCodegenVersion));
                }
            }
        } else {
            if (logger.isInfoEnabled()) {
                logger.info(
                        String.format(
                                "The client is compatible with the oci-java-sdk-common version '%s', "
                                        + "since the client was generated using codegen version '%s', "
                                        + "which is in the compatible codegen version range '%s' to '%s'",
                                sdkVersion,
                                clientCodegenVersion,
                                minimumClientCodegenVersion,
                                maximumClientCodegenVersion));
            }
        }
        return versionCompatibilityCheckMode.setPreviousResult(clientClassName, true);
    }

    interface VersionCompatibilityCheckModeImpl {
        void logInitialMessage();

        Optional<Boolean> getPreviousResult(String clientClassName);

        boolean setPreviousResult(String clientClassName, boolean previousResult);
    }

    static class NeverVersionCompatibilityCheckModeImpl
            implements VersionCompatibilityCheckModeImpl {
        @Override
        public void logInitialMessage() {
            LOG.info(
                    "Not checking client/common library codegen version compatibility; compatibility checks will always return 'true'");
        }

        @Override
        public Optional<Boolean> getPreviousResult(String clientClassName) {
            // always pretend the previous result was true
            return Optional.of(true);
        }

        @Override
        public boolean setPreviousResult(String clientClassName, boolean previousResult) {
            // don't keep track, just return the new result
            return previousResult;
        }
    }

    static class AlwaysVersionCompatibilityCheckModeImpl
            implements VersionCompatibilityCheckModeImpl {
        @Override
        public void logInitialMessage() {
            // no message
        }

        @Override
        public Optional<Boolean> getPreviousResult(String clientClassName) {
            // always pretend there never was a previous result
            return Optional.empty();
        }

        @Override
        public boolean setPreviousResult(String clientClassName, boolean previousResult) {
            // don't keep track, just return the new result
            return previousResult;
        }
    }

    static class OnceVersionCompatibilityCheckModeImpl
            implements VersionCompatibilityCheckModeImpl {
        /**
         * Stores previous client/common library codegen version compatibility checks, but only if
         * VERSION_COMPATIBILITY_CHECK_MODE is VersionCompatibilityCheckMode.ONCE.
         */
        private final Map<String, Boolean> previousResults = new HashMap<>();

        private final ReadWriteLock lock = new ReentrantReadWriteLock();

        @Override
        public void logInitialMessage() {
            // no message
        }

        @Override
        public Optional<Boolean> getPreviousResult(String clientClassName) {
            // always pretend there never was a previous result
            Lock readLock = lock.readLock();
            readLock.lock();
            try {
                if (previousResults.containsKey(clientClassName)) {
                    return Optional.of(previousResults.get(clientClassName));
                } else {
                    return Optional.empty();
                }
            } finally {
                readLock.unlock();
            }
        }

        @Override
        public boolean setPreviousResult(String clientClassName, boolean previousResult) {
            Lock writeLock = lock.writeLock();
            writeLock.lock();
            try {
                previousResults.put(clientClassName, previousResult);
            } finally {
                writeLock.unlock();
                return previousResult;
            }
        }
    }
}
