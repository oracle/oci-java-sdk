/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Sort key contains a set of sort key rules defining sorting algorithm. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SortKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SortKey extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sortRules"})
    public SortKey(java.util.List<SortKeyRule> sortRules) {
        super();
        this.sortRules = sortRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of sort key rules. */
        @com.fasterxml.jackson.annotation.JsonProperty("sortRules")
        private java.util.List<SortKeyRule> sortRules;

        /**
         * The list of sort key rules.
         *
         * @param sortRules the value to set
         * @return this builder
         */
        public Builder sortRules(java.util.List<SortKeyRule> sortRules) {
            this.sortRules = sortRules;
            this.__explicitlySet__.add("sortRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SortKey build() {
            SortKey model = new SortKey(this.sortRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SortKey model) {
            if (model.wasPropertyExplicitlySet("sortRules")) {
                this.sortRules(model.getSortRules());
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

    /** The list of sort key rules. */
    @com.fasterxml.jackson.annotation.JsonProperty("sortRules")
    private final java.util.List<SortKeyRule> sortRules;

    /**
     * The list of sort key rules.
     *
     * @return the value
     */
    public java.util.List<SortKeyRule> getSortRules() {
        return sortRules;
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
        sb.append("SortKey(");
        sb.append("super=").append(super.toString());
        sb.append("sortRules=").append(String.valueOf(this.sortRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SortKey)) {
            return false;
        }

        SortKey other = (SortKey) o;
        return java.util.Objects.equals(this.sortRules, other.sortRules) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sortRules == null ? 43 : this.sortRules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
