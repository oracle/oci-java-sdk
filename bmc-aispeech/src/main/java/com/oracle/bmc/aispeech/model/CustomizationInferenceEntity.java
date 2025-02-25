/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Entity Object for customization inference payload
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CustomizationInferenceEntity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CustomizationInferenceEntity
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"entityType", "customizationId", "customizationAlias"})
    public CustomizationInferenceEntity(
            String entityType, String customizationId, String customizationAlias) {
        super();
        this.entityType = entityType;
        this.customizationId = customizationId;
        this.customizationAlias = customizationAlias;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Entity type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * Entity type
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the customization to use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customizationId")
        private String customizationId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the customization to use.
         * @param customizationId the value to set
         * @return this builder
         **/
        public Builder customizationId(String customizationId) {
            this.customizationId = customizationId;
            this.__explicitlySet__.add("customizationId");
            return this;
        }
        /**
         * Alias of the customization
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customizationAlias")
        private String customizationAlias;

        /**
         * Alias of the customization
         * @param customizationAlias the value to set
         * @return this builder
         **/
        public Builder customizationAlias(String customizationAlias) {
            this.customizationAlias = customizationAlias;
            this.__explicitlySet__.add("customizationAlias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomizationInferenceEntity build() {
            CustomizationInferenceEntity model =
                    new CustomizationInferenceEntity(
                            this.entityType, this.customizationId, this.customizationAlias);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomizationInferenceEntity model) {
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("customizationId")) {
                this.customizationId(model.getCustomizationId());
            }
            if (model.wasPropertyExplicitlySet("customizationAlias")) {
                this.customizationAlias(model.getCustomizationAlias());
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
     * Entity type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * Entity type
     * @return the value
     **/
    public String getEntityType() {
        return entityType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the customization to use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customizationId")
    private final String customizationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the customization to use.
     * @return the value
     **/
    public String getCustomizationId() {
        return customizationId;
    }

    /**
     * Alias of the customization
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customizationAlias")
    private final String customizationAlias;

    /**
     * Alias of the customization
     * @return the value
     **/
    public String getCustomizationAlias() {
        return customizationAlias;
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
        sb.append("CustomizationInferenceEntity(");
        sb.append("super=").append(super.toString());
        sb.append("entityType=").append(String.valueOf(this.entityType));
        sb.append(", customizationId=").append(String.valueOf(this.customizationId));
        sb.append(", customizationAlias=").append(String.valueOf(this.customizationAlias));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomizationInferenceEntity)) {
            return false;
        }

        CustomizationInferenceEntity other = (CustomizationInferenceEntity) o;
        return java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.customizationId, other.customizationId)
                && java.util.Objects.equals(this.customizationAlias, other.customizationAlias)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result =
                (result * PRIME)
                        + (this.customizationId == null ? 43 : this.customizationId.hashCode());
        result =
                (result * PRIME)
                        + (this.customizationAlias == null
                                ? 43
                                : this.customizationAlias.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
