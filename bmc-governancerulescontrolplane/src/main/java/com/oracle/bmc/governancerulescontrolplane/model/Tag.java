/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane.model;

/**
 * Details of the tag that is being created. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Tag.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Tag extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "isCostTracking", "validator"})
    public Tag(
            String name,
            String description,
            Boolean isCostTracking,
            BaseTagDefinitionValidator validator) {
        super();
        this.name = name;
        this.description = description;
        this.isCostTracking = isCostTracking;
        this.validator = validator;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name you assign to the tag during creation. This is the tag key definition. The name
         * must be unique within the tag namespace and cannot be changed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name you assign to the tag during creation. This is the tag key definition. The name
         * must be unique within the tag namespace and cannot be changed.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The description assigned to the tag during creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description assigned to the tag during creation.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Indicates whether the tag is enabled for cost tracking. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCostTracking")
        private Boolean isCostTracking;

        /**
         * Indicates whether the tag is enabled for cost tracking.
         *
         * @param isCostTracking the value to set
         * @return this builder
         */
        public Builder isCostTracking(Boolean isCostTracking) {
            this.isCostTracking = isCostTracking;
            this.__explicitlySet__.add("isCostTracking");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validator")
        private BaseTagDefinitionValidator validator;

        public Builder validator(BaseTagDefinitionValidator validator) {
            this.validator = validator;
            this.__explicitlySet__.add("validator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Tag build() {
            Tag model = new Tag(this.name, this.description, this.isCostTracking, this.validator);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Tag model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isCostTracking")) {
                this.isCostTracking(model.getIsCostTracking());
            }
            if (model.wasPropertyExplicitlySet("validator")) {
                this.validator(model.getValidator());
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
     * The name you assign to the tag during creation. This is the tag key definition. The name must
     * be unique within the tag namespace and cannot be changed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name you assign to the tag during creation. This is the tag key definition. The name must
     * be unique within the tag namespace and cannot be changed.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The description assigned to the tag during creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description assigned to the tag during creation.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Indicates whether the tag is enabled for cost tracking. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCostTracking")
    private final Boolean isCostTracking;

    /**
     * Indicates whether the tag is enabled for cost tracking.
     *
     * @return the value
     */
    public Boolean getIsCostTracking() {
        return isCostTracking;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validator")
    private final BaseTagDefinitionValidator validator;

    public BaseTagDefinitionValidator getValidator() {
        return validator;
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
        sb.append("Tag(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isCostTracking=").append(String.valueOf(this.isCostTracking));
        sb.append(", validator=").append(String.valueOf(this.validator));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Tag)) {
            return false;
        }

        Tag other = (Tag) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isCostTracking, other.isCostTracking)
                && java.util.Objects.equals(this.validator, other.validator)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isCostTracking == null ? 43 : this.isCostTracking.hashCode());
        result = (result * PRIME) + (this.validator == null ? 43 : this.validator.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
