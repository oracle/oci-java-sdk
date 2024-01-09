/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * A summary of job details that is specific to the operation type. <br>
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
        defaultImpl = JobOperationDetailsSummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ApplyRollbackJobOperationDetailsSummary.class,
            name = "APPLY_ROLLBACK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ImportTfStateJobOperationDetailsSummary.class,
            name = "IMPORT_TF_STATE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PlanRollbackJobOperationDetailsSummary.class,
            name = "PLAN_ROLLBACK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PlanJobOperationDetailsSummary.class,
            name = "PLAN"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DestroyJobOperationDetailsSummary.class,
            name = "DESTROY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ApplyJobOperationDetailsSummary.class,
            name = "APPLY")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class JobOperationDetailsSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected JobOperationDetailsSummary() {
        super();
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
        sb.append("JobOperationDetailsSummary(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobOperationDetailsSummary)) {
            return false;
        }

        JobOperationDetailsSummary other = (JobOperationDetailsSummary) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
