/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The data to create a GenerativeAiProject. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateGenerativeAiProjectDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateGenerativeAiProjectDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "compartmentId",
        "displayName",
        "conversationConfig",
        "longTermMemoryConfig",
        "shortTermMemoryOptimizationConfig",
        "freeformTags",
        "definedTags"
    })
    public CreateGenerativeAiProjectDetails(
            String description,
            String compartmentId,
            String displayName,
            ConversationConfig conversationConfig,
            LongTermMemoryConfig longTermMemoryConfig,
            ShortTermMemoryOptimizationConfig shortTermMemoryOptimizationConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.conversationConfig = conversationConfig;
        this.longTermMemoryConfig = longTermMemoryConfig;
        this.shortTermMemoryOptimizationConfig = shortTermMemoryOptimizationConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An optional description of the GenerativeAiProject. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * An optional description of the GenerativeAiProject.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Owning compartment OCID for a GenerativeAiProject. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Owning compartment OCID for a GenerativeAiProject.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A user-friendly name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conversationConfig")
        private ConversationConfig conversationConfig;

        public Builder conversationConfig(ConversationConfig conversationConfig) {
            this.conversationConfig = conversationConfig;
            this.__explicitlySet__.add("conversationConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("longTermMemoryConfig")
        private LongTermMemoryConfig longTermMemoryConfig;

        public Builder longTermMemoryConfig(LongTermMemoryConfig longTermMemoryConfig) {
            this.longTermMemoryConfig = longTermMemoryConfig;
            this.__explicitlySet__.add("longTermMemoryConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shortTermMemoryOptimizationConfig")
        private ShortTermMemoryOptimizationConfig shortTermMemoryOptimizationConfig;

        public Builder shortTermMemoryOptimizationConfig(
                ShortTermMemoryOptimizationConfig shortTermMemoryOptimizationConfig) {
            this.shortTermMemoryOptimizationConfig = shortTermMemoryOptimizationConfig;
            this.__explicitlySet__.add("shortTermMemoryOptimizationConfig");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
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

        public CreateGenerativeAiProjectDetails build() {
            CreateGenerativeAiProjectDetails model =
                    new CreateGenerativeAiProjectDetails(
                            this.description,
                            this.compartmentId,
                            this.displayName,
                            this.conversationConfig,
                            this.longTermMemoryConfig,
                            this.shortTermMemoryOptimizationConfig,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGenerativeAiProjectDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("conversationConfig")) {
                this.conversationConfig(model.getConversationConfig());
            }
            if (model.wasPropertyExplicitlySet("longTermMemoryConfig")) {
                this.longTermMemoryConfig(model.getLongTermMemoryConfig());
            }
            if (model.wasPropertyExplicitlySet("shortTermMemoryOptimizationConfig")) {
                this.shortTermMemoryOptimizationConfig(
                        model.getShortTermMemoryOptimizationConfig());
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

    /** An optional description of the GenerativeAiProject. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * An optional description of the GenerativeAiProject.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Owning compartment OCID for a GenerativeAiProject. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Owning compartment OCID for a GenerativeAiProject.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A user-friendly name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("conversationConfig")
    private final ConversationConfig conversationConfig;

    public ConversationConfig getConversationConfig() {
        return conversationConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("longTermMemoryConfig")
    private final LongTermMemoryConfig longTermMemoryConfig;

    public LongTermMemoryConfig getLongTermMemoryConfig() {
        return longTermMemoryConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shortTermMemoryOptimizationConfig")
    private final ShortTermMemoryOptimizationConfig shortTermMemoryOptimizationConfig;

    public ShortTermMemoryOptimizationConfig getShortTermMemoryOptimizationConfig() {
        return shortTermMemoryOptimizationConfig;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
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
        sb.append("CreateGenerativeAiProjectDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", conversationConfig=").append(String.valueOf(this.conversationConfig));
        sb.append(", longTermMemoryConfig=").append(String.valueOf(this.longTermMemoryConfig));
        sb.append(", shortTermMemoryOptimizationConfig=")
                .append(String.valueOf(this.shortTermMemoryOptimizationConfig));
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
        if (!(o instanceof CreateGenerativeAiProjectDetails)) {
            return false;
        }

        CreateGenerativeAiProjectDetails other = (CreateGenerativeAiProjectDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.conversationConfig, other.conversationConfig)
                && java.util.Objects.equals(this.longTermMemoryConfig, other.longTermMemoryConfig)
                && java.util.Objects.equals(
                        this.shortTermMemoryOptimizationConfig,
                        other.shortTermMemoryOptimizationConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.conversationConfig == null
                                ? 43
                                : this.conversationConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.longTermMemoryConfig == null
                                ? 43
                                : this.longTermMemoryConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.shortTermMemoryOptimizationConfig == null
                                ? 43
                                : this.shortTermMemoryOptimizationConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
