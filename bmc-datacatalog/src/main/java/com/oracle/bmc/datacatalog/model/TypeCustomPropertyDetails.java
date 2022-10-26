/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Array of custom property IDs for which we have to associate the custom property to the type <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TypeCustomPropertyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class TypeCustomPropertyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"customPropertyIds", "isEventEnabled"})
    public TypeCustomPropertyDetails(
            java.util.List<String> customPropertyIds, Boolean isEventEnabled) {
        super();
        this.customPropertyIds = customPropertyIds;
        this.isEventEnabled = isEventEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** array of custom property Ids */
        @com.fasterxml.jackson.annotation.JsonProperty("customPropertyIds")
        private java.util.List<String> customPropertyIds;

        /**
         * array of custom property Ids
         *
         * @param customPropertyIds the value to set
         * @return this builder
         */
        public Builder customPropertyIds(java.util.List<String> customPropertyIds) {
            this.customPropertyIds = customPropertyIds;
            this.__explicitlySet__.add("customPropertyIds");
            return this;
        }
        /** If an OCI Event will be emitted when the custom property is modified. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEventEnabled")
        private Boolean isEventEnabled;

        /**
         * If an OCI Event will be emitted when the custom property is modified.
         *
         * @param isEventEnabled the value to set
         * @return this builder
         */
        public Builder isEventEnabled(Boolean isEventEnabled) {
            this.isEventEnabled = isEventEnabled;
            this.__explicitlySet__.add("isEventEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TypeCustomPropertyDetails build() {
            TypeCustomPropertyDetails model =
                    new TypeCustomPropertyDetails(this.customPropertyIds, this.isEventEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TypeCustomPropertyDetails model) {
            if (model.wasPropertyExplicitlySet("customPropertyIds")) {
                this.customPropertyIds(model.getCustomPropertyIds());
            }
            if (model.wasPropertyExplicitlySet("isEventEnabled")) {
                this.isEventEnabled(model.getIsEventEnabled());
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

    /** array of custom property Ids */
    @com.fasterxml.jackson.annotation.JsonProperty("customPropertyIds")
    private final java.util.List<String> customPropertyIds;

    /**
     * array of custom property Ids
     *
     * @return the value
     */
    public java.util.List<String> getCustomPropertyIds() {
        return customPropertyIds;
    }

    /** If an OCI Event will be emitted when the custom property is modified. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEventEnabled")
    private final Boolean isEventEnabled;

    /**
     * If an OCI Event will be emitted when the custom property is modified.
     *
     * @return the value
     */
    public Boolean getIsEventEnabled() {
        return isEventEnabled;
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
        sb.append("TypeCustomPropertyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("customPropertyIds=").append(String.valueOf(this.customPropertyIds));
        sb.append(", isEventEnabled=").append(String.valueOf(this.isEventEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TypeCustomPropertyDetails)) {
            return false;
        }

        TypeCustomPropertyDetails other = (TypeCustomPropertyDetails) o;
        return java.util.Objects.equals(this.customPropertyIds, other.customPropertyIds)
                && java.util.Objects.equals(this.isEventEnabled, other.isEventEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.customPropertyIds == null ? 43 : this.customPropertyIds.hashCode());
        result =
                (result * PRIME)
                        + (this.isEventEnabled == null ? 43 : this.isEventEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
