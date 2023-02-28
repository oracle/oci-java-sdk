/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * The configuration to update on an existing OpenSearch cluster. Software version and security
 * config are not allowed to be updated at the same time. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateOpensearchClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateOpensearchClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "softwareVersion",
        "securityMode",
        "securityMasterUserName",
        "securityMasterUserPasswordHash",
        "freeformTags",
        "definedTags"
    })
    public UpdateOpensearchClusterDetails(
            String displayName,
            String softwareVersion,
            SecurityMode securityMode,
            String securityMasterUserName,
            String securityMasterUserPasswordHash,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.softwareVersion = softwareVersion;
        this.securityMode = securityMode;
        this.securityMasterUserName = securityMasterUserName;
        this.securityMasterUserPasswordHash = securityMasterUserPasswordHash;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the cluster. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the cluster. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
        private String softwareVersion;

        public Builder softwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            this.__explicitlySet__.add("softwareVersion");
            return this;
        }
        /** The security mode of the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityMode")
        private SecurityMode securityMode;

        /**
         * The security mode of the cluster.
         *
         * @param securityMode the value to set
         * @return this builder
         */
        public Builder securityMode(SecurityMode securityMode) {
            this.securityMode = securityMode;
            this.__explicitlySet__.add("securityMode");
            return this;
        }
        /** The name of the master user that are used to manage security config */
        @com.fasterxml.jackson.annotation.JsonProperty("securityMasterUserName")
        private String securityMasterUserName;

        /**
         * The name of the master user that are used to manage security config
         *
         * @param securityMasterUserName the value to set
         * @return this builder
         */
        public Builder securityMasterUserName(String securityMasterUserName) {
            this.securityMasterUserName = securityMasterUserName;
            this.__explicitlySet__.add("securityMasterUserName");
            return this;
        }
        /** The password hash of the master user that are used to manage security config */
        @com.fasterxml.jackson.annotation.JsonProperty("securityMasterUserPasswordHash")
        private String securityMasterUserPasswordHash;

        /**
         * The password hash of the master user that are used to manage security config
         *
         * @param securityMasterUserPasswordHash the value to set
         * @return this builder
         */
        public Builder securityMasterUserPasswordHash(String securityMasterUserPasswordHash) {
            this.securityMasterUserPasswordHash = securityMasterUserPasswordHash;
            this.__explicitlySet__.add("securityMasterUserPasswordHash");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOpensearchClusterDetails build() {
            UpdateOpensearchClusterDetails model =
                    new UpdateOpensearchClusterDetails(
                            this.displayName,
                            this.softwareVersion,
                            this.securityMode,
                            this.securityMasterUserName,
                            this.securityMasterUserPasswordHash,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOpensearchClusterDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("softwareVersion")) {
                this.softwareVersion(model.getSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("securityMode")) {
                this.securityMode(model.getSecurityMode());
            }
            if (model.wasPropertyExplicitlySet("securityMasterUserName")) {
                this.securityMasterUserName(model.getSecurityMasterUserName());
            }
            if (model.wasPropertyExplicitlySet("securityMasterUserPasswordHash")) {
                this.securityMasterUserPasswordHash(model.getSecurityMasterUserPasswordHash());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The name of the cluster. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the cluster. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
    private final String softwareVersion;

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /** The security mode of the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityMode")
    private final SecurityMode securityMode;

    /**
     * The security mode of the cluster.
     *
     * @return the value
     */
    public SecurityMode getSecurityMode() {
        return securityMode;
    }

    /** The name of the master user that are used to manage security config */
    @com.fasterxml.jackson.annotation.JsonProperty("securityMasterUserName")
    private final String securityMasterUserName;

    /**
     * The name of the master user that are used to manage security config
     *
     * @return the value
     */
    public String getSecurityMasterUserName() {
        return securityMasterUserName;
    }

    /** The password hash of the master user that are used to manage security config */
    @com.fasterxml.jackson.annotation.JsonProperty("securityMasterUserPasswordHash")
    private final String securityMasterUserPasswordHash;

    /**
     * The password hash of the master user that are used to manage security config
     *
     * @return the value
     */
    public String getSecurityMasterUserPasswordHash() {
        return securityMasterUserPasswordHash;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateOpensearchClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", softwareVersion=").append(String.valueOf(this.softwareVersion));
        sb.append(", securityMode=").append(String.valueOf(this.securityMode));
        sb.append(", securityMasterUserName=").append(String.valueOf(this.securityMasterUserName));
        sb.append(", securityMasterUserPasswordHash=")
                .append(String.valueOf(this.securityMasterUserPasswordHash));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOpensearchClusterDetails)) {
            return false;
        }

        UpdateOpensearchClusterDetails other = (UpdateOpensearchClusterDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.softwareVersion, other.softwareVersion)
                && java.util.Objects.equals(this.securityMode, other.securityMode)
                && java.util.Objects.equals(
                        this.securityMasterUserName, other.securityMasterUserName)
                && java.util.Objects.equals(
                        this.securityMasterUserPasswordHash, other.securityMasterUserPasswordHash)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareVersion == null ? 43 : this.softwareVersion.hashCode());
        result = (result * PRIME) + (this.securityMode == null ? 43 : this.securityMode.hashCode());
        result =
                (result * PRIME)
                        + (this.securityMasterUserName == null
                                ? 43
                                : this.securityMasterUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.securityMasterUserPasswordHash == null
                                ? 43
                                : this.securityMasterUserPasswordHash.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
