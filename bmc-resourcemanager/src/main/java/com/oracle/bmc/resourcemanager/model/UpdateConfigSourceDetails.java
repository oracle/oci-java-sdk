/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Updates the property details for the configuration source.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configSourceType",
    defaultImpl = UpdateConfigSourceDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateGitConfigSourceDetails.class,
        name = "GIT_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateObjectStorageConfigSourceDetails.class,
        name = "OBJECT_STORAGE_CONFIG_SOURCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateZipUploadConfigSourceDetails.class,
        name = "ZIP_UPLOAD"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateConfigSourceDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"workingDirectory"})
    protected UpdateConfigSourceDetails(String workingDirectory) {
        super();
        this.workingDirectory = workingDirectory;
    }

    /**
     * File path to the directory to use for running Terraform.
     * If not specified, the root directory is used.
     * Required when using a zip Terraform configuration ({@code configSourceType} value of {@code ZIP_UPLOAD}) that contains folders.
     * Ignored for the {@code configSourceType} value of {@code COMPARTMENT_CONFIG_SOURCE}.
     * For more information about required and recommended file structure, see
     * [File Structure (Terraform Configurations for Resource Manager)](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/terraformconfigresourcemanager.htm#filestructure).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workingDirectory")
    private final String workingDirectory;

    /**
     * File path to the directory to use for running Terraform.
     * If not specified, the root directory is used.
     * Required when using a zip Terraform configuration ({@code configSourceType} value of {@code ZIP_UPLOAD}) that contains folders.
     * Ignored for the {@code configSourceType} value of {@code COMPARTMENT_CONFIG_SOURCE}.
     * For more information about required and recommended file structure, see
     * [File Structure (Terraform Configurations for Resource Manager)](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/terraformconfigresourcemanager.htm#filestructure).
     *
     * @return the value
     **/
    public String getWorkingDirectory() {
        return workingDirectory;
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
        sb.append("UpdateConfigSourceDetails(");
        sb.append("workingDirectory=").append(String.valueOf(this.workingDirectory));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConfigSourceDetails)) {
            return false;
        }

        UpdateConfigSourceDetails other = (UpdateConfigSourceDetails) o;
        return java.util.Objects.equals(this.workingDirectory, other.workingDirectory);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.workingDirectory == null ? 43 : this.workingDirectory.hashCode());
        return result;
    }
}
