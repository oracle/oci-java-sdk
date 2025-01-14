/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * OPSI data object. <br>
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
        property = "dataObjectType",
        defaultImpl = OpsiDataObject.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HostInsightsDataObject.class,
            name = "HOST_INSIGHTS_DATA_OBJECT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ExadataInsightsDataObject.class,
            name = "EXADATA_INSIGHTS_DATA_OBJECT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseInsightsDataObject.class,
            name = "DATABASE_INSIGHTS_DATA_OBJECT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class OpsiDataObject extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "identifier",
        "displayName",
        "description",
        "name",
        "groupNames",
        "supportedQueryTimePeriod",
        "columnsMetadata",
        "supportedQueryParams"
    })
    protected OpsiDataObject(
            String identifier,
            String displayName,
            String description,
            String name,
            java.util.List<String> groupNames,
            String supportedQueryTimePeriod,
            java.util.List<DataObjectColumnMetadata> columnsMetadata,
            java.util.List<OpsiDataObjectSupportedQueryParam> supportedQueryParams) {
        super();
        this.identifier = identifier;
        this.displayName = displayName;
        this.description = description;
        this.name = name;
        this.groupNames = groupNames;
        this.supportedQueryTimePeriod = supportedQueryTimePeriod;
        this.columnsMetadata = columnsMetadata;
        this.supportedQueryParams = supportedQueryParams;
    }

    /** Unique identifier of OPSI data object. */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Unique identifier of OPSI data object.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** User-friendly name of OPSI data object. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly name of OPSI data object.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of OPSI data object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of OPSI data object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Name of the data object, which can be used in data object queries just like how view names
     * are used in a query.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the data object, which can be used in data object queries just like how view names
     * are used in a query.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Names of all the groups to which the data object belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupNames")
    private final java.util.List<String> groupNames;

    /**
     * Names of all the groups to which the data object belongs to.
     *
     * @return the value
     */
    public java.util.List<String> getGroupNames() {
        return groupNames;
    }

    /**
     * Time period supported by the data object for quering data. Time period is in ISO 8601 format
     * with respect to current time. Default is last 30 days represented by P30D. Examples: P90D
     * (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y (last 12 months).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedQueryTimePeriod")
    private final String supportedQueryTimePeriod;

    /**
     * Time period supported by the data object for quering data. Time period is in ISO 8601 format
     * with respect to current time. Default is last 30 days represented by P30D. Examples: P90D
     * (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y (last 12 months).
     *
     * @return the value
     */
    public String getSupportedQueryTimePeriod() {
        return supportedQueryTimePeriod;
    }

    /** Metadata of columns in a data object. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnsMetadata")
    private final java.util.List<DataObjectColumnMetadata> columnsMetadata;

    /**
     * Metadata of columns in a data object.
     *
     * @return the value
     */
    public java.util.List<DataObjectColumnMetadata> getColumnsMetadata() {
        return columnsMetadata;
    }

    /**
     * Supported query parameters by this OPSI data object that can be configured while a data
     * object query involving this data object is executed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedQueryParams")
    private final java.util.List<OpsiDataObjectSupportedQueryParam> supportedQueryParams;

    /**
     * Supported query parameters by this OPSI data object that can be configured while a data
     * object query involving this data object is executed.
     *
     * @return the value
     */
    public java.util.List<OpsiDataObjectSupportedQueryParam> getSupportedQueryParams() {
        return supportedQueryParams;
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
        sb.append("OpsiDataObject(");
        sb.append("super=").append(super.toString());
        sb.append("identifier=").append(String.valueOf(this.identifier));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", groupNames=").append(String.valueOf(this.groupNames));
        sb.append(", supportedQueryTimePeriod=")
                .append(String.valueOf(this.supportedQueryTimePeriod));
        sb.append(", columnsMetadata=").append(String.valueOf(this.columnsMetadata));
        sb.append(", supportedQueryParams=").append(String.valueOf(this.supportedQueryParams));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpsiDataObject)) {
            return false;
        }

        OpsiDataObject other = (OpsiDataObject) o;
        return java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.groupNames, other.groupNames)
                && java.util.Objects.equals(
                        this.supportedQueryTimePeriod, other.supportedQueryTimePeriod)
                && java.util.Objects.equals(this.columnsMetadata, other.columnsMetadata)
                && java.util.Objects.equals(this.supportedQueryParams, other.supportedQueryParams)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.groupNames == null ? 43 : this.groupNames.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedQueryTimePeriod == null
                                ? 43
                                : this.supportedQueryTimePeriod.hashCode());
        result =
                (result * PRIME)
                        + (this.columnsMetadata == null ? 43 : this.columnsMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedQueryParams == null
                                ? 43
                                : this.supportedQueryParams.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
