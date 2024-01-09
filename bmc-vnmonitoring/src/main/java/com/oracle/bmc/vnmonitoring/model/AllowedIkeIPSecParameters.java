/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Lists the current allowed and default IPSec tunnel parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AllowedIkeIPSecParameters.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AllowedIkeIPSecParameters
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
            AllowedIkeIPSecParameters model =
                    new AllowedIkeIPSecParameters(
                            this.allowedPhaseOneParameters,
                            this.allowedPhaseTwoParameters,
                            this.defaultPhaseOneParameters,
                            this.defaultPhaseTwoParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AllowedIkeIPSecParameters model) {
            if (model.wasPropertyExplicitlySet("allowedPhaseOneParameters")) {
                this.allowedPhaseOneParameters(model.getAllowedPhaseOneParameters());
            }
            if (model.wasPropertyExplicitlySet("allowedPhaseTwoParameters")) {
                this.allowedPhaseTwoParameters(model.getAllowedPhaseTwoParameters());
            }
            if (model.wasPropertyExplicitlySet("defaultPhaseOneParameters")) {
                this.defaultPhaseOneParameters(model.getDefaultPhaseOneParameters());
            }
            if (model.wasPropertyExplicitlySet("defaultPhaseTwoParameters")) {
                this.defaultPhaseTwoParameters(model.getDefaultPhaseTwoParameters());
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
        sb.append("AllowedIkeIPSecParameters(");
        sb.append("super=").append(super.toString());
        sb.append("allowedPhaseOneParameters=")
                .append(String.valueOf(this.allowedPhaseOneParameters));
        sb.append(", allowedPhaseTwoParameters=")
                .append(String.valueOf(this.allowedPhaseTwoParameters));
        sb.append(", defaultPhaseOneParameters=")
                .append(String.valueOf(this.defaultPhaseOneParameters));
        sb.append(", defaultPhaseTwoParameters=")
                .append(String.valueOf(this.defaultPhaseTwoParameters));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
