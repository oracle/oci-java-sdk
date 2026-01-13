/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Job details that are specific to the operation type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "operation",
        defaultImpl = CreateJobOperationDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateImportTfStateJobOperationDetails.class,
            name = "IMPORT_TF_STATE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreatePlanRollbackJobOperationDetails.class,
            name = "PLAN_ROLLBACK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateApplyRollbackJobOperationDetails.class,
            name = "APPLY_ROLLBACK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateApplyJobOperationDetails.class,
            name = "APPLY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreatePlanJobOperationDetails.class,
            name = "PLAN"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateDestroyJobOperationDetails.class,
            name = "DESTROY")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateJobOperationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isProviderUpgradeRequired"})
    protected CreateJobOperationDetails(Boolean isProviderUpgradeRequired) {
        super();
        this.isProviderUpgradeRequired = isProviderUpgradeRequired;
    }

    /**
     * Specifies whether or not to upgrade provider versions. Within the version constraints of your
     * Terraform configuration, use the latest versions available from the source of Terraform
     * providers. For more information about this option, see [Dependency Lock File
     * (terraform.io)](https://www.terraform.io/language/files/dependency-lock).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isProviderUpgradeRequired")
    private final Boolean isProviderUpgradeRequired;

    /**
     * Specifies whether or not to upgrade provider versions. Within the version constraints of your
     * Terraform configuration, use the latest versions available from the source of Terraform
     * providers. For more information about this option, see [Dependency Lock File
     * (terraform.io)](https://www.terraform.io/language/files/dependency-lock).
     *
     * @return the value
     */
    public Boolean getIsProviderUpgradeRequired() {
        return isProviderUpgradeRequired;
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
        sb.append("CreateJobOperationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isProviderUpgradeRequired=")
                .append(String.valueOf(this.isProviderUpgradeRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateJobOperationDetails)) {
            return false;
        }

        CreateJobOperationDetails other = (CreateJobOperationDetails) o;
        return java.util.Objects.equals(
                        this.isProviderUpgradeRequired, other.isProviderUpgradeRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isProviderUpgradeRequired == null
                                ? 43
                                : this.isProviderUpgradeRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
