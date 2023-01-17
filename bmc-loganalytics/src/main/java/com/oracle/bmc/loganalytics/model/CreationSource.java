/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Details for auto-created entity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreationSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreationSource
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "details"})
    public CreationSource(CreationSourceType type, String details) {
        super();
        this.type = type;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Source that auto-created the entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private CreationSourceType type;

        /**
         * Source that auto-created the entity.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(CreationSourceType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * This will provide additional details for source of auto-creation. For example, if entity
         * is auto-created by enterprise manager bridge, this field provides additional detail on
         * enterprise manager that contributed to the entity auto-creation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private String details;

        /**
         * This will provide additional details for source of auto-creation. For example, if entity
         * is auto-created by enterprise manager bridge, this field provides additional detail on
         * enterprise manager that contributed to the entity auto-creation.
         *
         * @param details the value to set
         * @return this builder
         */
        public Builder details(String details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreationSource build() {
            CreationSource model = new CreationSource(this.type, this.details);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreationSource model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
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

    /** Source that auto-created the entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final CreationSourceType type;

    /**
     * Source that auto-created the entity.
     *
     * @return the value
     */
    public CreationSourceType getType() {
        return type;
    }

    /**
     * This will provide additional details for source of auto-creation. For example, if entity is
     * auto-created by enterprise manager bridge, this field provides additional detail on
     * enterprise manager that contributed to the entity auto-creation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final String details;

    /**
     * This will provide additional details for source of auto-creation. For example, if entity is
     * auto-created by enterprise manager bridge, this field provides additional detail on
     * enterprise manager that contributed to the entity auto-creation.
     *
     * @return the value
     */
    public String getDetails() {
        return details;
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
        sb.append("CreationSource(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreationSource)) {
            return false;
        }

        CreationSource other = (CreationSource) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.details, other.details)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
