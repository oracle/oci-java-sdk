/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * The details of a stream pool. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StreamPool.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StreamPool extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "name",
        "lifecycleState",
        "lifecycleStateDetails",
        "timeCreated",
        "kafkaSettings",
        "customEncryptionKey",
        "isPrivate",
        "endpointFqdn",
        "privateEndpointSettings",
        "freeformTags",
        "definedTags"
    })
    public StreamPool(
            String id,
            String compartmentId,
            String name,
            LifecycleState lifecycleState,
            String lifecycleStateDetails,
            java.util.Date timeCreated,
            KafkaSettings kafkaSettings,
            CustomEncryptionKey customEncryptionKey,
            Boolean isPrivate,
            String endpointFqdn,
            PrivateEndpointSettings privateEndpointSettings,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.name = name;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.timeCreated = timeCreated;
        this.kafkaSettings = kafkaSettings;
        this.customEncryptionKey = customEncryptionKey;
        this.isPrivate = isPrivate;
        this.endpointFqdn = endpointFqdn;
        this.privateEndpointSettings = privateEndpointSettings;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the stream pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the stream pool.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Compartment OCID that the pool belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID that the pool belongs to.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The name of the stream pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the stream pool.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The current state of the stream pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the stream pool.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Any additional details about the current state of the stream. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        /**
         * Any additional details about the current state of the stream.
         *
         * @param lifecycleStateDetails the value to set
         * @return this builder
         */
        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }
        /**
         * The date and time the stream pool was created, expressed in in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-04-20T00:00:07.405Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the stream pool was created, expressed in in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-04-20T00:00:07.405Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kafkaSettings")
        private KafkaSettings kafkaSettings;

        public Builder kafkaSettings(KafkaSettings kafkaSettings) {
            this.kafkaSettings = kafkaSettings;
            this.__explicitlySet__.add("kafkaSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customEncryptionKey")
        private CustomEncryptionKey customEncryptionKey;

        public Builder customEncryptionKey(CustomEncryptionKey customEncryptionKey) {
            this.customEncryptionKey = customEncryptionKey;
            this.__explicitlySet__.add("customEncryptionKey");
            return this;
        }
        /**
         * True if the stream pool is private, false otherwise. If the stream pool is private, the
         * streams inside the stream pool can only be accessed from inside the associated subnetId.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
        private Boolean isPrivate;

        /**
         * True if the stream pool is private, false otherwise. If the stream pool is private, the
         * streams inside the stream pool can only be accessed from inside the associated subnetId.
         *
         * @param isPrivate the value to set
         * @return this builder
         */
        public Builder isPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            this.__explicitlySet__.add("isPrivate");
            return this;
        }
        /**
         * The FQDN used to access the streams inside the stream pool (same FQDN as the
         * messagesEndpoint attribute of a {@link Stream} object). If the stream pool is private,
         * the FQDN is customized and can only be accessed from inside the associated subnetId,
         * otherwise the FQDN is publicly resolvable. Depending on which protocol you attempt to
         * use, you need to either prepend https or append the Kafka port.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointFqdn")
        private String endpointFqdn;

        /**
         * The FQDN used to access the streams inside the stream pool (same FQDN as the
         * messagesEndpoint attribute of a {@link Stream} object). If the stream pool is private,
         * the FQDN is customized and can only be accessed from inside the associated subnetId,
         * otherwise the FQDN is publicly resolvable. Depending on which protocol you attempt to
         * use, you need to either prepend https or append the Kafka port.
         *
         * @param endpointFqdn the value to set
         * @return this builder
         */
        public Builder endpointFqdn(String endpointFqdn) {
            this.endpointFqdn = endpointFqdn;
            this.__explicitlySet__.add("endpointFqdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointSettings")
        private PrivateEndpointSettings privateEndpointSettings;

        public Builder privateEndpointSettings(PrivateEndpointSettings privateEndpointSettings) {
            this.privateEndpointSettings = privateEndpointSettings;
            this.__explicitlySet__.add("privateEndpointSettings");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. Exists for cross-compatibility only. For more information, see
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. Exists for cross-compatibility only. For more information, see
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {"Operations": {"CostCenter": "42"}}'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {"Operations": {"CostCenter": "42"}}'
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

        public StreamPool build() {
            StreamPool model =
                    new StreamPool(
                            this.id,
                            this.compartmentId,
                            this.name,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.timeCreated,
                            this.kafkaSettings,
                            this.customEncryptionKey,
                            this.isPrivate,
                            this.endpointFqdn,
                            this.privateEndpointSettings,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StreamPool model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("kafkaSettings")) {
                this.kafkaSettings(model.getKafkaSettings());
            }
            if (model.wasPropertyExplicitlySet("customEncryptionKey")) {
                this.customEncryptionKey(model.getCustomEncryptionKey());
            }
            if (model.wasPropertyExplicitlySet("isPrivate")) {
                this.isPrivate(model.getIsPrivate());
            }
            if (model.wasPropertyExplicitlySet("endpointFqdn")) {
                this.endpointFqdn(model.getEndpointFqdn());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointSettings")) {
                this.privateEndpointSettings(model.getPrivateEndpointSettings());
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

    /** The OCID of the stream pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the stream pool.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Compartment OCID that the pool belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID that the pool belongs to.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The name of the stream pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the stream pool.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The current state of the stream pool. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The current state of the stream pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the stream pool.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Any additional details about the current state of the stream. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

    /**
     * Any additional details about the current state of the stream.
     *
     * @return the value
     */
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }

    /**
     * The date and time the stream pool was created, expressed in in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-04-20T00:00:07.405Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the stream pool was created, expressed in in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-04-20T00:00:07.405Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("kafkaSettings")
    private final KafkaSettings kafkaSettings;

    public KafkaSettings getKafkaSettings() {
        return kafkaSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customEncryptionKey")
    private final CustomEncryptionKey customEncryptionKey;

    public CustomEncryptionKey getCustomEncryptionKey() {
        return customEncryptionKey;
    }

    /**
     * True if the stream pool is private, false otherwise. If the stream pool is private, the
     * streams inside the stream pool can only be accessed from inside the associated subnetId.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
    private final Boolean isPrivate;

    /**
     * True if the stream pool is private, false otherwise. If the stream pool is private, the
     * streams inside the stream pool can only be accessed from inside the associated subnetId.
     *
     * @return the value
     */
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    /**
     * The FQDN used to access the streams inside the stream pool (same FQDN as the messagesEndpoint
     * attribute of a {@link Stream} object). If the stream pool is private, the FQDN is customized
     * and can only be accessed from inside the associated subnetId, otherwise the FQDN is publicly
     * resolvable. Depending on which protocol you attempt to use, you need to either prepend https
     * or append the Kafka port.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointFqdn")
    private final String endpointFqdn;

    /**
     * The FQDN used to access the streams inside the stream pool (same FQDN as the messagesEndpoint
     * attribute of a {@link Stream} object). If the stream pool is private, the FQDN is customized
     * and can only be accessed from inside the associated subnetId, otherwise the FQDN is publicly
     * resolvable. Depending on which protocol you attempt to use, you need to either prepend https
     * or append the Kafka port.
     *
     * @return the value
     */
    public String getEndpointFqdn() {
        return endpointFqdn;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointSettings")
    private final PrivateEndpointSettings privateEndpointSettings;

    public PrivateEndpointSettings getPrivateEndpointSettings() {
        return privateEndpointSettings;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. Exists for cross-compatibility only. For more information, see
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. Exists for cross-compatibility only. For more information, see
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {"Operations": {"CostCenter": "42"}}'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {"Operations": {"CostCenter": "42"}}'
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
        sb.append("StreamPool(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", kafkaSettings=").append(String.valueOf(this.kafkaSettings));
        sb.append(", customEncryptionKey=").append(String.valueOf(this.customEncryptionKey));
        sb.append(", isPrivate=").append(String.valueOf(this.isPrivate));
        sb.append(", endpointFqdn=").append(String.valueOf(this.endpointFqdn));
        sb.append(", privateEndpointSettings=")
                .append(String.valueOf(this.privateEndpointSettings));
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
        if (!(o instanceof StreamPool)) {
            return false;
        }

        StreamPool other = (StreamPool) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.kafkaSettings, other.kafkaSettings)
                && java.util.Objects.equals(this.customEncryptionKey, other.customEncryptionKey)
                && java.util.Objects.equals(this.isPrivate, other.isPrivate)
                && java.util.Objects.equals(this.endpointFqdn, other.endpointFqdn)
                && java.util.Objects.equals(
                        this.privateEndpointSettings, other.privateEndpointSettings)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.kafkaSettings == null ? 43 : this.kafkaSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.customEncryptionKey == null
                                ? 43
                                : this.customEncryptionKey.hashCode());
        result = (result * PRIME) + (this.isPrivate == null ? 43 : this.isPrivate.hashCode());
        result = (result * PRIME) + (this.endpointFqdn == null ? 43 : this.endpointFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointSettings == null
                                ? 43
                                : this.privateEndpointSettings.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
