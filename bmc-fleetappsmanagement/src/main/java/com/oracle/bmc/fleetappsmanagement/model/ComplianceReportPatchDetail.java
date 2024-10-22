/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details of the Patch. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComplianceReportPatchDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComplianceReportPatchDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "patchName",
        "patchDescription",
        "timeApplied",
        "timeReleased",
        "patchType"
    })
    public ComplianceReportPatchDetail(
            String patchName,
            String patchDescription,
            java.util.Date timeApplied,
            java.util.Date timeReleased,
            String patchType) {
        super();
        this.patchName = patchName;
        this.patchDescription = patchDescription;
        this.timeApplied = timeApplied;
        this.timeReleased = timeReleased;
        this.patchType = patchType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Patch name. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchName")
        private String patchName;

        /**
         * Patch name.
         *
         * @param patchName the value to set
         * @return this builder
         */
        public Builder patchName(String patchName) {
            this.patchName = patchName;
            this.__explicitlySet__.add("patchName");
            return this;
        }
        /** Patch description. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchDescription")
        private String patchDescription;

        /**
         * Patch description.
         *
         * @param patchDescription the value to set
         * @return this builder
         */
        public Builder patchDescription(String patchDescription) {
            this.patchDescription = patchDescription;
            this.__explicitlySet__.add("patchDescription");
            return this;
        }
        /** Time the patch was applied. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeApplied")
        private java.util.Date timeApplied;

        /**
         * Time the patch was applied.
         *
         * @param timeApplied the value to set
         * @return this builder
         */
        public Builder timeApplied(java.util.Date timeApplied) {
            this.timeApplied = timeApplied;
            this.__explicitlySet__.add("timeApplied");
            return this;
        }
        /** The date on which patch was released. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * The date on which patch was released.
         *
         * @param timeReleased the value to set
         * @return this builder
         */
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }
        /** Type of patch. */
        @com.fasterxml.jackson.annotation.JsonProperty("patchType")
        private String patchType;

        /**
         * Type of patch.
         *
         * @param patchType the value to set
         * @return this builder
         */
        public Builder patchType(String patchType) {
            this.patchType = patchType;
            this.__explicitlySet__.add("patchType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComplianceReportPatchDetail build() {
            ComplianceReportPatchDetail model =
                    new ComplianceReportPatchDetail(
                            this.patchName,
                            this.patchDescription,
                            this.timeApplied,
                            this.timeReleased,
                            this.patchType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComplianceReportPatchDetail model) {
            if (model.wasPropertyExplicitlySet("patchName")) {
                this.patchName(model.getPatchName());
            }
            if (model.wasPropertyExplicitlySet("patchDescription")) {
                this.patchDescription(model.getPatchDescription());
            }
            if (model.wasPropertyExplicitlySet("timeApplied")) {
                this.timeApplied(model.getTimeApplied());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("patchType")) {
                this.patchType(model.getPatchType());
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

    /** Patch name. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchName")
    private final String patchName;

    /**
     * Patch name.
     *
     * @return the value
     */
    public String getPatchName() {
        return patchName;
    }

    /** Patch description. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchDescription")
    private final String patchDescription;

    /**
     * Patch description.
     *
     * @return the value
     */
    public String getPatchDescription() {
        return patchDescription;
    }

    /** Time the patch was applied. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeApplied")
    private final java.util.Date timeApplied;

    /**
     * Time the patch was applied.
     *
     * @return the value
     */
    public java.util.Date getTimeApplied() {
        return timeApplied;
    }

    /** The date on which patch was released. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * The date on which patch was released.
     *
     * @return the value
     */
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    /** Type of patch. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchType")
    private final String patchType;

    /**
     * Type of patch.
     *
     * @return the value
     */
    public String getPatchType() {
        return patchType;
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
        sb.append("ComplianceReportPatchDetail(");
        sb.append("super=").append(super.toString());
        sb.append("patchName=").append(String.valueOf(this.patchName));
        sb.append(", patchDescription=").append(String.valueOf(this.patchDescription));
        sb.append(", timeApplied=").append(String.valueOf(this.timeApplied));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", patchType=").append(String.valueOf(this.patchType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComplianceReportPatchDetail)) {
            return false;
        }

        ComplianceReportPatchDetail other = (ComplianceReportPatchDetail) o;
        return java.util.Objects.equals(this.patchName, other.patchName)
                && java.util.Objects.equals(this.patchDescription, other.patchDescription)
                && java.util.Objects.equals(this.timeApplied, other.timeApplied)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(this.patchType, other.patchType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.patchName == null ? 43 : this.patchName.hashCode());
        result =
                (result * PRIME)
                        + (this.patchDescription == null ? 43 : this.patchDescription.hashCode());
        result = (result * PRIME) + (this.timeApplied == null ? 43 : this.timeApplied.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result = (result * PRIME) + (this.patchType == null ? 43 : this.patchType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
