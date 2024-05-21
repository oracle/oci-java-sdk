/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the management station details used to configure a managed instance.
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
    builder = ManagementStationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagementStationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "primaryManagementStationId",
        "secondaryManagementStationId",
        "workRequestDetails"
    })
    public ManagementStationDetails(
            String primaryManagementStationId,
            String secondaryManagementStationId,
            WorkRequestDetails workRequestDetails) {
        super();
        this.primaryManagementStationId = primaryManagementStationId;
        this.secondaryManagementStationId = secondaryManagementStationId;
        this.workRequestDetails = workRequestDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management station for the instance to use as primary management station.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryManagementStationId")
        private String primaryManagementStationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management station for the instance to use as primary management station.
         *
         * @param primaryManagementStationId the value to set
         * @return this builder
         **/
        public Builder primaryManagementStationId(String primaryManagementStationId) {
            this.primaryManagementStationId = primaryManagementStationId;
            this.__explicitlySet__.add("primaryManagementStationId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management station for the instance to use as secondary managment station.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secondaryManagementStationId")
        private String secondaryManagementStationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management station for the instance to use as secondary managment station.
         *
         * @param secondaryManagementStationId the value to set
         * @return this builder
         **/
        public Builder secondaryManagementStationId(String secondaryManagementStationId) {
            this.secondaryManagementStationId = secondaryManagementStationId;
            this.__explicitlySet__.add("secondaryManagementStationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workRequestDetails")
        private WorkRequestDetails workRequestDetails;

        public Builder workRequestDetails(WorkRequestDetails workRequestDetails) {
            this.workRequestDetails = workRequestDetails;
            this.__explicitlySet__.add("workRequestDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementStationDetails build() {
            ManagementStationDetails model =
                    new ManagementStationDetails(
                            this.primaryManagementStationId,
                            this.secondaryManagementStationId,
                            this.workRequestDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementStationDetails model) {
            if (model.wasPropertyExplicitlySet("primaryManagementStationId")) {
                this.primaryManagementStationId(model.getPrimaryManagementStationId());
            }
            if (model.wasPropertyExplicitlySet("secondaryManagementStationId")) {
                this.secondaryManagementStationId(model.getSecondaryManagementStationId());
            }
            if (model.wasPropertyExplicitlySet("workRequestDetails")) {
                this.workRequestDetails(model.getWorkRequestDetails());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management station for the instance to use as primary management station.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryManagementStationId")
    private final String primaryManagementStationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management station for the instance to use as primary management station.
     *
     * @return the value
     **/
    public String getPrimaryManagementStationId() {
        return primaryManagementStationId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management station for the instance to use as secondary managment station.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secondaryManagementStationId")
    private final String secondaryManagementStationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management station for the instance to use as secondary managment station.
     *
     * @return the value
     **/
    public String getSecondaryManagementStationId() {
        return secondaryManagementStationId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("workRequestDetails")
    private final WorkRequestDetails workRequestDetails;

    public WorkRequestDetails getWorkRequestDetails() {
        return workRequestDetails;
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
        sb.append("ManagementStationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("primaryManagementStationId=")
                .append(String.valueOf(this.primaryManagementStationId));
        sb.append(", secondaryManagementStationId=")
                .append(String.valueOf(this.secondaryManagementStationId));
        sb.append(", workRequestDetails=").append(String.valueOf(this.workRequestDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementStationDetails)) {
            return false;
        }

        ManagementStationDetails other = (ManagementStationDetails) o;
        return java.util.Objects.equals(
                        this.primaryManagementStationId, other.primaryManagementStationId)
                && java.util.Objects.equals(
                        this.secondaryManagementStationId, other.secondaryManagementStationId)
                && java.util.Objects.equals(this.workRequestDetails, other.workRequestDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.primaryManagementStationId == null
                                ? 43
                                : this.primaryManagementStationId.hashCode());
        result =
                (result * PRIME)
                        + (this.secondaryManagementStationId == null
                                ? 43
                                : this.secondaryManagementStationId.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestDetails == null
                                ? 43
                                : this.workRequestDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
