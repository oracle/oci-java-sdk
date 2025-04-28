/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Mirror information used for the management station configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MirrorConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MirrorConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "directory",
        "port",
        "sslport",
        "sslcert",
        "isSslverifyEnabled"
    })
    public MirrorConfiguration(
            String directory,
            String port,
            String sslport,
            String sslcert,
            Boolean isSslverifyEnabled) {
        super();
        this.directory = directory;
        this.port = port;
        this.sslport = sslport;
        this.sslcert = sslcert;
        this.isSslverifyEnabled = isSslverifyEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Path to the data volume on the management station where software source mirrors are
         * stored.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("directory")
        private String directory;

        /**
         * Path to the data volume on the management station where software source mirrors are
         * stored.
         *
         * @param directory the value to set
         * @return this builder
         */
        public Builder directory(String directory) {
            this.directory = directory;
            this.__explicitlySet__.add("directory");
            return this;
        }
        /** Default mirror listening port for http. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private String port;

        /**
         * Default mirror listening port for http.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(String port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** Default mirror listening port for https. */
        @com.fasterxml.jackson.annotation.JsonProperty("sslport")
        private String sslport;

        /**
         * Default mirror listening port for https.
         *
         * @param sslport the value to set
         * @return this builder
         */
        public Builder sslport(String sslport) {
            this.sslport = sslport;
            this.__explicitlySet__.add("sslport");
            return this;
        }
        /** Path to the SSL cerfificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("sslcert")
        private String sslcert;

        /**
         * Path to the SSL cerfificate.
         *
         * @param sslcert the value to set
         * @return this builder
         */
        public Builder sslcert(String sslcert) {
            this.sslcert = sslcert;
            this.__explicitlySet__.add("sslcert");
            return this;
        }
        /**
         * When enabled, the SSL certificate is verified whenever an instance installs or updates a
         * package from a software source that is mirrored on the management station.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSslverifyEnabled")
        private Boolean isSslverifyEnabled;

        /**
         * When enabled, the SSL certificate is verified whenever an instance installs or updates a
         * package from a software source that is mirrored on the management station.
         *
         * @param isSslverifyEnabled the value to set
         * @return this builder
         */
        public Builder isSslverifyEnabled(Boolean isSslverifyEnabled) {
            this.isSslverifyEnabled = isSslverifyEnabled;
            this.__explicitlySet__.add("isSslverifyEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MirrorConfiguration build() {
            MirrorConfiguration model =
                    new MirrorConfiguration(
                            this.directory,
                            this.port,
                            this.sslport,
                            this.sslcert,
                            this.isSslverifyEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MirrorConfiguration model) {
            if (model.wasPropertyExplicitlySet("directory")) {
                this.directory(model.getDirectory());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("sslport")) {
                this.sslport(model.getSslport());
            }
            if (model.wasPropertyExplicitlySet("sslcert")) {
                this.sslcert(model.getSslcert());
            }
            if (model.wasPropertyExplicitlySet("isSslverifyEnabled")) {
                this.isSslverifyEnabled(model.getIsSslverifyEnabled());
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
     * Path to the data volume on the management station where software source mirrors are stored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("directory")
    private final String directory;

    /**
     * Path to the data volume on the management station where software source mirrors are stored.
     *
     * @return the value
     */
    public String getDirectory() {
        return directory;
    }

    /** Default mirror listening port for http. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final String port;

    /**
     * Default mirror listening port for http.
     *
     * @return the value
     */
    public String getPort() {
        return port;
    }

    /** Default mirror listening port for https. */
    @com.fasterxml.jackson.annotation.JsonProperty("sslport")
    private final String sslport;

    /**
     * Default mirror listening port for https.
     *
     * @return the value
     */
    public String getSslport() {
        return sslport;
    }

    /** Path to the SSL cerfificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("sslcert")
    private final String sslcert;

    /**
     * Path to the SSL cerfificate.
     *
     * @return the value
     */
    public String getSslcert() {
        return sslcert;
    }

    /**
     * When enabled, the SSL certificate is verified whenever an instance installs or updates a
     * package from a software source that is mirrored on the management station.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSslverifyEnabled")
    private final Boolean isSslverifyEnabled;

    /**
     * When enabled, the SSL certificate is verified whenever an instance installs or updates a
     * package from a software source that is mirrored on the management station.
     *
     * @return the value
     */
    public Boolean getIsSslverifyEnabled() {
        return isSslverifyEnabled;
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
        sb.append("MirrorConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("directory=").append(String.valueOf(this.directory));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", sslport=").append(String.valueOf(this.sslport));
        sb.append(", sslcert=").append(String.valueOf(this.sslcert));
        sb.append(", isSslverifyEnabled=").append(String.valueOf(this.isSslverifyEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MirrorConfiguration)) {
            return false;
        }

        MirrorConfiguration other = (MirrorConfiguration) o;
        return java.util.Objects.equals(this.directory, other.directory)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.sslport, other.sslport)
                && java.util.Objects.equals(this.sslcert, other.sslcert)
                && java.util.Objects.equals(this.isSslverifyEnabled, other.isSslverifyEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.directory == null ? 43 : this.directory.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.sslport == null ? 43 : this.sslport.hashCode());
        result = (result * PRIME) + (this.sslcert == null ? 43 : this.sslcert.hashCode());
        result =
                (result * PRIME)
                        + (this.isSslverifyEnabled == null
                                ? 43
                                : this.isSslverifyEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
