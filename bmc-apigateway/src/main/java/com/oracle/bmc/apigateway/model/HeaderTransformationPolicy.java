/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * A set of transformations to apply to HTTP headers that pass through the gateway.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HeaderTransformationPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HeaderTransformationPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("setHeaders")
        private SetHeaderPolicy setHeaders;

        public Builder setHeaders(SetHeaderPolicy setHeaders) {
            this.setHeaders = setHeaders;
            this.__explicitlySet__.add("setHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("renameHeaders")
        private RenameHeaderPolicy renameHeaders;

        public Builder renameHeaders(RenameHeaderPolicy renameHeaders) {
            this.renameHeaders = renameHeaders;
            this.__explicitlySet__.add("renameHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filterHeaders")
        private FilterHeaderPolicy filterHeaders;

        public Builder filterHeaders(FilterHeaderPolicy filterHeaders) {
            this.filterHeaders = filterHeaders;
            this.__explicitlySet__.add("filterHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HeaderTransformationPolicy build() {
            HeaderTransformationPolicy __instance__ =
                    new HeaderTransformationPolicy(setHeaders, renameHeaders, filterHeaders);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HeaderTransformationPolicy o) {
            Builder copiedBuilder =
                    setHeaders(o.getSetHeaders())
                            .renameHeaders(o.getRenameHeaders())
                            .filterHeaders(o.getFilterHeaders());

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

    @com.fasterxml.jackson.annotation.JsonProperty("setHeaders")
    SetHeaderPolicy setHeaders;

    @com.fasterxml.jackson.annotation.JsonProperty("renameHeaders")
    RenameHeaderPolicy renameHeaders;

    @com.fasterxml.jackson.annotation.JsonProperty("filterHeaders")
    FilterHeaderPolicy filterHeaders;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
