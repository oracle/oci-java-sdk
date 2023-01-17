/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bastion.model;

/**
 * Summary information for a bastion session resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210331")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SessionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SessionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "bastionName",
        "bastionId",
        "targetResourceDetails",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "sessionTtlInSeconds"
    })
    public SessionSummary(
            String id,
            String displayName,
            String bastionName,
            String bastionId,
            TargetResourceDetails targetResourceDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            SessionLifecycleState lifecycleState,
            String lifecycleDetails,
            Integer sessionTtlInSeconds) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.bastionName = bastionName;
        this.bastionId = bastionId;
        this.targetResourceDetails = targetResourceDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.sessionTtlInSeconds = sessionTtlInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique identifier (OCID) of the session, which can't be changed after creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier (OCID) of the session, which can't be changed after creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the session. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the session.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The name of the bastion that is hosting this session. */
        @com.fasterxml.jackson.annotation.JsonProperty("bastionName")
        private String bastionName;

        /**
         * The name of the bastion that is hosting this session.
         *
         * @param bastionName the value to set
         * @return this builder
         */
        public Builder bastionName(String bastionName) {
            this.bastionName = bastionName;
            this.__explicitlySet__.add("bastionName");
            return this;
        }
        /** The unique identifier (OCID) of the bastion that is hosting this session. */
        @com.fasterxml.jackson.annotation.JsonProperty("bastionId")
        private String bastionId;

        /**
         * The unique identifier (OCID) of the bastion that is hosting this session.
         *
         * @param bastionId the value to set
         * @return this builder
         */
        public Builder bastionId(String bastionId) {
            this.bastionId = bastionId;
            this.__explicitlySet__.add("bastionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceDetails")
        private TargetResourceDetails targetResourceDetails;

        public Builder targetResourceDetails(TargetResourceDetails targetResourceDetails) {
            this.targetResourceDetails = targetResourceDetails;
            this.__explicitlySet__.add("targetResourceDetails");
            return this;
        }
        /**
         * The time the session was created. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the session was created. Format is defined by
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
         * The time the session was updated. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the session was updated. Format is defined by
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
        /** The current state of the session. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SessionLifecycleState lifecycleState;

        /**
         * The current state of the session.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(SessionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** A message describing the current session state in more detail. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current session state in more detail.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The amount of time the session can remain active. */
        @com.fasterxml.jackson.annotation.JsonProperty("sessionTtlInSeconds")
        private Integer sessionTtlInSeconds;

        /**
         * The amount of time the session can remain active.
         *
         * @param sessionTtlInSeconds the value to set
         * @return this builder
         */
        public Builder sessionTtlInSeconds(Integer sessionTtlInSeconds) {
            this.sessionTtlInSeconds = sessionTtlInSeconds;
            this.__explicitlySet__.add("sessionTtlInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SessionSummary build() {
            SessionSummary model =
                    new SessionSummary(
                            this.id,
                            this.displayName,
                            this.bastionName,
                            this.bastionId,
                            this.targetResourceDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.sessionTtlInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SessionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("bastionName")) {
                this.bastionName(model.getBastionName());
            }
            if (model.wasPropertyExplicitlySet("bastionId")) {
                this.bastionId(model.getBastionId());
            }
            if (model.wasPropertyExplicitlySet("targetResourceDetails")) {
                this.targetResourceDetails(model.getTargetResourceDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("sessionTtlInSeconds")) {
                this.sessionTtlInSeconds(model.getSessionTtlInSeconds());
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

    /** The unique identifier (OCID) of the session, which can't be changed after creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier (OCID) of the session, which can't be changed after creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the session. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the session.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The name of the bastion that is hosting this session. */
    @com.fasterxml.jackson.annotation.JsonProperty("bastionName")
    private final String bastionName;

    /**
     * The name of the bastion that is hosting this session.
     *
     * @return the value
     */
    public String getBastionName() {
        return bastionName;
    }

    /** The unique identifier (OCID) of the bastion that is hosting this session. */
    @com.fasterxml.jackson.annotation.JsonProperty("bastionId")
    private final String bastionId;

    /**
     * The unique identifier (OCID) of the bastion that is hosting this session.
     *
     * @return the value
     */
    public String getBastionId() {
        return bastionId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceDetails")
    private final TargetResourceDetails targetResourceDetails;

    public TargetResourceDetails getTargetResourceDetails() {
        return targetResourceDetails;
    }

    /**
     * The time the session was created. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the session was created. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the session was updated. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the session was updated. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the session. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SessionLifecycleState lifecycleState;

    /**
     * The current state of the session.
     *
     * @return the value
     */
    public SessionLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** A message describing the current session state in more detail. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current session state in more detail.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The amount of time the session can remain active. */
    @com.fasterxml.jackson.annotation.JsonProperty("sessionTtlInSeconds")
    private final Integer sessionTtlInSeconds;

    /**
     * The amount of time the session can remain active.
     *
     * @return the value
     */
    public Integer getSessionTtlInSeconds() {
        return sessionTtlInSeconds;
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
        sb.append("SessionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", bastionName=").append(String.valueOf(this.bastionName));
        sb.append(", bastionId=").append(String.valueOf(this.bastionId));
        sb.append(", targetResourceDetails=").append(String.valueOf(this.targetResourceDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", sessionTtlInSeconds=").append(String.valueOf(this.sessionTtlInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SessionSummary)) {
            return false;
        }

        SessionSummary other = (SessionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.bastionName, other.bastionName)
                && java.util.Objects.equals(this.bastionId, other.bastionId)
                && java.util.Objects.equals(this.targetResourceDetails, other.targetResourceDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.sessionTtlInSeconds, other.sessionTtlInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.bastionName == null ? 43 : this.bastionName.hashCode());
        result = (result * PRIME) + (this.bastionId == null ? 43 : this.bastionId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceDetails == null
                                ? 43
                                : this.targetResourceDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionTtlInSeconds == null
                                ? 43
                                : this.sessionTtlInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
