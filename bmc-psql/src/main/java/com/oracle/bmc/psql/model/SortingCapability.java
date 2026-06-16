/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Describes sorting support for an insight type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SortingCapability.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SortingCapability
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isSupported", "fields", "defaultSort"})
    public SortingCapability(
            Boolean isSupported, java.util.List<String> fields, SortingDefault defaultSort) {
        super();
        this.isSupported = isSupported;
        this.fields = fields;
        this.defaultSort = defaultSort;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates whether sorting is supported. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSupported")
        private Boolean isSupported;

        /**
         * Indicates whether sorting is supported.
         *
         * @param isSupported the value to set
         * @return this builder
         */
        public Builder isSupported(Boolean isSupported) {
            this.isSupported = isSupported;
            this.__explicitlySet__.add("isSupported");
            return this;
        }
        /** Fields that can be used for sorting. */
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<String> fields;

        /**
         * Fields that can be used for sorting.
         *
         * @param fields the value to set
         * @return this builder
         */
        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultSort")
        private SortingDefault defaultSort;

        public Builder defaultSort(SortingDefault defaultSort) {
            this.defaultSort = defaultSort;
            this.__explicitlySet__.add("defaultSort");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SortingCapability build() {
            SortingCapability model =
                    new SortingCapability(this.isSupported, this.fields, this.defaultSort);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SortingCapability model) {
            if (model.wasPropertyExplicitlySet("isSupported")) {
                this.isSupported(model.getIsSupported());
            }
            if (model.wasPropertyExplicitlySet("fields")) {
                this.fields(model.getFields());
            }
            if (model.wasPropertyExplicitlySet("defaultSort")) {
                this.defaultSort(model.getDefaultSort());
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

    /** Indicates whether sorting is supported. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSupported")
    private final Boolean isSupported;

    /**
     * Indicates whether sorting is supported.
     *
     * @return the value
     */
    public Boolean getIsSupported() {
        return isSupported;
    }

    /** Fields that can be used for sorting. */
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.List<String> fields;

    /**
     * Fields that can be used for sorting.
     *
     * @return the value
     */
    public java.util.List<String> getFields() {
        return fields;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultSort")
    private final SortingDefault defaultSort;

    public SortingDefault getDefaultSort() {
        return defaultSort;
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
        sb.append("SortingCapability(");
        sb.append("super=").append(super.toString());
        sb.append("isSupported=").append(String.valueOf(this.isSupported));
        sb.append(", fields=").append(String.valueOf(this.fields));
        sb.append(", defaultSort=").append(String.valueOf(this.defaultSort));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SortingCapability)) {
            return false;
        }

        SortingCapability other = (SortingCapability) o;
        return java.util.Objects.equals(this.isSupported, other.isSupported)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.defaultSort, other.defaultSort)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isSupported == null ? 43 : this.isSupported.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.defaultSort == null ? 43 : this.defaultSort.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
