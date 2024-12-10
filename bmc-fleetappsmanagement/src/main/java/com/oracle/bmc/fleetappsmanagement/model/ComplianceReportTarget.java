/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details of the target and patches.
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
    builder = ComplianceReportTarget.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComplianceReportTarget
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetId",
        "targetName",
        "version",
        "complianceState",
        "installedPatches",
        "recommendedPatches"
    })
    public ComplianceReportTarget(
            String targetId,
            String targetName,
            String version,
            ComplianceState complianceState,
            java.util.List<ComplianceReportPatchDetail> installedPatches,
            java.util.List<ComplianceReportPatchDetail> recommendedPatches) {
        super();
        this.targetId = targetId;
        this.targetName = targetName;
        this.version = version;
        this.complianceState = complianceState;
        this.installedPatches = installedPatches;
        this.recommendedPatches = recommendedPatches;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Target Identifier.Can be the target name if a separate ID is not available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * Target Identifier.Can be the target name if a separate ID is not available.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * Target Name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetName")
        private String targetName;

        /**
         * Target Name.
         * @param targetName the value to set
         * @return this builder
         **/
        public Builder targetName(String targetName) {
            this.targetName = targetName;
            this.__explicitlySet__.add("targetName");
            return this;
        }
        /**
         * Current version of the target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Current version of the target.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The last known compliance state of the target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
        private ComplianceState complianceState;

        /**
         * The last known compliance state of the target.
         * @param complianceState the value to set
         * @return this builder
         **/
        public Builder complianceState(ComplianceState complianceState) {
            this.complianceState = complianceState;
            this.__explicitlySet__.add("complianceState");
            return this;
        }
        /**
         * Installed Patches for the Target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("installedPatches")
        private java.util.List<ComplianceReportPatchDetail> installedPatches;

        /**
         * Installed Patches for the Target.
         * @param installedPatches the value to set
         * @return this builder
         **/
        public Builder installedPatches(
                java.util.List<ComplianceReportPatchDetail> installedPatches) {
            this.installedPatches = installedPatches;
            this.__explicitlySet__.add("installedPatches");
            return this;
        }
        /**
         * Recommended Patches for the Target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendedPatches")
        private java.util.List<ComplianceReportPatchDetail> recommendedPatches;

        /**
         * Recommended Patches for the Target.
         * @param recommendedPatches the value to set
         * @return this builder
         **/
        public Builder recommendedPatches(
                java.util.List<ComplianceReportPatchDetail> recommendedPatches) {
            this.recommendedPatches = recommendedPatches;
            this.__explicitlySet__.add("recommendedPatches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComplianceReportTarget build() {
            ComplianceReportTarget model =
                    new ComplianceReportTarget(
                            this.targetId,
                            this.targetName,
                            this.version,
                            this.complianceState,
                            this.installedPatches,
                            this.recommendedPatches);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComplianceReportTarget model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetName")) {
                this.targetName(model.getTargetName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("complianceState")) {
                this.complianceState(model.getComplianceState());
            }
            if (model.wasPropertyExplicitlySet("installedPatches")) {
                this.installedPatches(model.getInstalledPatches());
            }
            if (model.wasPropertyExplicitlySet("recommendedPatches")) {
                this.recommendedPatches(model.getRecommendedPatches());
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
     * Target Identifier.Can be the target name if a separate ID is not available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * Target Identifier.Can be the target name if a separate ID is not available.
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * Target Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetName")
    private final String targetName;

    /**
     * Target Name.
     * @return the value
     **/
    public String getTargetName() {
        return targetName;
    }

    /**
     * Current version of the target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Current version of the target.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * The last known compliance state of the target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
    private final ComplianceState complianceState;

    /**
     * The last known compliance state of the target.
     * @return the value
     **/
    public ComplianceState getComplianceState() {
        return complianceState;
    }

    /**
     * Installed Patches for the Target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installedPatches")
    private final java.util.List<ComplianceReportPatchDetail> installedPatches;

    /**
     * Installed Patches for the Target.
     * @return the value
     **/
    public java.util.List<ComplianceReportPatchDetail> getInstalledPatches() {
        return installedPatches;
    }

    /**
     * Recommended Patches for the Target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedPatches")
    private final java.util.List<ComplianceReportPatchDetail> recommendedPatches;

    /**
     * Recommended Patches for the Target.
     * @return the value
     **/
    public java.util.List<ComplianceReportPatchDetail> getRecommendedPatches() {
        return recommendedPatches;
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
        sb.append("ComplianceReportTarget(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetName=").append(String.valueOf(this.targetName));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", complianceState=").append(String.valueOf(this.complianceState));
        sb.append(", installedPatches=").append(String.valueOf(this.installedPatches));
        sb.append(", recommendedPatches=").append(String.valueOf(this.recommendedPatches));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComplianceReportTarget)) {
            return false;
        }

        ComplianceReportTarget other = (ComplianceReportTarget) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetName, other.targetName)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.complianceState, other.complianceState)
                && java.util.Objects.equals(this.installedPatches, other.installedPatches)
                && java.util.Objects.equals(this.recommendedPatches, other.recommendedPatches)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetName == null ? 43 : this.targetName.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.complianceState == null ? 43 : this.complianceState.hashCode());
        result =
                (result * PRIME)
                        + (this.installedPatches == null ? 43 : this.installedPatches.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedPatches == null
                                ? 43
                                : this.recommendedPatches.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
