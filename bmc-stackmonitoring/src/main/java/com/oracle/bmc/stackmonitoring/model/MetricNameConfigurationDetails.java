/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Metric name generation overriding configurations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MetricNameConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MetricNameConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isPrefixWithCollectorType", "excludePatternOnPrefix"})
    public MetricNameConfigurationDetails(
            Boolean isPrefixWithCollectorType, String excludePatternOnPrefix) {
        super();
        this.isPrefixWithCollectorType = isPrefixWithCollectorType;
        this.excludePatternOnPrefix = excludePatternOnPrefix;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** is prefixing the metric with collector type. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPrefixWithCollectorType")
        private Boolean isPrefixWithCollectorType;

        /**
         * is prefixing the metric with collector type.
         *
         * @param isPrefixWithCollectorType the value to set
         * @return this builder
         */
        public Builder isPrefixWithCollectorType(Boolean isPrefixWithCollectorType) {
            this.isPrefixWithCollectorType = isPrefixWithCollectorType;
            this.__explicitlySet__.add("isPrefixWithCollectorType");
            return this;
        }
        /** String pattern to be removed from the prefix of the metric name. */
        @com.fasterxml.jackson.annotation.JsonProperty("excludePatternOnPrefix")
        private String excludePatternOnPrefix;

        /**
         * String pattern to be removed from the prefix of the metric name.
         *
         * @param excludePatternOnPrefix the value to set
         * @return this builder
         */
        public Builder excludePatternOnPrefix(String excludePatternOnPrefix) {
            this.excludePatternOnPrefix = excludePatternOnPrefix;
            this.__explicitlySet__.add("excludePatternOnPrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MetricNameConfigurationDetails build() {
            MetricNameConfigurationDetails model =
                    new MetricNameConfigurationDetails(
                            this.isPrefixWithCollectorType, this.excludePatternOnPrefix);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricNameConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("isPrefixWithCollectorType")) {
                this.isPrefixWithCollectorType(model.getIsPrefixWithCollectorType());
            }
            if (model.wasPropertyExplicitlySet("excludePatternOnPrefix")) {
                this.excludePatternOnPrefix(model.getExcludePatternOnPrefix());
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

    /** is prefixing the metric with collector type. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrefixWithCollectorType")
    private final Boolean isPrefixWithCollectorType;

    /**
     * is prefixing the metric with collector type.
     *
     * @return the value
     */
    public Boolean getIsPrefixWithCollectorType() {
        return isPrefixWithCollectorType;
    }

    /** String pattern to be removed from the prefix of the metric name. */
    @com.fasterxml.jackson.annotation.JsonProperty("excludePatternOnPrefix")
    private final String excludePatternOnPrefix;

    /**
     * String pattern to be removed from the prefix of the metric name.
     *
     * @return the value
     */
    public String getExcludePatternOnPrefix() {
        return excludePatternOnPrefix;
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
        sb.append("MetricNameConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isPrefixWithCollectorType=")
                .append(String.valueOf(this.isPrefixWithCollectorType));
        sb.append(", excludePatternOnPrefix=").append(String.valueOf(this.excludePatternOnPrefix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricNameConfigurationDetails)) {
            return false;
        }

        MetricNameConfigurationDetails other = (MetricNameConfigurationDetails) o;
        return java.util.Objects.equals(
                        this.isPrefixWithCollectorType, other.isPrefixWithCollectorType)
                && java.util.Objects.equals(
                        this.excludePatternOnPrefix, other.excludePatternOnPrefix)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isPrefixWithCollectorType == null
                                ? 43
                                : this.isPrefixWithCollectorType.hashCode());
        result =
                (result * PRIME)
                        + (this.excludePatternOnPrefix == null
                                ? 43
                                : this.excludePatternOnPrefix.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
