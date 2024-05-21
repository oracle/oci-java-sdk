/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Details for scheduling HSM resource deletion.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScheduleHsmClusterDeletionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScheduleHsmClusterDeletionDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeOfDeletion"})
    public ScheduleHsmClusterDeletionDetails(java.util.Date timeOfDeletion) {
        super();
        this.timeOfDeletion = timeOfDeletion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An optional property indicating when to delete the HsmCluster resource, expressed in
         * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. The specified
         * time must be between 7 and 30 days from the time when the request is received.
         * If this property is missing, it will be set to 30 days from the time of the request
         * by default.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * An optional property indicating when to delete the HsmCluster resource, expressed in
         * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. The specified
         * time must be between 7 and 30 days from the time when the request is received.
         * If this property is missing, it will be set to 30 days from the time of the request
         * by default.
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         **/
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduleHsmClusterDeletionDetails build() {
            ScheduleHsmClusterDeletionDetails model =
                    new ScheduleHsmClusterDeletionDetails(this.timeOfDeletion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduleHsmClusterDeletionDetails model) {
            if (model.wasPropertyExplicitlySet("timeOfDeletion")) {
                this.timeOfDeletion(model.getTimeOfDeletion());
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
     * An optional property indicating when to delete the HsmCluster resource, expressed in
     * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. The specified
     * time must be between 7 and 30 days from the time when the request is received.
     * If this property is missing, it will be set to 30 days from the time of the request
     * by default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * An optional property indicating when to delete the HsmCluster resource, expressed in
     * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. The specified
     * time must be between 7 and 30 days from the time when the request is received.
     * If this property is missing, it will be set to 30 days from the time of the request
     * by default.
     *
     * @return the value
     **/
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
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
        sb.append("ScheduleHsmClusterDeletionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduleHsmClusterDeletionDetails)) {
            return false;
        }

        ScheduleHsmClusterDeletionDetails other = (ScheduleHsmClusterDeletionDetails) o;
        return java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
