/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of a Ops Insights chargeback plan report
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ChargebackPlanReportSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChargebackPlanReportSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "reportId",
        "reportName",
        "resourceType",
        "resourceId",
        "timeCreated",
        "timeUpdated",
        "reportProperties"
    })
    public ChargebackPlanReportSummary(
            String reportId,
            String reportName,
            ResourceType resourceType,
            String resourceId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ReportPropertyDetails reportProperties) {
        super();
        this.reportId = reportId;
        this.reportName = reportName;
        this.resourceType = resourceType;
        this.resourceId = resourceId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.reportProperties = reportProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Chargeback plan report.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reportId")
        private String reportId;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Chargeback plan report.
         *
         * @param reportId the value to set
         * @return this builder
         **/
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            this.__explicitlySet__.add("reportId");
            return this;
        }
        /**
         * The chargeback plan report name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reportName")
        private String reportName;

        /**
         * The chargeback plan report name.
         * @param reportName the value to set
         * @return this builder
         **/
        public Builder reportName(String reportName) {
            this.reportName = reportName;
            this.__explicitlySet__.add("reportName");
            return this;
        }
        /**
         * Defines the type of resource (example: EXADATA, HOST)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceType resourceType;

        /**
         * Defines the type of resource (example: EXADATA, HOST)
         *
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(ResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Chargeback plan report.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Chargeback plan report.
         *
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The date and time the chargeback plan was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the chargeback plan was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time chargeback plan was updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time chargeback plan was updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reportProperties")
        private ReportPropertyDetails reportProperties;

        public Builder reportProperties(ReportPropertyDetails reportProperties) {
            this.reportProperties = reportProperties;
            this.__explicitlySet__.add("reportProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChargebackPlanReportSummary build() {
            ChargebackPlanReportSummary model =
                    new ChargebackPlanReportSummary(
                            this.reportId,
                            this.reportName,
                            this.resourceType,
                            this.resourceId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.reportProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChargebackPlanReportSummary model) {
            if (model.wasPropertyExplicitlySet("reportId")) {
                this.reportId(model.getReportId());
            }
            if (model.wasPropertyExplicitlySet("reportName")) {
                this.reportName(model.getReportName());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("reportProperties")) {
                this.reportProperties(model.getReportProperties());
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
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Chargeback plan report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reportId")
    private final String reportId;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Chargeback plan report.
     *
     * @return the value
     **/
    public String getReportId() {
        return reportId;
    }

    /**
     * The chargeback plan report name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reportName")
    private final String reportName;

    /**
     * The chargeback plan report name.
     * @return the value
     **/
    public String getReportName() {
        return reportName;
    }

    /**
     * Defines the type of resource (example: EXADATA, HOST)
     *
     **/
    public enum ResourceType {
        ExadataInsight("EXADATA_INSIGHT"),
        DatabaseInsight("DATABASE_INSIGHT"),
        HostInsight("HOST_INSIGHT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceType.class);

        private final String value;
        private static java.util.Map<String, ResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceType v : ResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Defines the type of resource (example: EXADATA, HOST)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceType resourceType;

    /**
     * Defines the type of resource (example: EXADATA, HOST)
     *
     * @return the value
     **/
    public ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Chargeback plan report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Chargeback plan report.
     *
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The date and time the chargeback plan was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the chargeback plan was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time chargeback plan was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time chargeback plan was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("reportProperties")
    private final ReportPropertyDetails reportProperties;

    public ReportPropertyDetails getReportProperties() {
        return reportProperties;
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
        sb.append("ChargebackPlanReportSummary(");
        sb.append("super=").append(super.toString());
        sb.append("reportId=").append(String.valueOf(this.reportId));
        sb.append(", reportName=").append(String.valueOf(this.reportName));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", reportProperties=").append(String.valueOf(this.reportProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChargebackPlanReportSummary)) {
            return false;
        }

        ChargebackPlanReportSummary other = (ChargebackPlanReportSummary) o;
        return java.util.Objects.equals(this.reportId, other.reportId)
                && java.util.Objects.equals(this.reportName, other.reportName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.reportProperties, other.reportProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.reportId == null ? 43 : this.reportId.hashCode());
        result = (result * PRIME) + (this.reportName == null ? 43 : this.reportName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.reportProperties == null ? 43 : this.reportProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
