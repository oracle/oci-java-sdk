/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * A compute entity that can be imported into Operations Insights. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource",
        defaultImpl = ImportableComputeEntitySummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CloudImportableComputeEntitySummary.class,
            name = "MACS_MANAGED_CLOUD_HOST")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ImportableComputeEntitySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"computeId", "computeDisplayName", "compartmentId"})
    protected ImportableComputeEntitySummary(
            String computeId, String computeDisplayName, String compartmentId) {
        super();
        this.computeId = computeId;
        this.computeDisplayName = computeDisplayName;
        this.compartmentId = compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Compute Instance
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeId")
    private final String computeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Compute Instance
     *
     * @return the value
     */
    public String getComputeId() {
        return computeId;
    }

    /**
     * The [Display
     * Name](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Display) of the
     * Compute Instance
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeDisplayName")
    private final String computeDisplayName;

    /**
     * The [Display
     * Name](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Display) of the
     * Compute Instance
     *
     * @return the value
     */
    public String getComputeDisplayName() {
        return computeDisplayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
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
        sb.append("ImportableComputeEntitySummary(");
        sb.append("super=").append(super.toString());
        sb.append("computeId=").append(String.valueOf(this.computeId));
        sb.append(", computeDisplayName=").append(String.valueOf(this.computeDisplayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportableComputeEntitySummary)) {
            return false;
        }

        ImportableComputeEntitySummary other = (ImportableComputeEntitySummary) o;
        return java.util.Objects.equals(this.computeId, other.computeId)
                && java.util.Objects.equals(this.computeDisplayName, other.computeDisplayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.computeId == null ? 43 : this.computeId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeDisplayName == null
                                ? 43
                                : this.computeDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
