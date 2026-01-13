/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Minor or major version upgrade of a cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpgradeOpenSearchClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpgradeOpenSearchClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "originalClusterDisplayName",
        "desiredSoftwareVersion",
        "upgradeType",
        "isClone",
        "freeformTags",
        "definedTags",
        "systemTags",
        "securityAttributes"
    })
    public UpgradeOpenSearchClusterDetails(
            String originalClusterDisplayName,
            String desiredSoftwareVersion,
            UpgradeType upgradeType,
            Boolean isClone,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
        super();
        this.originalClusterDisplayName = originalClusterDisplayName;
        this.desiredSoftwareVersion = desiredSoftwareVersion;
        this.upgradeType = upgradeType;
        this.isClone = isClone;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.securityAttributes = securityAttributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The display name of the original cluster. This is required to validate that the cluster
         * ID has the same display name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("originalClusterDisplayName")
        private String originalClusterDisplayName;

        /**
         * The display name of the original cluster. This is required to validate that the cluster
         * ID has the same display name.
         *
         * @param originalClusterDisplayName the value to set
         * @return this builder
         */
        public Builder originalClusterDisplayName(String originalClusterDisplayName) {
            this.originalClusterDisplayName = originalClusterDisplayName;
            this.__explicitlySet__.add("originalClusterDisplayName");
            return this;
        }
        /** The software version the cluster is desired. */
        @com.fasterxml.jackson.annotation.JsonProperty("desiredSoftwareVersion")
        private String desiredSoftwareVersion;

        /**
         * The software version the cluster is desired.
         *
         * @param desiredSoftwareVersion the value to set
         * @return this builder
         */
        public Builder desiredSoftwareVersion(String desiredSoftwareVersion) {
            this.desiredSoftwareVersion = desiredSoftwareVersion;
            this.__explicitlySet__.add("desiredSoftwareVersion");
            return this;
        }
        /** The upgrade type of cluster (major or minor). */
        @com.fasterxml.jackson.annotation.JsonProperty("upgradeType")
        private UpgradeType upgradeType;

        /**
         * The upgrade type of cluster (major or minor).
         *
         * @param upgradeType the value to set
         * @return this builder
         */
        public Builder upgradeType(UpgradeType upgradeType) {
            this.upgradeType = upgradeType;
            this.__explicitlySet__.add("upgradeType");
            return this;
        }
        /** The cluster would be cloned for true and updated for false with the provided version. */
        @com.fasterxml.jackson.annotation.JsonProperty("isClone")
        private Boolean isClone;

        /**
         * The cluster would be cloned for true and updated for false with the provided version.
         *
         * @param isClone the value to set
         * @return this builder
         */
        public Builder isClone(Boolean isClone) {
            this.isClone = isClone;
            this.__explicitlySet__.add("isClone");
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * Security attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode":
         * "enforce"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * Security attributes for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode":
         * "enforce"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpgradeOpenSearchClusterDetails build() {
            UpgradeOpenSearchClusterDetails model =
                    new UpgradeOpenSearchClusterDetails(
                            this.originalClusterDisplayName,
                            this.desiredSoftwareVersion,
                            this.upgradeType,
                            this.isClone,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.securityAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpgradeOpenSearchClusterDetails model) {
            if (model.wasPropertyExplicitlySet("originalClusterDisplayName")) {
                this.originalClusterDisplayName(model.getOriginalClusterDisplayName());
            }
            if (model.wasPropertyExplicitlySet("desiredSoftwareVersion")) {
                this.desiredSoftwareVersion(model.getDesiredSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("upgradeType")) {
                this.upgradeType(model.getUpgradeType());
            }
            if (model.wasPropertyExplicitlySet("isClone")) {
                this.isClone(model.getIsClone());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
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
     * The display name of the original cluster. This is required to validate that the cluster ID
     * has the same display name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("originalClusterDisplayName")
    private final String originalClusterDisplayName;

    /**
     * The display name of the original cluster. This is required to validate that the cluster ID
     * has the same display name.
     *
     * @return the value
     */
    public String getOriginalClusterDisplayName() {
        return originalClusterDisplayName;
    }

    /** The software version the cluster is desired. */
    @com.fasterxml.jackson.annotation.JsonProperty("desiredSoftwareVersion")
    private final String desiredSoftwareVersion;

    /**
     * The software version the cluster is desired.
     *
     * @return the value
     */
    public String getDesiredSoftwareVersion() {
        return desiredSoftwareVersion;
    }

    /** The upgrade type of cluster (major or minor). */
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeType")
    private final UpgradeType upgradeType;

    /**
     * The upgrade type of cluster (major or minor).
     *
     * @return the value
     */
    public UpgradeType getUpgradeType() {
        return upgradeType;
    }

    /** The cluster would be cloned for true and updated for false with the provided version. */
    @com.fasterxml.jackson.annotation.JsonProperty("isClone")
    private final Boolean isClone;

    /**
     * The cluster would be cloned for true and updated for false with the provided version.
     *
     * @return the value
     */
    public Boolean getIsClone() {
        return isClone;
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

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * Security attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "enforce"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * Security attributes for this resource. Each key is predefined and scoped to a namespace. For
     * more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Oracle-ZPR": {"MaxEgressCount": {"value": "42", "mode": "enforce"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
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
        sb.append("UpgradeOpenSearchClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("originalClusterDisplayName=")
                .append(String.valueOf(this.originalClusterDisplayName));
        sb.append(", desiredSoftwareVersion=").append(String.valueOf(this.desiredSoftwareVersion));
        sb.append(", upgradeType=").append(String.valueOf(this.upgradeType));
        sb.append(", isClone=").append(String.valueOf(this.isClone));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpgradeOpenSearchClusterDetails)) {
            return false;
        }

        UpgradeOpenSearchClusterDetails other = (UpgradeOpenSearchClusterDetails) o;
        return java.util.Objects.equals(
                        this.originalClusterDisplayName, other.originalClusterDisplayName)
                && java.util.Objects.equals(
                        this.desiredSoftwareVersion, other.desiredSoftwareVersion)
                && java.util.Objects.equals(this.upgradeType, other.upgradeType)
                && java.util.Objects.equals(this.isClone, other.isClone)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.originalClusterDisplayName == null
                                ? 43
                                : this.originalClusterDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.desiredSoftwareVersion == null
                                ? 43
                                : this.desiredSoftwareVersion.hashCode());
        result = (result * PRIME) + (this.upgradeType == null ? 43 : this.upgradeType.hashCode());
        result = (result * PRIME) + (this.isClone == null ? 43 : this.isClone.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
