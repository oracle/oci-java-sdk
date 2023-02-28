/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines details for the security action taken on allowed traffic. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AllowedSecurityActionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AllowedSecurityActionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isRestrictedOrPartial", "allowedSecurityConfiguration"})
    public AllowedSecurityActionDetails(
            Boolean isRestrictedOrPartial,
            AllowedSecurityConfiguration allowedSecurityConfiguration) {
        super();
        this.isRestrictedOrPartial = isRestrictedOrPartial;
        this.allowedSecurityConfiguration = allowedSecurityConfiguration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** If true, the allowed security configuration details are incomplete. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRestrictedOrPartial")
        private Boolean isRestrictedOrPartial;

        /**
         * If true, the allowed security configuration details are incomplete.
         *
         * @param isRestrictedOrPartial the value to set
         * @return this builder
         */
        public Builder isRestrictedOrPartial(Boolean isRestrictedOrPartial) {
            this.isRestrictedOrPartial = isRestrictedOrPartial;
            this.__explicitlySet__.add("isRestrictedOrPartial");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedSecurityConfiguration")
        private AllowedSecurityConfiguration allowedSecurityConfiguration;

        public Builder allowedSecurityConfiguration(
                AllowedSecurityConfiguration allowedSecurityConfiguration) {
            this.allowedSecurityConfiguration = allowedSecurityConfiguration;
            this.__explicitlySet__.add("allowedSecurityConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AllowedSecurityActionDetails build() {
            AllowedSecurityActionDetails model =
                    new AllowedSecurityActionDetails(
                            this.isRestrictedOrPartial, this.allowedSecurityConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AllowedSecurityActionDetails model) {
            if (model.wasPropertyExplicitlySet("isRestrictedOrPartial")) {
                this.isRestrictedOrPartial(model.getIsRestrictedOrPartial());
            }
            if (model.wasPropertyExplicitlySet("allowedSecurityConfiguration")) {
                this.allowedSecurityConfiguration(model.getAllowedSecurityConfiguration());
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

    /** If true, the allowed security configuration details are incomplete. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRestrictedOrPartial")
    private final Boolean isRestrictedOrPartial;

    /**
     * If true, the allowed security configuration details are incomplete.
     *
     * @return the value
     */
    public Boolean getIsRestrictedOrPartial() {
        return isRestrictedOrPartial;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("allowedSecurityConfiguration")
    private final AllowedSecurityConfiguration allowedSecurityConfiguration;

    public AllowedSecurityConfiguration getAllowedSecurityConfiguration() {
        return allowedSecurityConfiguration;
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
        sb.append("AllowedSecurityActionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isRestrictedOrPartial=").append(String.valueOf(this.isRestrictedOrPartial));
        sb.append(", allowedSecurityConfiguration=")
                .append(String.valueOf(this.allowedSecurityConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AllowedSecurityActionDetails)) {
            return false;
        }

        AllowedSecurityActionDetails other = (AllowedSecurityActionDetails) o;
        return java.util.Objects.equals(this.isRestrictedOrPartial, other.isRestrictedOrPartial)
                && java.util.Objects.equals(
                        this.allowedSecurityConfiguration, other.allowedSecurityConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isRestrictedOrPartial == null
                                ? 43
                                : this.isRestrictedOrPartial.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedSecurityConfiguration == null
                                ? 43
                                : this.allowedSecurityConfiguration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
