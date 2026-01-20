/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Details of a group in a DR plan. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DrPlanGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrPlanGroup extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "type",
        "refreshStatus",
        "displayName",
        "isPauseEnabled",
        "steps"
    })
    public DrPlanGroup(
            String id,
            DrPlanGroupType type,
            DrPlanGroupRefreshStatus refreshStatus,
            String displayName,
            Boolean isPauseEnabled,
            java.util.List<DrPlanStep> steps) {
        super();
        this.id = id;
        this.type = type;
        this.refreshStatus = refreshStatus;
        this.displayName = displayName;
        this.isPauseEnabled = isPauseEnabled;
        this.steps = steps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique id of the group. Must not be modified by user.
         *
         * <p>Example: {@code sgid1.group..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique id of the group. Must not be modified by user.
         *
         * <p>Example: {@code sgid1.group..uniqueID}
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The group type.
         *
         * <p>Example: {@code BUILT_IN}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private DrPlanGroupType type;

        /**
         * The group type.
         *
         * <p>Example: {@code BUILT_IN}
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(DrPlanGroupType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The DR plan group refresh status.
         *
         * <p>Example: {@code GROUP_MODIFIED}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("refreshStatus")
        private DrPlanGroupRefreshStatus refreshStatus;

        /**
         * The DR plan group refresh status.
         *
         * <p>Example: {@code GROUP_MODIFIED}
         *
         * @param refreshStatus the value to set
         * @return this builder
         */
        public Builder refreshStatus(DrPlanGroupRefreshStatus refreshStatus) {
            this.refreshStatus = refreshStatus;
            this.__explicitlySet__.add("refreshStatus");
            return this;
        }
        /**
         * The display name of the group.
         *
         * <p>Example: {@code DATABASE_SWITCHOVER}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the group.
         *
         * <p>Example: {@code DATABASE_SWITCHOVER}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A flag indicating whether this group should be enabled for execution. This flag is only
         * applicable to the {@code USER_DEFINED_PAUSE} group. The flag should be null for the
         * remaining group types.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPauseEnabled")
        private Boolean isPauseEnabled;

        /**
         * A flag indicating whether this group should be enabled for execution. This flag is only
         * applicable to the {@code USER_DEFINED_PAUSE} group. The flag should be null for the
         * remaining group types.
         *
         * <p>Example: {@code true}
         *
         * @param isPauseEnabled the value to set
         * @return this builder
         */
        public Builder isPauseEnabled(Boolean isPauseEnabled) {
            this.isPauseEnabled = isPauseEnabled;
            this.__explicitlySet__.add("isPauseEnabled");
            return this;
        }
        /** The list of steps in the group. */
        @com.fasterxml.jackson.annotation.JsonProperty("steps")
        private java.util.List<DrPlanStep> steps;

        /**
         * The list of steps in the group.
         *
         * @param steps the value to set
         * @return this builder
         */
        public Builder steps(java.util.List<DrPlanStep> steps) {
            this.steps = steps;
            this.__explicitlySet__.add("steps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrPlanGroup build() {
            DrPlanGroup model =
                    new DrPlanGroup(
                            this.id,
                            this.type,
                            this.refreshStatus,
                            this.displayName,
                            this.isPauseEnabled,
                            this.steps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrPlanGroup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("refreshStatus")) {
                this.refreshStatus(model.getRefreshStatus());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isPauseEnabled")) {
                this.isPauseEnabled(model.getIsPauseEnabled());
            }
            if (model.wasPropertyExplicitlySet("steps")) {
                this.steps(model.getSteps());
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
     * The unique id of the group. Must not be modified by user.
     *
     * <p>Example: {@code sgid1.group..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique id of the group. Must not be modified by user.
     *
     * <p>Example: {@code sgid1.group..uniqueID}
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The group type.
     *
     * <p>Example: {@code BUILT_IN}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final DrPlanGroupType type;

    /**
     * The group type.
     *
     * <p>Example: {@code BUILT_IN}
     *
     * @return the value
     */
    public DrPlanGroupType getType() {
        return type;
    }

    /**
     * The DR plan group refresh status.
     *
     * <p>Example: {@code GROUP_MODIFIED}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("refreshStatus")
    private final DrPlanGroupRefreshStatus refreshStatus;

    /**
     * The DR plan group refresh status.
     *
     * <p>Example: {@code GROUP_MODIFIED}
     *
     * @return the value
     */
    public DrPlanGroupRefreshStatus getRefreshStatus() {
        return refreshStatus;
    }

    /**
     * The display name of the group.
     *
     * <p>Example: {@code DATABASE_SWITCHOVER}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the group.
     *
     * <p>Example: {@code DATABASE_SWITCHOVER}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A flag indicating whether this group should be enabled for execution. This flag is only
     * applicable to the {@code USER_DEFINED_PAUSE} group. The flag should be null for the remaining
     * group types.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPauseEnabled")
    private final Boolean isPauseEnabled;

    /**
     * A flag indicating whether this group should be enabled for execution. This flag is only
     * applicable to the {@code USER_DEFINED_PAUSE} group. The flag should be null for the remaining
     * group types.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsPauseEnabled() {
        return isPauseEnabled;
    }

    /** The list of steps in the group. */
    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    private final java.util.List<DrPlanStep> steps;

    /**
     * The list of steps in the group.
     *
     * @return the value
     */
    public java.util.List<DrPlanStep> getSteps() {
        return steps;
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
        sb.append("DrPlanGroup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", refreshStatus=").append(String.valueOf(this.refreshStatus));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isPauseEnabled=").append(String.valueOf(this.isPauseEnabled));
        sb.append(", steps=").append(String.valueOf(this.steps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanGroup)) {
            return false;
        }

        DrPlanGroup other = (DrPlanGroup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.refreshStatus, other.refreshStatus)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isPauseEnabled, other.isPauseEnabled)
                && java.util.Objects.equals(this.steps, other.steps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshStatus == null ? 43 : this.refreshStatus.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.isPauseEnabled == null ? 43 : this.isPauseEnabled.hashCode());
        result = (result * PRIME) + (this.steps == null ? 43 : this.steps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
