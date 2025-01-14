/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of a granular maintenance history. <br>
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
        builder = GranularMaintenanceHistoryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GranularMaintenanceHistoryDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"executionWindow", "executionActions"})
    public GranularMaintenanceHistoryDetails(
            ExecutionWindow executionWindow, java.util.List<ExecutionAction> executionActions) {
        super();
        this.executionWindow = executionWindow;
        this.executionActions = executionActions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("executionWindow")
        private ExecutionWindow executionWindow;

        public Builder executionWindow(ExecutionWindow executionWindow) {
            this.executionWindow = executionWindow;
            this.__explicitlySet__.add("executionWindow");
            return this;
        }
        /** The list of execution actions for this granular maintenance history. */
        @com.fasterxml.jackson.annotation.JsonProperty("executionActions")
        private java.util.List<ExecutionAction> executionActions;

        /**
         * The list of execution actions for this granular maintenance history.
         *
         * @param executionActions the value to set
         * @return this builder
         */
        public Builder executionActions(java.util.List<ExecutionAction> executionActions) {
            this.executionActions = executionActions;
            this.__explicitlySet__.add("executionActions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GranularMaintenanceHistoryDetails build() {
            GranularMaintenanceHistoryDetails model =
                    new GranularMaintenanceHistoryDetails(
                            this.executionWindow, this.executionActions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GranularMaintenanceHistoryDetails model) {
            if (model.wasPropertyExplicitlySet("executionWindow")) {
                this.executionWindow(model.getExecutionWindow());
            }
            if (model.wasPropertyExplicitlySet("executionActions")) {
                this.executionActions(model.getExecutionActions());
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

    @com.fasterxml.jackson.annotation.JsonProperty("executionWindow")
    private final ExecutionWindow executionWindow;

    public ExecutionWindow getExecutionWindow() {
        return executionWindow;
    }

    /** The list of execution actions for this granular maintenance history. */
    @com.fasterxml.jackson.annotation.JsonProperty("executionActions")
    private final java.util.List<ExecutionAction> executionActions;

    /**
     * The list of execution actions for this granular maintenance history.
     *
     * @return the value
     */
    public java.util.List<ExecutionAction> getExecutionActions() {
        return executionActions;
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
        sb.append("GranularMaintenanceHistoryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("executionWindow=").append(String.valueOf(this.executionWindow));
        sb.append(", executionActions=").append(String.valueOf(this.executionActions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GranularMaintenanceHistoryDetails)) {
            return false;
        }

        GranularMaintenanceHistoryDetails other = (GranularMaintenanceHistoryDetails) o;
        return java.util.Objects.equals(this.executionWindow, other.executionWindow)
                && java.util.Objects.equals(this.executionActions, other.executionActions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.executionWindow == null ? 43 : this.executionWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.executionActions == null ? 43 : this.executionActions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
