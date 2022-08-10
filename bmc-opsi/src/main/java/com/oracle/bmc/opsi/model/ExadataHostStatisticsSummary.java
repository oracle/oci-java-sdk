/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Host details and statistics.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExadataHostStatisticsSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "exadataResourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExadataHostStatisticsSummary
        extends ExadataInsightResourceStatisticsAggregation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("resourceDetails")
        private HostDetails resourceDetails;

        public Builder resourceDetails(HostDetails resourceDetails) {
            this.resourceDetails = resourceDetails;
            this.__explicitlySet__.add("resourceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentStatistics")
        private ExadataInsightResourceStatistics currentStatistics;

        public Builder currentStatistics(ExadataInsightResourceStatistics currentStatistics) {
            this.currentStatistics = currentStatistics;
            this.__explicitlySet__.add("currentStatistics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataHostStatisticsSummary build() {
            ExadataHostStatisticsSummary model =
                    new ExadataHostStatisticsSummary(this.resourceDetails, this.currentStatistics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataHostStatisticsSummary model) {
            if (model.wasPropertyExplicitlySet("resourceDetails")) {
                this.resourceDetails(model.getResourceDetails());
            }
            if (model.wasPropertyExplicitlySet("currentStatistics")) {
                this.currentStatistics(model.getCurrentStatistics());
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

    @Deprecated
    public ExadataHostStatisticsSummary(
            HostDetails resourceDetails, ExadataInsightResourceStatistics currentStatistics) {
        super();
        this.resourceDetails = resourceDetails;
        this.currentStatistics = currentStatistics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceDetails")
    private final HostDetails resourceDetails;

    public HostDetails getResourceDetails() {
        return resourceDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currentStatistics")
    private final ExadataInsightResourceStatistics currentStatistics;

    public ExadataInsightResourceStatistics getCurrentStatistics() {
        return currentStatistics;
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
        sb.append("ExadataHostStatisticsSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", resourceDetails=").append(String.valueOf(this.resourceDetails));
        sb.append(", currentStatistics=").append(String.valueOf(this.currentStatistics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataHostStatisticsSummary)) {
            return false;
        }

        ExadataHostStatisticsSummary other = (ExadataHostStatisticsSummary) o;
        return java.util.Objects.equals(this.resourceDetails, other.resourceDetails)
                && java.util.Objects.equals(this.currentStatistics, other.currentStatistics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.resourceDetails == null ? 43 : this.resourceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.currentStatistics == null ? 43 : this.currentStatistics.hashCode());
        return result;
    }
}
