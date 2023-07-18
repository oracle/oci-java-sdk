/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Options for switchover execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SwitchoverExecutionOptionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "planExecutionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SwitchoverExecutionOptionDetails extends DrPlanExecutionOptionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A flag indicating whether prechecks should be executed before the plan execution.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("arePrechecksEnabled")
        private Boolean arePrechecksEnabled;

        /**
         * A flag indicating whether prechecks should be executed before the plan execution.
         *
         * <p>Example: {@code false}
         *
         * @param arePrechecksEnabled the value to set
         * @return this builder
         */
        public Builder arePrechecksEnabled(Boolean arePrechecksEnabled) {
            this.arePrechecksEnabled = arePrechecksEnabled;
            this.__explicitlySet__.add("arePrechecksEnabled");
            return this;
        }
        /**
         * A flag indicating whether warnings should be ignored during the switchover.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areWarningsIgnored")
        private Boolean areWarningsIgnored;

        /**
         * A flag indicating whether warnings should be ignored during the switchover.
         *
         * <p>Example: {@code true}
         *
         * @param areWarningsIgnored the value to set
         * @return this builder
         */
        public Builder areWarningsIgnored(Boolean areWarningsIgnored) {
            this.areWarningsIgnored = areWarningsIgnored;
            this.__explicitlySet__.add("areWarningsIgnored");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SwitchoverExecutionOptionDetails build() {
            SwitchoverExecutionOptionDetails model =
                    new SwitchoverExecutionOptionDetails(
                            this.arePrechecksEnabled, this.areWarningsIgnored);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SwitchoverExecutionOptionDetails model) {
            if (model.wasPropertyExplicitlySet("arePrechecksEnabled")) {
                this.arePrechecksEnabled(model.getArePrechecksEnabled());
            }
            if (model.wasPropertyExplicitlySet("areWarningsIgnored")) {
                this.areWarningsIgnored(model.getAreWarningsIgnored());
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

    @Deprecated
    public SwitchoverExecutionOptionDetails(
            Boolean arePrechecksEnabled, Boolean areWarningsIgnored) {
        super();
        this.arePrechecksEnabled = arePrechecksEnabled;
        this.areWarningsIgnored = areWarningsIgnored;
    }

    /**
     * A flag indicating whether prechecks should be executed before the plan execution.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("arePrechecksEnabled")
    private final Boolean arePrechecksEnabled;

    /**
     * A flag indicating whether prechecks should be executed before the plan execution.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getArePrechecksEnabled() {
        return arePrechecksEnabled;
    }

    /**
     * A flag indicating whether warnings should be ignored during the switchover.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("areWarningsIgnored")
    private final Boolean areWarningsIgnored;

    /**
     * A flag indicating whether warnings should be ignored during the switchover.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getAreWarningsIgnored() {
        return areWarningsIgnored;
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
        sb.append("SwitchoverExecutionOptionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", arePrechecksEnabled=").append(String.valueOf(this.arePrechecksEnabled));
        sb.append(", areWarningsIgnored=").append(String.valueOf(this.areWarningsIgnored));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SwitchoverExecutionOptionDetails)) {
            return false;
        }

        SwitchoverExecutionOptionDetails other = (SwitchoverExecutionOptionDetails) o;
        return java.util.Objects.equals(this.arePrechecksEnabled, other.arePrechecksEnabled)
                && java.util.Objects.equals(this.areWarningsIgnored, other.areWarningsIgnored)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.arePrechecksEnabled == null
                                ? 43
                                : this.arePrechecksEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.areWarningsIgnored == null
                                ? 43
                                : this.areWarningsIgnored.hashCode());
        return result;
    }
}
