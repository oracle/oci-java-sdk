/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Summary of Fleet part of the Schedule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScheduledFleetSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScheduledFleetSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "tenancyId",
        "displayName",
        "countOfAffectedResources",
        "countOfAffectedTargets",
        "actionGroupTypes",
        "applicationTypes",
        "systemTags"
    })
    public ScheduledFleetSummary(
            String id,
            String tenancyId,
            String displayName,
            Integer countOfAffectedResources,
            Integer countOfAffectedTargets,
            java.util.List<LifeCycleActionGroupType> actionGroupTypes,
            java.util.List<String> applicationTypes,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.tenancyId = tenancyId;
        this.displayName = displayName;
        this.countOfAffectedResources = countOfAffectedResources;
        this.countOfAffectedTargets = countOfAffectedTargets;
        this.actionGroupTypes = actionGroupTypes;
        this.applicationTypes = applicationTypes;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * OCID of the tenancy to which the resource belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * OCID of the tenancy to which the resource belongs to.
         * @param tenancyId the value to set
         * @return this builder
         **/
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Count of Resources affected by the Schedule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("countOfAffectedResources")
        private Integer countOfAffectedResources;

        /**
         * Count of Resources affected by the Schedule
         * @param countOfAffectedResources the value to set
         * @return this builder
         **/
        public Builder countOfAffectedResources(Integer countOfAffectedResources) {
            this.countOfAffectedResources = countOfAffectedResources;
            this.__explicitlySet__.add("countOfAffectedResources");
            return this;
        }
        /**
         * Count of Targets affected by the Schedule
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("countOfAffectedTargets")
        private Integer countOfAffectedTargets;

        /**
         * Count of Targets affected by the Schedule
         * @param countOfAffectedTargets the value to set
         * @return this builder
         **/
        public Builder countOfAffectedTargets(Integer countOfAffectedTargets) {
            this.countOfAffectedTargets = countOfAffectedTargets;
            this.__explicitlySet__.add("countOfAffectedTargets");
            return this;
        }
        /**
         * All ActionGroup Types part of the schedule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionGroupTypes")
        private java.util.List<LifeCycleActionGroupType> actionGroupTypes;

        /**
         * All ActionGroup Types part of the schedule.
         * @param actionGroupTypes the value to set
         * @return this builder
         **/
        public Builder actionGroupTypes(java.util.List<LifeCycleActionGroupType> actionGroupTypes) {
            this.actionGroupTypes = actionGroupTypes;
            this.__explicitlySet__.add("actionGroupTypes");
            return this;
        }
        /**
         * All application types part of the schedule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationTypes")
        private java.util.List<String> applicationTypes;

        /**
         * All application types part of the schedule.
         * @param applicationTypes the value to set
         * @return this builder
         **/
        public Builder applicationTypes(java.util.List<String> applicationTypes) {
            this.applicationTypes = applicationTypes;
            this.__explicitlySet__.add("applicationTypes");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduledFleetSummary build() {
            ScheduledFleetSummary model =
                    new ScheduledFleetSummary(
                            this.id,
                            this.tenancyId,
                            this.displayName,
                            this.countOfAffectedResources,
                            this.countOfAffectedTargets,
                            this.actionGroupTypes,
                            this.applicationTypes,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduledFleetSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("countOfAffectedResources")) {
                this.countOfAffectedResources(model.getCountOfAffectedResources());
            }
            if (model.wasPropertyExplicitlySet("countOfAffectedTargets")) {
                this.countOfAffectedTargets(model.getCountOfAffectedTargets());
            }
            if (model.wasPropertyExplicitlySet("actionGroupTypes")) {
                this.actionGroupTypes(model.getActionGroupTypes());
            }
            if (model.wasPropertyExplicitlySet("applicationTypes")) {
                this.applicationTypes(model.getApplicationTypes());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The OCID of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * OCID of the tenancy to which the resource belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * OCID of the tenancy to which the resource belongs to.
     * @return the value
     **/
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Count of Resources affected by the Schedule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countOfAffectedResources")
    private final Integer countOfAffectedResources;

    /**
     * Count of Resources affected by the Schedule
     * @return the value
     **/
    public Integer getCountOfAffectedResources() {
        return countOfAffectedResources;
    }

    /**
     * Count of Targets affected by the Schedule
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countOfAffectedTargets")
    private final Integer countOfAffectedTargets;

    /**
     * Count of Targets affected by the Schedule
     * @return the value
     **/
    public Integer getCountOfAffectedTargets() {
        return countOfAffectedTargets;
    }

    /**
     * All ActionGroup Types part of the schedule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionGroupTypes")
    private final java.util.List<LifeCycleActionGroupType> actionGroupTypes;

    /**
     * All ActionGroup Types part of the schedule.
     * @return the value
     **/
    public java.util.List<LifeCycleActionGroupType> getActionGroupTypes() {
        return actionGroupTypes;
    }

    /**
     * All application types part of the schedule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationTypes")
    private final java.util.List<String> applicationTypes;

    /**
     * All application types part of the schedule.
     * @return the value
     **/
    public java.util.List<String> getApplicationTypes() {
        return applicationTypes;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ScheduledFleetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", countOfAffectedResources=")
                .append(String.valueOf(this.countOfAffectedResources));
        sb.append(", countOfAffectedTargets=").append(String.valueOf(this.countOfAffectedTargets));
        sb.append(", actionGroupTypes=").append(String.valueOf(this.actionGroupTypes));
        sb.append(", applicationTypes=").append(String.valueOf(this.applicationTypes));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduledFleetSummary)) {
            return false;
        }

        ScheduledFleetSummary other = (ScheduledFleetSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.countOfAffectedResources, other.countOfAffectedResources)
                && java.util.Objects.equals(
                        this.countOfAffectedTargets, other.countOfAffectedTargets)
                && java.util.Objects.equals(this.actionGroupTypes, other.actionGroupTypes)
                && java.util.Objects.equals(this.applicationTypes, other.applicationTypes)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.countOfAffectedResources == null
                                ? 43
                                : this.countOfAffectedResources.hashCode());
        result =
                (result * PRIME)
                        + (this.countOfAffectedTargets == null
                                ? 43
                                : this.countOfAffectedTargets.hashCode());
        result =
                (result * PRIME)
                        + (this.actionGroupTypes == null ? 43 : this.actionGroupTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationTypes == null ? 43 : this.applicationTypes.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
