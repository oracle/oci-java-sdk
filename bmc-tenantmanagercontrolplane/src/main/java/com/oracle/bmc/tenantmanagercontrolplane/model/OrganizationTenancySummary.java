/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * An organization tenancy summary entity. <br>
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
        builder = OrganizationTenancySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OrganizationTenancySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tenancyId",
        "name",
        "lifecycleState",
        "role",
        "timeJoined",
        "timeLeft",
        "isApprovedForTransfer",
        "governanceStatus",
        "systemTags"
    })
    public OrganizationTenancySummary(
            String tenancyId,
            String name,
            OrganizationTenancyLifecycleState lifecycleState,
            OrganizationTenancyRole role,
            java.util.Date timeJoined,
            java.util.Date timeLeft,
            Boolean isApprovedForTransfer,
            GovernanceStatus governanceStatus,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.tenancyId = tenancyId;
        this.name = name;
        this.lifecycleState = lifecycleState;
        this.role = role;
        this.timeJoined = timeJoined;
        this.timeLeft = timeLeft;
        this.isApprovedForTransfer = isApprovedForTransfer;
        this.governanceStatus = governanceStatus;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * OCID of the tenancy.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /** Name of the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the tenancy.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Lifecycle state of the organization tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OrganizationTenancyLifecycleState lifecycleState;

        /**
         * Lifecycle state of the organization tenancy.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(OrganizationTenancyLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Role of the organization tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private OrganizationTenancyRole role;

        /**
         * Role of the organization tenancy.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(OrganizationTenancyRole role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /** Date and time when the tenancy joined the organization. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeJoined")
        private java.util.Date timeJoined;

        /**
         * Date and time when the tenancy joined the organization.
         *
         * @param timeJoined the value to set
         * @return this builder
         */
        public Builder timeJoined(java.util.Date timeJoined) {
            this.timeJoined = timeJoined;
            this.__explicitlySet__.add("timeJoined");
            return this;
        }
        /** Date and time when the tenancy left the organization. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLeft")
        private java.util.Date timeLeft;

        /**
         * Date and time when the tenancy left the organization.
         *
         * @param timeLeft the value to set
         * @return this builder
         */
        public Builder timeLeft(java.util.Date timeLeft) {
            this.timeLeft = timeLeft;
            this.__explicitlySet__.add("timeLeft");
            return this;
        }
        /** Parameter to indicate the tenancy is approved for transfer to another organization. */
        @com.fasterxml.jackson.annotation.JsonProperty("isApprovedForTransfer")
        private Boolean isApprovedForTransfer;

        /**
         * Parameter to indicate the tenancy is approved for transfer to another organization.
         *
         * @param isApprovedForTransfer the value to set
         * @return this builder
         */
        public Builder isApprovedForTransfer(Boolean isApprovedForTransfer) {
            this.isApprovedForTransfer = isApprovedForTransfer;
            this.__explicitlySet__.add("isApprovedForTransfer");
            return this;
        }
        /** The governance status of the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("governanceStatus")
        private GovernanceStatus governanceStatus;

        /**
         * The governance status of the tenancy.
         *
         * @param governanceStatus the value to set
         * @return this builder
         */
        public Builder governanceStatus(GovernanceStatus governanceStatus) {
            this.governanceStatus = governanceStatus;
            this.__explicitlySet__.add("governanceStatus");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OrganizationTenancySummary build() {
            OrganizationTenancySummary model =
                    new OrganizationTenancySummary(
                            this.tenancyId,
                            this.name,
                            this.lifecycleState,
                            this.role,
                            this.timeJoined,
                            this.timeLeft,
                            this.isApprovedForTransfer,
                            this.governanceStatus,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OrganizationTenancySummary model) {
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("timeJoined")) {
                this.timeJoined(model.getTimeJoined());
            }
            if (model.wasPropertyExplicitlySet("timeLeft")) {
                this.timeLeft(model.getTimeLeft());
            }
            if (model.wasPropertyExplicitlySet("isApprovedForTransfer")) {
                this.isApprovedForTransfer(model.getIsApprovedForTransfer());
            }
            if (model.wasPropertyExplicitlySet("governanceStatus")) {
                this.governanceStatus(model.getGovernanceStatus());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** OCID of the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * OCID of the tenancy.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
    }

    /** Name of the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the tenancy.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Lifecycle state of the organization tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OrganizationTenancyLifecycleState lifecycleState;

    /**
     * Lifecycle state of the organization tenancy.
     *
     * @return the value
     */
    public OrganizationTenancyLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Role of the organization tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final OrganizationTenancyRole role;

    /**
     * Role of the organization tenancy.
     *
     * @return the value
     */
    public OrganizationTenancyRole getRole() {
        return role;
    }

    /** Date and time when the tenancy joined the organization. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeJoined")
    private final java.util.Date timeJoined;

    /**
     * Date and time when the tenancy joined the organization.
     *
     * @return the value
     */
    public java.util.Date getTimeJoined() {
        return timeJoined;
    }

    /** Date and time when the tenancy left the organization. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLeft")
    private final java.util.Date timeLeft;

    /**
     * Date and time when the tenancy left the organization.
     *
     * @return the value
     */
    public java.util.Date getTimeLeft() {
        return timeLeft;
    }

    /** Parameter to indicate the tenancy is approved for transfer to another organization. */
    @com.fasterxml.jackson.annotation.JsonProperty("isApprovedForTransfer")
    private final Boolean isApprovedForTransfer;

    /**
     * Parameter to indicate the tenancy is approved for transfer to another organization.
     *
     * @return the value
     */
    public Boolean getIsApprovedForTransfer() {
        return isApprovedForTransfer;
    }

    /** The governance status of the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("governanceStatus")
    private final GovernanceStatus governanceStatus;

    /**
     * The governance status of the tenancy.
     *
     * @return the value
     */
    public GovernanceStatus getGovernanceStatus() {
        return governanceStatus;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("OrganizationTenancySummary(");
        sb.append("super=").append(super.toString());
        sb.append("tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", timeJoined=").append(String.valueOf(this.timeJoined));
        sb.append(", timeLeft=").append(String.valueOf(this.timeLeft));
        sb.append(", isApprovedForTransfer=").append(String.valueOf(this.isApprovedForTransfer));
        sb.append(", governanceStatus=").append(String.valueOf(this.governanceStatus));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrganizationTenancySummary)) {
            return false;
        }

        OrganizationTenancySummary other = (OrganizationTenancySummary) o;
        return java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.timeJoined, other.timeJoined)
                && java.util.Objects.equals(this.timeLeft, other.timeLeft)
                && java.util.Objects.equals(this.isApprovedForTransfer, other.isApprovedForTransfer)
                && java.util.Objects.equals(this.governanceStatus, other.governanceStatus)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + (this.timeJoined == null ? 43 : this.timeJoined.hashCode());
        result = (result * PRIME) + (this.timeLeft == null ? 43 : this.timeLeft.hashCode());
        result =
                (result * PRIME)
                        + (this.isApprovedForTransfer == null
                                ? 43
                                : this.isApprovedForTransfer.hashCode());
        result =
                (result * PRIME)
                        + (this.governanceStatus == null ? 43 : this.governanceStatus.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
