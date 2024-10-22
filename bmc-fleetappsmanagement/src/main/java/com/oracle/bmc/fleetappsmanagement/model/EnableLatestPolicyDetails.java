/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The information to be updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EnableLatestPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EnableLatestPolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"canLatestFamsPoliciesBeEnabled"})
    public EnableLatestPolicyDetails(Boolean canLatestFamsPoliciesBeEnabled) {
        super();
        this.canLatestFamsPoliciesBeEnabled = canLatestFamsPoliciesBeEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A value determining if latest Fleet Application Management policies should be enabled */
        @com.fasterxml.jackson.annotation.JsonProperty("canLatestFamsPoliciesBeEnabled")
        private Boolean canLatestFamsPoliciesBeEnabled;

        /**
         * A value determining if latest Fleet Application Management policies should be enabled
         *
         * @param canLatestFamsPoliciesBeEnabled the value to set
         * @return this builder
         */
        public Builder canLatestFamsPoliciesBeEnabled(Boolean canLatestFamsPoliciesBeEnabled) {
            this.canLatestFamsPoliciesBeEnabled = canLatestFamsPoliciesBeEnabled;
            this.__explicitlySet__.add("canLatestFamsPoliciesBeEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnableLatestPolicyDetails build() {
            EnableLatestPolicyDetails model =
                    new EnableLatestPolicyDetails(this.canLatestFamsPoliciesBeEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnableLatestPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("canLatestFamsPoliciesBeEnabled")) {
                this.canLatestFamsPoliciesBeEnabled(model.getCanLatestFamsPoliciesBeEnabled());
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

    /** A value determining if latest Fleet Application Management policies should be enabled */
    @com.fasterxml.jackson.annotation.JsonProperty("canLatestFamsPoliciesBeEnabled")
    private final Boolean canLatestFamsPoliciesBeEnabled;

    /**
     * A value determining if latest Fleet Application Management policies should be enabled
     *
     * @return the value
     */
    public Boolean getCanLatestFamsPoliciesBeEnabled() {
        return canLatestFamsPoliciesBeEnabled;
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
        sb.append("EnableLatestPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("canLatestFamsPoliciesBeEnabled=")
                .append(String.valueOf(this.canLatestFamsPoliciesBeEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableLatestPolicyDetails)) {
            return false;
        }

        EnableLatestPolicyDetails other = (EnableLatestPolicyDetails) o;
        return java.util.Objects.equals(
                        this.canLatestFamsPoliciesBeEnabled, other.canLatestFamsPoliciesBeEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.canLatestFamsPoliciesBeEnabled == null
                                ? 43
                                : this.canLatestFamsPoliciesBeEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
