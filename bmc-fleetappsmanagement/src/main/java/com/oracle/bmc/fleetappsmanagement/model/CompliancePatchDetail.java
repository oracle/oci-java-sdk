/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details of the Patch
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
    builder = CompliancePatchDetail.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CompliancePatchDetail
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "patchId",
        "patchName",
        "patchDescription",
        "timeReleased",
        "patchType",
        "severity",
        "product"
    })
    public CompliancePatchDetail(
            String patchId,
            String patchName,
            String patchDescription,
            java.util.Date timeReleased,
            String patchType,
            PatchSeverity severity,
            ComplianceDetailProduct product) {
        super();
        this.patchId = patchId;
        this.patchName = patchName;
        this.patchDescription = patchDescription;
        this.timeReleased = timeReleased;
        this.patchType = patchType;
        this.severity = severity;
        this.product = product;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * patch OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchId")
        private String patchId;

        /**
         * patch OCID.
         * @param patchId the value to set
         * @return this builder
         **/
        public Builder patchId(String patchId) {
            this.patchId = patchId;
            this.__explicitlySet__.add("patchId");
            return this;
        }
        /**
         * patch Name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchName")
        private String patchName;

        /**
         * patch Name.
         * @param patchName the value to set
         * @return this builder
         **/
        public Builder patchName(String patchName) {
            this.patchName = patchName;
            this.__explicitlySet__.add("patchName");
            return this;
        }
        /**
         * Patch Description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchDescription")
        private String patchDescription;

        /**
         * Patch Description.
         * @param patchDescription the value to set
         * @return this builder
         **/
        public Builder patchDescription(String patchDescription) {
            this.patchDescription = patchDescription;
            this.__explicitlySet__.add("patchDescription");
            return this;
        }
        /**
         * Date on which patch was released
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * Date on which patch was released
         * @param timeReleased the value to set
         * @return this builder
         **/
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }
        /**
         * Type of patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchType")
        private String patchType;

        /**
         * Type of patch.
         * @param patchType the value to set
         * @return this builder
         **/
        public Builder patchType(String patchType) {
            this.patchType = patchType;
            this.__explicitlySet__.add("patchType");
            return this;
        }
        /**
         * Patch Severity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private PatchSeverity severity;

        /**
         * Patch Severity.
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(PatchSeverity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private ComplianceDetailProduct product;

        public Builder product(ComplianceDetailProduct product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompliancePatchDetail build() {
            CompliancePatchDetail model =
                    new CompliancePatchDetail(
                            this.patchId,
                            this.patchName,
                            this.patchDescription,
                            this.timeReleased,
                            this.patchType,
                            this.severity,
                            this.product);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompliancePatchDetail model) {
            if (model.wasPropertyExplicitlySet("patchId")) {
                this.patchId(model.getPatchId());
            }
            if (model.wasPropertyExplicitlySet("patchName")) {
                this.patchName(model.getPatchName());
            }
            if (model.wasPropertyExplicitlySet("patchDescription")) {
                this.patchDescription(model.getPatchDescription());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("patchType")) {
                this.patchType(model.getPatchType());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
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
     * patch OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchId")
    private final String patchId;

    /**
     * patch OCID.
     * @return the value
     **/
    public String getPatchId() {
        return patchId;
    }

    /**
     * patch Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchName")
    private final String patchName;

    /**
     * patch Name.
     * @return the value
     **/
    public String getPatchName() {
        return patchName;
    }

    /**
     * Patch Description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchDescription")
    private final String patchDescription;

    /**
     * Patch Description.
     * @return the value
     **/
    public String getPatchDescription() {
        return patchDescription;
    }

    /**
     * Date on which patch was released
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * Date on which patch was released
     * @return the value
     **/
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    /**
     * Type of patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchType")
    private final String patchType;

    /**
     * Type of patch.
     * @return the value
     **/
    public String getPatchType() {
        return patchType;
    }

    /**
     * Patch Severity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final PatchSeverity severity;

    /**
     * Patch Severity.
     * @return the value
     **/
    public PatchSeverity getSeverity() {
        return severity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final ComplianceDetailProduct product;

    public ComplianceDetailProduct getProduct() {
        return product;
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
        sb.append("CompliancePatchDetail(");
        sb.append("super=").append(super.toString());
        sb.append("patchId=").append(String.valueOf(this.patchId));
        sb.append(", patchName=").append(String.valueOf(this.patchName));
        sb.append(", patchDescription=").append(String.valueOf(this.patchDescription));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", patchType=").append(String.valueOf(this.patchType));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompliancePatchDetail)) {
            return false;
        }

        CompliancePatchDetail other = (CompliancePatchDetail) o;
        return java.util.Objects.equals(this.patchId, other.patchId)
                && java.util.Objects.equals(this.patchName, other.patchName)
                && java.util.Objects.equals(this.patchDescription, other.patchDescription)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(this.patchType, other.patchType)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.product, other.product)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.patchId == null ? 43 : this.patchId.hashCode());
        result = (result * PRIME) + (this.patchName == null ? 43 : this.patchName.hashCode());
        result =
                (result * PRIME)
                        + (this.patchDescription == null ? 43 : this.patchDescription.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result = (result * PRIME) + (this.patchType == null ? 43 : this.patchType.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
