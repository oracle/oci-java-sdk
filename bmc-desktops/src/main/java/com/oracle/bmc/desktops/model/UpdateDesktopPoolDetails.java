/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.model;

/**
 * Provides the details of a request to update the desktop pool. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateDesktopPoolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDesktopPoolDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "maximumSize",
        "standbySize",
        "devicePolicy",
        "availabilityPolicy",
        "contactDetails",
        "timeStartScheduled",
        "timeStopScheduled",
        "freeformTags",
        "definedTags",
        "sessionLifecycleActions"
    })
    public UpdateDesktopPoolDetails(
            String displayName,
            String description,
            Integer maximumSize,
            Integer standbySize,
            DesktopDevicePolicy devicePolicy,
            DesktopAvailabilityPolicy availabilityPolicy,
            String contactDetails,
            java.util.Date timeStartScheduled,
            java.util.Date timeStopScheduled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            UpdateDesktopPoolDesktopSessionLifecycleActions sessionLifecycleActions) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.maximumSize = maximumSize;
        this.standbySize = standbySize;
        this.devicePolicy = devicePolicy;
        this.availabilityPolicy = availabilityPolicy;
        this.contactDetails = contactDetails;
        this.timeStartScheduled = timeStartScheduled;
        this.timeStopScheduled = timeStopScheduled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.sessionLifecycleActions = sessionLifecycleActions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A user friendly display name. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user friendly display name. Avoid entering confidential information.
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
         * A user friendly description providing additional information about the resource. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user friendly description providing additional information about the resource. Avoid
         * entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The maximum number of desktops permitted in the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumSize")
        private Integer maximumSize;

        /**
         * The maximum number of desktops permitted in the desktop pool.
         *
         * @param maximumSize the value to set
         * @return this builder
         */
        public Builder maximumSize(Integer maximumSize) {
            this.maximumSize = maximumSize;
            this.__explicitlySet__.add("maximumSize");
            return this;
        }
        /** The maximum number of standby desktops available in the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("standbySize")
        private Integer standbySize;

        /**
         * The maximum number of standby desktops available in the desktop pool.
         *
         * @param standbySize the value to set
         * @return this builder
         */
        public Builder standbySize(Integer standbySize) {
            this.standbySize = standbySize;
            this.__explicitlySet__.add("standbySize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("devicePolicy")
        private DesktopDevicePolicy devicePolicy;

        public Builder devicePolicy(DesktopDevicePolicy devicePolicy) {
            this.devicePolicy = devicePolicy;
            this.__explicitlySet__.add("devicePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityPolicy")
        private DesktopAvailabilityPolicy availabilityPolicy;

        public Builder availabilityPolicy(DesktopAvailabilityPolicy availabilityPolicy) {
            this.availabilityPolicy = availabilityPolicy;
            this.__explicitlySet__.add("availabilityPolicy");
            return this;
        }
        /**
         * Contact information of the desktop pool administrator. Avoid entering confidential
         * information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("contactDetails")
        private String contactDetails;

        /**
         * Contact information of the desktop pool administrator. Avoid entering confidential
         * information.
         *
         * @param contactDetails the value to set
         * @return this builder
         */
        public Builder contactDetails(String contactDetails) {
            this.contactDetails = contactDetails;
            this.__explicitlySet__.add("contactDetails");
            return this;
        }
        /** The start time of the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStartScheduled")
        private java.util.Date timeStartScheduled;

        /**
         * The start time of the desktop pool.
         *
         * @param timeStartScheduled the value to set
         * @return this builder
         */
        public Builder timeStartScheduled(java.util.Date timeStartScheduled) {
            this.timeStartScheduled = timeStartScheduled;
            this.__explicitlySet__.add("timeStartScheduled");
            return this;
        }
        /** The stop time of the desktop pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStopScheduled")
        private java.util.Date timeStopScheduled;

        /**
         * The stop time of the desktop pool.
         *
         * @param timeStopScheduled the value to set
         * @return this builder
         */
        public Builder timeStopScheduled(java.util.Date timeStopScheduled) {
            this.timeStopScheduled = timeStopScheduled;
            this.__explicitlySet__.add("timeStopScheduled");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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

        @com.fasterxml.jackson.annotation.JsonProperty("sessionLifecycleActions")
        private UpdateDesktopPoolDesktopSessionLifecycleActions sessionLifecycleActions;

        public Builder sessionLifecycleActions(
                UpdateDesktopPoolDesktopSessionLifecycleActions sessionLifecycleActions) {
            this.sessionLifecycleActions = sessionLifecycleActions;
            this.__explicitlySet__.add("sessionLifecycleActions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDesktopPoolDetails build() {
            UpdateDesktopPoolDetails model =
                    new UpdateDesktopPoolDetails(
                            this.displayName,
                            this.description,
                            this.maximumSize,
                            this.standbySize,
                            this.devicePolicy,
                            this.availabilityPolicy,
                            this.contactDetails,
                            this.timeStartScheduled,
                            this.timeStopScheduled,
                            this.freeformTags,
                            this.definedTags,
                            this.sessionLifecycleActions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDesktopPoolDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("maximumSize")) {
                this.maximumSize(model.getMaximumSize());
            }
            if (model.wasPropertyExplicitlySet("standbySize")) {
                this.standbySize(model.getStandbySize());
            }
            if (model.wasPropertyExplicitlySet("devicePolicy")) {
                this.devicePolicy(model.getDevicePolicy());
            }
            if (model.wasPropertyExplicitlySet("availabilityPolicy")) {
                this.availabilityPolicy(model.getAvailabilityPolicy());
            }
            if (model.wasPropertyExplicitlySet("contactDetails")) {
                this.contactDetails(model.getContactDetails());
            }
            if (model.wasPropertyExplicitlySet("timeStartScheduled")) {
                this.timeStartScheduled(model.getTimeStartScheduled());
            }
            if (model.wasPropertyExplicitlySet("timeStopScheduled")) {
                this.timeStopScheduled(model.getTimeStopScheduled());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("sessionLifecycleActions")) {
                this.sessionLifecycleActions(model.getSessionLifecycleActions());
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

    /** A user friendly display name. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user friendly display name. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A user friendly description providing additional information about the resource. Avoid
     * entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user friendly description providing additional information about the resource. Avoid
     * entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The maximum number of desktops permitted in the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumSize")
    private final Integer maximumSize;

    /**
     * The maximum number of desktops permitted in the desktop pool.
     *
     * @return the value
     */
    public Integer getMaximumSize() {
        return maximumSize;
    }

    /** The maximum number of standby desktops available in the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("standbySize")
    private final Integer standbySize;

    /**
     * The maximum number of standby desktops available in the desktop pool.
     *
     * @return the value
     */
    public Integer getStandbySize() {
        return standbySize;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("devicePolicy")
    private final DesktopDevicePolicy devicePolicy;

    public DesktopDevicePolicy getDevicePolicy() {
        return devicePolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("availabilityPolicy")
    private final DesktopAvailabilityPolicy availabilityPolicy;

    public DesktopAvailabilityPolicy getAvailabilityPolicy() {
        return availabilityPolicy;
    }

    /**
     * Contact information of the desktop pool administrator. Avoid entering confidential
     * information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contactDetails")
    private final String contactDetails;

    /**
     * Contact information of the desktop pool administrator. Avoid entering confidential
     * information.
     *
     * @return the value
     */
    public String getContactDetails() {
        return contactDetails;
    }

    /** The start time of the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStartScheduled")
    private final java.util.Date timeStartScheduled;

    /**
     * The start time of the desktop pool.
     *
     * @return the value
     */
    public java.util.Date getTimeStartScheduled() {
        return timeStartScheduled;
    }

    /** The stop time of the desktop pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStopScheduled")
    private final java.util.Date timeStopScheduled;

    /**
     * The stop time of the desktop pool.
     *
     * @return the value
     */
    public java.util.Date getTimeStopScheduled() {
        return timeStopScheduled;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sessionLifecycleActions")
    private final UpdateDesktopPoolDesktopSessionLifecycleActions sessionLifecycleActions;

    public UpdateDesktopPoolDesktopSessionLifecycleActions getSessionLifecycleActions() {
        return sessionLifecycleActions;
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
        sb.append("UpdateDesktopPoolDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", maximumSize=").append(String.valueOf(this.maximumSize));
        sb.append(", standbySize=").append(String.valueOf(this.standbySize));
        sb.append(", devicePolicy=").append(String.valueOf(this.devicePolicy));
        sb.append(", availabilityPolicy=").append(String.valueOf(this.availabilityPolicy));
        sb.append(", contactDetails=").append(String.valueOf(this.contactDetails));
        sb.append(", timeStartScheduled=").append(String.valueOf(this.timeStartScheduled));
        sb.append(", timeStopScheduled=").append(String.valueOf(this.timeStopScheduled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", sessionLifecycleActions=")
                .append(String.valueOf(this.sessionLifecycleActions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDesktopPoolDetails)) {
            return false;
        }

        UpdateDesktopPoolDetails other = (UpdateDesktopPoolDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.maximumSize, other.maximumSize)
                && java.util.Objects.equals(this.standbySize, other.standbySize)
                && java.util.Objects.equals(this.devicePolicy, other.devicePolicy)
                && java.util.Objects.equals(this.availabilityPolicy, other.availabilityPolicy)
                && java.util.Objects.equals(this.contactDetails, other.contactDetails)
                && java.util.Objects.equals(this.timeStartScheduled, other.timeStartScheduled)
                && java.util.Objects.equals(this.timeStopScheduled, other.timeStopScheduled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.sessionLifecycleActions, other.sessionLifecycleActions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.maximumSize == null ? 43 : this.maximumSize.hashCode());
        result = (result * PRIME) + (this.standbySize == null ? 43 : this.standbySize.hashCode());
        result = (result * PRIME) + (this.devicePolicy == null ? 43 : this.devicePolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityPolicy == null
                                ? 43
                                : this.availabilityPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.contactDetails == null ? 43 : this.contactDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStartScheduled == null
                                ? 43
                                : this.timeStartScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStopScheduled == null ? 43 : this.timeStopScheduled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionLifecycleActions == null
                                ? 43
                                : this.sessionLifecycleActions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
