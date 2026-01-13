/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * <br>
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
        builder = AttachVnicDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AttachVnicDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "createVnicDetails",
        "displayName",
        "instanceId",
        "nicIndex"
    })
    public AttachVnicDetails(
            CreateVnicDetails createVnicDetails,
            String displayName,
            String instanceId,
            Integer nicIndex) {
        super();
        this.createVnicDetails = createVnicDetails;
        this.displayName = displayName;
        this.instanceId = instanceId;
        this.nicIndex = nicIndex;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
        private CreateVnicDetails createVnicDetails;

        public Builder createVnicDetails(CreateVnicDetails createVnicDetails) {
            this.createVnicDetails = createVnicDetails;
            this.__explicitlySet__.add("createVnicDetails");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The OCID of the instance.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * Which physical network interface card (NIC) the VNIC will use. Defaults to 0. Certain
         * bare metal instance shapes have two active physical NICs (0 and 1). If you add a
         * secondary VNIC to one of these instances, you can specify which NIC the VNIC will use.
         * For more information, see [Virtual Network Interface Cards
         * (VNICs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nicIndex")
        private Integer nicIndex;

        /**
         * Which physical network interface card (NIC) the VNIC will use. Defaults to 0. Certain
         * bare metal instance shapes have two active physical NICs (0 and 1). If you add a
         * secondary VNIC to one of these instances, you can specify which NIC the VNIC will use.
         * For more information, see [Virtual Network Interface Cards
         * (VNICs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
         *
         * @param nicIndex the value to set
         * @return this builder
         */
        public Builder nicIndex(Integer nicIndex) {
            this.nicIndex = nicIndex;
            this.__explicitlySet__.add("nicIndex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachVnicDetails build() {
            AttachVnicDetails model =
                    new AttachVnicDetails(
                            this.createVnicDetails,
                            this.displayName,
                            this.instanceId,
                            this.nicIndex);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachVnicDetails model) {
            if (model.wasPropertyExplicitlySet("createVnicDetails")) {
                this.createVnicDetails(model.getCreateVnicDetails());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("nicIndex")) {
                this.nicIndex(model.getNicIndex());
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

    @com.fasterxml.jackson.annotation.JsonProperty("createVnicDetails")
    private final CreateVnicDetails createVnicDetails;

    public CreateVnicDetails getCreateVnicDetails() {
        return createVnicDetails;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The OCID of the instance.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Which physical network interface card (NIC) the VNIC will use. Defaults to 0. Certain bare
     * metal instance shapes have two active physical NICs (0 and 1). If you add a secondary VNIC to
     * one of these instances, you can specify which NIC the VNIC will use. For more information,
     * see [Virtual Network Interface Cards
     * (VNICs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nicIndex")
    private final Integer nicIndex;

    /**
     * Which physical network interface card (NIC) the VNIC will use. Defaults to 0. Certain bare
     * metal instance shapes have two active physical NICs (0 and 1). If you add a secondary VNIC to
     * one of these instances, you can specify which NIC the VNIC will use. For more information,
     * see [Virtual Network Interface Cards
     * (VNICs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     *
     * @return the value
     */
    public Integer getNicIndex() {
        return nicIndex;
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
        sb.append("AttachVnicDetails(");
        sb.append("super=").append(super.toString());
        sb.append("createVnicDetails=").append(String.valueOf(this.createVnicDetails));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", nicIndex=").append(String.valueOf(this.nicIndex));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachVnicDetails)) {
            return false;
        }

        AttachVnicDetails other = (AttachVnicDetails) o;
        return java.util.Objects.equals(this.createVnicDetails, other.createVnicDetails)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.nicIndex, other.nicIndex)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.createVnicDetails == null ? 43 : this.createVnicDetails.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.nicIndex == null ? 43 : this.nicIndex.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
