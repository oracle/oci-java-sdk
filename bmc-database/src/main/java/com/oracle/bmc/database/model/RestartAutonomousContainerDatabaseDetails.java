/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Request details to restart an Autonomous Container Database with force option. <br>
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
        builder = RestartAutonomousContainerDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RestartAutonomousContainerDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isForceRestart"})
    public RestartAutonomousContainerDatabaseDetails(Boolean isForceRestart) {
        super();
        this.isForceRestart = isForceRestart;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** If set to {@code true}, restarts the Autonomous Container Database with force option. */
        @com.fasterxml.jackson.annotation.JsonProperty("isForceRestart")
        private Boolean isForceRestart;

        /**
         * If set to {@code true}, restarts the Autonomous Container Database with force option.
         *
         * @param isForceRestart the value to set
         * @return this builder
         */
        public Builder isForceRestart(Boolean isForceRestart) {
            this.isForceRestart = isForceRestart;
            this.__explicitlySet__.add("isForceRestart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestartAutonomousContainerDatabaseDetails build() {
            RestartAutonomousContainerDatabaseDetails model =
                    new RestartAutonomousContainerDatabaseDetails(this.isForceRestart);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestartAutonomousContainerDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("isForceRestart")) {
                this.isForceRestart(model.getIsForceRestart());
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

    /** If set to {@code true}, restarts the Autonomous Container Database with force option. */
    @com.fasterxml.jackson.annotation.JsonProperty("isForceRestart")
    private final Boolean isForceRestart;

    /**
     * If set to {@code true}, restarts the Autonomous Container Database with force option.
     *
     * @return the value
     */
    public Boolean getIsForceRestart() {
        return isForceRestart;
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
        sb.append("RestartAutonomousContainerDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isForceRestart=").append(String.valueOf(this.isForceRestart));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestartAutonomousContainerDatabaseDetails)) {
            return false;
        }

        RestartAutonomousContainerDatabaseDetails other =
                (RestartAutonomousContainerDatabaseDetails) o;
        return java.util.Objects.equals(this.isForceRestart, other.isForceRestart)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isForceRestart == null ? 43 : this.isForceRestart.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
