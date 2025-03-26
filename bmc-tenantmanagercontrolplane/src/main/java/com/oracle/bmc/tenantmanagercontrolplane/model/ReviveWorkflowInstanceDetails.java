/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * The parameters for reviving failed workflow
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReviveWorkflowInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReviveWorkflowInstanceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"workflowInstanceId", "workflowInstanceName"})
    public ReviveWorkflowInstanceDetails(String workflowInstanceId, String workflowInstanceName) {
        super();
        this.workflowInstanceId = workflowInstanceId;
        this.workflowInstanceName = workflowInstanceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Id of failed workflow
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workflowInstanceId")
        private String workflowInstanceId;

        /**
         * Id of failed workflow
         * @param workflowInstanceId the value to set
         * @return this builder
         **/
        public Builder workflowInstanceId(String workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            this.__explicitlySet__.add("workflowInstanceId");
            return this;
        }
        /**
         * Service specific workflow instance name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workflowInstanceName")
        private String workflowInstanceName;

        /**
         * Service specific workflow instance name
         * @param workflowInstanceName the value to set
         * @return this builder
         **/
        public Builder workflowInstanceName(String workflowInstanceName) {
            this.workflowInstanceName = workflowInstanceName;
            this.__explicitlySet__.add("workflowInstanceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReviveWorkflowInstanceDetails build() {
            ReviveWorkflowInstanceDetails model =
                    new ReviveWorkflowInstanceDetails(
                            this.workflowInstanceId, this.workflowInstanceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReviveWorkflowInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("workflowInstanceId")) {
                this.workflowInstanceId(model.getWorkflowInstanceId());
            }
            if (model.wasPropertyExplicitlySet("workflowInstanceName")) {
                this.workflowInstanceName(model.getWorkflowInstanceName());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Id of failed workflow
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workflowInstanceId")
    private final String workflowInstanceId;

    /**
     * Id of failed workflow
     * @return the value
     **/
    public String getWorkflowInstanceId() {
        return workflowInstanceId;
    }

    /**
     * Service specific workflow instance name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workflowInstanceName")
    private final String workflowInstanceName;

    /**
     * Service specific workflow instance name
     * @return the value
     **/
    public String getWorkflowInstanceName() {
        return workflowInstanceName;
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
        sb.append("ReviveWorkflowInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("workflowInstanceId=").append(String.valueOf(this.workflowInstanceId));
        sb.append(", workflowInstanceName=").append(String.valueOf(this.workflowInstanceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReviveWorkflowInstanceDetails)) {
            return false;
        }

        ReviveWorkflowInstanceDetails other = (ReviveWorkflowInstanceDetails) o;
        return java.util.Objects.equals(this.workflowInstanceId, other.workflowInstanceId)
                && java.util.Objects.equals(this.workflowInstanceName, other.workflowInstanceName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.workflowInstanceId == null
                                ? 43
                                : this.workflowInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.workflowInstanceName == null
                                ? 43
                                : this.workflowInstanceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
