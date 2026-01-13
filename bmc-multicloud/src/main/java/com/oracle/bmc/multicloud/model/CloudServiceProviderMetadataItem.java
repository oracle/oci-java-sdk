/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * Cloud Service Provider metadata item. Warning - In future this object can change to generic
 * object with future Cloud Service Provider based on CloudServiceProvider field. This can be one of
 * CSP provider type Azure, GCP and AWS. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "subscriptionType",
        defaultImpl = CloudServiceProviderMetadataItem.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AzureCloudServiceProviderMetadataItem.class,
            name = "ORACLEDBATAZURE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GcpCloudServiceProviderMetadataItem.class,
            name = "ORACLEDBATGOOGLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AwsCloudServiceProviderMetadataItem.class,
            name = "ORACLEDBATAWS")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CloudServiceProviderMetadataItem
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "region",
        "resourceAnchorName",
        "cspResourceAnchorId",
        "cspResourceAnchorName",
        "resourceAnchorUri",
        "cspAdditionalProperties"
    })
    protected CloudServiceProviderMetadataItem(
            String region,
            String resourceAnchorName,
            String cspResourceAnchorId,
            String cspResourceAnchorName,
            String resourceAnchorUri,
            java.util.Map<String, String> cspAdditionalProperties) {
        super();
        this.region = region;
        this.resourceAnchorName = resourceAnchorName;
        this.cspResourceAnchorId = cspResourceAnchorId;
        this.cspResourceAnchorName = cspResourceAnchorName;
        this.resourceAnchorUri = resourceAnchorUri;
        this.cspAdditionalProperties = cspAdditionalProperties;
    }

    /** The Azure, AWS or GCP region. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The Azure, AWS or GCP region.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** OCI resource anchor name. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceAnchorName")
    private final String resourceAnchorName;

    /**
     * OCI resource anchor name.
     *
     * @return the value
     */
    public String getResourceAnchorName() {
        return resourceAnchorName;
    }

    /** CSP resource anchor ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("cspResourceAnchorId")
    private final String cspResourceAnchorId;

    /**
     * CSP resource anchor ID.
     *
     * @return the value
     */
    public String getCspResourceAnchorId() {
        return cspResourceAnchorId;
    }

    /** CSP resource anchor name. */
    @com.fasterxml.jackson.annotation.JsonProperty("cspResourceAnchorName")
    private final String cspResourceAnchorName;

    /**
     * CSP resource anchor name.
     *
     * @return the value
     */
    public String getCspResourceAnchorName() {
        return cspResourceAnchorName;
    }

    /** CSP resource anchor Uri. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceAnchorUri")
    private final String resourceAnchorUri;

    /**
     * CSP resource anchor Uri.
     *
     * @return the value
     */
    public String getResourceAnchorUri() {
        return resourceAnchorUri;
    }

    /** CSP Specific Additional Properties, AzureSubnetId for Azure */
    @com.fasterxml.jackson.annotation.JsonProperty("cspAdditionalProperties")
    private final java.util.Map<String, String> cspAdditionalProperties;

    /**
     * CSP Specific Additional Properties, AzureSubnetId for Azure
     *
     * @return the value
     */
    public java.util.Map<String, String> getCspAdditionalProperties() {
        return cspAdditionalProperties;
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
        sb.append("CloudServiceProviderMetadataItem(");
        sb.append("super=").append(super.toString());
        sb.append("region=").append(String.valueOf(this.region));
        sb.append(", resourceAnchorName=").append(String.valueOf(this.resourceAnchorName));
        sb.append(", cspResourceAnchorId=").append(String.valueOf(this.cspResourceAnchorId));
        sb.append(", cspResourceAnchorName=").append(String.valueOf(this.cspResourceAnchorName));
        sb.append(", resourceAnchorUri=").append(String.valueOf(this.resourceAnchorUri));
        sb.append(", cspAdditionalProperties=")
                .append(String.valueOf(this.cspAdditionalProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudServiceProviderMetadataItem)) {
            return false;
        }

        CloudServiceProviderMetadataItem other = (CloudServiceProviderMetadataItem) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.resourceAnchorName, other.resourceAnchorName)
                && java.util.Objects.equals(this.cspResourceAnchorId, other.cspResourceAnchorId)
                && java.util.Objects.equals(this.cspResourceAnchorName, other.cspResourceAnchorName)
                && java.util.Objects.equals(this.resourceAnchorUri, other.resourceAnchorUri)
                && java.util.Objects.equals(
                        this.cspAdditionalProperties, other.cspAdditionalProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceAnchorName == null
                                ? 43
                                : this.resourceAnchorName.hashCode());
        result =
                (result * PRIME)
                        + (this.cspResourceAnchorId == null
                                ? 43
                                : this.cspResourceAnchorId.hashCode());
        result =
                (result * PRIME)
                        + (this.cspResourceAnchorName == null
                                ? 43
                                : this.cspResourceAnchorName.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceAnchorUri == null ? 43 : this.resourceAnchorUri.hashCode());
        result =
                (result * PRIME)
                        + (this.cspAdditionalProperties == null
                                ? 43
                                : this.cspAdditionalProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
