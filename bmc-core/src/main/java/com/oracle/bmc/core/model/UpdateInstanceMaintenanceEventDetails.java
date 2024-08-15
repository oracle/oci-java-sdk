/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Specifies the properties for updating maintenance due date.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateInstanceMaintenanceEventDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateInstanceMaintenanceEventDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeWindowStart",
        "alternativeResolutionAction",
        "canDeleteLocalStorage",
        "displayName",
        "definedTags",
        "freeformTags"
    })
    public UpdateInstanceMaintenanceEventDetails(
            java.util.Date timeWindowStart,
            InstanceMaintenanceAlternativeResolutionActions alternativeResolutionAction,
            Boolean canDeleteLocalStorage,
            String displayName,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags) {
        super();
        this.timeWindowStart = timeWindowStart;
        this.alternativeResolutionAction = alternativeResolutionAction;
        this.canDeleteLocalStorage = canDeleteLocalStorage;
        this.displayName = displayName;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The beginning of the time window when Maintenance is scheduled to begin. The Maintenance will not begin before
         * this time.
         * <p>
         * The timeWindowEnd is automatically calculated based on the maintenanceReason and the instanceAction.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeWindowStart")
        private java.util.Date timeWindowStart;

        /**
         * The beginning of the time window when Maintenance is scheduled to begin. The Maintenance will not begin before
         * this time.
         * <p>
         * The timeWindowEnd is automatically calculated based on the maintenanceReason and the instanceAction.
         *
         * @param timeWindowStart the value to set
         * @return this builder
         **/
        public Builder timeWindowStart(java.util.Date timeWindowStart) {
            this.timeWindowStart = timeWindowStart;
            this.__explicitlySet__.add("timeWindowStart");
            return this;
        }
        /**
         * One of the alternativeResolutionActions that was provided in the InstanceMaintenanceEvent.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alternativeResolutionAction")
        private InstanceMaintenanceAlternativeResolutionActions alternativeResolutionAction;

        /**
         * One of the alternativeResolutionActions that was provided in the InstanceMaintenanceEvent.
         *
         * @param alternativeResolutionAction the value to set
         * @return this builder
         **/
        public Builder alternativeResolutionAction(
                InstanceMaintenanceAlternativeResolutionActions alternativeResolutionAction) {
            this.alternativeResolutionAction = alternativeResolutionAction;
            this.__explicitlySet__.add("alternativeResolutionAction");
            return this;
        }
        /**
         * This field is only applicable when setting the alternativeResolutionAction.
         * <p>
         * For Instances that have local storage, this must be set to true to verify that the local storage
         * will be deleted during the migration. For instances without, this parameter has no effect.
         * <p>
         * In cases where the local storage will be lost, this parameter must be set or the request will fail.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("canDeleteLocalStorage")
        private Boolean canDeleteLocalStorage;

        /**
         * This field is only applicable when setting the alternativeResolutionAction.
         * <p>
         * For Instances that have local storage, this must be set to true to verify that the local storage
         * will be deleted during the migration. For instances without, this parameter has no effect.
         * <p>
         * In cases where the local storage will be lost, this parameter must be set or the request will fail.
         *
         * @param canDeleteLocalStorage the value to set
         * @return this builder
         **/
        public Builder canDeleteLocalStorage(Boolean canDeleteLocalStorage) {
            this.canDeleteLocalStorage = canDeleteLocalStorage;
            this.__explicitlySet__.add("canDeleteLocalStorage");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
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
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateInstanceMaintenanceEventDetails build() {
            UpdateInstanceMaintenanceEventDetails model =
                    new UpdateInstanceMaintenanceEventDetails(
                            this.timeWindowStart,
                            this.alternativeResolutionAction,
                            this.canDeleteLocalStorage,
                            this.displayName,
                            this.definedTags,
                            this.freeformTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateInstanceMaintenanceEventDetails model) {
            if (model.wasPropertyExplicitlySet("timeWindowStart")) {
                this.timeWindowStart(model.getTimeWindowStart());
            }
            if (model.wasPropertyExplicitlySet("alternativeResolutionAction")) {
                this.alternativeResolutionAction(model.getAlternativeResolutionAction());
            }
            if (model.wasPropertyExplicitlySet("canDeleteLocalStorage")) {
                this.canDeleteLocalStorage(model.getCanDeleteLocalStorage());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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
     * The beginning of the time window when Maintenance is scheduled to begin. The Maintenance will not begin before
     * this time.
     * <p>
     * The timeWindowEnd is automatically calculated based on the maintenanceReason and the instanceAction.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeWindowStart")
    private final java.util.Date timeWindowStart;

    /**
     * The beginning of the time window when Maintenance is scheduled to begin. The Maintenance will not begin before
     * this time.
     * <p>
     * The timeWindowEnd is automatically calculated based on the maintenanceReason and the instanceAction.
     *
     * @return the value
     **/
    public java.util.Date getTimeWindowStart() {
        return timeWindowStart;
    }

    /**
     * One of the alternativeResolutionActions that was provided in the InstanceMaintenanceEvent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alternativeResolutionAction")
    private final InstanceMaintenanceAlternativeResolutionActions alternativeResolutionAction;

    /**
     * One of the alternativeResolutionActions that was provided in the InstanceMaintenanceEvent.
     *
     * @return the value
     **/
    public InstanceMaintenanceAlternativeResolutionActions getAlternativeResolutionAction() {
        return alternativeResolutionAction;
    }

    /**
     * This field is only applicable when setting the alternativeResolutionAction.
     * <p>
     * For Instances that have local storage, this must be set to true to verify that the local storage
     * will be deleted during the migration. For instances without, this parameter has no effect.
     * <p>
     * In cases where the local storage will be lost, this parameter must be set or the request will fail.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canDeleteLocalStorage")
    private final Boolean canDeleteLocalStorage;

    /**
     * This field is only applicable when setting the alternativeResolutionAction.
     * <p>
     * For Instances that have local storage, this must be set to true to verify that the local storage
     * will be deleted during the migration. For instances without, this parameter has no effect.
     * <p>
     * In cases where the local storage will be lost, this parameter must be set or the request will fail.
     *
     * @return the value
     **/
    public Boolean getCanDeleteLocalStorage() {
        return canDeleteLocalStorage;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
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
        sb.append("UpdateInstanceMaintenanceEventDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeWindowStart=").append(String.valueOf(this.timeWindowStart));
        sb.append(", alternativeResolutionAction=")
                .append(String.valueOf(this.alternativeResolutionAction));
        sb.append(", canDeleteLocalStorage=").append(String.valueOf(this.canDeleteLocalStorage));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateInstanceMaintenanceEventDetails)) {
            return false;
        }

        UpdateInstanceMaintenanceEventDetails other = (UpdateInstanceMaintenanceEventDetails) o;
        return java.util.Objects.equals(this.timeWindowStart, other.timeWindowStart)
                && java.util.Objects.equals(
                        this.alternativeResolutionAction, other.alternativeResolutionAction)
                && java.util.Objects.equals(this.canDeleteLocalStorage, other.canDeleteLocalStorage)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeWindowStart == null ? 43 : this.timeWindowStart.hashCode());
        result =
                (result * PRIME)
                        + (this.alternativeResolutionAction == null
                                ? 43
                                : this.alternativeResolutionAction.hashCode());
        result =
                (result * PRIME)
                        + (this.canDeleteLocalStorage == null
                                ? 43
                                : this.canDeleteLocalStorage.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
