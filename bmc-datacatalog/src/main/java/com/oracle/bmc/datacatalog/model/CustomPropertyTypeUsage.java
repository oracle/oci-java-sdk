/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Object which describes the indivial object stats for every custom property <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CustomPropertyTypeUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomPropertyTypeUsage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"typeId", "typeName", "count", "isEventEnabled"})
    public CustomPropertyTypeUsage(
            String typeId, String typeName, Integer count, Boolean isEventEnabled) {
        super();
        this.typeId = typeId;
        this.typeName = typeName;
        this.count = count;
        this.isEventEnabled = isEventEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique type key identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("typeId")
        private String typeId;

        /**
         * Unique type key identifier
         *
         * @param typeId the value to set
         * @return this builder
         */
        public Builder typeId(String typeId) {
            this.typeId = typeId;
            this.__explicitlySet__.add("typeId");
            return this;
        }
        /** Name of the type associated with */
        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        /**
         * Name of the type associated with
         *
         * @param typeName the value to set
         * @return this builder
         */
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }
        /** Number of objects associated with this type */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * Number of objects associated with this type
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
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

        public CustomPropertyTypeUsage build() {
            CustomPropertyTypeUsage model =
                    new CustomPropertyTypeUsage(
                            this.typeId, this.typeName, this.count, this.isEventEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomPropertyTypeUsage model) {
            if (model.wasPropertyExplicitlySet("typeId")) {
                this.typeId(model.getTypeId());
            }
            if (model.wasPropertyExplicitlySet("typeName")) {
                this.typeName(model.getTypeName());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
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

    /** Unique type key identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("typeId")
    private final String typeId;

    /**
     * Unique type key identifier
     *
     * @return the value
     */
    public String getTypeId() {
        return typeId;
    }

    /** Name of the type associated with */
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    private final String typeName;

    /**
     * Name of the type associated with
     *
     * @return the value
     */
    public String getTypeName() {
        return typeName;
    }

    /** Number of objects associated with this type */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * Number of objects associated with this type
     *
     * @return the value
     */
    public Integer getCount() {
        return count;
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
        sb.append("CustomPropertyTypeUsage(");
        sb.append("super=").append(super.toString());
        sb.append("typeId=").append(String.valueOf(this.typeId));
        sb.append(", typeName=").append(String.valueOf(this.typeName));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(", isEventEnabled=").append(String.valueOf(this.isEventEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomPropertyTypeUsage)) {
            return false;
        }

        CustomPropertyTypeUsage other = (CustomPropertyTypeUsage) o;
        return java.util.Objects.equals(this.typeId, other.typeId)
                && java.util.Objects.equals(this.typeName, other.typeName)
                && java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.isEventEnabled, other.isEventEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.typeId == null ? 43 : this.typeId.hashCode());
        result = (result * PRIME) + (this.typeName == null ? 43 : this.typeName.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result =
                (result * PRIME)
                        + (this.isEventEnabled == null ? 43 : this.isEventEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
