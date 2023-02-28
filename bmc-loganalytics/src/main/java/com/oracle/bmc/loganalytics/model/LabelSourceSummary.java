/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * source summary <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LabelSourceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LabelSourceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceDisplayName",
        "sourceName",
        "sourceId",
        "labelOperatorName",
        "labelCondition",
        "labelFieldDisplayname",
        "labelFieldName"
    })
    public LabelSourceSummary(
            String sourceDisplayName,
            String sourceName,
            Long sourceId,
            String labelOperatorName,
            String labelCondition,
            String labelFieldDisplayname,
            String labelFieldName) {
        super();
        this.sourceDisplayName = sourceDisplayName;
        this.sourceName = sourceName;
        this.sourceId = sourceId;
        this.labelOperatorName = labelOperatorName;
        this.labelCondition = labelCondition;
        this.labelFieldDisplayname = labelFieldDisplayname;
        this.labelFieldName = labelFieldName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The source display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
        private String sourceDisplayName;

        /**
         * The source display name.
         *
         * @param sourceDisplayName the value to set
         * @return this builder
         */
        public Builder sourceDisplayName(String sourceDisplayName) {
            this.sourceDisplayName = sourceDisplayName;
            this.__explicitlySet__.add("sourceDisplayName");
            return this;
        }
        /** The source internal name. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        /**
         * The source internal name.
         *
         * @param sourceName the value to set
         * @return this builder
         */
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
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
        /** The label operator. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelOperatorName")
        private String labelOperatorName;

        /**
         * The label operator.
         *
         * @param labelOperatorName the value to set
         * @return this builder
         */
        public Builder labelOperatorName(String labelOperatorName) {
            this.labelOperatorName = labelOperatorName;
            this.__explicitlySet__.add("labelOperatorName");
            return this;
        }
        /** The label condition. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelCondition")
        private String labelCondition;

        /**
         * The label condition.
         *
         * @param labelCondition the value to set
         * @return this builder
         */
        public Builder labelCondition(String labelCondition) {
            this.labelCondition = labelCondition;
            this.__explicitlySet__.add("labelCondition");
            return this;
        }
        /** The label field display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelFieldDisplayname")
        private String labelFieldDisplayname;

        /**
         * The label field display name.
         *
         * @param labelFieldDisplayname the value to set
         * @return this builder
         */
        public Builder labelFieldDisplayname(String labelFieldDisplayname) {
            this.labelFieldDisplayname = labelFieldDisplayname;
            this.__explicitlySet__.add("labelFieldDisplayname");
            return this;
        }
        /** The label field name. */
        @com.fasterxml.jackson.annotation.JsonProperty("labelFieldName")
        private String labelFieldName;

        /**
         * The label field name.
         *
         * @param labelFieldName the value to set
         * @return this builder
         */
        public Builder labelFieldName(String labelFieldName) {
            this.labelFieldName = labelFieldName;
            this.__explicitlySet__.add("labelFieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LabelSourceSummary build() {
            LabelSourceSummary model =
                    new LabelSourceSummary(
                            this.sourceDisplayName,
                            this.sourceName,
                            this.sourceId,
                            this.labelOperatorName,
                            this.labelCondition,
                            this.labelFieldDisplayname,
                            this.labelFieldName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LabelSourceSummary model) {
            if (model.wasPropertyExplicitlySet("sourceDisplayName")) {
                this.sourceDisplayName(model.getSourceDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sourceName")) {
                this.sourceName(model.getSourceName());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("labelOperatorName")) {
                this.labelOperatorName(model.getLabelOperatorName());
            }
            if (model.wasPropertyExplicitlySet("labelCondition")) {
                this.labelCondition(model.getLabelCondition());
            }
            if (model.wasPropertyExplicitlySet("labelFieldDisplayname")) {
                this.labelFieldDisplayname(model.getLabelFieldDisplayname());
            }
            if (model.wasPropertyExplicitlySet("labelFieldName")) {
                this.labelFieldName(model.getLabelFieldName());
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

    /** The source display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
    private final String sourceDisplayName;

    /**
     * The source display name.
     *
     * @return the value
     */
    public String getSourceDisplayName() {
        return sourceDisplayName;
    }

    /** The source internal name. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    /**
     * The source internal name.
     *
     * @return the value
     */
    public String getSourceName() {
        return sourceName;
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

    /** The label operator. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelOperatorName")
    private final String labelOperatorName;

    /**
     * The label operator.
     *
     * @return the value
     */
    public String getLabelOperatorName() {
        return labelOperatorName;
    }

    /** The label condition. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelCondition")
    private final String labelCondition;

    /**
     * The label condition.
     *
     * @return the value
     */
    public String getLabelCondition() {
        return labelCondition;
    }

    /** The label field display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelFieldDisplayname")
    private final String labelFieldDisplayname;

    /**
     * The label field display name.
     *
     * @return the value
     */
    public String getLabelFieldDisplayname() {
        return labelFieldDisplayname;
    }

    /** The label field name. */
    @com.fasterxml.jackson.annotation.JsonProperty("labelFieldName")
    private final String labelFieldName;

    /**
     * The label field name.
     *
     * @return the value
     */
    public String getLabelFieldName() {
        return labelFieldName;
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
        sb.append("LabelSourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("sourceDisplayName=").append(String.valueOf(this.sourceDisplayName));
        sb.append(", sourceName=").append(String.valueOf(this.sourceName));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", labelOperatorName=").append(String.valueOf(this.labelOperatorName));
        sb.append(", labelCondition=").append(String.valueOf(this.labelCondition));
        sb.append(", labelFieldDisplayname=").append(String.valueOf(this.labelFieldDisplayname));
        sb.append(", labelFieldName=").append(String.valueOf(this.labelFieldName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LabelSourceSummary)) {
            return false;
        }

        LabelSourceSummary other = (LabelSourceSummary) o;
        return java.util.Objects.equals(this.sourceDisplayName, other.sourceDisplayName)
                && java.util.Objects.equals(this.sourceName, other.sourceName)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.labelOperatorName, other.labelOperatorName)
                && java.util.Objects.equals(this.labelCondition, other.labelCondition)
                && java.util.Objects.equals(this.labelFieldDisplayname, other.labelFieldDisplayname)
                && java.util.Objects.equals(this.labelFieldName, other.labelFieldName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceDisplayName == null ? 43 : this.sourceDisplayName.hashCode());
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.labelOperatorName == null ? 43 : this.labelOperatorName.hashCode());
        result =
                (result * PRIME)
                        + (this.labelCondition == null ? 43 : this.labelCondition.hashCode());
        result =
                (result * PRIME)
                        + (this.labelFieldDisplayname == null
                                ? 43
                                : this.labelFieldDisplayname.hashCode());
        result =
                (result * PRIME)
                        + (this.labelFieldName == null ? 43 : this.labelFieldName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
