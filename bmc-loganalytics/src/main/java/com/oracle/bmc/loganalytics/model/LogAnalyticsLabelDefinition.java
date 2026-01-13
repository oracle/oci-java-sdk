/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsLabelDefinition <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsLabelDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsLabelDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"editVersion", "isSystem", "sourceId", "labelName"})
    public LogAnalyticsLabelDefinition(
            Long editVersion, Boolean isSystem, Long sourceId, String labelName) {
        super();
        this.editVersion = editVersion;
        this.isSystem = isSystem;
        this.sourceId = sourceId;
        this.labelName = labelName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The edit version. */
        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        /**
         * The edit version.
         *
         * @param editVersion the value to set
         * @return this builder
         */
        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }
        /**
         * The system flag. A value of false denotes a custom, or user defined object. A value of
         * true denotes a built in object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
        private Boolean isSystem;

        /**
         * The system flag. A value of false denotes a custom, or user defined object. A value of
         * true denotes a built in object.
         *
         * @param isSystem the value to set
         * @return this builder
         */
        public Builder isSystem(Boolean isSystem) {
            this.isSystem = isSystem;
            this.__explicitlySet__.add("isSystem");
            return this;
        }
        /** The source unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        /**
         * The source unique identifier.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /** The label name. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelName")
        private String labelName;

        /**
         * The label name.
         *
         * @param labelName the value to set
         * @return this builder
         */
        public Builder labelName(String labelName) {
            this.labelName = labelName;
            this.__explicitlySet__.add("labelName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsLabelDefinition build() {
            LogAnalyticsLabelDefinition model =
                    new LogAnalyticsLabelDefinition(
                            this.editVersion, this.isSystem, this.sourceId, this.labelName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsLabelDefinition model) {
            if (model.wasPropertyExplicitlySet("editVersion")) {
                this.editVersion(model.getEditVersion());
            }
            if (model.wasPropertyExplicitlySet("isSystem")) {
                this.isSystem(model.getIsSystem());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("labelName")) {
                this.labelName(model.getLabelName());
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

    /** The edit version. */
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    /**
     * The edit version.
     *
     * @return the value
     */
    public Long getEditVersion() {
        return editVersion;
    }

    /**
     * The system flag. A value of false denotes a custom, or user defined object. A value of true
     * denotes a built in object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSystem")
    private final Boolean isSystem;

    /**
     * The system flag. A value of false denotes a custom, or user defined object. A value of true
     * denotes a built in object.
     *
     * @return the value
     */
    public Boolean getIsSystem() {
        return isSystem;
    }

    /** The source unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final Long sourceId;

    /**
     * The source unique identifier.
     *
     * @return the value
     */
    public Long getSourceId() {
        return sourceId;
    }

    /** The label name. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelName")
    private final String labelName;

    /**
     * The label name.
     *
     * @return the value
     */
    public String getLabelName() {
        return labelName;
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
        sb.append("LogAnalyticsLabelDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("editVersion=").append(String.valueOf(this.editVersion));
        sb.append(", isSystem=").append(String.valueOf(this.isSystem));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", labelName=").append(String.valueOf(this.labelName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsLabelDefinition)) {
            return false;
        }

        LogAnalyticsLabelDefinition other = (LogAnalyticsLabelDefinition) o;
        return java.util.Objects.equals(this.editVersion, other.editVersion)
                && java.util.Objects.equals(this.isSystem, other.isSystem)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.labelName, other.labelName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.editVersion == null ? 43 : this.editVersion.hashCode());
        result = (result * PRIME) + (this.isSystem == null ? 43 : this.isSystem.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.labelName == null ? 43 : this.labelName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
