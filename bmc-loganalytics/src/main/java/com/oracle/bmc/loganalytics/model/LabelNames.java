/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LabelName
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LabelNames.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LabelNames extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"labelNames"})
    public LabelNames(java.util.List<String> labelNames) {
        super();
        this.labelNames = labelNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of label names.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("labelNames")
        private java.util.List<String> labelNames;

        /**
         * An array of label names.
         * @param labelNames the value to set
         * @return this builder
         **/
        public Builder labelNames(java.util.List<String> labelNames) {
            this.labelNames = labelNames;
            this.__explicitlySet__.add("labelNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LabelNames build() {
            LabelNames model = new LabelNames(this.labelNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LabelNames model) {
            if (model.wasPropertyExplicitlySet("labelNames")) {
                this.labelNames(model.getLabelNames());
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
     * An array of label names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labelNames")
    private final java.util.List<String> labelNames;

    /**
     * An array of label names.
     * @return the value
     **/
    public java.util.List<String> getLabelNames() {
        return labelNames;
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
        sb.append("LabelNames(");
        sb.append("super=").append(super.toString());
        sb.append("labelNames=").append(String.valueOf(this.labelNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LabelNames)) {
            return false;
        }

        LabelNames other = (LabelNames) o;
        return java.util.Objects.equals(this.labelNames, other.labelNames) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.labelNames == null ? 43 : this.labelNames.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
