/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information of the VM Cluster which contains databases. Either an opsiPrivateEndpointId or
 * dbmPrivateEndpointId must be specified. If the dbmPrivateEndpointId is specified, a new
 * Operations Insights private endpoint will be created. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreatePeComanagedExadataVmclusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreatePeComanagedExadataVmclusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vmclusterId",
        "opsiPrivateEndpointId",
        "dbmPrivateEndpointId",
        "memberDatabaseDetails",
        "compartmentId"
    })
    public CreatePeComanagedExadataVmclusterDetails(
            String vmclusterId,
            String opsiPrivateEndpointId,
            String dbmPrivateEndpointId,
            java.util.List<CreatePeComanagedDatabaseInsightDetails> memberDatabaseDetails,
            String compartmentId) {
        super();
        this.vmclusterId = vmclusterId;
        this.opsiPrivateEndpointId = opsiPrivateEndpointId;
        this.dbmPrivateEndpointId = dbmPrivateEndpointId;
        this.memberDatabaseDetails = memberDatabaseDetails;
        this.compartmentId = compartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VM Cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmclusterId")
        private String vmclusterId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the VM Cluster.
         *
         * @param vmclusterId the value to set
         * @return this builder
         */
        public Builder vmclusterId(String vmclusterId) {
            this.vmclusterId = vmclusterId;
            this.__explicitlySet__.add("vmclusterId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the OPSI private endpoint
         */
        @com.fasterxml.jackson.annotation.JsonProperty("opsiPrivateEndpointId")
        private String opsiPrivateEndpointId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the OPSI private endpoint
         *
         * @param opsiPrivateEndpointId the value to set
         * @return this builder
         */
        public Builder opsiPrivateEndpointId(String opsiPrivateEndpointId) {
            this.opsiPrivateEndpointId = opsiPrivateEndpointId;
            this.__explicitlySet__.add("opsiPrivateEndpointId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the Database Management private endpoint
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbmPrivateEndpointId")
        private String dbmPrivateEndpointId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the Database Management private endpoint
         *
         * @param dbmPrivateEndpointId the value to set
         * @return this builder
         */
        public Builder dbmPrivateEndpointId(String dbmPrivateEndpointId) {
            this.dbmPrivateEndpointId = dbmPrivateEndpointId;
            this.__explicitlySet__.add("dbmPrivateEndpointId");
            return this;
        }
        /** The databases that belong to the VM Cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("memberDatabaseDetails")
        private java.util.List<CreatePeComanagedDatabaseInsightDetails> memberDatabaseDetails;

        /**
         * The databases that belong to the VM Cluster
         *
         * @param memberDatabaseDetails the value to set
         * @return this builder
         */
        public Builder memberDatabaseDetails(
                java.util.List<CreatePeComanagedDatabaseInsightDetails> memberDatabaseDetails) {
            this.memberDatabaseDetails = memberDatabaseDetails;
            this.__explicitlySet__.add("memberDatabaseDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePeComanagedExadataVmclusterDetails build() {
            CreatePeComanagedExadataVmclusterDetails model =
                    new CreatePeComanagedExadataVmclusterDetails(
                            this.vmclusterId,
                            this.opsiPrivateEndpointId,
                            this.dbmPrivateEndpointId,
                            this.memberDatabaseDetails,
                            this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePeComanagedExadataVmclusterDetails model) {
            if (model.wasPropertyExplicitlySet("vmclusterId")) {
                this.vmclusterId(model.getVmclusterId());
            }
            if (model.wasPropertyExplicitlySet("opsiPrivateEndpointId")) {
                this.opsiPrivateEndpointId(model.getOpsiPrivateEndpointId());
            }
            if (model.wasPropertyExplicitlySet("dbmPrivateEndpointId")) {
                this.dbmPrivateEndpointId(model.getDbmPrivateEndpointId());
            }
            if (model.wasPropertyExplicitlySet("memberDatabaseDetails")) {
                this.memberDatabaseDetails(model.getMemberDatabaseDetails());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VM Cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmclusterId")
    private final String vmclusterId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the VM Cluster.
     *
     * @return the value
     */
    public String getVmclusterId() {
        return vmclusterId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the OPSI private endpoint
     */
    @com.fasterxml.jackson.annotation.JsonProperty("opsiPrivateEndpointId")
    private final String opsiPrivateEndpointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the OPSI private endpoint
     *
     * @return the value
     */
    public String getOpsiPrivateEndpointId() {
        return opsiPrivateEndpointId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Database Management private endpoint
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbmPrivateEndpointId")
    private final String dbmPrivateEndpointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Database Management private endpoint
     *
     * @return the value
     */
    public String getDbmPrivateEndpointId() {
        return dbmPrivateEndpointId;
    }

    /** The databases that belong to the VM Cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("memberDatabaseDetails")
    private final java.util.List<CreatePeComanagedDatabaseInsightDetails> memberDatabaseDetails;

    /**
     * The databases that belong to the VM Cluster
     *
     * @return the value
     */
    public java.util.List<CreatePeComanagedDatabaseInsightDetails> getMemberDatabaseDetails() {
        return memberDatabaseDetails;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("CreatePeComanagedExadataVmclusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vmclusterId=").append(String.valueOf(this.vmclusterId));
        sb.append(", opsiPrivateEndpointId=").append(String.valueOf(this.opsiPrivateEndpointId));
        sb.append(", dbmPrivateEndpointId=").append(String.valueOf(this.dbmPrivateEndpointId));
        sb.append(", memberDatabaseDetails=").append(String.valueOf(this.memberDatabaseDetails));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePeComanagedExadataVmclusterDetails)) {
            return false;
        }

        CreatePeComanagedExadataVmclusterDetails other =
                (CreatePeComanagedExadataVmclusterDetails) o;
        return java.util.Objects.equals(this.vmclusterId, other.vmclusterId)
                && java.util.Objects.equals(this.opsiPrivateEndpointId, other.opsiPrivateEndpointId)
                && java.util.Objects.equals(this.dbmPrivateEndpointId, other.dbmPrivateEndpointId)
                && java.util.Objects.equals(this.memberDatabaseDetails, other.memberDatabaseDetails)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vmclusterId == null ? 43 : this.vmclusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.opsiPrivateEndpointId == null
                                ? 43
                                : this.opsiPrivateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.dbmPrivateEndpointId == null
                                ? 43
                                : this.dbmPrivateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.memberDatabaseDetails == null
                                ? 43
                                : this.memberDatabaseDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
