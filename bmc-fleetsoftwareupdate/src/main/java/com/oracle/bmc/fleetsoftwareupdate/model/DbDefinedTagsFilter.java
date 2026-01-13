/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Defined tags to include in the discovery. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DbDefinedTagsFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DbDefinedTagsFilter extends DbFleetDiscoveryFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }
        /** Defined tags to include in the discovery. */
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<DefinedTagFilterEntry> tags;

        /**
         * Defined tags to include in the discovery.
         *
         * @param tags the value to set
         * @return this builder
         */
        public Builder tags(java.util.List<DefinedTagFilterEntry> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }
        /** Type of join for each element in this filter. */
        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private FleetDiscoveryOperators operator;

        /**
         * Type of join for each element in this filter.
         *
         * @param operator the value to set
         * @return this builder
         */
        public Builder operator(FleetDiscoveryOperators operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbDefinedTagsFilter build() {
            DbDefinedTagsFilter model =
                    new DbDefinedTagsFilter(this.mode, this.tags, this.operator);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbDefinedTagsFilter model) {
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("tags")) {
                this.tags(model.getTags());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
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

    @Deprecated
    public DbDefinedTagsFilter(
            Mode mode,
            java.util.List<DefinedTagFilterEntry> tags,
            FleetDiscoveryOperators operator) {
        super(mode);
        this.tags = tags;
        this.operator = operator;
    }

    /** Defined tags to include in the discovery. */
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<DefinedTagFilterEntry> tags;

    /**
     * Defined tags to include in the discovery.
     *
     * @return the value
     */
    public java.util.List<DefinedTagFilterEntry> getTags() {
        return tags;
    }

    /** Type of join for each element in this filter. */
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final FleetDiscoveryOperators operator;

    /**
     * Type of join for each element in this filter.
     *
     * @return the value
     */
    public FleetDiscoveryOperators getOperator() {
        return operator;
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
        sb.append("DbDefinedTagsFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbDefinedTagsFilter)) {
            return false;
        }

        DbDefinedTagsFilter other = (DbDefinedTagsFilter) o;
        return java.util.Objects.equals(this.tags, other.tags)
                && java.util.Objects.equals(this.operator, other.operator)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        return result;
    }
}
