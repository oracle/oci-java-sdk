/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.model;

/**
 * Attributes to create a Java download report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateJavaDownloadReportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateJavaDownloadReportDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "timeStart",
        "timeEnd",
        "sortBy",
        "sortOrder",
        "format",
        "freeformTags",
        "definedTags"
    })
    public CreateJavaDownloadReportDetails(
            String compartmentId,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            JavaDownloadRecordSortBy sortBy,
            SortOrder sortOrder,
            JavaDownloadReportFormat format,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.format = format;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) here should be
         * the tenancy OCID.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) here should be
         * the tenancy OCID.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The start time from when download records have to be included (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * The start time from when download records have to be included (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeStart the value to set
         * @return this builder
         **/
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * The end time until when the download records have to be included (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * The end time until when the download records have to be included (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * The property to be used for sorting the records.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private JavaDownloadRecordSortBy sortBy;

        /**
         * The property to be used for sorting the records.
         * @param sortBy the value to set
         * @return this builder
         **/
        public Builder sortBy(JavaDownloadRecordSortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }
        /**
         * The sort order for the records.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        /**
         * The sort order for the records.
         * @param sortOrder the value to set
         * @return this builder
         **/
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }
        /**
         * The format of the report that is generated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("format")
        private JavaDownloadReportFormat format;

        /**
         * The format of the report that is generated.
         * @param format the value to set
         * @return this builder
         **/
        public Builder format(JavaDownloadReportFormat format) {
            this.format = format;
            this.__explicitlySet__.add("format");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.oracle.com/iaas/Content/Tagging/Concepts/understandingfreeformtags.htm).)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.oracle.com/iaas/Content/Tagging/Concepts/understandingfreeformtags.htm).)
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.oracle.com/iaas/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.oracle.com/iaas/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateJavaDownloadReportDetails build() {
            CreateJavaDownloadReportDetails model =
                    new CreateJavaDownloadReportDetails(
                            this.compartmentId,
                            this.timeStart,
                            this.timeEnd,
                            this.sortBy,
                            this.sortOrder,
                            this.format,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateJavaDownloadReportDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("sortBy")) {
                this.sortBy(model.getSortBy());
            }
            if (model.wasPropertyExplicitlySet("sortOrder")) {
                this.sortOrder(model.getSortOrder());
            }
            if (model.wasPropertyExplicitlySet("format")) {
                this.format(model.getFormat());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) here should be
     * the tenancy OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) here should be
     * the tenancy OCID.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The start time from when download records have to be included (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * The start time from when download records have to be included (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     **/
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * The end time until when the download records have to be included (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * The end time until when the download records have to be included (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     **/
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * The property to be used for sorting the records.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final JavaDownloadRecordSortBy sortBy;

    /**
     * The property to be used for sorting the records.
     * @return the value
     **/
    public JavaDownloadRecordSortBy getSortBy() {
        return sortBy;
    }

    /**
     * The sort order for the records.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

    /**
     * The sort order for the records.
     * @return the value
     **/
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * The format of the report that is generated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final JavaDownloadReportFormat format;

    /**
     * The format of the report that is generated.
     * @return the value
     **/
    public JavaDownloadReportFormat getFormat() {
        return format;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.oracle.com/iaas/Content/Tagging/Concepts/understandingfreeformtags.htm).)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.oracle.com/iaas/Content/Tagging/Concepts/understandingfreeformtags.htm).)
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.oracle.com/iaas/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.oracle.com/iaas/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateJavaDownloadReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateJavaDownloadReportDetails)) {
            return false;
        }

        CreateJavaDownloadReportDetails other = (CreateJavaDownloadReportDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.format, other.format)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
