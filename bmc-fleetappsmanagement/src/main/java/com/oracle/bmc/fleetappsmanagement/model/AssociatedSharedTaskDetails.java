/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The details of the shared task. Tasks that are part of the task library and can be reused across
 * runbooks. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AssociatedSharedTaskDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "scope")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssociatedSharedTaskDetails extends AssociatedTaskDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ID of taskRecord. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskRecordId")
        private String taskRecordId;

        /**
         * The ID of taskRecord.
         *
         * @param taskRecordId the value to set
         * @return this builder
         */
        public Builder taskRecordId(String taskRecordId) {
            this.taskRecordId = taskRecordId;
            this.__explicitlySet__.add("taskRecordId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociatedSharedTaskDetails build() {
            AssociatedSharedTaskDetails model = new AssociatedSharedTaskDetails(this.taskRecordId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociatedSharedTaskDetails model) {
            if (model.wasPropertyExplicitlySet("taskRecordId")) {
                this.taskRecordId(model.getTaskRecordId());
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
    public AssociatedSharedTaskDetails(String taskRecordId) {
        super();
        this.taskRecordId = taskRecordId;
    }

    /** The ID of taskRecord. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskRecordId")
    private final String taskRecordId;

    /**
     * The ID of taskRecord.
     *
     * @return the value
     */
    public String getTaskRecordId() {
        return taskRecordId;
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
        sb.append("AssociatedSharedTaskDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", taskRecordId=").append(String.valueOf(this.taskRecordId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociatedSharedTaskDetails)) {
            return false;
        }

        AssociatedSharedTaskDetails other = (AssociatedSharedTaskDetails) o;
        return java.util.Objects.equals(this.taskRecordId, other.taskRecordId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.taskRecordId == null ? 43 : this.taskRecordId.hashCode());
        return result;
    }
}
