/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * An organization entity.
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
    builder = OrganizationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OrganizationSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "parentName",
        "defaultUcmSubscriptionId",
        "lifecycleState",
        "timeCreated",
        "timeUpdated"
    })
    public OrganizationSummary(
            String id,
            String displayName,
            String compartmentId,
            String parentName,
            String defaultUcmSubscriptionId,
            Organization.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.parentName = parentName;
        this.defaultUcmSubscriptionId = defaultUcmSubscriptionId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the organization.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the organization.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A display name for the organization.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A display name for the organization.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * OCID of the compartment containing the organization. Always a tenancy OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment containing the organization. Always a tenancy OCID.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name of the tenancy that is the organization parent.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentName")
        private String parentName;

        /**
         * The name of the tenancy that is the organization parent.
         * @param parentName the value to set
         * @return this builder
         **/
        public Builder parentName(String parentName) {
            this.parentName = parentName;
            this.__explicitlySet__.add("parentName");
            return this;
        }
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
        /**
         * Lifecycle state of the organization.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Organization.LifecycleState lifecycleState;

        /**
         * Lifecycle state of the organization.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(Organization.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Date-time when this organization was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date-time when this organization was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Date-time when this organization was last updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date-time when this organization was last updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OrganizationSummary build() {
            OrganizationSummary __instance__ =
                    new OrganizationSummary(
                            id,
                            displayName,
                            compartmentId,
                            parentName,
                            defaultUcmSubscriptionId,
                            lifecycleState,
                            timeCreated,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OrganizationSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .parentName(o.getParentName())
                            .defaultUcmSubscriptionId(o.getDefaultUcmSubscriptionId())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated());

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
     * OCID of the organization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the organization.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A display name for the organization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A display name for the organization.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * OCID of the compartment containing the organization. Always a tenancy OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment containing the organization. Always a tenancy OCID.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the tenancy that is the organization parent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentName")
    private final String parentName;

    /**
     * The name of the tenancy that is the organization parent.
     * @return the value
     **/
    public String getParentName() {
        return parentName;
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

    /**
     * Lifecycle state of the organization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Organization.LifecycleState lifecycleState;

    /**
     * Lifecycle state of the organization.
     * @return the value
     **/
    public Organization.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Date-time when this organization was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date-time when this organization was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date-time when this organization was last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date-time when this organization was last updated.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OrganizationSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", parentName=").append(String.valueOf(this.parentName));
        sb.append(", defaultUcmSubscriptionId=")
                .append(String.valueOf(this.defaultUcmSubscriptionId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrganizationSummary)) {
            return false;
        }

        OrganizationSummary other = (OrganizationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.parentName, other.parentName)
                && java.util.Objects.equals(
                        this.defaultUcmSubscriptionId, other.defaultUcmSubscriptionId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.parentName == null ? 43 : this.parentName.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultUcmSubscriptionId == null
                                ? 43
                                : this.defaultUcmSubscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
