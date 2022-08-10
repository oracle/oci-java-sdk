/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * Update request for authentication policy, describes set of validation rules and their parameters to be updated.
 *
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
    builder = UpdateAuthenticationPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateAuthenticationPolicyDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"passwordPolicy", "networkPolicy"})
    public UpdateAuthenticationPolicyDetails(
            PasswordPolicy passwordPolicy, NetworkPolicy networkPolicy) {
        super();
        this.passwordPolicy = passwordPolicy;
        this.networkPolicy = networkPolicy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("passwordPolicy")
        private PasswordPolicy passwordPolicy;

        public Builder passwordPolicy(PasswordPolicy passwordPolicy) {
            this.passwordPolicy = passwordPolicy;
            this.__explicitlySet__.add("passwordPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkPolicy")
        private NetworkPolicy networkPolicy;

        public Builder networkPolicy(NetworkPolicy networkPolicy) {
            this.networkPolicy = networkPolicy;
            this.__explicitlySet__.add("networkPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAuthenticationPolicyDetails build() {
            UpdateAuthenticationPolicyDetails model =
                    new UpdateAuthenticationPolicyDetails(this.passwordPolicy, this.networkPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAuthenticationPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("passwordPolicy")) {
                this.passwordPolicy(model.getPasswordPolicy());
            }
            if (model.wasPropertyExplicitlySet("networkPolicy")) {
                this.networkPolicy(model.getNetworkPolicy());
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

    @com.fasterxml.jackson.annotation.JsonProperty("passwordPolicy")
    private final PasswordPolicy passwordPolicy;

    public PasswordPolicy getPasswordPolicy() {
        return passwordPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkPolicy")
    private final NetworkPolicy networkPolicy;

    public NetworkPolicy getNetworkPolicy() {
        return networkPolicy;
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
        sb.append("UpdateAuthenticationPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("passwordPolicy=").append(String.valueOf(this.passwordPolicy));
        sb.append(", networkPolicy=").append(String.valueOf(this.networkPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAuthenticationPolicyDetails)) {
            return false;
        }

        UpdateAuthenticationPolicyDetails other = (UpdateAuthenticationPolicyDetails) o;
        return java.util.Objects.equals(this.passwordPolicy, other.passwordPolicy)
                && java.util.Objects.equals(this.networkPolicy, other.networkPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.passwordPolicy == null ? 43 : this.passwordPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.networkPolicy == null ? 43 : this.networkPolicy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
