/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * List of available post actions you can execute after the successful Java installation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PostInstallationActionSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PostInstallationActionSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "disabledTlsVersions",
        "shouldReplaceCertificatesOperatingSystem",
        "minimumKeySizeSettings",
        "addLoggingHandler",
        "globalLoggingLevel",
        "proxies"
    })
    public PostInstallationActionSettings(
            java.util.List<TlsVersions> disabledTlsVersions,
            Boolean shouldReplaceCertificatesOperatingSystem,
            MinimumKeySizeSettings minimumKeySizeSettings,
            Boolean addLoggingHandler,
            GlobalLoggingLevel globalLoggingLevel,
            Proxies proxies) {
        super();
        this.disabledTlsVersions = disabledTlsVersions;
        this.shouldReplaceCertificatesOperatingSystem = shouldReplaceCertificatesOperatingSystem;
        this.minimumKeySizeSettings = minimumKeySizeSettings;
        this.addLoggingHandler = addLoggingHandler;
        this.globalLoggingLevel = globalLoggingLevel;
        this.proxies = proxies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The following post JRE installation actions are supported by the field: - Disable TLS 1.0
         * , TLS 1.1
         */
        @com.fasterxml.jackson.annotation.JsonProperty("disabledTlsVersions")
        private java.util.List<TlsVersions> disabledTlsVersions;

        /**
         * The following post JRE installation actions are supported by the field: - Disable TLS 1.0
         * , TLS 1.1
         *
         * @param disabledTlsVersions the value to set
         * @return this builder
         */
        public Builder disabledTlsVersions(java.util.List<TlsVersions> disabledTlsVersions) {
            this.disabledTlsVersions = disabledTlsVersions;
            this.__explicitlySet__.add("disabledTlsVersions");
            return this;
        }
        /**
         * Restores JDK root certificates with the certificates that are available in the operating
         * system. The following action is supported by the field: - Replace JDK root certificates
         * with a list provided by the operating system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldReplaceCertificatesOperatingSystem")
        private Boolean shouldReplaceCertificatesOperatingSystem;

        /**
         * Restores JDK root certificates with the certificates that are available in the operating
         * system. The following action is supported by the field: - Replace JDK root certificates
         * with a list provided by the operating system.
         *
         * @param shouldReplaceCertificatesOperatingSystem the value to set
         * @return this builder
         */
        public Builder shouldReplaceCertificatesOperatingSystem(
                Boolean shouldReplaceCertificatesOperatingSystem) {
            this.shouldReplaceCertificatesOperatingSystem =
                    shouldReplaceCertificatesOperatingSystem;
            this.__explicitlySet__.add("shouldReplaceCertificatesOperatingSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minimumKeySizeSettings")
        private MinimumKeySizeSettings minimumKeySizeSettings;

        public Builder minimumKeySizeSettings(MinimumKeySizeSettings minimumKeySizeSettings) {
            this.minimumKeySizeSettings = minimumKeySizeSettings;
            this.__explicitlySet__.add("minimumKeySizeSettings");
            return this;
        }
        /** Sets FileHandler and ConsoleHandler as handlers in logging.properties file. */
        @com.fasterxml.jackson.annotation.JsonProperty("addLoggingHandler")
        private Boolean addLoggingHandler;

        /**
         * Sets FileHandler and ConsoleHandler as handlers in logging.properties file.
         *
         * @param addLoggingHandler the value to set
         * @return this builder
         */
        public Builder addLoggingHandler(Boolean addLoggingHandler) {
            this.addLoggingHandler = addLoggingHandler;
            this.__explicitlySet__.add("addLoggingHandler");
            return this;
        }
        /** Sets the logging level in logging.properties file. */
        @com.fasterxml.jackson.annotation.JsonProperty("globalLoggingLevel")
        private GlobalLoggingLevel globalLoggingLevel;

        /**
         * Sets the logging level in logging.properties file.
         *
         * @param globalLoggingLevel the value to set
         * @return this builder
         */
        public Builder globalLoggingLevel(GlobalLoggingLevel globalLoggingLevel) {
            this.globalLoggingLevel = globalLoggingLevel;
            this.__explicitlySet__.add("globalLoggingLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("proxies")
        private Proxies proxies;

        public Builder proxies(Proxies proxies) {
            this.proxies = proxies;
            this.__explicitlySet__.add("proxies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PostInstallationActionSettings build() {
            PostInstallationActionSettings model =
                    new PostInstallationActionSettings(
                            this.disabledTlsVersions,
                            this.shouldReplaceCertificatesOperatingSystem,
                            this.minimumKeySizeSettings,
                            this.addLoggingHandler,
                            this.globalLoggingLevel,
                            this.proxies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PostInstallationActionSettings model) {
            if (model.wasPropertyExplicitlySet("disabledTlsVersions")) {
                this.disabledTlsVersions(model.getDisabledTlsVersions());
            }
            if (model.wasPropertyExplicitlySet("shouldReplaceCertificatesOperatingSystem")) {
                this.shouldReplaceCertificatesOperatingSystem(
                        model.getShouldReplaceCertificatesOperatingSystem());
            }
            if (model.wasPropertyExplicitlySet("minimumKeySizeSettings")) {
                this.minimumKeySizeSettings(model.getMinimumKeySizeSettings());
            }
            if (model.wasPropertyExplicitlySet("addLoggingHandler")) {
                this.addLoggingHandler(model.getAddLoggingHandler());
            }
            if (model.wasPropertyExplicitlySet("globalLoggingLevel")) {
                this.globalLoggingLevel(model.getGlobalLoggingLevel());
            }
            if (model.wasPropertyExplicitlySet("proxies")) {
                this.proxies(model.getProxies());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The following post JRE installation actions are supported by the field: - Disable TLS 1.0 ,
     * TLS 1.1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disabledTlsVersions")
    private final java.util.List<TlsVersions> disabledTlsVersions;

    /**
     * The following post JRE installation actions are supported by the field: - Disable TLS 1.0 ,
     * TLS 1.1
     *
     * @return the value
     */
    public java.util.List<TlsVersions> getDisabledTlsVersions() {
        return disabledTlsVersions;
    }

    /**
     * Restores JDK root certificates with the certificates that are available in the operating
     * system. The following action is supported by the field: - Replace JDK root certificates with
     * a list provided by the operating system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldReplaceCertificatesOperatingSystem")
    private final Boolean shouldReplaceCertificatesOperatingSystem;

    /**
     * Restores JDK root certificates with the certificates that are available in the operating
     * system. The following action is supported by the field: - Replace JDK root certificates with
     * a list provided by the operating system.
     *
     * @return the value
     */
    public Boolean getShouldReplaceCertificatesOperatingSystem() {
        return shouldReplaceCertificatesOperatingSystem;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("minimumKeySizeSettings")
    private final MinimumKeySizeSettings minimumKeySizeSettings;

    public MinimumKeySizeSettings getMinimumKeySizeSettings() {
        return minimumKeySizeSettings;
    }

    /** Sets FileHandler and ConsoleHandler as handlers in logging.properties file. */
    @com.fasterxml.jackson.annotation.JsonProperty("addLoggingHandler")
    private final Boolean addLoggingHandler;

    /**
     * Sets FileHandler and ConsoleHandler as handlers in logging.properties file.
     *
     * @return the value
     */
    public Boolean getAddLoggingHandler() {
        return addLoggingHandler;
    }

    /** Sets the logging level in logging.properties file. */
    @com.fasterxml.jackson.annotation.JsonProperty("globalLoggingLevel")
    private final GlobalLoggingLevel globalLoggingLevel;

    /**
     * Sets the logging level in logging.properties file.
     *
     * @return the value
     */
    public GlobalLoggingLevel getGlobalLoggingLevel() {
        return globalLoggingLevel;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("proxies")
    private final Proxies proxies;

    public Proxies getProxies() {
        return proxies;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PostInstallationActionSettings(");
        sb.append("super=").append(super.toString());
        sb.append("disabledTlsVersions=").append(String.valueOf(this.disabledTlsVersions));
        sb.append(", shouldReplaceCertificatesOperatingSystem=")
                .append(String.valueOf(this.shouldReplaceCertificatesOperatingSystem));
        sb.append(", minimumKeySizeSettings=").append(String.valueOf(this.minimumKeySizeSettings));
        sb.append(", addLoggingHandler=").append(String.valueOf(this.addLoggingHandler));
        sb.append(", globalLoggingLevel=").append(String.valueOf(this.globalLoggingLevel));
        sb.append(", proxies=").append(String.valueOf(this.proxies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostInstallationActionSettings)) {
            return false;
        }

        PostInstallationActionSettings other = (PostInstallationActionSettings) o;
        return java.util.Objects.equals(this.disabledTlsVersions, other.disabledTlsVersions)
                && java.util.Objects.equals(
                        this.shouldReplaceCertificatesOperatingSystem,
                        other.shouldReplaceCertificatesOperatingSystem)
                && java.util.Objects.equals(
                        this.minimumKeySizeSettings, other.minimumKeySizeSettings)
                && java.util.Objects.equals(this.addLoggingHandler, other.addLoggingHandler)
                && java.util.Objects.equals(this.globalLoggingLevel, other.globalLoggingLevel)
                && java.util.Objects.equals(this.proxies, other.proxies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.disabledTlsVersions == null
                                ? 43
                                : this.disabledTlsVersions.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldReplaceCertificatesOperatingSystem == null
                                ? 43
                                : this.shouldReplaceCertificatesOperatingSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumKeySizeSettings == null
                                ? 43
                                : this.minimumKeySizeSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.addLoggingHandler == null ? 43 : this.addLoggingHandler.hashCode());
        result =
                (result * PRIME)
                        + (this.globalLoggingLevel == null
                                ? 43
                                : this.globalLoggingLevel.hashCode());
        result = (result * PRIME) + (this.proxies == null ? 43 : this.proxies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
