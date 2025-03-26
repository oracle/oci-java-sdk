/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * The parameters for updating an organization.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOrganizationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOrganizationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"defaultUcmSubscriptionId"})
    public UpdateOrganizationDetails(String defaultUcmSubscriptionId) {
        super();
        this.defaultUcmSubscriptionId = defaultUcmSubscriptionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the default Universal Credits Model subscription. Any tenancy joining the organization will automatically get assigned this subscription, if a subscription is not explictly assigned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultUcmSubscriptionId")
        private String defaultUcmSubscriptionId;

        /**
         * OCID of the default Universal Credits Model subscription. Any tenancy joining the organization will automatically get assigned this subscription, if a subscription is not explictly assigned.
         * @param defaultUcmSubscriptionId the value to set
         * @return this builder
         **/
        public Builder defaultUcmSubscriptionId(String defaultUcmSubscriptionId) {
            this.defaultUcmSubscriptionId = defaultUcmSubscriptionId;
            this.__explicitlySet__.add("defaultUcmSubscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOrganizationDetails build() {
            UpdateOrganizationDetails model =
                    new UpdateOrganizationDetails(this.defaultUcmSubscriptionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOrganizationDetails model) {
            if (model.wasPropertyExplicitlySet("defaultUcmSubscriptionId")) {
                this.defaultUcmSubscriptionId(model.getDefaultUcmSubscriptionId());
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

    /**
     * OCID of the default Universal Credits Model subscription. Any tenancy joining the organization will automatically get assigned this subscription, if a subscription is not explictly assigned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultUcmSubscriptionId")
    private final String defaultUcmSubscriptionId;

    /**
     * OCID of the default Universal Credits Model subscription. Any tenancy joining the organization will automatically get assigned this subscription, if a subscription is not explictly assigned.
     * @return the value
     **/
    public String getDefaultUcmSubscriptionId() {
        return defaultUcmSubscriptionId;
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
        sb.append("UpdateOrganizationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("defaultUcmSubscriptionId=")
                .append(String.valueOf(this.defaultUcmSubscriptionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOrganizationDetails)) {
            return false;
        }

        UpdateOrganizationDetails other = (UpdateOrganizationDetails) o;
        return java.util.Objects.equals(
                        this.defaultUcmSubscriptionId, other.defaultUcmSubscriptionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.defaultUcmSubscriptionId == null
                                ? 43
                                : this.defaultUcmSubscriptionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
