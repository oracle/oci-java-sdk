/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of a exadata configuration for a resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource",
    defaultImpl = ExadataConfigurationSummary.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExadataDatabaseMachineConfigurationSummary.class,
        name = "EM_MANAGED_EXTERNAL_EXADATA"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ExadataExacsConfigurationSummary.class,
        name = "PE_COMANAGED_EXADATA"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ExadataConfigurationSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "exadataInsightId",
        "compartmentId",
        "exadataName",
        "exadataDisplayName",
        "exadataType",
        "exadataRackType",
        "definedTags",
        "freeformTags",
        "vmclusterDetails"
    })
    protected ExadataConfigurationSummary(
            String exadataInsightId,
            String compartmentId,
            String exadataName,
            String exadataDisplayName,
            ExadataType exadataType,
            ExadataRackType exadataRackType,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.List<VmClusterSummary> vmclusterDetails) {
        super();
        this.exadataInsightId = exadataInsightId;
        this.compartmentId = compartmentId;
        this.exadataName = exadataName;
        this.exadataDisplayName = exadataDisplayName;
        this.exadataType = exadataType;
        this.exadataRackType = exadataRackType;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.vmclusterDetails = vmclusterDetails;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
    private final String exadataInsightId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     * @return the value
     **/
    public String getExadataInsightId() {
        return exadataInsightId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The Exadata system name. If the Exadata systems managed by Enterprise Manager, the name is unique amongst the Exadata systems managed by the same Enterprise Manager.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataName")
    private final String exadataName;

    /**
     * The Exadata system name. If the Exadata systems managed by Enterprise Manager, the name is unique amongst the Exadata systems managed by the same Enterprise Manager.
     * @return the value
     **/
    public String getExadataName() {
        return exadataName;
    }

    /**
     * The user-friendly name for the Exadata system. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataDisplayName")
    private final String exadataDisplayName;

    /**
     * The user-friendly name for the Exadata system. The name does not have to be unique.
     * @return the value
     **/
    public String getExadataDisplayName() {
        return exadataDisplayName;
    }

    /**
     * Operations Insights internal representation of the the Exadata system type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataType")
    private final ExadataType exadataType;

    /**
     * Operations Insights internal representation of the the Exadata system type.
     * @return the value
     **/
    public ExadataType getExadataType() {
        return exadataType;
    }

    /**
     * Exadata rack type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataRackType")
    private final ExadataRackType exadataRackType;

    /**
     * Exadata rack type.
     * @return the value
     **/
    public ExadataRackType getExadataRackType() {
        return exadataRackType;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Array of objects containing VM cluster information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmclusterDetails")
    private final java.util.List<VmClusterSummary> vmclusterDetails;

    /**
     * Array of objects containing VM cluster information.
     * @return the value
     **/
    public java.util.List<VmClusterSummary> getVmclusterDetails() {
        return vmclusterDetails;
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
        sb.append("ExadataConfigurationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("exadataInsightId=").append(String.valueOf(this.exadataInsightId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", exadataName=").append(String.valueOf(this.exadataName));
        sb.append(", exadataDisplayName=").append(String.valueOf(this.exadataDisplayName));
        sb.append(", exadataType=").append(String.valueOf(this.exadataType));
        sb.append(", exadataRackType=").append(String.valueOf(this.exadataRackType));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", vmclusterDetails=").append(String.valueOf(this.vmclusterDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataConfigurationSummary)) {
            return false;
        }

        ExadataConfigurationSummary other = (ExadataConfigurationSummary) o;
        return java.util.Objects.equals(this.exadataInsightId, other.exadataInsightId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.exadataName, other.exadataName)
                && java.util.Objects.equals(this.exadataDisplayName, other.exadataDisplayName)
                && java.util.Objects.equals(this.exadataType, other.exadataType)
                && java.util.Objects.equals(this.exadataRackType, other.exadataRackType)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.vmclusterDetails, other.vmclusterDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.exadataInsightId == null ? 43 : this.exadataInsightId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.exadataName == null ? 43 : this.exadataName.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataDisplayName == null
                                ? 43
                                : this.exadataDisplayName.hashCode());
        result = (result * PRIME) + (this.exadataType == null ? 43 : this.exadataType.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataRackType == null ? 43 : this.exadataRackType.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.vmclusterDetails == null ? 43 : this.vmclusterDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
