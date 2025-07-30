/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The model group details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = ModelGroupDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HeterogeneousModelGroupDetails.class,
            name = "HETEROGENEOUS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = StackedModelGroupDetails.class,
            name = "STACKED"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HomogeneousModelGroupDetails.class,
            name = "HOMOGENEOUS")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ModelGroupDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"customMetadataList"})
    protected ModelGroupDetails(java.util.List<CustomMetadata> customMetadataList) {
        super();
        this.customMetadataList = customMetadataList;
    }

    /** An array of custom metadata details for the model group. */
    @com.fasterxml.jackson.annotation.JsonProperty("customMetadataList")
    private final java.util.List<CustomMetadata> customMetadataList;

    /**
     * An array of custom metadata details for the model group.
     *
     * @return the value
     */
    public java.util.List<CustomMetadata> getCustomMetadataList() {
        return customMetadataList;
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
        sb.append("ModelGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("customMetadataList=").append(String.valueOf(this.customMetadataList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelGroupDetails)) {
            return false;
        }

        ModelGroupDetails other = (ModelGroupDetails) o;
        return java.util.Objects.equals(this.customMetadataList, other.customMetadataList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.customMetadataList == null
                                ? 43
                                : this.customMetadataList.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
