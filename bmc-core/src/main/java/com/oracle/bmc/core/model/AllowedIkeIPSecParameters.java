/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Lists the current allowed and default IPSec tunnel parameters.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AllowedIkeIPSecParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AllowedIkeIPSecParameters {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("allowedPhaseOneParameters")
        private AllowedPhaseOneParameters allowedPhaseOneParameters;

        public Builder allowedPhaseOneParameters(
                AllowedPhaseOneParameters allowedPhaseOneParameters) {
            this.allowedPhaseOneParameters = allowedPhaseOneParameters;
            this.__explicitlySet__.add("allowedPhaseOneParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedPhaseTwoParameters")
        private AllowedPhaseTwoParameters allowedPhaseTwoParameters;

        public Builder allowedPhaseTwoParameters(
                AllowedPhaseTwoParameters allowedPhaseTwoParameters) {
            this.allowedPhaseTwoParameters = allowedPhaseTwoParameters;
            this.__explicitlySet__.add("allowedPhaseTwoParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultPhaseOneParameters")
        private DefaultPhaseOneParameters defaultPhaseOneParameters;

        public Builder defaultPhaseOneParameters(
                DefaultPhaseOneParameters defaultPhaseOneParameters) {
            this.defaultPhaseOneParameters = defaultPhaseOneParameters;
            this.__explicitlySet__.add("defaultPhaseOneParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultPhaseTwoParameters")
        private DefaultPhaseTwoParameters defaultPhaseTwoParameters;

        public Builder defaultPhaseTwoParameters(
                DefaultPhaseTwoParameters defaultPhaseTwoParameters) {
            this.defaultPhaseTwoParameters = defaultPhaseTwoParameters;
            this.__explicitlySet__.add("defaultPhaseTwoParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AllowedIkeIPSecParameters build() {
            AllowedIkeIPSecParameters __instance__ =
                    new AllowedIkeIPSecParameters(
                            allowedPhaseOneParameters,
                            allowedPhaseTwoParameters,
                            defaultPhaseOneParameters,
                            defaultPhaseTwoParameters);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AllowedIkeIPSecParameters o) {
            Builder copiedBuilder =
                    allowedPhaseOneParameters(o.getAllowedPhaseOneParameters())
                            .allowedPhaseTwoParameters(o.getAllowedPhaseTwoParameters())
                            .defaultPhaseOneParameters(o.getDefaultPhaseOneParameters())
                            .defaultPhaseTwoParameters(o.getDefaultPhaseTwoParameters());

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

    @com.fasterxml.jackson.annotation.JsonProperty("allowedPhaseOneParameters")
    AllowedPhaseOneParameters allowedPhaseOneParameters;

    @com.fasterxml.jackson.annotation.JsonProperty("allowedPhaseTwoParameters")
    AllowedPhaseTwoParameters allowedPhaseTwoParameters;

    @com.fasterxml.jackson.annotation.JsonProperty("defaultPhaseOneParameters")
    DefaultPhaseOneParameters defaultPhaseOneParameters;

    @com.fasterxml.jackson.annotation.JsonProperty("defaultPhaseTwoParameters")
    DefaultPhaseTwoParameters defaultPhaseTwoParameters;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
