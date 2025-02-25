/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides additional information for the work request associated with an event.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkRequestEventDataAdditionalDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestEventDataAdditionalDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"initiatorId", "workRequestIds"})
    public WorkRequestEventDataAdditionalDetails(
            String initiatorId, java.util.List<String> workRequestIds) {
        super();
        this.initiatorId = initiatorId;
        this.workRequestIds = workRequestIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource that triggered the event, such as scheduled job id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("initiatorId")
        private String initiatorId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource that triggered the event, such as scheduled job id.
         * @param initiatorId the value to set
         * @return this builder
         **/
        public Builder initiatorId(String initiatorId) {
            this.initiatorId = initiatorId;
            this.__explicitlySet__.add("initiatorId");
            return this;
        }
        /**
         * List of all work request [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with the event.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestIds")
        private java.util.List<String> workRequestIds;

        /**
         * List of all work request [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with the event.
         * @param workRequestIds the value to set
         * @return this builder
         **/
        public Builder workRequestIds(java.util.List<String> workRequestIds) {
            this.workRequestIds = workRequestIds;
            this.__explicitlySet__.add("workRequestIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestEventDataAdditionalDetails build() {
            WorkRequestEventDataAdditionalDetails model =
                    new WorkRequestEventDataAdditionalDetails(
                            this.initiatorId, this.workRequestIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestEventDataAdditionalDetails model) {
            if (model.wasPropertyExplicitlySet("initiatorId")) {
                this.initiatorId(model.getInitiatorId());
            }
            if (model.wasPropertyExplicitlySet("workRequestIds")) {
                this.workRequestIds(model.getWorkRequestIds());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource that triggered the event, such as scheduled job id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initiatorId")
    private final String initiatorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource that triggered the event, such as scheduled job id.
     * @return the value
     **/
    public String getInitiatorId() {
        return initiatorId;
    }

    /**
     * List of all work request [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with the event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestIds")
    private final java.util.List<String> workRequestIds;

    /**
     * List of all work request [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with the event.
     * @return the value
     **/
    public java.util.List<String> getWorkRequestIds() {
        return workRequestIds;
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
        sb.append("WorkRequestEventDataAdditionalDetails(");
        sb.append("super=").append(super.toString());
        sb.append("initiatorId=").append(String.valueOf(this.initiatorId));
        sb.append(", workRequestIds=").append(String.valueOf(this.workRequestIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestEventDataAdditionalDetails)) {
            return false;
        }

        WorkRequestEventDataAdditionalDetails other = (WorkRequestEventDataAdditionalDetails) o;
        return java.util.Objects.equals(this.initiatorId, other.initiatorId)
                && java.util.Objects.equals(this.workRequestIds, other.workRequestIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.initiatorId == null ? 43 : this.initiatorId.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestIds == null ? 43 : this.workRequestIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
