/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateChildTenancyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateChildTenancyDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "tenancyName",
        "homeRegion",
        "adminEmail",
        "policyName",
        "governanceStatus",
        "subscriptionId"
    })
    public CreateChildTenancyDetails(
            String compartmentId,
            String tenancyName,
            String homeRegion,
            String adminEmail,
            String policyName,
            GovernanceStatus governanceStatus,
            String subscriptionId) {
        super();
        this.compartmentId = compartmentId;
        this.tenancyName = tenancyName;
        this.homeRegion = homeRegion;
        this.adminEmail = adminEmail;
        this.policyName = policyName;
        this.governanceStatus = governanceStatus;
        this.subscriptionId = subscriptionId;
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
         * Email address of the child tenancy administrator.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
        private String adminEmail;

        /**
         * Email address of the child tenancy administrator.
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
        /**
         * The governance status of the child tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("governanceStatus")
        private GovernanceStatus governanceStatus;

        /**
         * The governance status of the child tenancy.
         * @param governanceStatus the value to set
         * @return this builder
         **/
        public Builder governanceStatus(GovernanceStatus governanceStatus) {
            this.governanceStatus = governanceStatus;
            this.__explicitlySet__.add("governanceStatus");
            return this;
        }
        /**
         * OCID of the subscription that needs to be assigned to the child tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * OCID of the subscription that needs to be assigned to the child tenancy.
         * @param subscriptionId the value to set
         * @return this builder
         **/
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateChildTenancyDetails build() {
            CreateChildTenancyDetails model =
                    new CreateChildTenancyDetails(
                            this.compartmentId,
                            this.tenancyName,
                            this.homeRegion,
                            this.adminEmail,
                            this.policyName,
                            this.governanceStatus,
                            this.subscriptionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateChildTenancyDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("tenancyName")) {
                this.tenancyName(model.getTenancyName());
            }
            if (model.wasPropertyExplicitlySet("homeRegion")) {
                this.homeRegion(model.getHomeRegion());
            }
            if (model.wasPropertyExplicitlySet("adminEmail")) {
                this.adminEmail(model.getAdminEmail());
            }
            if (model.wasPropertyExplicitlySet("policyName")) {
                this.policyName(model.getPolicyName());
            }
            if (model.wasPropertyExplicitlySet("governanceStatus")) {
                this.governanceStatus(model.getGovernanceStatus());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
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
     * Email address of the child tenancy administrator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
    private final String adminEmail;

    /**
     * Email address of the child tenancy administrator.
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

    /**
     * The governance status of the child tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("governanceStatus")
    private final GovernanceStatus governanceStatus;

    /**
     * The governance status of the child tenancy.
     * @return the value
     **/
    public GovernanceStatus getGovernanceStatus() {
        return governanceStatus;
    }

    /**
     * OCID of the subscription that needs to be assigned to the child tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * OCID of the subscription that needs to be assigned to the child tenancy.
     * @return the value
     **/
    public String getSubscriptionId() {
        return subscriptionId;
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
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", tenancyName=").append(String.valueOf(this.tenancyName));
        sb.append(", homeRegion=").append(String.valueOf(this.homeRegion));
        sb.append(", adminEmail=").append(String.valueOf(this.adminEmail));
        sb.append(", policyName=").append(String.valueOf(this.policyName));
        sb.append(", governanceStatus=").append(String.valueOf(this.governanceStatus));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
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
                && java.util.Objects.equals(this.governanceStatus, other.governanceStatus)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && super.equals(other);
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
                        + (this.governanceStatus == null ? 43 : this.governanceStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
