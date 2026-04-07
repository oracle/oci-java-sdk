/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * An object that defines the set of rules that identifies the target instances in a dynamic set.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MatchingRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MatchingRule extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tags",
        "managedInstanceIds",
        "managedInstanceGroupIds",
        "displayNames",
        "osNames",
        "architectures",
        "osFamilies",
        "statuses",
        "locations",
        "isRebootRequired"
    })
    public MatchingRule(
            java.util.List<Tag> tags,
            java.util.List<String> managedInstanceIds,
            java.util.List<String> managedInstanceGroupIds,
            java.util.List<String> displayNames,
            java.util.List<OsName> osNames,
            java.util.List<CpuArchType> architectures,
            java.util.List<OsFamily> osFamilies,
            java.util.List<ManagedInstanceStatus> statuses,
            java.util.List<ManagedInstanceLocation> locations,
            Boolean isRebootRequired) {
        super();
        this.tags = tags;
        this.managedInstanceIds = managedInstanceIds;
        this.managedInstanceGroupIds = managedInstanceGroupIds;
        this.displayNames = displayNames;
        this.osNames = osNames;
        this.architectures = architectures;
        this.osFamilies = osFamilies;
        this.statuses = statuses;
        this.locations = locations;
        this.isRebootRequired = isRebootRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of the managed instance tags. */
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tag> tags;

        /**
         * The list of the managed instance tags.
         *
         * @param tags the value to set
         * @return this builder
         */
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }
        /** The list of managed instance ids. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
        private java.util.List<String> managedInstanceIds;

        /**
         * The list of managed instance ids.
         *
         * @param managedInstanceIds the value to set
         * @return this builder
         */
        public Builder managedInstanceIds(java.util.List<String> managedInstanceIds) {
            this.managedInstanceIds = managedInstanceIds;
            this.__explicitlySet__.add("managedInstanceIds");
            return this;
        }
        /** The list of managed instance group IDs. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroupIds")
        private java.util.List<String> managedInstanceGroupIds;

        /**
         * The list of managed instance group IDs.
         *
         * @param managedInstanceGroupIds the value to set
         * @return this builder
         */
        public Builder managedInstanceGroupIds(java.util.List<String> managedInstanceGroupIds) {
            this.managedInstanceGroupIds = managedInstanceGroupIds;
            this.__explicitlySet__.add("managedInstanceGroupIds");
            return this;
        }
        /** The list of managed instance display names. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayNames")
        private java.util.List<String> displayNames;

        /**
         * The list of managed instance display names.
         *
         * @param displayNames the value to set
         * @return this builder
         */
        public Builder displayNames(java.util.List<String> displayNames) {
            this.displayNames = displayNames;
            this.__explicitlySet__.add("displayNames");
            return this;
        }
        /** The list of managed instance OS names. */
        @com.fasterxml.jackson.annotation.JsonProperty("osNames")
        private java.util.List<OsName> osNames;

        /**
         * The list of managed instance OS names.
         *
         * @param osNames the value to set
         * @return this builder
         */
        public Builder osNames(java.util.List<OsName> osNames) {
            this.osNames = osNames;
            this.__explicitlySet__.add("osNames");
            return this;
        }
        /** The list of managed instance architectures. */
        @com.fasterxml.jackson.annotation.JsonProperty("architectures")
        private java.util.List<CpuArchType> architectures;

        /**
         * The list of managed instance architectures.
         *
         * @param architectures the value to set
         * @return this builder
         */
        public Builder architectures(java.util.List<CpuArchType> architectures) {
            this.architectures = architectures;
            this.__explicitlySet__.add("architectures");
            return this;
        }
        /** The list of managed instance OS families. */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamilies")
        private java.util.List<OsFamily> osFamilies;

        /**
         * The list of managed instance OS families.
         *
         * @param osFamilies the value to set
         * @return this builder
         */
        public Builder osFamilies(java.util.List<OsFamily> osFamilies) {
            this.osFamilies = osFamilies;
            this.__explicitlySet__.add("osFamilies");
            return this;
        }
        /** The list of managed instance statuses. */
        @com.fasterxml.jackson.annotation.JsonProperty("statuses")
        private java.util.List<ManagedInstanceStatus> statuses;

        /**
         * The list of managed instance statuses.
         *
         * @param statuses the value to set
         * @return this builder
         */
        public Builder statuses(java.util.List<ManagedInstanceStatus> statuses) {
            this.statuses = statuses;
            this.__explicitlySet__.add("statuses");
            return this;
        }
        /** The list of managed instance locations. */
        @com.fasterxml.jackson.annotation.JsonProperty("locations")
        private java.util.List<ManagedInstanceLocation> locations;

        /**
         * The list of managed instance locations.
         *
         * @param locations the value to set
         * @return this builder
         */
        public Builder locations(java.util.List<ManagedInstanceLocation> locations) {
            this.locations = locations;
            this.__explicitlySet__.add("locations");
            return this;
        }
        /** Indicates if the managed instance needs to be rebooted. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequired")
        private Boolean isRebootRequired;

        /**
         * Indicates if the managed instance needs to be rebooted.
         *
         * @param isRebootRequired the value to set
         * @return this builder
         */
        public Builder isRebootRequired(Boolean isRebootRequired) {
            this.isRebootRequired = isRebootRequired;
            this.__explicitlySet__.add("isRebootRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MatchingRule build() {
            MatchingRule model =
                    new MatchingRule(
                            this.tags,
                            this.managedInstanceIds,
                            this.managedInstanceGroupIds,
                            this.displayNames,
                            this.osNames,
                            this.architectures,
                            this.osFamilies,
                            this.statuses,
                            this.locations,
                            this.isRebootRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MatchingRule model) {
            if (model.wasPropertyExplicitlySet("tags")) {
                this.tags(model.getTags());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceIds")) {
                this.managedInstanceIds(model.getManagedInstanceIds());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceGroupIds")) {
                this.managedInstanceGroupIds(model.getManagedInstanceGroupIds());
            }
            if (model.wasPropertyExplicitlySet("displayNames")) {
                this.displayNames(model.getDisplayNames());
            }
            if (model.wasPropertyExplicitlySet("osNames")) {
                this.osNames(model.getOsNames());
            }
            if (model.wasPropertyExplicitlySet("architectures")) {
                this.architectures(model.getArchitectures());
            }
            if (model.wasPropertyExplicitlySet("osFamilies")) {
                this.osFamilies(model.getOsFamilies());
            }
            if (model.wasPropertyExplicitlySet("statuses")) {
                this.statuses(model.getStatuses());
            }
            if (model.wasPropertyExplicitlySet("locations")) {
                this.locations(model.getLocations());
            }
            if (model.wasPropertyExplicitlySet("isRebootRequired")) {
                this.isRebootRequired(model.getIsRebootRequired());
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

    /** The list of the managed instance tags. */
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<Tag> tags;

    /**
     * The list of the managed instance tags.
     *
     * @return the value
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /** The list of managed instance ids. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
    private final java.util.List<String> managedInstanceIds;

    /**
     * The list of managed instance ids.
     *
     * @return the value
     */
    public java.util.List<String> getManagedInstanceIds() {
        return managedInstanceIds;
    }

    /** The list of managed instance group IDs. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceGroupIds")
    private final java.util.List<String> managedInstanceGroupIds;

    /**
     * The list of managed instance group IDs.
     *
     * @return the value
     */
    public java.util.List<String> getManagedInstanceGroupIds() {
        return managedInstanceGroupIds;
    }

    /** The list of managed instance display names. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayNames")
    private final java.util.List<String> displayNames;

    /**
     * The list of managed instance display names.
     *
     * @return the value
     */
    public java.util.List<String> getDisplayNames() {
        return displayNames;
    }

    /** The list of managed instance OS names. */
    @com.fasterxml.jackson.annotation.JsonProperty("osNames")
    private final java.util.List<OsName> osNames;

    /**
     * The list of managed instance OS names.
     *
     * @return the value
     */
    public java.util.List<OsName> getOsNames() {
        return osNames;
    }

    /** The list of managed instance architectures. */
    @com.fasterxml.jackson.annotation.JsonProperty("architectures")
    private final java.util.List<CpuArchType> architectures;

    /**
     * The list of managed instance architectures.
     *
     * @return the value
     */
    public java.util.List<CpuArchType> getArchitectures() {
        return architectures;
    }

    /** The list of managed instance OS families. */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamilies")
    private final java.util.List<OsFamily> osFamilies;

    /**
     * The list of managed instance OS families.
     *
     * @return the value
     */
    public java.util.List<OsFamily> getOsFamilies() {
        return osFamilies;
    }

    /** The list of managed instance statuses. */
    @com.fasterxml.jackson.annotation.JsonProperty("statuses")
    private final java.util.List<ManagedInstanceStatus> statuses;

    /**
     * The list of managed instance statuses.
     *
     * @return the value
     */
    public java.util.List<ManagedInstanceStatus> getStatuses() {
        return statuses;
    }

    /** The list of managed instance locations. */
    @com.fasterxml.jackson.annotation.JsonProperty("locations")
    private final java.util.List<ManagedInstanceLocation> locations;

    /**
     * The list of managed instance locations.
     *
     * @return the value
     */
    public java.util.List<ManagedInstanceLocation> getLocations() {
        return locations;
    }

    /** Indicates if the managed instance needs to be rebooted. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequired")
    private final Boolean isRebootRequired;

    /**
     * Indicates if the managed instance needs to be rebooted.
     *
     * @return the value
     */
    public Boolean getIsRebootRequired() {
        return isRebootRequired;
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
        sb.append("MatchingRule(");
        sb.append("super=").append(super.toString());
        sb.append("tags=").append(String.valueOf(this.tags));
        sb.append(", managedInstanceIds=").append(String.valueOf(this.managedInstanceIds));
        sb.append(", managedInstanceGroupIds=")
                .append(String.valueOf(this.managedInstanceGroupIds));
        sb.append(", displayNames=").append(String.valueOf(this.displayNames));
        sb.append(", osNames=").append(String.valueOf(this.osNames));
        sb.append(", architectures=").append(String.valueOf(this.architectures));
        sb.append(", osFamilies=").append(String.valueOf(this.osFamilies));
        sb.append(", statuses=").append(String.valueOf(this.statuses));
        sb.append(", locations=").append(String.valueOf(this.locations));
        sb.append(", isRebootRequired=").append(String.valueOf(this.isRebootRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MatchingRule)) {
            return false;
        }

        MatchingRule other = (MatchingRule) o;
        return java.util.Objects.equals(this.tags, other.tags)
                && java.util.Objects.equals(this.managedInstanceIds, other.managedInstanceIds)
                && java.util.Objects.equals(
                        this.managedInstanceGroupIds, other.managedInstanceGroupIds)
                && java.util.Objects.equals(this.displayNames, other.displayNames)
                && java.util.Objects.equals(this.osNames, other.osNames)
                && java.util.Objects.equals(this.architectures, other.architectures)
                && java.util.Objects.equals(this.osFamilies, other.osFamilies)
                && java.util.Objects.equals(this.statuses, other.statuses)
                && java.util.Objects.equals(this.locations, other.locations)
                && java.util.Objects.equals(this.isRebootRequired, other.isRebootRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceIds == null
                                ? 43
                                : this.managedInstanceIds.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceGroupIds == null
                                ? 43
                                : this.managedInstanceGroupIds.hashCode());
        result = (result * PRIME) + (this.displayNames == null ? 43 : this.displayNames.hashCode());
        result = (result * PRIME) + (this.osNames == null ? 43 : this.osNames.hashCode());
        result =
                (result * PRIME)
                        + (this.architectures == null ? 43 : this.architectures.hashCode());
        result = (result * PRIME) + (this.osFamilies == null ? 43 : this.osFamilies.hashCode());
        result = (result * PRIME) + (this.statuses == null ? 43 : this.statuses.hashCode());
        result = (result * PRIME) + (this.locations == null ? 43 : this.locations.hashCode());
        result =
                (result * PRIME)
                        + (this.isRebootRequired == null ? 43 : this.isRebootRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
