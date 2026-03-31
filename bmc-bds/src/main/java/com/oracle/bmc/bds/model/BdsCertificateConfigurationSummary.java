/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Summary details of the BDS certificate configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BdsCertificateConfigurationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BdsCertificateConfigurationSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bdsInstanceId",
        "id",
        "certificateAuthorityId",
        "lifecycleState",
        "displayName",
        "timeLastRefreshedOrGenerated",
        "timeCreated",
        "timeUpdated",
        "type",
        "isDefaultConfiguration",
        "compartmentId",
        "freeformTags",
        "definedTags"
    })
    public BdsCertificateConfigurationSummary(
            String bdsInstanceId,
            String id,
            String certificateAuthorityId,
            BdsCertificateConfiguration.LifecycleState lifecycleState,
            String displayName,
            java.util.Date timeLastRefreshedOrGenerated,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            BdsCertificateConfiguration.Type type,
            Boolean isDefaultConfiguration,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.bdsInstanceId = bdsInstanceId;
        this.id = id;
        this.certificateAuthorityId = certificateAuthorityId;
        this.lifecycleState = lifecycleState;
        this.displayName = displayName;
        this.timeLastRefreshedOrGenerated = timeLastRefreshedOrGenerated;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.type = type;
        this.isDefaultConfiguration = isDefaultConfiguration;
        this.compartmentId = compartmentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the bdsInstance which is the parent resource id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bdsInstanceId")
        private String bdsInstanceId;

        /**
         * The OCID of the bdsInstance which is the parent resource id.
         * @param bdsInstanceId the value to set
         * @return this builder
         **/
        public Builder bdsInstanceId(String bdsInstanceId) {
            this.bdsInstanceId = bdsInstanceId;
            this.__explicitlySet__.add("bdsInstanceId");
            return this;
        }
        /**
         * The ID of the BDS certificate configuration defined under BDS resources, not OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The ID of the BDS certificate configuration defined under BDS resources, not OCID.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the certificate authority which is associated with this certificate configuration. The value is Null when this BDS certificate configuration type is SELF_SIGNED.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityId")
        private String certificateAuthorityId;

        /**
         * The OCID of the certificate authority which is associated with this certificate configuration. The value is Null when this BDS certificate configuration type is SELF_SIGNED.
         * @param certificateAuthorityId the value to set
         * @return this builder
         **/
        public Builder certificateAuthorityId(String certificateAuthorityId) {
            this.certificateAuthorityId = certificateAuthorityId;
            this.__explicitlySet__.add("certificateAuthorityId");
            return this;
        }
        /**
         * The lifecycle status of the BDS certificate configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private BdsCertificateConfiguration.LifecycleState lifecycleState;

        /**
         * The lifecycle status of the BDS certificate configuration.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(BdsCertificateConfiguration.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The display name of BDS certificate configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of BDS certificate configuration.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The last time the BDS certificate configuration was used to generate or renew the certificate(s).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastRefreshedOrGenerated")
        private java.util.Date timeLastRefreshedOrGenerated;

        /**
         * The last time the BDS certificate configuration was used to generate or renew the certificate(s).
         * @param timeLastRefreshedOrGenerated the value to set
         * @return this builder
         **/
        public Builder timeLastRefreshedOrGenerated(java.util.Date timeLastRefreshedOrGenerated) {
            this.timeLastRefreshedOrGenerated = timeLastRefreshedOrGenerated;
            this.__explicitlySet__.add("timeLastRefreshedOrGenerated");
            return this;
        }
        /**
         * The time when the BDS certificate configuration was created, shown as an RFC 3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the BDS certificate configuration was created, shown as an RFC 3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the BDS certificate configuration was updated, shown as an RFC 3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the BDS certificate configuration was updated, shown as an RFC 3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The type of the BDS certificate configuration, also the type of the BDS certificates which will be generated by the BDS certificate configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private BdsCertificateConfiguration.Type type;

        /**
         * The type of the BDS certificate configuration, also the type of the BDS certificates which will be generated by the BDS certificate configuration.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(BdsCertificateConfiguration.Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * If this BDS certificate configuration is a default configuration or not. There will be only one Default certificate configuration per BDS cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultConfiguration")
        private Boolean isDefaultConfiguration;

        /**
         * If this BDS certificate configuration is a default configuration or not. There will be only one Default certificate configuration per BDS cluster.
         * @param isDefaultConfiguration the value to set
         * @return this builder
         **/
        public Builder isDefaultConfiguration(Boolean isDefaultConfiguration) {
            this.isDefaultConfiguration = isDefaultConfiguration;
            this.__explicitlySet__.add("isDefaultConfiguration");
            return this;
        }
        /**
         * The OCID of the compartment of the certificate authority connecting to this certificate configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment of the certificate authority connecting to this certificate configuration.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Exists for cross-compatibility only. For example, {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Exists for cross-compatibility only. For example, {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For example, {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For example, {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BdsCertificateConfigurationSummary build() {
            BdsCertificateConfigurationSummary model =
                    new BdsCertificateConfigurationSummary(
                            this.bdsInstanceId,
                            this.id,
                            this.certificateAuthorityId,
                            this.lifecycleState,
                            this.displayName,
                            this.timeLastRefreshedOrGenerated,
                            this.timeCreated,
                            this.timeUpdated,
                            this.type,
                            this.isDefaultConfiguration,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BdsCertificateConfigurationSummary model) {
            if (model.wasPropertyExplicitlySet("bdsInstanceId")) {
                this.bdsInstanceId(model.getBdsInstanceId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("certificateAuthorityId")) {
                this.certificateAuthorityId(model.getCertificateAuthorityId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeLastRefreshedOrGenerated")) {
                this.timeLastRefreshedOrGenerated(model.getTimeLastRefreshedOrGenerated());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isDefaultConfiguration")) {
                this.isDefaultConfiguration(model.getIsDefaultConfiguration());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the bdsInstance which is the parent resource id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsInstanceId")
    private final String bdsInstanceId;

    /**
     * The OCID of the bdsInstance which is the parent resource id.
     * @return the value
     **/
    public String getBdsInstanceId() {
        return bdsInstanceId;
    }

    /**
     * The ID of the BDS certificate configuration defined under BDS resources, not OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The ID of the BDS certificate configuration defined under BDS resources, not OCID.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the certificate authority which is associated with this certificate configuration. The value is Null when this BDS certificate configuration type is SELF_SIGNED.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityId")
    private final String certificateAuthorityId;

    /**
     * The OCID of the certificate authority which is associated with this certificate configuration. The value is Null when this BDS certificate configuration type is SELF_SIGNED.
     * @return the value
     **/
    public String getCertificateAuthorityId() {
        return certificateAuthorityId;
    }

    /**
     * The lifecycle status of the BDS certificate configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final BdsCertificateConfiguration.LifecycleState lifecycleState;

    /**
     * The lifecycle status of the BDS certificate configuration.
     * @return the value
     **/
    public BdsCertificateConfiguration.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The display name of BDS certificate configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of BDS certificate configuration.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The last time the BDS certificate configuration was used to generate or renew the certificate(s).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastRefreshedOrGenerated")
    private final java.util.Date timeLastRefreshedOrGenerated;

    /**
     * The last time the BDS certificate configuration was used to generate or renew the certificate(s).
     * @return the value
     **/
    public java.util.Date getTimeLastRefreshedOrGenerated() {
        return timeLastRefreshedOrGenerated;
    }

    /**
     * The time when the BDS certificate configuration was created, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the BDS certificate configuration was created, shown as an RFC 3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the BDS certificate configuration was updated, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the BDS certificate configuration was updated, shown as an RFC 3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The type of the BDS certificate configuration, also the type of the BDS certificates which will be generated by the BDS certificate configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final BdsCertificateConfiguration.Type type;

    /**
     * The type of the BDS certificate configuration, also the type of the BDS certificates which will be generated by the BDS certificate configuration.
     * @return the value
     **/
    public BdsCertificateConfiguration.Type getType() {
        return type;
    }

    /**
     * If this BDS certificate configuration is a default configuration or not. There will be only one Default certificate configuration per BDS cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultConfiguration")
    private final Boolean isDefaultConfiguration;

    /**
     * If this BDS certificate configuration is a default configuration or not. There will be only one Default certificate configuration per BDS cluster.
     * @return the value
     **/
    public Boolean getIsDefaultConfiguration() {
        return isDefaultConfiguration;
    }

    /**
     * The OCID of the compartment of the certificate authority connecting to this certificate configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment of the certificate authority connecting to this certificate configuration.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Exists for cross-compatibility only. For example, {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Exists for cross-compatibility only. For example, {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For example, {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For example, {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BdsCertificateConfigurationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("bdsInstanceId=").append(String.valueOf(this.bdsInstanceId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", certificateAuthorityId=").append(String.valueOf(this.certificateAuthorityId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeLastRefreshedOrGenerated=")
                .append(String.valueOf(this.timeLastRefreshedOrGenerated));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isDefaultConfiguration=").append(String.valueOf(this.isDefaultConfiguration));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
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
        if (!(o instanceof BdsCertificateConfigurationSummary)) {
            return false;
        }

        BdsCertificateConfigurationSummary other = (BdsCertificateConfigurationSummary) o;
        return java.util.Objects.equals(this.bdsInstanceId, other.bdsInstanceId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.certificateAuthorityId, other.certificateAuthorityId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.timeLastRefreshedOrGenerated, other.timeLastRefreshedOrGenerated)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(
                        this.isDefaultConfiguration, other.isDefaultConfiguration)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.bdsInstanceId == null ? 43 : this.bdsInstanceId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateAuthorityId == null
                                ? 43
                                : this.certificateAuthorityId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastRefreshedOrGenerated == null
                                ? 43
                                : this.timeLastRefreshedOrGenerated.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.isDefaultConfiguration == null
                                ? 43
                                : this.isDefaultConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
