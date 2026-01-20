/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * Job priority configuration to instruct the service on how to use priority tags. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JobPriorityConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JobPriorityConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tagNamespace", "tagKey", "weight", "values"})
    public JobPriorityConfiguration(
            String tagNamespace,
            String tagKey,
            Integer weight,
            java.util.Map<String, Integer> values) {
        super();
        this.tagNamespace = tagNamespace;
        this.tagKey = tagKey;
        this.weight = weight;
        this.values = values;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the corresponding tag namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("tagNamespace")
        private String tagNamespace;

        /**
         * Name of the corresponding tag namespace.
         *
         * @param tagNamespace the value to set
         * @return this builder
         */
        public Builder tagNamespace(String tagNamespace) {
            this.tagNamespace = tagNamespace;
            this.__explicitlySet__.add("tagNamespace");
            return this;
        }
        /** Name of the tag key. */
        @com.fasterxml.jackson.annotation.JsonProperty("tagKey")
        private String tagKey;

        /**
         * Name of the tag key.
         *
         * @param tagKey the value to set
         * @return this builder
         */
        public Builder tagKey(String tagKey) {
            this.tagKey = tagKey;
            this.__explicitlySet__.add("tagKey");
            return this;
        }
        /** Weight associated with the tag key. Percentage point is the unit of measurement. */
        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private Integer weight;

        /**
         * Weight associated with the tag key. Percentage point is the unit of measurement.
         *
         * @param weight the value to set
         * @return this builder
         */
        public Builder weight(Integer weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }
        /** Mapping of tag value to its priority. */
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.Map<String, Integer> values;

        /**
         * Mapping of tag value to its priority.
         *
         * @param values the value to set
         * @return this builder
         */
        public Builder values(java.util.Map<String, Integer> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobPriorityConfiguration build() {
            JobPriorityConfiguration model =
                    new JobPriorityConfiguration(
                            this.tagNamespace, this.tagKey, this.weight, this.values);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobPriorityConfiguration model) {
            if (model.wasPropertyExplicitlySet("tagNamespace")) {
                this.tagNamespace(model.getTagNamespace());
            }
            if (model.wasPropertyExplicitlySet("tagKey")) {
                this.tagKey(model.getTagKey());
            }
            if (model.wasPropertyExplicitlySet("weight")) {
                this.weight(model.getWeight());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
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

    /** Name of the corresponding tag namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("tagNamespace")
    private final String tagNamespace;

    /**
     * Name of the corresponding tag namespace.
     *
     * @return the value
     */
    public String getTagNamespace() {
        return tagNamespace;
    }

    /** Name of the tag key. */
    @com.fasterxml.jackson.annotation.JsonProperty("tagKey")
    private final String tagKey;

    /**
     * Name of the tag key.
     *
     * @return the value
     */
    public String getTagKey() {
        return tagKey;
    }

    /** Weight associated with the tag key. Percentage point is the unit of measurement. */
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    private final Integer weight;

    /**
     * Weight associated with the tag key. Percentage point is the unit of measurement.
     *
     * @return the value
     */
    public Integer getWeight() {
        return weight;
    }

    /** Mapping of tag value to its priority. */
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.Map<String, Integer> values;

    /**
     * Mapping of tag value to its priority.
     *
     * @return the value
     */
    public java.util.Map<String, Integer> getValues() {
        return values;
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
        sb.append("JobPriorityConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("tagNamespace=").append(String.valueOf(this.tagNamespace));
        sb.append(", tagKey=").append(String.valueOf(this.tagKey));
        sb.append(", weight=").append(String.valueOf(this.weight));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobPriorityConfiguration)) {
            return false;
        }

        JobPriorityConfiguration other = (JobPriorityConfiguration) o;
        return java.util.Objects.equals(this.tagNamespace, other.tagNamespace)
                && java.util.Objects.equals(this.tagKey, other.tagKey)
                && java.util.Objects.equals(this.weight, other.weight)
                && java.util.Objects.equals(this.values, other.values)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tagNamespace == null ? 43 : this.tagNamespace.hashCode());
        result = (result * PRIME) + (this.tagKey == null ? 43 : this.tagKey.hashCode());
        result = (result * PRIME) + (this.weight == null ? 43 : this.weight.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
