/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox.model;

/**
 * Summary information for an access request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220126")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AccessRequestSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AccessRequestSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "lockboxId",
        "displayName",
        "description",
        "requestorId",
        "requestorLocation",
        "lifecycleState",
        "accessDuration",
        "timeCreated",
        "timeUpdated",
        "timeExpired",
        "ticketNumber",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public AccessRequestSummary(
            String id,
            String lockboxId,
            String displayName,
            String description,
            String requestorId,
            String requestorLocation,
            AccessRequest.LifecycleState lifecycleState,
            String accessDuration,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeExpired,
            String ticketNumber,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.lockboxId = lockboxId;
        this.displayName = displayName;
        this.description = description;
        this.requestorId = requestorId;
        this.requestorLocation = requestorLocation;
        this.lifecycleState = lifecycleState;
        this.accessDuration = accessDuration;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeExpired = timeExpired;
        this.ticketNumber = ticketNumber;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier (OCID) of the access request, which can't be changed after creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier (OCID) of the access request, which can't be changed after creation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The unique identifier (OCID) of the lockbox box that the access request is associated with, which can't be changed after creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lockboxId")
        private String lockboxId;

        /**
         * The unique identifier (OCID) of the lockbox box that the access request is associated with, which can't be changed after creation.
         * @param lockboxId the value to set
         * @return this builder
         **/
        public Builder lockboxId(String lockboxId) {
            this.lockboxId = lockboxId;
            this.__explicitlySet__.add("lockboxId");
            return this;
        }
        /**
         * The name of the access request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the access request.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The rationale for requesting the access request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The rationale for requesting the access request.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The unique identifier of the requestor.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestorId")
        private String requestorId;

        /**
         * The unique identifier of the requestor.
         * @param requestorId the value to set
         * @return this builder
         **/
        public Builder requestorId(String requestorId) {
            this.requestorId = requestorId;
            this.__explicitlySet__.add("requestorId");
            return this;
        }
        /**
         * The two-char country code of the requestor while creating the access request
         * Example: {@code US}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestorLocation")
        private String requestorLocation;

        /**
         * The two-char country code of the requestor while creating the access request
         * Example: {@code US}
         *
         * @param requestorLocation the value to set
         * @return this builder
         **/
        public Builder requestorLocation(String requestorLocation) {
            this.requestorLocation = requestorLocation;
            this.__explicitlySet__.add("requestorLocation");
            return this;
        }
        /**
         * The current state of the access request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AccessRequest.LifecycleState lifecycleState;

        /**
         * The current state of the access request.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(AccessRequest.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The maximum amount of time operator has access to associated resources.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("accessDuration")
        private String accessDuration;

        /**
         * The maximum amount of time operator has access to associated resources.
         * @param accessDuration the value to set
         * @return this builder
         **/
        public Builder accessDuration(String accessDuration) {
            this.accessDuration = accessDuration;
            this.__explicitlySet__.add("accessDuration");
            return this;
        }
        /**
         * The time the access request was created. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the access request was created. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the access request was last updated. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the access request was last updated. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The time the access request expired. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpired")
        private java.util.Date timeExpired;

        /**
         * The time the access request expired. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeExpired the value to set
         * @return this builder
         **/
        public Builder timeExpired(java.util.Date timeExpired) {
            this.timeExpired = timeExpired;
            this.__explicitlySet__.add("timeExpired");
            return this;
        }
        /**
         * The ticket number raised by external customers
         * Example: {@code 3-37509643121}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ticketNumber")
        private String ticketNumber;

        /**
         * The ticket number raised by external customers
         * Example: {@code 3-37509643121}
         *
         * @param ticketNumber the value to set
         * @return this builder
         **/
        public Builder ticketNumber(String ticketNumber) {
            this.ticketNumber = ticketNumber;
            this.__explicitlySet__.add("ticketNumber");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
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

        public AccessRequestSummary build() {
            AccessRequestSummary model =
                    new AccessRequestSummary(
                            this.id,
                            this.lockboxId,
                            this.displayName,
                            this.description,
                            this.requestorId,
                            this.requestorLocation,
                            this.lifecycleState,
                            this.accessDuration,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeExpired,
                            this.ticketNumber,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRequestSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lockboxId")) {
                this.lockboxId(model.getLockboxId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("requestorId")) {
                this.requestorId(model.getRequestorId());
            }
            if (model.wasPropertyExplicitlySet("requestorLocation")) {
                this.requestorLocation(model.getRequestorLocation());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("accessDuration")) {
                this.accessDuration(model.getAccessDuration());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeExpired")) {
                this.timeExpired(model.getTimeExpired());
            }
            if (model.wasPropertyExplicitlySet("ticketNumber")) {
                this.ticketNumber(model.getTicketNumber());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The unique identifier (OCID) of the access request, which can't be changed after creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier (OCID) of the access request, which can't be changed after creation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The unique identifier (OCID) of the lockbox box that the access request is associated with, which can't be changed after creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lockboxId")
    private final String lockboxId;

    /**
     * The unique identifier (OCID) of the lockbox box that the access request is associated with, which can't be changed after creation.
     * @return the value
     **/
    public String getLockboxId() {
        return lockboxId;
    }

    /**
     * The name of the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the access request.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The rationale for requesting the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The rationale for requesting the access request.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The unique identifier of the requestor.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestorId")
    private final String requestorId;

    /**
     * The unique identifier of the requestor.
     * @return the value
     **/
    public String getRequestorId() {
        return requestorId;
    }

    /**
     * The two-char country code of the requestor while creating the access request
     * Example: {@code US}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestorLocation")
    private final String requestorLocation;

    /**
     * The two-char country code of the requestor while creating the access request
     * Example: {@code US}
     *
     * @return the value
     **/
    public String getRequestorLocation() {
        return requestorLocation;
    }

    /**
     * The current state of the access request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AccessRequest.LifecycleState lifecycleState;

    /**
     * The current state of the access request.
     * @return the value
     **/
    public AccessRequest.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The maximum amount of time operator has access to associated resources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessDuration")
    private final String accessDuration;

    /**
     * The maximum amount of time operator has access to associated resources.
     * @return the value
     **/
    public String getAccessDuration() {
        return accessDuration;
    }

    /**
     * The time the access request was created. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the access request was created. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the access request was last updated. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the access request was last updated. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The time the access request expired. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpired")
    private final java.util.Date timeExpired;

    /**
     * The time the access request expired. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeExpired() {
        return timeExpired;
    }

    /**
     * The ticket number raised by external customers
     * Example: {@code 3-37509643121}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ticketNumber")
    private final String ticketNumber;

    /**
     * The ticket number raised by external customers
     * Example: {@code 3-37509643121}
     *
     * @return the value
     **/
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
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
        sb.append("AccessRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", lockboxId=").append(String.valueOf(this.lockboxId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", requestorId=").append(String.valueOf(this.requestorId));
        sb.append(", requestorLocation=").append(String.valueOf(this.requestorLocation));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", accessDuration=").append(String.valueOf(this.accessDuration));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeExpired=").append(String.valueOf(this.timeExpired));
        sb.append(", ticketNumber=").append(String.valueOf(this.ticketNumber));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessRequestSummary)) {
            return false;
        }

        AccessRequestSummary other = (AccessRequestSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lockboxId, other.lockboxId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.requestorId, other.requestorId)
                && java.util.Objects.equals(this.requestorLocation, other.requestorLocation)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.accessDuration, other.accessDuration)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeExpired, other.timeExpired)
                && java.util.Objects.equals(this.ticketNumber, other.ticketNumber)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.lockboxId == null ? 43 : this.lockboxId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.requestorId == null ? 43 : this.requestorId.hashCode());
        result =
                (result * PRIME)
                        + (this.requestorLocation == null ? 43 : this.requestorLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.accessDuration == null ? 43 : this.accessDuration.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeExpired == null ? 43 : this.timeExpired.hashCode());
        result = (result * PRIME) + (this.ticketNumber == null ? 43 : this.ticketNumber.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
