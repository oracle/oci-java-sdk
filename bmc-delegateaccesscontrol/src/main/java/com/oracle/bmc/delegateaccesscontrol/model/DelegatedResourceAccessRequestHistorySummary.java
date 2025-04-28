/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.model;

/**
 * Summary of Delegated Resource Access Request status changes. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DelegatedResourceAccessRequestHistorySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DelegatedResourceAccessRequestHistorySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "lifecycleState",
        "requestStatus",
        "userId",
        "comment",
        "timestamp"
    })
    public DelegatedResourceAccessRequestHistorySummary(
            DelegatedResourceAccessRequest.LifecycleState lifecycleState,
            DelegatedResourceAccessRequestStatus requestStatus,
            String userId,
            String comment,
            java.util.Date timestamp) {
        super();
        this.lifecycleState = lifecycleState;
        this.requestStatus = requestStatus;
        this.userId = userId;
        this.comment = comment;
        this.timestamp = timestamp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The current lifecycle state of the Delegated Resource Access Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DelegatedResourceAccessRequest.LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the Delegated Resource Access Request.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(
                DelegatedResourceAccessRequest.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The current status of the Delegated Resource Access Request. */
        @com.fasterxml.jackson.annotation.JsonProperty("requestStatus")
        private DelegatedResourceAccessRequestStatus requestStatus;

        /**
         * The current status of the Delegated Resource Access Request.
         *
         * @param requestStatus the value to set
         * @return this builder
         */
        public Builder requestStatus(DelegatedResourceAccessRequestStatus requestStatus) {
            this.requestStatus = requestStatus;
            this.__explicitlySet__.add("requestStatus");
            return this;
        }
        /**
         * ID of user who modified the Delegated Resource Access Request. For operator, this field
         * is "Operator".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * ID of user who modified the Delegated Resource Access Request. For operator, this field
         * is "Operator".
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /** Comment about the status change. */
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * Comment about the status change.
         *
         * @param comment the value to set
         * @return this builder
         */
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /**
         * Time when the respective action happened in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * Time when the respective action happened in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DelegatedResourceAccessRequestHistorySummary build() {
            DelegatedResourceAccessRequestHistorySummary model =
                    new DelegatedResourceAccessRequestHistorySummary(
                            this.lifecycleState,
                            this.requestStatus,
                            this.userId,
                            this.comment,
                            this.timestamp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DelegatedResourceAccessRequestHistorySummary model) {
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("requestStatus")) {
                this.requestStatus(model.getRequestStatus());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
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

    /** The current lifecycle state of the Delegated Resource Access Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DelegatedResourceAccessRequest.LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the Delegated Resource Access Request.
     *
     * @return the value
     */
    public DelegatedResourceAccessRequest.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The current status of the Delegated Resource Access Request. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestStatus")
    private final DelegatedResourceAccessRequestStatus requestStatus;

    /**
     * The current status of the Delegated Resource Access Request.
     *
     * @return the value
     */
    public DelegatedResourceAccessRequestStatus getRequestStatus() {
        return requestStatus;
    }

    /**
     * ID of user who modified the Delegated Resource Access Request. For operator, this field is
     * "Operator".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * ID of user who modified the Delegated Resource Access Request. For operator, this field is
     * "Operator".
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /** Comment about the status change. */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * Comment about the status change.
     *
     * @return the value
     */
    public String getComment() {
        return comment;
    }

    /**
     * Time when the respective action happened in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * Time when the respective action happened in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
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
        sb.append("DelegatedResourceAccessRequestHistorySummary(");
        sb.append("super=").append(super.toString());
        sb.append("lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", requestStatus=").append(String.valueOf(this.requestStatus));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DelegatedResourceAccessRequestHistorySummary)) {
            return false;
        }

        DelegatedResourceAccessRequestHistorySummary other =
                (DelegatedResourceAccessRequestHistorySummary) o;
        return java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.requestStatus, other.requestStatus)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.requestStatus == null ? 43 : this.requestStatus.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
