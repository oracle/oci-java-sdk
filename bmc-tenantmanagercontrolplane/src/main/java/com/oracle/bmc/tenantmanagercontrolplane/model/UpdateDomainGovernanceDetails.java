/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * The parameters for updating a domain govenance entity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateDomainGovernanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDomainGovernanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subscriptionEmail",
        "isGovernanceEnabled",
        "freeformTags",
        "definedTags"
    })
    public UpdateDomainGovernanceDetails(
            String subscriptionEmail,
            Boolean isGovernanceEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.subscriptionEmail = subscriptionEmail;
        this.isGovernanceEnabled = isGovernanceEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Email address to be used to notify the user, and that the ONS subscription will be
         * created with. The ONS subscription for the previous email will also be deleted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionEmail")
        private String subscriptionEmail;

        /**
         * Email address to be used to notify the user, and that the ONS subscription will be
         * created with. The ONS subscription for the previous email will also be deleted.
         *
         * @param subscriptionEmail the value to set
         * @return this builder
         */
        public Builder subscriptionEmail(String subscriptionEmail) {
            this.subscriptionEmail = subscriptionEmail;
            this.__explicitlySet__.add("subscriptionEmail");
            return this;
        }
        /** Indicates whether governance is enabled for this domain. */
        @com.fasterxml.jackson.annotation.JsonProperty("isGovernanceEnabled")
        private Boolean isGovernanceEnabled;

        /**
         * Indicates whether governance is enabled for this domain.
         *
         * @param isGovernanceEnabled the value to set
         * @return this builder
         */
        public Builder isGovernanceEnabled(Boolean isGovernanceEnabled) {
            this.isGovernanceEnabled = isGovernanceEnabled;
            this.__explicitlySet__.add("isGovernanceEnabled");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDomainGovernanceDetails build() {
            UpdateDomainGovernanceDetails model =
                    new UpdateDomainGovernanceDetails(
                            this.subscriptionEmail,
                            this.isGovernanceEnabled,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDomainGovernanceDetails model) {
            if (model.wasPropertyExplicitlySet("subscriptionEmail")) {
                this.subscriptionEmail(model.getSubscriptionEmail());
            }
            if (model.wasPropertyExplicitlySet("isGovernanceEnabled")) {
                this.isGovernanceEnabled(model.getIsGovernanceEnabled());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /**
     * Email address to be used to notify the user, and that the ONS subscription will be created
     * with. The ONS subscription for the previous email will also be deleted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionEmail")
    private final String subscriptionEmail;

    /**
     * Email address to be used to notify the user, and that the ONS subscription will be created
     * with. The ONS subscription for the previous email will also be deleted.
     *
     * @return the value
     */
    public String getSubscriptionEmail() {
        return subscriptionEmail;
    }

    /** Indicates whether governance is enabled for this domain. */
    @com.fasterxml.jackson.annotation.JsonProperty("isGovernanceEnabled")
    private final Boolean isGovernanceEnabled;

    /**
     * Indicates whether governance is enabled for this domain.
     *
     * @return the value
     */
    public Boolean getIsGovernanceEnabled() {
        return isGovernanceEnabled;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateDomainGovernanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("subscriptionEmail=").append(String.valueOf(this.subscriptionEmail));
        sb.append(", isGovernanceEnabled=").append(String.valueOf(this.isGovernanceEnabled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDomainGovernanceDetails)) {
            return false;
        }

        UpdateDomainGovernanceDetails other = (UpdateDomainGovernanceDetails) o;
        return java.util.Objects.equals(this.subscriptionEmail, other.subscriptionEmail)
                && java.util.Objects.equals(this.isGovernanceEnabled, other.isGovernanceEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.subscriptionEmail == null ? 43 : this.subscriptionEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.isGovernanceEnabled == null
                                ? 43
                                : this.isGovernanceEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
