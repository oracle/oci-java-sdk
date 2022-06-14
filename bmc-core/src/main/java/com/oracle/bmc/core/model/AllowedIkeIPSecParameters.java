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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AllowedIkeIPSecParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AllowedIkeIPSecParameters {
    @Deprecated
    @java.beans.ConstructorProperties({
        "allowedPhaseOneParameters",
        "allowedPhaseTwoParameters",
        "defaultPhaseOneParameters",
        "defaultPhaseTwoParameters"
    })
    public AllowedIkeIPSecParameters(
            AllowedPhaseOneParameters allowedPhaseOneParameters,
            AllowedPhaseTwoParameters allowedPhaseTwoParameters,
            DefaultPhaseOneParameters defaultPhaseOneParameters,
            DefaultPhaseTwoParameters defaultPhaseTwoParameters) {
        super();
        this.allowedPhaseOneParameters = allowedPhaseOneParameters;
        this.allowedPhaseTwoParameters = allowedPhaseTwoParameters;
        this.defaultPhaseOneParameters = defaultPhaseOneParameters;
        this.defaultPhaseTwoParameters = defaultPhaseTwoParameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("allowedPhaseOneParameters")
    private final AllowedPhaseOneParameters allowedPhaseOneParameters;

    public AllowedPhaseOneParameters getAllowedPhaseOneParameters() {
        return allowedPhaseOneParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("allowedPhaseTwoParameters")
    private final AllowedPhaseTwoParameters allowedPhaseTwoParameters;

    public AllowedPhaseTwoParameters getAllowedPhaseTwoParameters() {
        return allowedPhaseTwoParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultPhaseOneParameters")
    private final DefaultPhaseOneParameters defaultPhaseOneParameters;

    public DefaultPhaseOneParameters getDefaultPhaseOneParameters() {
        return defaultPhaseOneParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("defaultPhaseTwoParameters")
    private final DefaultPhaseTwoParameters defaultPhaseTwoParameters;

    public DefaultPhaseTwoParameters getDefaultPhaseTwoParameters() {
        return defaultPhaseTwoParameters;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AllowedIkeIPSecParameters(");
        sb.append("allowedPhaseOneParameters=")
                .append(String.valueOf(this.allowedPhaseOneParameters));
        sb.append(", allowedPhaseTwoParameters=")
                .append(String.valueOf(this.allowedPhaseTwoParameters));
        sb.append(", defaultPhaseOneParameters=")
                .append(String.valueOf(this.defaultPhaseOneParameters));
        sb.append(", defaultPhaseTwoParameters=")
                .append(String.valueOf(this.defaultPhaseTwoParameters));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AllowedIkeIPSecParameters)) {
            return false;
        }

        AllowedIkeIPSecParameters other = (AllowedIkeIPSecParameters) o;
        return java.util.Objects.equals(
                        this.allowedPhaseOneParameters, other.allowedPhaseOneParameters)
                && java.util.Objects.equals(
                        this.allowedPhaseTwoParameters, other.allowedPhaseTwoParameters)
                && java.util.Objects.equals(
                        this.defaultPhaseOneParameters, other.defaultPhaseOneParameters)
                && java.util.Objects.equals(
                        this.defaultPhaseTwoParameters, other.defaultPhaseTwoParameters)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.allowedPhaseOneParameters == null
                                ? 43
                                : this.allowedPhaseOneParameters.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedPhaseTwoParameters == null
                                ? 43
                                : this.allowedPhaseTwoParameters.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultPhaseOneParameters == null
                                ? 43
                                : this.defaultPhaseOneParameters.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultPhaseTwoParameters == null
                                ? 43
                                : this.defaultPhaseTwoParameters.hashCode());
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
