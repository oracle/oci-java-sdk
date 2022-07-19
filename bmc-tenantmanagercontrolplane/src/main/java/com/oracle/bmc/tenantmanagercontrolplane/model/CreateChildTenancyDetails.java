/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * The parameters for creating a child tenancy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateChildTenancyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateChildTenancyDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "tenancyName",
        "homeRegion",
        "adminEmail",
        "policyName"
    })
    public CreateChildTenancyDetails(
            String compartmentId,
            String tenancyName,
            String homeRegion,
            String adminEmail,
            String policyName) {
        super();
        this.compartmentId = compartmentId;
        this.tenancyName = tenancyName;
        this.homeRegion = homeRegion;
        this.adminEmail = adminEmail;
        this.policyName = policyName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The tenancy ID of the parent tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The tenancy ID of the parent tenancy.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The tenancy name to use for the child tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
        private String tenancyName;

        /**
         * The tenancy name to use for the child tenancy.
         * @param tenancyName the value to set
         * @return this builder
         **/
        public Builder tenancyName(String tenancyName) {
            this.tenancyName = tenancyName;
            this.__explicitlySet__.add("tenancyName");
            return this;
        }
        /**
         * The home region to use for the child tenancy. This must be a region where the parent tenancy is subscribed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("homeRegion")
        private String homeRegion;

        /**
         * The home region to use for the child tenancy. This must be a region where the parent tenancy is subscribed.
         * @param homeRegion the value to set
         * @return this builder
         **/
        public Builder homeRegion(String homeRegion) {
            this.homeRegion = homeRegion;
            this.__explicitlySet__.add("homeRegion");
            return this;
        }
        /**
         * The email address of the administrator of the child tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
        private String adminEmail;

        /**
         * The email address of the administrator of the child tenancy.
         * @param adminEmail the value to set
         * @return this builder
         **/
        public Builder adminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            this.__explicitlySet__.add("adminEmail");
            return this;
        }
        /**
         * The name to use for the administrator policy in the child tenancy. Must contain only letters and underscores.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policyName")
        private String policyName;

        /**
         * The name to use for the administrator policy in the child tenancy. Must contain only letters and underscores.
         * @param policyName the value to set
         * @return this builder
         **/
        public Builder policyName(String policyName) {
            this.policyName = policyName;
            this.__explicitlySet__.add("policyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateChildTenancyDetails build() {
            CreateChildTenancyDetails __instance__ =
                    new CreateChildTenancyDetails(
                            compartmentId, tenancyName, homeRegion, adminEmail, policyName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateChildTenancyDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .tenancyName(o.getTenancyName())
                            .homeRegion(o.getHomeRegion())
                            .adminEmail(o.getAdminEmail())
                            .policyName(o.getPolicyName());

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

    /**
     * The tenancy ID of the parent tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The tenancy ID of the parent tenancy.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The tenancy name to use for the child tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
    private final String tenancyName;

    /**
     * The tenancy name to use for the child tenancy.
     * @return the value
     **/
    public String getTenancyName() {
        return tenancyName;
    }

    /**
     * The home region to use for the child tenancy. This must be a region where the parent tenancy is subscribed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("homeRegion")
    private final String homeRegion;

    /**
     * The home region to use for the child tenancy. This must be a region where the parent tenancy is subscribed.
     * @return the value
     **/
    public String getHomeRegion() {
        return homeRegion;
    }

    /**
     * The email address of the administrator of the child tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
    private final String adminEmail;

    /**
     * The email address of the administrator of the child tenancy.
     * @return the value
     **/
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * The name to use for the administrator policy in the child tenancy. Must contain only letters and underscores.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyName")
    private final String policyName;

    /**
     * The name to use for the administrator policy in the child tenancy. Must contain only letters and underscores.
     * @return the value
     **/
    public String getPolicyName() {
        return policyName;
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
        sb.append("CreateChildTenancyDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", tenancyName=").append(String.valueOf(this.tenancyName));
        sb.append(", homeRegion=").append(String.valueOf(this.homeRegion));
        sb.append(", adminEmail=").append(String.valueOf(this.adminEmail));
        sb.append(", policyName=").append(String.valueOf(this.policyName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateChildTenancyDetails)) {
            return false;
        }

        CreateChildTenancyDetails other = (CreateChildTenancyDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.tenancyName, other.tenancyName)
                && java.util.Objects.equals(this.homeRegion, other.homeRegion)
                && java.util.Objects.equals(this.adminEmail, other.adminEmail)
                && java.util.Objects.equals(this.policyName, other.policyName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.tenancyName == null ? 43 : this.tenancyName.hashCode());
        result = (result * PRIME) + (this.homeRegion == null ? 43 : this.homeRegion.hashCode());
        result = (result * PRIME) + (this.adminEmail == null ? 43 : this.adminEmail.hashCode());
        result = (result * PRIME) + (this.policyName == null ? 43 : this.policyName.hashCode());
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
