/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * A set of transformations to apply to query parameters that pass through the gateway.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = QueryParameterTransformationPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryParameterTransformationPolicy {
    @Deprecated
    @java.beans.ConstructorProperties({
        "setQueryParameters",
        "renameQueryParameters",
        "filterQueryParameters"
    })
    public QueryParameterTransformationPolicy(
            SetQueryParameterPolicy setQueryParameters,
            RenameQueryParameterPolicy renameQueryParameters,
            FilterQueryParameterPolicy filterQueryParameters) {
        super();
        this.setQueryParameters = setQueryParameters;
        this.renameQueryParameters = renameQueryParameters;
        this.filterQueryParameters = filterQueryParameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("setQueryParameters")
        private SetQueryParameterPolicy setQueryParameters;

        public Builder setQueryParameters(SetQueryParameterPolicy setQueryParameters) {
            this.setQueryParameters = setQueryParameters;
            this.__explicitlySet__.add("setQueryParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("renameQueryParameters")
        private RenameQueryParameterPolicy renameQueryParameters;

        public Builder renameQueryParameters(RenameQueryParameterPolicy renameQueryParameters) {
            this.renameQueryParameters = renameQueryParameters;
            this.__explicitlySet__.add("renameQueryParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filterQueryParameters")
        private FilterQueryParameterPolicy filterQueryParameters;

        public Builder filterQueryParameters(FilterQueryParameterPolicy filterQueryParameters) {
            this.filterQueryParameters = filterQueryParameters;
            this.__explicitlySet__.add("filterQueryParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryParameterTransformationPolicy build() {
            QueryParameterTransformationPolicy __instance__ =
                    new QueryParameterTransformationPolicy(
                            setQueryParameters, renameQueryParameters, filterQueryParameters);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryParameterTransformationPolicy o) {
            Builder copiedBuilder =
                    setQueryParameters(o.getSetQueryParameters())
                            .renameQueryParameters(o.getRenameQueryParameters())
                            .filterQueryParameters(o.getFilterQueryParameters());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @com.fasterxml.jackson.annotation.JsonProperty("setQueryParameters")
    private final SetQueryParameterPolicy setQueryParameters;

    public SetQueryParameterPolicy getSetQueryParameters() {
        return setQueryParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("renameQueryParameters")
    private final RenameQueryParameterPolicy renameQueryParameters;

    public RenameQueryParameterPolicy getRenameQueryParameters() {
        return renameQueryParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("filterQueryParameters")
    private final FilterQueryParameterPolicy filterQueryParameters;

    public FilterQueryParameterPolicy getFilterQueryParameters() {
        return filterQueryParameters;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryParameterTransformationPolicy(");
        sb.append("setQueryParameters=").append(String.valueOf(this.setQueryParameters));
        sb.append(", renameQueryParameters=").append(String.valueOf(this.renameQueryParameters));
        sb.append(", filterQueryParameters=").append(String.valueOf(this.filterQueryParameters));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryParameterTransformationPolicy)) {
            return false;
        }

        QueryParameterTransformationPolicy other = (QueryParameterTransformationPolicy) o;
        return java.util.Objects.equals(this.setQueryParameters, other.setQueryParameters)
                && java.util.Objects.equals(this.renameQueryParameters, other.renameQueryParameters)
                && java.util.Objects.equals(this.filterQueryParameters, other.filterQueryParameters)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.setQueryParameters == null
                                ? 43
                                : this.setQueryParameters.hashCode());
        result =
                (result * PRIME)
                        + (this.renameQueryParameters == null
                                ? 43
                                : this.renameQueryParameters.hashCode());
        result =
                (result * PRIME)
                        + (this.filterQueryParameters == null
                                ? 43
                                : this.filterQueryParameters.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
