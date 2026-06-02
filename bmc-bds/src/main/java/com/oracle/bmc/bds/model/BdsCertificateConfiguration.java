/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The BDS certificate configuration information.
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
    builder = BdsCertificateConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BdsCertificateConfiguration
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
        "compartmentId"
    })
    public BdsCertificateConfiguration(
            String bdsInstanceId,
            String id,
            String certificateAuthorityId,
            LifecycleState lifecycleState,
            String displayName,
            java.util.Date timeLastRefreshedOrGenerated,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Type type,
            Boolean isDefaultConfiguration,
            String compartmentId) {
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
        private LifecycleState lifecycleState;

        /**
         * The lifecycle status of the BDS certificate configuration.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The display name of the BDS certificate configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the BDS certificate configuration.
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
        private Type type;

        /**
         * The type of the BDS certificate configuration, also the type of the BDS certificates which will be generated by the BDS certificate configuration.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BdsCertificateConfiguration build() {
            BdsCertificateConfiguration model =
                    new BdsCertificateConfiguration(
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
                            this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BdsCertificateConfiguration model) {
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
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The lifecycle status of the BDS certificate configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The lifecycle status of the BDS certificate configuration.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The display name of the BDS certificate configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the BDS certificate configuration.
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
    public enum Type {
        SelfSigned("SELF_SIGNED"),
        OciCertificate("OCI_CERTIFICATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the BDS certificate configuration, also the type of the BDS certificates which will be generated by the BDS certificate configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of the BDS certificate configuration, also the type of the BDS certificates which will be generated by the BDS certificate configuration.
     * @return the value
     **/
    public Type getType() {
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
        sb.append("BdsCertificateConfiguration(");
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
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BdsCertificateConfiguration)) {
            return false;
        }

        BdsCertificateConfiguration other = (BdsCertificateConfiguration) o;
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
