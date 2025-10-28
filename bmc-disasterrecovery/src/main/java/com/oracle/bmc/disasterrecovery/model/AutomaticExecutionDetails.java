/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details of the event that started the automatic DR plan execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AutomaticExecutionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutomaticExecutionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"eventName", "memberId"})
    public AutomaticExecutionDetails(String eventName, String memberId) {
        super();
        this.eventName = eventName;
        this.memberId = memberId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the OCI event that started the automatic DR plan execution.
         *
         * <p>Example: {@code SwitchoverAutonomousDatabase}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("eventName")
        private String eventName;

        /**
         * The name of the OCI event that started the automatic DR plan execution.
         *
         * <p>Example: {@code SwitchoverAutonomousDatabase}
         *
         * @param eventName the value to set
         * @return this builder
         */
        public Builder eventName(String eventName) {
            this.eventName = eventName;
            this.__explicitlySet__.add("eventName");
            return this;
        }
        /**
         * The OCID of the member that emitted the event that started the automatic DR plan
         * execution.
         *
         * <p>Example: "ocid1.autonomousdatabase.oc1..uniqueID"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("memberId")
        private String memberId;

        /**
         * The OCID of the member that emitted the event that started the automatic DR plan
         * execution.
         *
         * <p>Example: "ocid1.autonomousdatabase.oc1..uniqueID"
         *
         * @param memberId the value to set
         * @return this builder
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            this.__explicitlySet__.add("memberId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutomaticExecutionDetails build() {
            AutomaticExecutionDetails model =
                    new AutomaticExecutionDetails(this.eventName, this.memberId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutomaticExecutionDetails model) {
            if (model.wasPropertyExplicitlySet("eventName")) {
                this.eventName(model.getEventName());
            }
            if (model.wasPropertyExplicitlySet("memberId")) {
                this.memberId(model.getMemberId());
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
     * The name of the OCI event that started the automatic DR plan execution.
     *
     * <p>Example: {@code SwitchoverAutonomousDatabase}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("eventName")
    private final String eventName;

    /**
     * The name of the OCI event that started the automatic DR plan execution.
     *
     * <p>Example: {@code SwitchoverAutonomousDatabase}
     *
     * @return the value
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * The OCID of the member that emitted the event that started the automatic DR plan execution.
     *
     * <p>Example: "ocid1.autonomousdatabase.oc1..uniqueID"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memberId")
    private final String memberId;

    /**
     * The OCID of the member that emitted the event that started the automatic DR plan execution.
     *
     * <p>Example: "ocid1.autonomousdatabase.oc1..uniqueID"
     *
     * @return the value
     */
    public String getMemberId() {
        return memberId;
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
        sb.append("AutomaticExecutionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("eventName=").append(String.valueOf(this.eventName));
        sb.append(", memberId=").append(String.valueOf(this.memberId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutomaticExecutionDetails)) {
            return false;
        }

        AutomaticExecutionDetails other = (AutomaticExecutionDetails) o;
        return java.util.Objects.equals(this.eventName, other.eventName)
                && java.util.Objects.equals(this.memberId, other.memberId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.eventName == null ? 43 : this.eventName.hashCode());
        result = (result * PRIME) + (this.memberId == null ? 43 : this.memberId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
