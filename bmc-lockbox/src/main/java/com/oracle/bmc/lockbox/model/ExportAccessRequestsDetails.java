/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox.model;

/**
 * Details for generating report of Access Requests to export action <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220126")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExportAccessRequestsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportAccessRequestsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"lockboxId", "timeCreatedAfter", "timeCreatedBefore"})
    public ExportAccessRequestsDetails(
            String lockboxId, java.util.Date timeCreatedAfter, java.util.Date timeCreatedBefore) {
        super();
        this.lockboxId = lockboxId;
        this.timeCreatedAfter = timeCreatedAfter;
        this.timeCreatedBefore = timeCreatedBefore;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier (OCID) of the lockbox box that the access request is associated
         * with which is immutable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lockboxId")
        private String lockboxId;

        /**
         * The unique identifier (OCID) of the lockbox box that the access request is associated
         * with which is immutable.
         *
         * @param lockboxId the value to set
         * @return this builder
         */
        public Builder lockboxId(String lockboxId) {
            this.lockboxId = lockboxId;
            this.__explicitlySet__.add("lockboxId");
            return this;
        }
        /**
         * Date and time after which access requests were created, as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedAfter")
        private java.util.Date timeCreatedAfter;

        /**
         * Date and time after which access requests were created, as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339)
         *
         * @param timeCreatedAfter the value to set
         * @return this builder
         */
        public Builder timeCreatedAfter(java.util.Date timeCreatedAfter) {
            this.timeCreatedAfter = timeCreatedAfter;
            this.__explicitlySet__.add("timeCreatedAfter");
            return this;
        }
        /**
         * Date and time before which access requests were created, as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339)s
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedBefore")
        private java.util.Date timeCreatedBefore;

        /**
         * Date and time before which access requests were created, as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339)s
         *
         * @param timeCreatedBefore the value to set
         * @return this builder
         */
        public Builder timeCreatedBefore(java.util.Date timeCreatedBefore) {
            this.timeCreatedBefore = timeCreatedBefore;
            this.__explicitlySet__.add("timeCreatedBefore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportAccessRequestsDetails build() {
            ExportAccessRequestsDetails model =
                    new ExportAccessRequestsDetails(
                            this.lockboxId, this.timeCreatedAfter, this.timeCreatedBefore);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportAccessRequestsDetails model) {
            if (model.wasPropertyExplicitlySet("lockboxId")) {
                this.lockboxId(model.getLockboxId());
            }
            if (model.wasPropertyExplicitlySet("timeCreatedAfter")) {
                this.timeCreatedAfter(model.getTimeCreatedAfter());
            }
            if (model.wasPropertyExplicitlySet("timeCreatedBefore")) {
                this.timeCreatedBefore(model.getTimeCreatedBefore());
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
     * The unique identifier (OCID) of the lockbox box that the access request is associated with
     * which is immutable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lockboxId")
    private final String lockboxId;

    /**
     * The unique identifier (OCID) of the lockbox box that the access request is associated with
     * which is immutable.
     *
     * @return the value
     */
    public String getLockboxId() {
        return lockboxId;
    }

    /**
     * Date and time after which access requests were created, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedAfter")
    private final java.util.Date timeCreatedAfter;

    /**
     * Date and time after which access requests were created, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339)
     *
     * @return the value
     */
    public java.util.Date getTimeCreatedAfter() {
        return timeCreatedAfter;
    }

    /**
     * Date and time before which access requests were created, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339)s
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedBefore")
    private final java.util.Date timeCreatedBefore;

    /**
     * Date and time before which access requests were created, as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339)s
     *
     * @return the value
     */
    public java.util.Date getTimeCreatedBefore() {
        return timeCreatedBefore;
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
        sb.append("ExportAccessRequestsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("lockboxId=").append(String.valueOf(this.lockboxId));
        sb.append(", timeCreatedAfter=").append(String.valueOf(this.timeCreatedAfter));
        sb.append(", timeCreatedBefore=").append(String.valueOf(this.timeCreatedBefore));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportAccessRequestsDetails)) {
            return false;
        }

        ExportAccessRequestsDetails other = (ExportAccessRequestsDetails) o;
        return java.util.Objects.equals(this.lockboxId, other.lockboxId)
                && java.util.Objects.equals(this.timeCreatedAfter, other.timeCreatedAfter)
                && java.util.Objects.equals(this.timeCreatedBefore, other.timeCreatedBefore)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.lockboxId == null ? 43 : this.lockboxId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedAfter == null ? 43 : this.timeCreatedAfter.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedBefore == null ? 43 : this.timeCreatedBefore.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
