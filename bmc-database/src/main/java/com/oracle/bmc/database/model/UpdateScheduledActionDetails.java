/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Describes the modification parameters for the Scheduled Action. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateScheduledActionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateScheduledActionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"actionParams", "actionMembers", "schedulingWindowId"})
    public UpdateScheduledActionDetails(
            java.util.Map<String, String> actionParams,
            java.util.List<ActionMember> actionMembers,
            String schedulingWindowId) {
        super();
        this.actionParams = actionParams;
        this.actionMembers = actionMembers;
        this.schedulingWindowId = schedulingWindowId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Map<ParamName, ParamValue> where a key value pair describes the specific action
         * parameter. Example: {@code {"count": "3"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("actionParams")
        private java.util.Map<String, String> actionParams;

        /**
         * Map<ParamName, ParamValue> where a key value pair describes the specific action
         * parameter. Example: {@code {"count": "3"}}
         *
         * @param actionParams the value to set
         * @return this builder
         */
        public Builder actionParams(java.util.Map<String, String> actionParams) {
            this.actionParams = actionParams;
            this.__explicitlySet__.add("actionParams");
            return this;
        }
        /** The list of action members in a scheduled action. */
        @com.fasterxml.jackson.annotation.JsonProperty("actionMembers")
        private java.util.List<ActionMember> actionMembers;

        /**
         * The list of action members in a scheduled action.
         *
         * @param actionMembers the value to set
         * @return this builder
         */
        public Builder actionMembers(java.util.List<ActionMember> actionMembers) {
            this.actionMembers = actionMembers;
            this.__explicitlySet__.add("actionMembers");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Scheduling Window.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schedulingWindowId")
        private String schedulingWindowId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Scheduling Window.
         *
         * @param schedulingWindowId the value to set
         * @return this builder
         */
        public Builder schedulingWindowId(String schedulingWindowId) {
            this.schedulingWindowId = schedulingWindowId;
            this.__explicitlySet__.add("schedulingWindowId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateScheduledActionDetails build() {
            UpdateScheduledActionDetails model =
                    new UpdateScheduledActionDetails(
                            this.actionParams, this.actionMembers, this.schedulingWindowId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateScheduledActionDetails model) {
            if (model.wasPropertyExplicitlySet("actionParams")) {
                this.actionParams(model.getActionParams());
            }
            if (model.wasPropertyExplicitlySet("actionMembers")) {
                this.actionMembers(model.getActionMembers());
            }
            if (model.wasPropertyExplicitlySet("schedulingWindowId")) {
                this.schedulingWindowId(model.getSchedulingWindowId());
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
     * Map<ParamName, ParamValue> where a key value pair describes the specific action parameter.
     * Example: {@code {"count": "3"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actionParams")
    private final java.util.Map<String, String> actionParams;

    /**
     * Map<ParamName, ParamValue> where a key value pair describes the specific action parameter.
     * Example: {@code {"count": "3"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getActionParams() {
        return actionParams;
    }

    /** The list of action members in a scheduled action. */
    @com.fasterxml.jackson.annotation.JsonProperty("actionMembers")
    private final java.util.List<ActionMember> actionMembers;

    /**
     * The list of action members in a scheduled action.
     *
     * @return the value
     */
    public java.util.List<ActionMember> getActionMembers() {
        return actionMembers;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Scheduling Window.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedulingWindowId")
    private final String schedulingWindowId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Scheduling Window.
     *
     * @return the value
     */
    public String getSchedulingWindowId() {
        return schedulingWindowId;
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
        sb.append("UpdateScheduledActionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("actionParams=").append(String.valueOf(this.actionParams));
        sb.append(", actionMembers=").append(String.valueOf(this.actionMembers));
        sb.append(", schedulingWindowId=").append(String.valueOf(this.schedulingWindowId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateScheduledActionDetails)) {
            return false;
        }

        UpdateScheduledActionDetails other = (UpdateScheduledActionDetails) o;
        return java.util.Objects.equals(this.actionParams, other.actionParams)
                && java.util.Objects.equals(this.actionMembers, other.actionMembers)
                && java.util.Objects.equals(this.schedulingWindowId, other.schedulingWindowId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.actionParams == null ? 43 : this.actionParams.hashCode());
        result =
                (result * PRIME)
                        + (this.actionMembers == null ? 43 : this.actionMembers.hashCode());
        result =
                (result * PRIME)
                        + (this.schedulingWindowId == null
                                ? 43
                                : this.schedulingWindowId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
