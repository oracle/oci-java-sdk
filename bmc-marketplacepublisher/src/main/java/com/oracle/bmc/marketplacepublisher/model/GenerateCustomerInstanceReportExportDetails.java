/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Details to generate a Customer Instance Report export.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GenerateCustomerInstanceReportExportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GenerateCustomerInstanceReportExportDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "sortOrder",
        "sortBy",
        "name",
        "listingId",
        "status",
        "shape",
        "region",
        "realm",
        "tenantAdminDomain",
        "packageVersion",
        "instanceId",
        "timeInstanceCreationFromDate",
        "timeInstanceCreationToDate",
        "timeInstanceTerminationFromDate",
        "timeInstanceTerminationToDate"
    })
    public GenerateCustomerInstanceReportExportDetails(
            String compartmentId,
            SortOrder sortOrder,
            SortBy sortBy,
            String name,
            String listingId,
            Status status,
            String shape,
            String region,
            String realm,
            String tenantAdminDomain,
            String packageVersion,
            String instanceId,
            java.util.Date timeInstanceCreationFromDate,
            java.util.Date timeInstanceCreationToDate,
            java.util.Date timeInstanceTerminationFromDate,
            java.util.Date timeInstanceTerminationToDate) {
        super();
        this.compartmentId = compartmentId;
        this.sortOrder = sortOrder;
        this.sortBy = sortBy;
        this.name = name;
        this.listingId = listingId;
        this.status = status;
        this.shape = shape;
        this.region = region;
        this.realm = realm;
        this.tenantAdminDomain = tenantAdminDomain;
        this.packageVersion = packageVersion;
        this.instanceId = instanceId;
        this.timeInstanceCreationFromDate = timeInstanceCreationFromDate;
        this.timeInstanceCreationToDate = timeInstanceCreationToDate;
        this.timeInstanceTerminationFromDate = timeInstanceTerminationFromDate;
        this.timeInstanceTerminationToDate = timeInstanceTerminationToDate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment for the export.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment for the export.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The sort order for the generated export.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        /**
         * The sort order for the generated export.
         * @param sortOrder the value to set
         * @return this builder
         **/
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }
        /**
         * The field to sort by.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private SortBy sortBy;

        /**
         * The field to sort by.
         * @param sortBy the value to set
         * @return this builder
         **/
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }
        /**
         * A filter to return only report records that match the listing name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A filter to return only report records that match the listing name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A filter to return only report records that match the listing OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * A filter to return only report records that match the listing OCID.
         * @param listingId the value to set
         * @return this builder
         **/
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /**
         * A filter to return only report records that match the instance status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * A filter to return only report records that match the instance status.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * A filter to return only report records that match the instance shape.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * A filter to return only report records that match the instance shape.
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * A filter to return only report records that match the instance region.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * A filter to return only report records that match the instance region.
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * A filter to return only report records that match the instance realm.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("realm")
        private String realm;

        /**
         * A filter to return only report records that match the instance realm.
         * @param realm the value to set
         * @return this builder
         **/
        public Builder realm(String realm) {
            this.realm = realm;
            this.__explicitlySet__.add("realm");
            return this;
        }
        /**
         * A filter to return only report records that match the tenant administrator email domain.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantAdminDomain")
        private String tenantAdminDomain;

        /**
         * A filter to return only report records that match the tenant administrator email domain.
         * @param tenantAdminDomain the value to set
         * @return this builder
         **/
        public Builder tenantAdminDomain(String tenantAdminDomain) {
            this.tenantAdminDomain = tenantAdminDomain;
            this.__explicitlySet__.add("tenantAdminDomain");
            return this;
        }
        /**
         * A filter to return only report records that match the package version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
        private String packageVersion;

        /**
         * A filter to return only report records that match the package version.
         * @param packageVersion the value to set
         * @return this builder
         **/
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            this.__explicitlySet__.add("packageVersion");
            return this;
        }
        /**
         * A filter to return only report records that match the instance OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * A filter to return only report records that match the instance OCID.
         * @param instanceId the value to set
         * @return this builder
         **/
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * The inclusive earliest instance creation time, in RFC 3339 format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeInstanceCreationFromDate")
        private java.util.Date timeInstanceCreationFromDate;

        /**
         * The inclusive earliest instance creation time, in RFC 3339 format.
         * @param timeInstanceCreationFromDate the value to set
         * @return this builder
         **/
        public Builder timeInstanceCreationFromDate(java.util.Date timeInstanceCreationFromDate) {
            this.timeInstanceCreationFromDate = timeInstanceCreationFromDate;
            this.__explicitlySet__.add("timeInstanceCreationFromDate");
            return this;
        }
        /**
         * The inclusive latest instance creation time, in RFC 3339 format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeInstanceCreationToDate")
        private java.util.Date timeInstanceCreationToDate;

        /**
         * The inclusive latest instance creation time, in RFC 3339 format.
         * @param timeInstanceCreationToDate the value to set
         * @return this builder
         **/
        public Builder timeInstanceCreationToDate(java.util.Date timeInstanceCreationToDate) {
            this.timeInstanceCreationToDate = timeInstanceCreationToDate;
            this.__explicitlySet__.add("timeInstanceCreationToDate");
            return this;
        }
        /**
         * The inclusive earliest instance termination time, in RFC 3339 format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeInstanceTerminationFromDate")
        private java.util.Date timeInstanceTerminationFromDate;

        /**
         * The inclusive earliest instance termination time, in RFC 3339 format.
         * @param timeInstanceTerminationFromDate the value to set
         * @return this builder
         **/
        public Builder timeInstanceTerminationFromDate(
                java.util.Date timeInstanceTerminationFromDate) {
            this.timeInstanceTerminationFromDate = timeInstanceTerminationFromDate;
            this.__explicitlySet__.add("timeInstanceTerminationFromDate");
            return this;
        }
        /**
         * The inclusive latest instance termination time, in RFC 3339 format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeInstanceTerminationToDate")
        private java.util.Date timeInstanceTerminationToDate;

        /**
         * The inclusive latest instance termination time, in RFC 3339 format.
         * @param timeInstanceTerminationToDate the value to set
         * @return this builder
         **/
        public Builder timeInstanceTerminationToDate(java.util.Date timeInstanceTerminationToDate) {
            this.timeInstanceTerminationToDate = timeInstanceTerminationToDate;
            this.__explicitlySet__.add("timeInstanceTerminationToDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateCustomerInstanceReportExportDetails build() {
            GenerateCustomerInstanceReportExportDetails model =
                    new GenerateCustomerInstanceReportExportDetails(
                            this.compartmentId,
                            this.sortOrder,
                            this.sortBy,
                            this.name,
                            this.listingId,
                            this.status,
                            this.shape,
                            this.region,
                            this.realm,
                            this.tenantAdminDomain,
                            this.packageVersion,
                            this.instanceId,
                            this.timeInstanceCreationFromDate,
                            this.timeInstanceCreationToDate,
                            this.timeInstanceTerminationFromDate,
                            this.timeInstanceTerminationToDate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateCustomerInstanceReportExportDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("sortOrder")) {
                this.sortOrder(model.getSortOrder());
            }
            if (model.wasPropertyExplicitlySet("sortBy")) {
                this.sortBy(model.getSortBy());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("realm")) {
                this.realm(model.getRealm());
            }
            if (model.wasPropertyExplicitlySet("tenantAdminDomain")) {
                this.tenantAdminDomain(model.getTenantAdminDomain());
            }
            if (model.wasPropertyExplicitlySet("packageVersion")) {
                this.packageVersion(model.getPackageVersion());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("timeInstanceCreationFromDate")) {
                this.timeInstanceCreationFromDate(model.getTimeInstanceCreationFromDate());
            }
            if (model.wasPropertyExplicitlySet("timeInstanceCreationToDate")) {
                this.timeInstanceCreationToDate(model.getTimeInstanceCreationToDate());
            }
            if (model.wasPropertyExplicitlySet("timeInstanceTerminationFromDate")) {
                this.timeInstanceTerminationFromDate(model.getTimeInstanceTerminationFromDate());
            }
            if (model.wasPropertyExplicitlySet("timeInstanceTerminationToDate")) {
                this.timeInstanceTerminationToDate(model.getTimeInstanceTerminationToDate());
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
     * The OCID of the compartment for the export.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment for the export.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The sort order for the generated export.
     **/
    public enum SortOrder {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };
    /**
     * The sort order for the generated export.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

    /**
     * The sort order for the generated export.
     * @return the value
     **/
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * The field to sort by.
     **/
    public enum SortBy {
        InstanceId("INSTANCE_ID"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
    /**
     * The field to sort by.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final SortBy sortBy;

    /**
     * The field to sort by.
     * @return the value
     **/
    public SortBy getSortBy() {
        return sortBy;
    }

    /**
     * A filter to return only report records that match the listing name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A filter to return only report records that match the listing name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A filter to return only report records that match the listing OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * A filter to return only report records that match the listing OCID.
     * @return the value
     **/
    public String getListingId() {
        return listingId;
    }

    /**
     * A filter to return only report records that match the instance status.
     **/
    public enum Status {
        Provisioning("PROVISIONING"),
        Running("RUNNING"),
        Stopped("STOPPED"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Disabled("DISABLED"),
        Starting("STARTING"),
        Stopping("STOPPING"),
        Snapshotting("SNAPSHOTTING"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };
    /**
     * A filter to return only report records that match the instance status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * A filter to return only report records that match the instance status.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * A filter to return only report records that match the instance shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * A filter to return only report records that match the instance shape.
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * A filter to return only report records that match the instance region.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * A filter to return only report records that match the instance region.
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * A filter to return only report records that match the instance realm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("realm")
    private final String realm;

    /**
     * A filter to return only report records that match the instance realm.
     * @return the value
     **/
    public String getRealm() {
        return realm;
    }

    /**
     * A filter to return only report records that match the tenant administrator email domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantAdminDomain")
    private final String tenantAdminDomain;

    /**
     * A filter to return only report records that match the tenant administrator email domain.
     * @return the value
     **/
    public String getTenantAdminDomain() {
        return tenantAdminDomain;
    }

    /**
     * A filter to return only report records that match the package version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * A filter to return only report records that match the package version.
     * @return the value
     **/
    public String getPackageVersion() {
        return packageVersion;
    }

    /**
     * A filter to return only report records that match the instance OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * A filter to return only report records that match the instance OCID.
     * @return the value
     **/
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * The inclusive earliest instance creation time, in RFC 3339 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInstanceCreationFromDate")
    private final java.util.Date timeInstanceCreationFromDate;

    /**
     * The inclusive earliest instance creation time, in RFC 3339 format.
     * @return the value
     **/
    public java.util.Date getTimeInstanceCreationFromDate() {
        return timeInstanceCreationFromDate;
    }

    /**
     * The inclusive latest instance creation time, in RFC 3339 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInstanceCreationToDate")
    private final java.util.Date timeInstanceCreationToDate;

    /**
     * The inclusive latest instance creation time, in RFC 3339 format.
     * @return the value
     **/
    public java.util.Date getTimeInstanceCreationToDate() {
        return timeInstanceCreationToDate;
    }

    /**
     * The inclusive earliest instance termination time, in RFC 3339 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInstanceTerminationFromDate")
    private final java.util.Date timeInstanceTerminationFromDate;

    /**
     * The inclusive earliest instance termination time, in RFC 3339 format.
     * @return the value
     **/
    public java.util.Date getTimeInstanceTerminationFromDate() {
        return timeInstanceTerminationFromDate;
    }

    /**
     * The inclusive latest instance termination time, in RFC 3339 format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeInstanceTerminationToDate")
    private final java.util.Date timeInstanceTerminationToDate;

    /**
     * The inclusive latest instance termination time, in RFC 3339 format.
     * @return the value
     **/
    public java.util.Date getTimeInstanceTerminationToDate() {
        return timeInstanceTerminationToDate;
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
        sb.append("GenerateCustomerInstanceReportExportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", realm=").append(String.valueOf(this.realm));
        sb.append(", tenantAdminDomain=").append(String.valueOf(this.tenantAdminDomain));
        sb.append(", packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", timeInstanceCreationFromDate=")
                .append(String.valueOf(this.timeInstanceCreationFromDate));
        sb.append(", timeInstanceCreationToDate=")
                .append(String.valueOf(this.timeInstanceCreationToDate));
        sb.append(", timeInstanceTerminationFromDate=")
                .append(String.valueOf(this.timeInstanceTerminationFromDate));
        sb.append(", timeInstanceTerminationToDate=")
                .append(String.valueOf(this.timeInstanceTerminationToDate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateCustomerInstanceReportExportDetails)) {
            return false;
        }

        GenerateCustomerInstanceReportExportDetails other =
                (GenerateCustomerInstanceReportExportDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.realm, other.realm)
                && java.util.Objects.equals(this.tenantAdminDomain, other.tenantAdminDomain)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(
                        this.timeInstanceCreationFromDate, other.timeInstanceCreationFromDate)
                && java.util.Objects.equals(
                        this.timeInstanceCreationToDate, other.timeInstanceCreationToDate)
                && java.util.Objects.equals(
                        this.timeInstanceTerminationFromDate, other.timeInstanceTerminationFromDate)
                && java.util.Objects.equals(
                        this.timeInstanceTerminationToDate, other.timeInstanceTerminationToDate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.realm == null ? 43 : this.realm.hashCode());
        result =
                (result * PRIME)
                        + (this.tenantAdminDomain == null ? 43 : this.tenantAdminDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInstanceCreationFromDate == null
                                ? 43
                                : this.timeInstanceCreationFromDate.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInstanceCreationToDate == null
                                ? 43
                                : this.timeInstanceCreationToDate.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInstanceTerminationFromDate == null
                                ? 43
                                : this.timeInstanceTerminationFromDate.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInstanceTerminationToDate == null
                                ? 43
                                : this.timeInstanceTerminationToDate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
