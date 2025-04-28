/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * Object used to create a stream pool. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateStreamPoolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateStreamPoolDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "name",
        "kafkaSettings",
        "customEncryptionKeyDetails",
        "privateEndpointDetails",
        "freeformTags",
        "definedTags"
    })
    public CreateStreamPoolDetails(
            String compartmentId,
            String name,
            KafkaSettings kafkaSettings,
            CustomEncryptionKeyDetails customEncryptionKeyDetails,
            PrivateEndpointDetails privateEndpointDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.name = name;
        this.kafkaSettings = kafkaSettings;
        this.customEncryptionKeyDetails = customEncryptionKeyDetails;
        this.privateEndpointDetails = privateEndpointDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment that contains the stream. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the stream.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name of the stream pool. Avoid entering confidential information.
         *
         * <p>Example: {@code MyStreamPool}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the stream pool. Avoid entering confidential information.
         *
         * <p>Example: {@code MyStreamPool}
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kafkaSettings")
        private KafkaSettings kafkaSettings;

        public Builder kafkaSettings(KafkaSettings kafkaSettings) {
            this.kafkaSettings = kafkaSettings;
            this.__explicitlySet__.add("kafkaSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customEncryptionKeyDetails")
        private CustomEncryptionKeyDetails customEncryptionKeyDetails;

        public Builder customEncryptionKeyDetails(
                CustomEncryptionKeyDetails customEncryptionKeyDetails) {
            this.customEncryptionKeyDetails = customEncryptionKeyDetails;
            this.__explicitlySet__.add("customEncryptionKeyDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointDetails")
        private PrivateEndpointDetails privateEndpointDetails;

        public Builder privateEndpointDetails(PrivateEndpointDetails privateEndpointDetails) {
            this.privateEndpointDetails = privateEndpointDetails;
            this.__explicitlySet__.add("privateEndpointDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair that is applied
         * with no predefined name, type, or namespace. Exists for cross-compatibility only. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair that is applied
         * with no predefined name, type, or namespace. Exists for cross-compatibility only. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        public CreateStreamPoolDetails build() {
            CreateStreamPoolDetails model =
                    new CreateStreamPoolDetails(
                            this.compartmentId,
                            this.name,
                            this.kafkaSettings,
                            this.customEncryptionKeyDetails,
                            this.privateEndpointDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateStreamPoolDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("kafkaSettings")) {
                this.kafkaSettings(model.getKafkaSettings());
            }
            if (model.wasPropertyExplicitlySet("customEncryptionKeyDetails")) {
                this.customEncryptionKeyDetails(model.getCustomEncryptionKeyDetails());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointDetails")) {
                this.privateEndpointDetails(model.getPrivateEndpointDetails());
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

    /** The OCID of the compartment that contains the stream. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the stream.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the stream pool. Avoid entering confidential information.
     *
     * <p>Example: {@code MyStreamPool}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the stream pool. Avoid entering confidential information.
     *
     * <p>Example: {@code MyStreamPool}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("kafkaSettings")
    private final KafkaSettings kafkaSettings;

    public KafkaSettings getKafkaSettings() {
        return kafkaSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customEncryptionKeyDetails")
    private final CustomEncryptionKeyDetails customEncryptionKeyDetails;

    public CustomEncryptionKeyDetails getCustomEncryptionKeyDetails() {
        return customEncryptionKeyDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointDetails")
    private final PrivateEndpointDetails privateEndpointDetails;

    public PrivateEndpointDetails getPrivateEndpointDetails() {
        return privateEndpointDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair that is applied with no
     * predefined name, type, or namespace. Exists for cross-compatibility only. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair that is applied with no
     * predefined name, type, or namespace. Exists for cross-compatibility only. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("CreateStreamPoolDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", kafkaSettings=").append(String.valueOf(this.kafkaSettings));
        sb.append(", customEncryptionKeyDetails=")
                .append(String.valueOf(this.customEncryptionKeyDetails));
        sb.append(", privateEndpointDetails=").append(String.valueOf(this.privateEndpointDetails));
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
        if (!(o instanceof CreateStreamPoolDetails)) {
            return false;
        }

        CreateStreamPoolDetails other = (CreateStreamPoolDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.kafkaSettings, other.kafkaSettings)
                && java.util.Objects.equals(
                        this.customEncryptionKeyDetails, other.customEncryptionKeyDetails)
                && java.util.Objects.equals(
                        this.privateEndpointDetails, other.privateEndpointDetails)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.kafkaSettings == null ? 43 : this.kafkaSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.customEncryptionKeyDetails == null
                                ? 43
                                : this.customEncryptionKeyDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointDetails == null
                                ? 43
                                : this.privateEndpointDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
