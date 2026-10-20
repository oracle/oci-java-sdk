/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Represents the location used to share Databricks application artifacts. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "locationType",
        defaultImpl = DatabricksEngineArtifactLocation.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OciObjectStorageDatabricksEngineArtifactLocation.class,
            name = "OCI_OBJECT_STORAGE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AzureDataLakeStorageDatabricksEngineArtifactLocation.class,
            name = "AZURE_DATE_LAKE_STORAGE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UcVolumeDatabricksEngineArtifactLocation.class,
            name = "UC_VOLUME")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DatabricksEngineArtifactLocation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shouldOverwriteExisting"})
    protected DatabricksEngineArtifactLocation(Boolean shouldOverwriteExisting) {
        super();
        this.shouldOverwriteExisting = shouldOverwriteExisting;
    }

    /**
     * Controls whether a staged application artifact replaces an existing file or object with the
     * same name at the configured destination. The artifact is typically a GGFAB pipeline package
     * or one of its dependency files.
     *
     * <p>When set to {@code true}, the existing file or object is replaced with the newly staged
     * version. When set to {@code false}, staging fails or skips the upload rather than replacing
     * it. This setting does not replace the entire target directory or prefix. It allows an updated
     * pipeline or dependency to be deployed when artifact names remain the same across versions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldOverwriteExisting")
    private final Boolean shouldOverwriteExisting;

    /**
     * Controls whether a staged application artifact replaces an existing file or object with the
     * same name at the configured destination. The artifact is typically a GGFAB pipeline package
     * or one of its dependency files.
     *
     * <p>When set to {@code true}, the existing file or object is replaced with the newly staged
     * version. When set to {@code false}, staging fails or skips the upload rather than replacing
     * it. This setting does not replace the entire target directory or prefix. It allows an updated
     * pipeline or dependency to be deployed when artifact names remain the same across versions.
     *
     * @return the value
     */
    public Boolean getShouldOverwriteExisting() {
        return shouldOverwriteExisting;
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
        sb.append("DatabricksEngineArtifactLocation(");
        sb.append("super=").append(super.toString());
        sb.append("shouldOverwriteExisting=").append(String.valueOf(this.shouldOverwriteExisting));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabricksEngineArtifactLocation)) {
            return false;
        }

        DatabricksEngineArtifactLocation other = (DatabricksEngineArtifactLocation) o;
        return java.util.Objects.equals(this.shouldOverwriteExisting, other.shouldOverwriteExisting)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.shouldOverwriteExisting == null
                                ? 43
                                : this.shouldOverwriteExisting.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
