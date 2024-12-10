/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details for generating Compliance Report
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExportComplianceReportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExportComplianceReportDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "entityId",
        "resourceId",
        "productStack",
        "productName",
        "complianceState"
    })
    public ExportComplianceReportDetails(
            String compartmentId,
            String entityId,
            String resourceId,
            String productStack,
            String productName,
            ComplianceState complianceState) {
        super();
        this.compartmentId = compartmentId;
        this.entityId = entityId;
        this.resourceId = resourceId;
        this.productStack = productStack;
        this.productName = productName;
        this.complianceState = complianceState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The OCID of the entity for which the compliance is calculated.Ex.FleetId
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * The OCID of the entity for which the compliance is calculated.Ex.FleetId
         * @param entityId the value to set
         * @return this builder
         **/
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /**
         * The OCID to identify the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The OCID to identify the resource.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * Product Stack.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("productStack")
        private String productStack;

        /**
         * Product Stack.
         * @param productStack the value to set
         * @return this builder
         **/
        public Builder productStack(String productStack) {
            this.productStack = productStack;
            this.__explicitlySet__.add("productStack");
            return this;
        }
        /**
         * Product Name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("productName")
        private String productName;

        /**
         * Product Name.
         * @param productName the value to set
         * @return this builder
         **/
        public Builder productName(String productName) {
            this.productName = productName;
            this.__explicitlySet__.add("productName");
            return this;
        }
        /**
         * Last known compliance state of target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
        private ComplianceState complianceState;

        /**
         * Last known compliance state of target.
         * @param complianceState the value to set
         * @return this builder
         **/
        public Builder complianceState(ComplianceState complianceState) {
            this.complianceState = complianceState;
            this.__explicitlySet__.add("complianceState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportComplianceReportDetails build() {
            ExportComplianceReportDetails model =
                    new ExportComplianceReportDetails(
                            this.compartmentId,
                            this.entityId,
                            this.resourceId,
                            this.productStack,
                            this.productName,
                            this.complianceState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportComplianceReportDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("entityId")) {
                this.entityId(model.getEntityId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("productStack")) {
                this.productStack(model.getProductStack());
            }
            if (model.wasPropertyExplicitlySet("productName")) {
                this.productName(model.getProductName());
            }
            if (model.wasPropertyExplicitlySet("complianceState")) {
                this.complianceState(model.getComplianceState());
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
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The OCID of the entity for which the compliance is calculated.Ex.FleetId
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * The OCID of the entity for which the compliance is calculated.Ex.FleetId
     * @return the value
     **/
    public String getEntityId() {
        return entityId;
    }

    /**
     * The OCID to identify the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The OCID to identify the resource.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Product Stack.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productStack")
    private final String productStack;

    /**
     * Product Stack.
     * @return the value
     **/
    public String getProductStack() {
        return productStack;
    }

    /**
     * Product Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    private final String productName;

    /**
     * Product Name.
     * @return the value
     **/
    public String getProductName() {
        return productName;
    }

    /**
     * Last known compliance state of target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
    private final ComplianceState complianceState;

    /**
     * Last known compliance state of target.
     * @return the value
     **/
    public ComplianceState getComplianceState() {
        return complianceState;
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
        sb.append("ExportComplianceReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", productStack=").append(String.valueOf(this.productStack));
        sb.append(", productName=").append(String.valueOf(this.productName));
        sb.append(", complianceState=").append(String.valueOf(this.complianceState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportComplianceReportDetails)) {
            return false;
        }

        ExportComplianceReportDetails other = (ExportComplianceReportDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.productStack, other.productStack)
                && java.util.Objects.equals(this.productName, other.productName)
                && java.util.Objects.equals(this.complianceState, other.complianceState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.productStack == null ? 43 : this.productStack.hashCode());
        result = (result * PRIME) + (this.productName == null ? 43 : this.productName.hashCode());
        result =
                (result * PRIME)
                        + (this.complianceState == null ? 43 : this.complianceState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
