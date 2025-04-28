/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * An agent entity that can be imported into Operations Insights. <br>
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
        defaultImpl = ImportableAgentEntitySummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HostImportableAgentEntitySummary.class,
            name = "MACS_MANAGED_EXTERNAL_HOST")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ImportableAgentEntitySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"managementAgentId", "managementAgentDisplayName"})
    protected ImportableAgentEntitySummary(
            String managementAgentId, String managementAgentDisplayName) {
        super();
        this.managementAgentId = managementAgentId;
        this.managementAgentDisplayName = managementAgentDisplayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Management Agent
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Management Agent
     *
     * @return the value
     */
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /**
     * The [Display
     * Name](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Display) of the
     * Management Agent
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentDisplayName")
    private final String managementAgentDisplayName;

    /**
     * The [Display
     * Name](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm#Display) of the
     * Management Agent
     *
     * @return the value
     */
    public String getManagementAgentDisplayName() {
        return managementAgentDisplayName;
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
        sb.append("ImportableAgentEntitySummary(");
        sb.append("super=").append(super.toString());
        sb.append("managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", managementAgentDisplayName=")
                .append(String.valueOf(this.managementAgentDisplayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportableAgentEntitySummary)) {
            return false;
        }

        ImportableAgentEntitySummary other = (ImportableAgentEntitySummary) o;
        return java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(
                        this.managementAgentDisplayName, other.managementAgentDisplayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentDisplayName == null
                                ? 43
                                : this.managementAgentDisplayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
