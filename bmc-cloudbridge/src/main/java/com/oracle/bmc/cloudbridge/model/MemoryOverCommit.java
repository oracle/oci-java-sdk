/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Memory over commit
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MemoryOverCommit.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MemoryOverCommit extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"percentage"})
    public MemoryOverCommit(Integer percentage) {
        super();
        this.percentage = percentage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Percentage of memory over commit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("percentage")
        private Integer percentage;

        /**
         * Percentage of memory over commit
         * @param percentage the value to set
         * @return this builder
         **/
        public Builder percentage(Integer percentage) {
            this.percentage = percentage;
            this.__explicitlySet__.add("percentage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MemoryOverCommit build() {
            MemoryOverCommit model = new MemoryOverCommit(this.percentage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MemoryOverCommit model) {
            if (model.wasPropertyExplicitlySet("percentage")) {
                this.percentage(model.getPercentage());
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
     * Percentage of memory over commit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentage")
    private final Integer percentage;

    /**
     * Percentage of memory over commit
     * @return the value
     **/
    public Integer getPercentage() {
        return percentage;
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
        sb.append("MemoryOverCommit(");
        sb.append("super=").append(super.toString());
        sb.append("percentage=").append(String.valueOf(this.percentage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MemoryOverCommit)) {
            return false;
        }

        MemoryOverCommit other = (MemoryOverCommit) o;
        return java.util.Objects.equals(this.percentage, other.percentage) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.percentage == null ? 43 : this.percentage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
