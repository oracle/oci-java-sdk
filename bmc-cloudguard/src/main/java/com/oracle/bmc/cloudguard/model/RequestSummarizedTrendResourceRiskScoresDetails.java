/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details for requesting summarized trend risk scores. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RequestSummarizedTrendResourceRiskScoresDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RequestSummarizedTrendResourceRiskScoresDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"filter", "filterId"})
    public RequestSummarizedTrendResourceRiskScoresDetails(
            ResourceRiskScoreDimension filter, String filterId) {
        super();
        this.filter = filter;
        this.filterId = filterId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The filter type */
        @com.fasterxml.jackson.annotation.JsonProperty("filter")
        private ResourceRiskScoreDimension filter;

        /**
         * The filter type
         *
         * @param filter the value to set
         * @return this builder
         */
        public Builder filter(ResourceRiskScoreDimension filter) {
            this.filter = filter;
            this.__explicitlySet__.add("filter");
            return this;
        }
        /** ID to be passed in to filter the risk scores */
        @com.fasterxml.jackson.annotation.JsonProperty("filterId")
        private String filterId;

        /**
         * ID to be passed in to filter the risk scores
         *
         * @param filterId the value to set
         * @return this builder
         */
        public Builder filterId(String filterId) {
            this.filterId = filterId;
            this.__explicitlySet__.add("filterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestSummarizedTrendResourceRiskScoresDetails build() {
            RequestSummarizedTrendResourceRiskScoresDetails model =
                    new RequestSummarizedTrendResourceRiskScoresDetails(this.filter, this.filterId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestSummarizedTrendResourceRiskScoresDetails model) {
            if (model.wasPropertyExplicitlySet("filter")) {
                this.filter(model.getFilter());
            }
            if (model.wasPropertyExplicitlySet("filterId")) {
                this.filterId(model.getFilterId());
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

    /** The filter type */
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final ResourceRiskScoreDimension filter;

    /**
     * The filter type
     *
     * @return the value
     */
    public ResourceRiskScoreDimension getFilter() {
        return filter;
    }

    /** ID to be passed in to filter the risk scores */
    @com.fasterxml.jackson.annotation.JsonProperty("filterId")
    private final String filterId;

    /**
     * ID to be passed in to filter the risk scores
     *
     * @return the value
     */
    public String getFilterId() {
        return filterId;
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
        sb.append("RequestSummarizedTrendResourceRiskScoresDetails(");
        sb.append("super=").append(super.toString());
        sb.append("filter=").append(String.valueOf(this.filter));
        sb.append(", filterId=").append(String.valueOf(this.filterId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestSummarizedTrendResourceRiskScoresDetails)) {
            return false;
        }

        RequestSummarizedTrendResourceRiskScoresDetails other =
                (RequestSummarizedTrendResourceRiskScoresDetails) o;
        return java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(this.filterId, other.filterId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + (this.filterId == null ? 43 : this.filterId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
