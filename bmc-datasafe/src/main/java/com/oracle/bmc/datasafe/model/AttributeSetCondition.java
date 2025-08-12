/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The audit policy provisioning conditions. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AttributeSetCondition.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entityType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AttributeSetCondition extends PolicyCondition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("entitySelection")
        private EntitySelection entitySelection;

        public Builder entitySelection(EntitySelection entitySelection) {
            this.entitySelection = entitySelection;
            this.__explicitlySet__.add("entitySelection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationStatus")
        private OperationStatus operationStatus;

        public Builder operationStatus(OperationStatus operationStatus) {
            this.operationStatus = operationStatus;
            this.__explicitlySet__.add("operationStatus");
            return this;
        }
        /** The OCID of the attribute set. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeSetId")
        private String attributeSetId;

        /**
         * The OCID of the attribute set.
         *
         * @param attributeSetId the value to set
         * @return this builder
         */
        public Builder attributeSetId(String attributeSetId) {
            this.attributeSetId = attributeSetId;
            this.__explicitlySet__.add("attributeSetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttributeSetCondition build() {
            AttributeSetCondition model =
                    new AttributeSetCondition(
                            this.entitySelection, this.operationStatus, this.attributeSetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttributeSetCondition model) {
            if (model.wasPropertyExplicitlySet("entitySelection")) {
                this.entitySelection(model.getEntitySelection());
            }
            if (model.wasPropertyExplicitlySet("operationStatus")) {
                this.operationStatus(model.getOperationStatus());
            }
            if (model.wasPropertyExplicitlySet("attributeSetId")) {
                this.attributeSetId(model.getAttributeSetId());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public AttributeSetCondition(
            EntitySelection entitySelection,
            OperationStatus operationStatus,
            String attributeSetId) {
        super(entitySelection, operationStatus);
        this.attributeSetId = attributeSetId;
    }

    /** The OCID of the attribute set. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeSetId")
    private final String attributeSetId;

    /**
     * The OCID of the attribute set.
     *
     * @return the value
     */
    public String getAttributeSetId() {
        return attributeSetId;
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
        sb.append("AttributeSetCondition(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", attributeSetId=").append(String.valueOf(this.attributeSetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttributeSetCondition)) {
            return false;
        }

        AttributeSetCondition other = (AttributeSetCondition) o;
        return java.util.Objects.equals(this.attributeSetId, other.attributeSetId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.attributeSetId == null ? 43 : this.attributeSetId.hashCode());
        return result;
    }
}
