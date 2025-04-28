/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Image version details of the On-premise VP worker. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OnPremiseVpWorkerVersionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OnPremiseVpWorkerVersionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"version", "minSupportedVersion", "latestVersion"})
    public OnPremiseVpWorkerVersionDetails(
            String version, String minSupportedVersion, String latestVersion) {
        super();
        this.version = version;
        this.minSupportedVersion = minSupportedVersion;
        this.latestVersion = latestVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Current image version of the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Current image version of the On-premise VP worker.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** Minimum supported image version of the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("minSupportedVersion")
        private String minSupportedVersion;

        /**
         * Minimum supported image version of the On-premise VP worker.
         *
         * @param minSupportedVersion the value to set
         * @return this builder
         */
        public Builder minSupportedVersion(String minSupportedVersion) {
            this.minSupportedVersion = minSupportedVersion;
            this.__explicitlySet__.add("minSupportedVersion");
            return this;
        }
        /** Latest image version of the On-premise VP worker. */
        @com.fasterxml.jackson.annotation.JsonProperty("latestVersion")
        private String latestVersion;

        /**
         * Latest image version of the On-premise VP worker.
         *
         * @param latestVersion the value to set
         * @return this builder
         */
        public Builder latestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            this.__explicitlySet__.add("latestVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OnPremiseVpWorkerVersionDetails build() {
            OnPremiseVpWorkerVersionDetails model =
                    new OnPremiseVpWorkerVersionDetails(
                            this.version, this.minSupportedVersion, this.latestVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OnPremiseVpWorkerVersionDetails model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("minSupportedVersion")) {
                this.minSupportedVersion(model.getMinSupportedVersion());
            }
            if (model.wasPropertyExplicitlySet("latestVersion")) {
                this.latestVersion(model.getLatestVersion());
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

    /** Current image version of the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Current image version of the On-premise VP worker.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** Minimum supported image version of the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("minSupportedVersion")
    private final String minSupportedVersion;

    /**
     * Minimum supported image version of the On-premise VP worker.
     *
     * @return the value
     */
    public String getMinSupportedVersion() {
        return minSupportedVersion;
    }

    /** Latest image version of the On-premise VP worker. */
    @com.fasterxml.jackson.annotation.JsonProperty("latestVersion")
    private final String latestVersion;

    /**
     * Latest image version of the On-premise VP worker.
     *
     * @return the value
     */
    public String getLatestVersion() {
        return latestVersion;
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
        sb.append("OnPremiseVpWorkerVersionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", minSupportedVersion=").append(String.valueOf(this.minSupportedVersion));
        sb.append(", latestVersion=").append(String.valueOf(this.latestVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OnPremiseVpWorkerVersionDetails)) {
            return false;
        }

        OnPremiseVpWorkerVersionDetails other = (OnPremiseVpWorkerVersionDetails) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.minSupportedVersion, other.minSupportedVersion)
                && java.util.Objects.equals(this.latestVersion, other.latestVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.minSupportedVersion == null
                                ? 43
                                : this.minSupportedVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.latestVersion == null ? 43 : this.latestVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
