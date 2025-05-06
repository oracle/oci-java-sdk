/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details for a user action to be performed on an action group. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ActionGroupBasedUserActionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "level")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ActionGroupBasedUserActionDetails extends UserActionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /** Unique identifier for the action group. */
        @com.fasterxml.jackson.annotation.JsonProperty("actionGroupId")
        private String actionGroupId;

        /**
         * Unique identifier for the action group.
         *
         * @param actionGroupId the value to set
         * @return this builder
         */
        public Builder actionGroupId(String actionGroupId) {
            this.actionGroupId = actionGroupId;
            this.__explicitlySet__.add("actionGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActionGroupBasedUserActionDetails build() {
            ActionGroupBasedUserActionDetails model =
                    new ActionGroupBasedUserActionDetails(this.action, this.actionGroupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActionGroupBasedUserActionDetails model) {
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("actionGroupId")) {
                this.actionGroupId(model.getActionGroupId());
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

    @Deprecated
    public ActionGroupBasedUserActionDetails(Action action, String actionGroupId) {
        super(action);
        this.actionGroupId = actionGroupId;
    }

    /** Unique identifier for the action group. */
    @com.fasterxml.jackson.annotation.JsonProperty("actionGroupId")
    private final String actionGroupId;

    /**
     * Unique identifier for the action group.
     *
     * @return the value
     */
    public String getActionGroupId() {
        return actionGroupId;
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
        sb.append("ActionGroupBasedUserActionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", actionGroupId=").append(String.valueOf(this.actionGroupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionGroupBasedUserActionDetails)) {
            return false;
        }

        ActionGroupBasedUserActionDetails other = (ActionGroupBasedUserActionDetails) o;
        return java.util.Objects.equals(this.actionGroupId, other.actionGroupId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.actionGroupId == null ? 43 : this.actionGroupId.hashCode());
        return result;
    }
}
