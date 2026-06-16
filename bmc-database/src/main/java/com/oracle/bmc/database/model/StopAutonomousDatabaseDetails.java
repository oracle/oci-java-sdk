/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Request details to stop an Autonomous Database with force option. <br>
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
        builder = StopAutonomousDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StopAutonomousDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isForceStop"})
    public StopAutonomousDatabaseDetails(Boolean isForceStop) {
        super();
        this.isForceStop = isForceStop;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** If set to {@code true}, stops the Autonomous Database with force option. */
        @com.fasterxml.jackson.annotation.JsonProperty("isForceStop")
        private Boolean isForceStop;

        /**
         * If set to {@code true}, stops the Autonomous Database with force option.
         *
         * @param isForceStop the value to set
         * @return this builder
         */
        public Builder isForceStop(Boolean isForceStop) {
            this.isForceStop = isForceStop;
            this.__explicitlySet__.add("isForceStop");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StopAutonomousDatabaseDetails build() {
            StopAutonomousDatabaseDetails model =
                    new StopAutonomousDatabaseDetails(this.isForceStop);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StopAutonomousDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("isForceStop")) {
                this.isForceStop(model.getIsForceStop());
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

    /** If set to {@code true}, stops the Autonomous Database with force option. */
    @com.fasterxml.jackson.annotation.JsonProperty("isForceStop")
    private final Boolean isForceStop;

    /**
     * If set to {@code true}, stops the Autonomous Database with force option.
     *
     * @return the value
     */
    public Boolean getIsForceStop() {
        return isForceStop;
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
        sb.append("StopAutonomousDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isForceStop=").append(String.valueOf(this.isForceStop));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StopAutonomousDatabaseDetails)) {
            return false;
        }

        StopAutonomousDatabaseDetails other = (StopAutonomousDatabaseDetails) o;
        return java.util.Objects.equals(this.isForceStop, other.isForceStop) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isForceStop == null ? 43 : this.isForceStop.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
