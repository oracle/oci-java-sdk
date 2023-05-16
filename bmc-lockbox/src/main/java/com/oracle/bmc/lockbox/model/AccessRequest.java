/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox.model;

/**
 * An access request to a customer's resource. An access request is a subsidiary resource of the
 * Lockbox entity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220126")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AccessRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AccessRequest extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "lockboxId",
        "displayName",
        "description",
        "requestorId",
        "lifecycleState",
        "lifecycleStateDetails",
        "accessDuration",
        "context",
        "activityLogs",
        "timeCreated",
        "timeUpdated",
        "timeExpired"
    })
    public AccessRequest(
            String id,
            String lockboxId,
            String displayName,
            String description,
            String requestorId,
            LifecycleState lifecycleState,
            LifecycleStateDetails lifecycleStateDetails,
            String accessDuration,
            java.util.Map<String, String> context,
            java.util.List<ActivityLog> activityLogs,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeExpired) {
        super();
        this.id = id;
        this.lockboxId = lockboxId;
        this.displayName = displayName;
        this.description = description;
        this.requestorId = requestorId;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.accessDuration = accessDuration;
        this.context = context;
        this.activityLogs = activityLogs;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeExpired = timeExpired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier (OCID) of the access request, which can't be changed after
         * creation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier (OCID) of the access request, which can't be changed after
         * creation.
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
         * The unique identifier (OCID) of the lockbox box that the access request is associated
         * with, which can't be changed after creation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lockboxId")
        private String lockboxId;

        /**
         * The unique identifier (OCID) of the lockbox box that the access request is associated
         * with, which can't be changed after creation.
         *
         * @param lockboxId the value to set
         * @return this builder
         */
        public Builder lockboxId(String lockboxId) {
            this.lockboxId = lockboxId;
            this.__explicitlySet__.add("lockboxId");
            return this;
        }
        /** The name of the access request. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the access request.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The rationale for requesting the access request and any other related details.. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The rationale for requesting the access request and any other related details..
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The unique identifier of the requestor. */
        @com.fasterxml.jackson.annotation.JsonProperty("requestorId")
        private String requestorId;

        /**
         * The unique identifier of the requestor.
         *
         * @param requestorId the value to set
         * @return this builder
         */
        public Builder requestorId(String requestorId) {
            this.requestorId = requestorId;
            this.__explicitlySet__.add("requestorId");
            return this;
        }
        /** Possible access request lifecycle states. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Possible access request lifecycle states.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Details of access request lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private LifecycleStateDetails lifecycleStateDetails;

        /**
         * Details of access request lifecycle state.
         *
         * @param lifecycleStateDetails the value to set
         * @return this builder
         */
        public Builder lifecycleStateDetails(LifecycleStateDetails lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }
        /** The maximum amount of time operator has access to associated resources. */
        @com.fasterxml.jackson.annotation.JsonProperty("accessDuration")
        private String accessDuration;

        /**
         * The maximum amount of time operator has access to associated resources.
         *
         * @param accessDuration the value to set
         * @return this builder
         */
        public Builder accessDuration(String accessDuration) {
            this.accessDuration = accessDuration;
            this.__explicitlySet__.add("accessDuration");
            return this;
        }
        /** The context object containing the access request specific details. */
        @com.fasterxml.jackson.annotation.JsonProperty("context")
        private java.util.Map<String, String> context;

        /**
         * The context object containing the access request specific details.
         *
         * @param context the value to set
         * @return this builder
         */
        public Builder context(java.util.Map<String, String> context) {
            this.context = context;
            this.__explicitlySet__.add("context");
            return this;
        }
        /**
         * The actions taken by different persona on the access request, e.g. approve/deny/revoke
         */
        @com.fasterxml.jackson.annotation.JsonProperty("activityLogs")
        private java.util.List<ActivityLog> activityLogs;

        /**
         * The actions taken by different persona on the access request, e.g. approve/deny/revoke
         *
         * @param activityLogs the value to set
         * @return this builder
         */
        public Builder activityLogs(java.util.List<ActivityLog> activityLogs) {
            this.activityLogs = activityLogs;
            this.__explicitlySet__.add("activityLogs");
            return this;
        }
        /**
         * The time the access request was created. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the access request was created. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the access request was last updated. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the access request was last updated. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The time the access request expired. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpired")
        private java.util.Date timeExpired;

        /**
         * The time the access request expired. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeExpired the value to set
         * @return this builder
         */
        public Builder timeExpired(java.util.Date timeExpired) {
            this.timeExpired = timeExpired;
            this.__explicitlySet__.add("timeExpired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessRequest build() {
            AccessRequest model =
                    new AccessRequest(
                            this.id,
                            this.lockboxId,
                            this.displayName,
                            this.description,
                            this.requestorId,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.accessDuration,
                            this.context,
                            this.activityLogs,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeExpired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRequest model) {
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
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
            }
            if (model.wasPropertyExplicitlySet("accessDuration")) {
                this.accessDuration(model.getAccessDuration());
            }
            if (model.wasPropertyExplicitlySet("context")) {
                this.context(model.getContext());
            }
            if (model.wasPropertyExplicitlySet("activityLogs")) {
                this.activityLogs(model.getActivityLogs());
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
     * The unique identifier (OCID) of the access request, which can't be changed after creation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier (OCID) of the access request, which can't be changed after creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The unique identifier (OCID) of the lockbox box that the access request is associated with,
     * which can't be changed after creation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lockboxId")
    private final String lockboxId;

    /**
     * The unique identifier (OCID) of the lockbox box that the access request is associated with,
     * which can't be changed after creation.
     *
     * @return the value
     */
    public String getLockboxId() {
        return lockboxId;
    }

    /** The name of the access request. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the access request.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The rationale for requesting the access request and any other related details.. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The rationale for requesting the access request and any other related details..
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The unique identifier of the requestor. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestorId")
    private final String requestorId;

    /**
     * The unique identifier of the requestor.
     *
     * @return the value
     */
    public String getRequestorId() {
        return requestorId;
    }

    /** Possible access request lifecycle states. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        InProgress("IN_PROGRESS"),
        Waiting("WAITING"),
        Succeeded("SUCCEEDED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Possible access request lifecycle states. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Possible access request lifecycle states.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Details of access request lifecycle state. */
    public enum LifecycleStateDetails implements com.oracle.bmc.http.internal.BmcEnum {
        Processing("PROCESSING"),
        WaitingForApprovals("WAITING_FOR_APPROVALS"),
        Approved("APPROVED"),
        AutoApproved("AUTO_APPROVED"),
        CancellingAccess("CANCELLING_ACCESS"),
        Expired("EXPIRED"),
        Revoked("REVOKED"),
        Denied("DENIED"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleStateDetails.class);

        private final String value;
        private static java.util.Map<String, LifecycleStateDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleStateDetails v : LifecycleStateDetails.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleStateDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleStateDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleStateDetails', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Details of access request lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final LifecycleStateDetails lifecycleStateDetails;

    /**
     * Details of access request lifecycle state.
     *
     * @return the value
     */
    public LifecycleStateDetails getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }

    /** The maximum amount of time operator has access to associated resources. */
    @com.fasterxml.jackson.annotation.JsonProperty("accessDuration")
    private final String accessDuration;

    /**
     * The maximum amount of time operator has access to associated resources.
     *
     * @return the value
     */
    public String getAccessDuration() {
        return accessDuration;
    }

    /** The context object containing the access request specific details. */
    @com.fasterxml.jackson.annotation.JsonProperty("context")
    private final java.util.Map<String, String> context;

    /**
     * The context object containing the access request specific details.
     *
     * @return the value
     */
    public java.util.Map<String, String> getContext() {
        return context;
    }

    /** The actions taken by different persona on the access request, e.g. approve/deny/revoke */
    @com.fasterxml.jackson.annotation.JsonProperty("activityLogs")
    private final java.util.List<ActivityLog> activityLogs;

    /**
     * The actions taken by different persona on the access request, e.g. approve/deny/revoke
     *
     * @return the value
     */
    public java.util.List<ActivityLog> getActivityLogs() {
        return activityLogs;
    }

    /**
     * The time the access request was created. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the access request was created. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the access request was last updated. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the access request was last updated. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The time the access request expired. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpired")
    private final java.util.Date timeExpired;

    /**
     * The time the access request expired. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeExpired() {
        return timeExpired;
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
        sb.append("AccessRequest(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", lockboxId=").append(String.valueOf(this.lockboxId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", requestorId=").append(String.valueOf(this.requestorId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", accessDuration=").append(String.valueOf(this.accessDuration));
        sb.append(", context=").append(String.valueOf(this.context));
        sb.append(", activityLogs=").append(String.valueOf(this.activityLogs));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeExpired=").append(String.valueOf(this.timeExpired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessRequest)) {
            return false;
        }

        AccessRequest other = (AccessRequest) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lockboxId, other.lockboxId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.requestorId, other.requestorId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(this.accessDuration, other.accessDuration)
                && java.util.Objects.equals(this.context, other.context)
                && java.util.Objects.equals(this.activityLogs, other.activityLogs)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeExpired, other.timeExpired)
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.accessDuration == null ? 43 : this.accessDuration.hashCode());
        result = (result * PRIME) + (this.context == null ? 43 : this.context.hashCode());
        result = (result * PRIME) + (this.activityLogs == null ? 43 : this.activityLogs.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeExpired == null ? 43 : this.timeExpired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
